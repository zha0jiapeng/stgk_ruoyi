package com.ruoyi.system.websocket;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.spring.SpringUtils;
import com.ruoyi.system.domain.StgkTransformer;
import com.ruoyi.system.service.IStgkTransformerService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.websocket.*;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;

@ServerEndpoint(value = "/transformerSocket")
@Component
@Slf4j
public class TransformerSocket {

    private Session session;


    @OnOpen
    public void onOpen(Session session) {
        this.session = session;
        log.info(session.getId()+"连接成功");
        sendMessageByStr(JSON.toJSONString(AjaxResult.success("连接成功", null)));
    }

    @OnClose
    public void onClose() {

        log.info("用户退出:" );
    }

    @OnMessage
    public void onMessage(String message, Session session) {
        this.session = session;
        log.info("报文:" + message);
        //可以群发消息
        //消息保存到数据库、redis
        if (StringUtils.isNotBlank(message)) {
            JSONObject jsonObject = JSON.parseObject(message);
            log.info("报文:" + jsonObject);
            Long id = jsonObject.getLong("id");
            log.info("报文:" + id);
            IStgkTransformerService stgkTransformerService = SpringUtils.getBean(IStgkTransformerService.class);
            StgkTransformer stgkTransformer = stgkTransformerService.selectStgkTransformerById(id);
            sendMessageByStr(JSONObject.toJSONString(stgkTransformer));
        }
    }

    /**
     * @param session
     * @param error
     */
    @OnError
    public void onError(Session session, Throwable error) {
        log.error("用户错误: ,原因:" + error.getMessage());
        log.error("websocket error: ", error);
    }


    public void sendMessageByObject(Object message) {
        if (message != null) {
            try {
                this.session.getBasicRemote().sendObject(message);
            } catch (IOException | EncodeException e) {
                log.error("发送到用户：信息失败 ，信息是：" + message);
                log.error("websocket send object msg exception: ", e);
            }
        }
    }
    public void sendMessageByStr(String message) {
        if (StringUtils.isNotBlank(message)) {
            try {
                if (this.session.isOpen()) {
                    this.session.getBasicRemote().sendText(message);
                }
            } catch (IOException e) {
                log.error("发送到用户：信息失败 ，信息是：" + message);
                log.error("websocket send str msg exception: ", e);
            }
        }
    }

}
