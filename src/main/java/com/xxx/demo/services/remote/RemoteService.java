package com.xxx.demo.services.remote;


import com.alibaba.fastjson.JSONObject;
import com.xxx.demo.models.sys.RequestParameterForCtrl;
import com.xxx.demo.models.sys.RequestParameters;


/**
 * @description:登录相关的方法
 * @author:@leo.
 */
public interface RemoteService {
    /**
     * 闭锁
     *
     * @param vin车架号 操作类型
     * @return  成功失败
     */
    JSONObject closelock(RequestParameterForCtrl request);

    /**
     * 开锁
     *
     * @param vin车架号操作类型
     * @return 成功失败
     */
    JSONObject openlock(RequestParameterForCtrl request);

    /**
     * 空调
     *
     * @param vin车架号 操作类型
     * @return  成功失败
     */
    JSONObject airconditioner(RequestParameterForCtrl request);

    /**
     * 车辆诊断
     *
     * @param vin车架号 操作类型
     * @return  成功失败
     */
    JSONObject vehiclediagnose(RequestParameterForCtrl request);

    /**
     * 闪烁鸣笛
     *
     * @param vin车架号 操作类型
     * @return  成功失败
     */
    JSONObject flashhorns(RequestParameterForCtrl request);

    /**
     * 用户行为分析
     *
     * @param vin车架号 操作类型
     * @return  成功失败
     */
    JSONObject userbehavioranalysis(RequestParameterForCtrl request);
}

