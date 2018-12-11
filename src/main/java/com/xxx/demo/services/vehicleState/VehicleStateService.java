package com.xxx.demo.services.vehicleState;


import com.alibaba.fastjson.JSONObject;
import com.xxx.demo.jsonBean.remote.RequestParameters;
<<<<<<< HEAD
import com.xxx.demo.jsonBean.remote.remoteRequestParmmeter.DeleteDataRequestParameter;


/**
 * @description:车辆状态
 * @author:@guo.zj
 */
public interface VehicleStateService {
    /**
     * 车辆状态
     *
     * @param vin车架号
     * @return 车辆状态
     */
    JSONObject vehiclestate(RequestParameters request);


    /**
     * 车辆状态
     *
     * @param vin车架号
     * @return 重置状态
     */
    JSONObject deletedata(DeleteDataRequestParameter request);
=======


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
>>>>>>> 6726497bc8b42a17bb44cbf5e0d58416139fdeb6
}

