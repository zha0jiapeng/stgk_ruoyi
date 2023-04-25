package com.ruoyi.system.websocket.entity;


import com.alibaba.fastjson.JSON;
import com.ruoyi.common.utils.sign.Base64;
import org.apache.commons.lang3.ArrayUtils;

import javax.websocket.EncodeException;
import javax.websocket.Encoder;
import javax.websocket.EndpointConfig;


public class ImageEncoder implements Encoder.Text<Image> {

    @Override
    public String encode(Image image) {
        if(image != null && !ArrayUtils.isEmpty(image.getImageByte())){
            String base64Image= Base64.encode(image.getImageByte());

            return JSON.toJSONString(new AjaxResult(AjaxResult.Type.SUCCESS_IMG_BYTE,image.getIp(),base64Image));
        }
        return JSON.toJSONString(AjaxResult.error("获取视频帧失败"));
    }

    @Override
    public void init(EndpointConfig endpointConfig) {
    }

    @Override
    public void destroy() {

    }
}