package com.xxx.demo.services.vehicleState;


import com.alibaba.fastjson.JSONObject;
import com.xxx.demo.jsonBean.remote.RequestParameters;


/**
 * @description:登录相关的方法
 * @author:@leo.
 */
public interface VehicleStateService {
    /**
     * 远程寻车
     *
     * @param vin车架号
     * @return 经纬度
     */
    JSONObject vehiclestate(RequestParameters request);
}

