package itor.topnetwork.com.dxditor.utils;

/**
 * @Description:Url
 * @Created by D.Han on 2018/3/22 11:37 in Peking.
 */

public class Constants {
    public static boolean testData = false;

    public static String SHAREDPREFERENCESIP = "IP";
    //北京
    public static String ORIGINALIP = "36.110.98.226:5280/iotr";
    //郑州
    //public static String ORIGINALIP = "36.110.98.226:5680";

    public static String HTTP = "http://";

    public static String APPNAME="";
    //首页设备信息
    public static String getAppDeviceStausCount =  APPNAME+"/iotrApp/iotr/iotrApp/iotrAppDataDevice!getAppDeviceStausCount.action";
    //获取设备告警信息占比
    public static String getAppDeviceAlarmProportion =  APPNAME+"/iotrApp/iotr/iotrApp/iotrAppDataDevice!getAppDeviceAlarmProportion.action";
    //获取铁路线中不同设备数量,铁路线告警数
    public static String getAppDeviceCount = APPNAME+"/iotrApp/iotr/iotrApp/iotrAppDataDevice!getAppDeviceCount.action";
    //获取十条告警信息
    public static String getAppNewAlarmCount = APPNAME+"/iotrApp/iotrAppDataDevice!getAppNewAlarmCount.action";
    //桥梁趋势
    public static String getAppBridgeMonthDisplacementInfo =  APPNAME+"/iotrApp/iotr/iotrApp/iotrAppDataBridge!getAppBridgeMonthDisplacementInfo.action";
    //桥梁告警
    public static String getAppBridgeNewOneAlarm = APPNAME+ "/iotrApp/iotrAppDataBridge!getAppBridgeNewOneAlarm.action";
    //坠坨现场测试
    public static String getAppWeightsTrendInfo =  APPNAME+"/iotrApp/iotrAppDataWeights!getAppWeightsTrendInfo.action";
    //声屏障监测指标
    public static String getAppSoundBarrierNewOneAlarm =  APPNAME+"/iotrApp/iotrAppDataSoundBarrier!getAppSoundBarrierNewOneAlarm.action";
    //声屏障趋势图
    public static String getAppSoundBarrierInfo =APPNAME+ "/iotrApp/iotrAppDataSoundBarrier!getAppSoundBarrierInfo.action";

    public static String BRIDGECODE = "ZX0001";

    public static String MONTH = "2018-03";


}
