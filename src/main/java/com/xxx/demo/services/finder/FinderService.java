package com.xxx.demo.services.finder;


import com.alibaba.fastjson.JSONObject;
import com.xxx.demo.models.sys.RequestParameters;


/**
 * @description:登录相关的方法
 * @author:@leo.
 */
public interface FinderService {
    /**
     * 远程寻车
     *
     * @param vin车架号
     * @return 经纬度
     */
    JSONObject finder(RequestParameters request);

    /**
     * 车锁控制
     *
     * @param vin车架号
     * @return 经纬度
     */
    JSONObject safelock(RequestParameters request);
}

