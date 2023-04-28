//package com.ruoyi.system.task;
//
//import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
//import com.ruoyi.common.enums.DeviceTypeEnum;
//import com.ruoyi.common.utils.DateUtils;
//import com.ruoyi.system.domain.StgkVoltageCabinet;
//import com.ruoyi.system.domain.StgkVoltageCabinetMonitor;
//import com.ruoyi.system.service.IStgkVoltageCabinetMonitorService;
//import com.ruoyi.system.service.IStgkVoltageCabinetService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.scheduling.annotation.EnableScheduling;
//
//import java.lang.reflect.Field;
//import java.math.BigDecimal;
//import java.util.List;
//
//@Configuration      //1.主要用于标记配置类，兼备Component的效果。
//@EnableScheduling
//public class DeviceReportTask {
//
//    @Autowired
//    private IStgkVoltageCabinetService stgkVoltageCabinetService;
//
//
//    @Autowired
//    private IStgkVoltageCabinetMonitorService stgkVoltageCabinetMonitorService;
//
//    @Autowired
//    private IStgkDeviceSetService stgkDeviceSetService;
//
//    @Autowired
//    private IStgkDeviceReportService deviceReportService;
//    //@Scheduled(cron ="0 0/1 * * * ?")
//    public void check() throws IllegalAccessException {
//
//        //查询所有设备列表
//        List<StgkVoltageCabinet> stgkVoltageCabinets = stgkVoltageCabinetService.selectStgkVoltageCabinetList(new StgkVoltageCabinet());
//        for (StgkVoltageCabinet stgkVoltageCabinet : stgkVoltageCabinets) {
//            StgkVoltageCabinetMonitor stgkVoltageCabinetMonitor = stgkVoltageCabinetMonitorService.selectStgkVoltageCabinetMonitorByCabinetId(stgkVoltageCabinet.getId());
//            if(stgkVoltageCabinetMonitor!=null){
//                StgkDeviceSet stgkDeviceSet = stgkDeviceSetService.selectStgkDeviceSetByTypeIdAndDeviceId(DeviceTypeEnum.HIGH_VOLTAGE_CABINET.getCode(),stgkVoltageCabinet.getId());
//                if(stgkDeviceSet!=null){
//                    Field[] declaredFields = stgkVoltageCabinetMonitor.getClass().getDeclaredFields();
//                    for (Field declaredField : declaredFields) {
//                        declaredField.setAccessible(true);
//                        if(declaredField.getName().endsWith("Temperature")){
//                            Object valueObj = declaredField.get(stgkVoltageCabinetMonitor);
//                            BigDecimal value = (BigDecimal) valueObj;
//                            if(value.compareTo(stgkDeviceSet.getReportWarning())>0){
//                                long count = deviceReportService.count(new LambdaQueryWrapper<StgkDeviceReport>().eq(StgkDeviceReport::getMonitorId, stgkVoltageCabinetMonitor.getId()));
//                                if(count==0) {
//                                    StgkDeviceReport deviceReport = new StgkDeviceReport();
//                                    deviceReport.setDeviceId(stgkVoltageCabinetMonitor.getCabinetId());
//                                    deviceReport.setTypeId(DeviceTypeEnum.HIGH_VOLTAGE_CABINET.getCode());
//                                    deviceReport.setReportWarning(stgkDeviceSet.getReportWarning());
//                                    deviceReport.setEarlyWarning(stgkDeviceSet.getEarlyWarning());
//                                    deviceReport.setAlarmWarning(stgkDeviceSet.getAlarmWarning());
//                                    deviceReport.setTemperature(value);
//                                    deviceReport.setCreateTime(DateUtils.getNowDate());
//                                    deviceReport.setReportFieldName(declaredField.getName());
//                                    deviceReport.setDeviceName(stgkVoltageCabinet.getCabinetName());
//                                    deviceReport.setMonitorId(stgkVoltageCabinetMonitor.getId());
//                                    deviceReportService.insertStgkDeviceReport(deviceReport);
//                                }
//                            }
//                        }
//                    }
//
//                }
//            }
//        }
//
//    }
//
//}
