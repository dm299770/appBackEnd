package com.xxx.demo.controller.remote;

import com.alibaba.fastjson.JSONObject;
import com.xxx.demo.models.sys.RequestParameterForCtrl;
import com.xxx.demo.services.remote.RemoteService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


/**
 * @description:远程寻车
 * @author:@guo.zj
 */

@RestController
@RequestMapping({"/remotecontrol"})
public class RemoteController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
        private RemoteService remoteService;
    @ResponseBody
    @RequestMapping(value = "openlock")
    public Object openlock(@RequestBody RequestParameterForCtrl data) {
        JSONObject result=null;
        try {
            result = remoteService.openlock(data);
        } catch (Exception e) {
            // TODO Auto-generated  catch block
            e.printStackTrace();
        }
        return result;
    }

    @ResponseBody
    @RequestMapping(value = "closelock")
    public Object closelock(@RequestBody RequestParameterForCtrl data) {
        JSONObject result=null;
        try {
            result =remoteService.closelock(data);
        } catch (Exception e) {
             e.printStackTrace();
        }
        return result;
    }

    @ResponseBody
    @RequestMapping(value = "air_conditioner")
    public Object airconditioner(@RequestBody RequestParameterForCtrl data) {
        JSONObject result=null;
        try {
            result = remoteService.airconditioner(data);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @ResponseBody
    @RequestMapping(value = "vehicle_diagnose")
    public Object vehiclediagnose(@RequestBody RequestParameterForCtrl data) {
        JSONObject result=null;
        try {
            result = remoteService.vehiclediagnose(data);
        } catch (Exception e) {

            e.printStackTrace();
        }
        return result;
    }


    @ResponseBody
    @RequestMapping(value = "flash_horns")
    public Object flashhorns(@RequestBody RequestParameterForCtrl data) {
        JSONObject result=null;
        try {
            result = remoteService.flashhorns(data);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @ResponseBody
    @RequestMapping(value = "user_behavior_analysis")
    public Object userbehavioranalysis(@RequestBody RequestParameterForCtrl data) {
        JSONObject result=null;
        try {
            result = remoteService.userbehavioranalysis(data);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}


