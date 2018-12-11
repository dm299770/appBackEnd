package com.xxx.demo.controller.login;

import com.alibaba.fastjson.JSONObject;
import com.xxx.demo.services.login.LoginService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:登录
 * @author:@leo.
 */
@RestController
@RequestMapping({"/login"})
public class LoginController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
<<<<<<< HEAD

    @Autowired
    private LoginService loginService;
=======
    @Autowired
    private LoginService loginService;

    @ResponseBody
>>>>>>> 6726497bc8b42a17bb44cbf5e0d58416139fdeb6
    @RequestMapping(value = "login")
    public Object login(String phoneNum,String password) {
        JSONObject result = loginService.login(phoneNum,password);
        return result;
    }

<<<<<<< HEAD
    @ResponseBody
=======
       @ResponseBody
>>>>>>> 6726497bc8b42a17bb44cbf5e0d58416139fdeb6
    @RequestMapping(value = "logout")
    public Object logout(String userName) {
        JSONObject result = loginService.logout(userName);
        return result;
    }

}
