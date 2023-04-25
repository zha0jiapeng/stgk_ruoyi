package com.ruoyi.system.task;

import com.ruoyi.system.domain.StgkVoltageCabinet;
import com.ruoyi.system.domain.StgkVoltageCabinetMonitor;
import com.ruoyi.system.service.IStgkVoltageCabinetMonitorService;
import com.ruoyi.system.service.IStgkVoltageCabinetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.List;

@Configuration      //1.主要用于标记配置类，兼备Component的效果。
@EnableScheduling
public class DeviceReportTask {

    @Autowired
    private IStgkVoltageCabinetService stgkVoltageCabinetService;


    @Autowired
    private IStgkVoltageCabinetMonitorService stgkVoltageCabinetMonitorService;

    @Scheduled(cron ="0 0/1 * * * ?")
    public void check(){
        //查询所有设备列表
        List<StgkVoltageCabinet> stgkVoltageCabinets = stgkVoltageCabinetService.selectStgkVoltageCabinetList(new StgkVoltageCabinet());
        for (StgkVoltageCabinet stgkVoltageCabinet : stgkVoltageCabinets) {
            StgkVoltageCabinetMonitor stgkVoltageCabinetMonitor = stgkVoltageCabinetMonitorService.selectStgkVoltageCabinetMonitorByCabinetId(stgkVoltageCabinet.getId());
            if(stgkVoltageCabinetMonitor!=null){
                //stgkVoltageCabinetMonitor.get
            }
        }

    }

}
