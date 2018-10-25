package com.xxx.demo.services.remote.impl;


import com.alibaba.fastjson.JSONObject;
import com.xxx.demo.models.sys.RequestParameterForCtrl;
import com.xxx.demo.services.remote.RemoteService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @description:车辆操控接口
 * @author:@guo.zj
 */
@Service
public class RemoteServiceImpl implements RemoteService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Override
    public JSONObject closelock(RequestParameterForCtrl data) {
        JSONObject jsonObject = new JSONObject();
        try {
            logger.info("请求体:" + data);
            //Finder finder = JSON.parseObject(request, RequestParameters.class).getData();
            String vin = data.getData().getVin();
            String serviceType = data.getData().getType();
            String controltype=data.getData().getControltype();
            if(vin==null||"".equals(vin)){
                jsonObject.put("status", 201);
                jsonObject.put("msg", "传入参数有误");
                jsonObject.put("data","");
            }else if ("APP".equals(serviceType) && "NISSAN0000000000".equals(vin)&& "closelock".equals(controltype)) {
                jsonObject.put("status", 200);
                jsonObject.put("msg", "闭锁成功");
                logger.info("返回的json:{}", jsonObject);
            } else {
                jsonObject.put("status", 400);
                jsonObject.put("msg", "failed");
                logger.info("返回的json:{}",jsonObject);
            }
        }catch(Exception e) {
            e.printStackTrace();
            logger.error("系统内部错误!");
            jsonObject.put("status",500);
            jsonObject.put("msg", "服务器处理失败，系统内部错误");
        }
        return jsonObject;
    }

    /**
     * 3@description:开锁接口实现
     * @author:@guo.zj
     */
    @Override
    public JSONObject openlock(RequestParameterForCtrl data) {
        JSONObject jsonObject = new JSONObject();
        try {
            logger.info("请求体:" + data);
            String vin = data.getData().getVin();
            String serviceType = data.getData().getType();
            String controltype=data.getData().getControltype();
            if(vin==null||"".equals(vin)){
                jsonObject.put("status", 201);
                jsonObject.put("msg", "传入参数有误");
                jsonObject.put("data","");
            }else if ("APP".equals(serviceType) && "NISSAN0000000000".equals(vin)&& "openlock".equals(controltype)) {
                jsonObject.put("status", 200);
                jsonObject.put("msg", "开锁成功");
                logger.info("返回的json:{}", jsonObject);
            } else {
                jsonObject.put("status", 400);
                jsonObject.put("msg", "failed");
                logger.info("返回的json:{}",jsonObject);
            }
        }catch(Exception e) {
            e.printStackTrace();
            logger.error("系统内部错误!");
            jsonObject.put("status",500);
            jsonObject.put("msg", "服务器处理失败，系统内部错误");
        }
        return jsonObject;
    }

    @Override
    public JSONObject airconditioner(RequestParameterForCtrl data) {
        JSONObject jsonObject = new JSONObject();
        try {
            logger.info("请求体:" + data);
            //Finder finder = JSON.parseObject(request, RequestParameters.class).getData();
            String vin = data.getData().getVin();
            String serviceType = data.getData().getType();
            String controltype=data.getData().getControltype();
            if(vin==null||"".equals(vin)){
                jsonObject.put("status", 201);
                jsonObject.put("msg", "传入参数有误");
                jsonObject.put("data","");
            }else if ("APP".equals(serviceType) && "NISSAN0000000000".equals(vin)&& "air_conditioner".equals(controltype)) {
                jsonObject.put("status", 200);
                jsonObject.put("msg", "空调操作成功");
                logger.info("返回的json:{}", jsonObject);
            } else {
                jsonObject.put("status", 400);
                jsonObject.put("msg", "failed");
                logger.info("返回的json:{}",jsonObject);
            }
        }catch(Exception e) {
            e.printStackTrace();
            logger.error("系统内部错误!");
            jsonObject.put("status",500);
            jsonObject.put("msg", "服务器处理失败，系统内部错误");
        }
        return jsonObject;
    }

    @Override
    public JSONObject flashhorns(RequestParameterForCtrl data) {
        JSONObject jsonObject = new JSONObject();
        try {
            logger.info("请求体:" + data);
            //Finder finder = JSON.parseObject(request, RequestParameters.class).getData();
            String vin = data.getData().getVin();
            String serviceType = data.getData().getType();
            String controltype=data.getData().getControltype();
            if(vin==null||"".equals(vin)){
                jsonObject.put("status", 201);
                jsonObject.put("msg", "传入参数有误");
                jsonObject.put("data","");
            }else if ("APP".equals(serviceType) && "NISSAN0000000000".equals(vin)&& "flash_horns".equals(controltype)) {
                jsonObject.put("status", 200);
                jsonObject.put("msg", "车辆正在鸣笛闪烁");
                logger.info("返回的json:{}", jsonObject);
            } else {
                jsonObject.put("status", 400);
                jsonObject.put("msg", "failed");
                logger.info("返回的json:{}",jsonObject);
            }
        }catch(Exception e) {
            e.printStackTrace();
            logger.error("系统内部错误!");
            jsonObject.put("status",500);
            jsonObject.put("msg", "服务器处理失败，系统内部错误");
        }
        return jsonObject;
    }

    @Override
    public JSONObject vehiclediagnose(RequestParameterForCtrl data) {
        JSONObject jsonObject = new JSONObject();
        try {
            logger.info("请求体:" + data);
            //Finder finder = JSON.parseObject(request, RequestParameters.class).getData();
            String vin = data.getData().getVin();
            String serviceType = data.getData().getType();
            String controltype=data.getData().getControltype();
            if(vin==null||"".equals(vin)){
                jsonObject.put("status", 201);
                jsonObject.put("msg", "传入参数有误");
                jsonObject.put("data","");
            }else if ("APP".equals(serviceType) && "NISSAN0000000000".equals(vin)&& "vehicle_diagnose".equals(controltype)) {
                jsonObject.put("status", 200);
                jsonObject.put("msg", "车辆诊断成功");
                logger.info("返回的json:{}", jsonObject);
            } else {
                jsonObject.put("status", 400);
                jsonObject.put("msg", "failed");
                logger.info("返回的json:{}",jsonObject);
            }
        }catch(Exception e) {
            e.printStackTrace();
            logger.error("系统内部错误!");
            jsonObject.put("status",500);
            jsonObject.put("msg", "服务器处理失败，系统内部错误");
        }
        return jsonObject;
    }

    @Override
    public JSONObject userbehavioranalysis(RequestParameterForCtrl data) {
        JSONObject jsonObject = new JSONObject();
        try {
            logger.info("请求体:" + data);
            //Finder finder = JSON.parseObject(request, RequestParameters.class).getData();
            String vin = data.getData().getVin();
            String serviceType = data.getData().getType();
            String controltype=data.getData().getControltype();
            if(vin==null||"".equals(vin)){
                jsonObject.put("status", 201);
                jsonObject.put("msg", "传入参数有误");
                jsonObject.put("data","");
            }else if ("APP".equals(serviceType) && "NISSAN0000000000".equals(vin)&& "user_behavior_analysis".equals(controltype)) {
                jsonObject.put("status", 200);
                jsonObject.put("msg", "用户行为分析成功");
                logger.info("返回的json:{}", jsonObject);
            } else {
                jsonObject.put("status", 400);
                jsonObject.put("msg", "failed");
                logger.info("返回的json:{}",jsonObject);
            }
        }catch(Exception e) {
            e.printStackTrace();
            logger.error("系统内部错误!");
            jsonObject.put("status",500);
            jsonObject.put("msg", "服务器处理失败，系统内部错误");
        }
        return jsonObject;
    }


}