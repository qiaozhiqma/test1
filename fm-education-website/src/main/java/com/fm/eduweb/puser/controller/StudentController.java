package com.fm.eduweb.puser.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @author ：liukun
 * @date ：Created in 2020-04-18 12:40
 * @description：用户操作接口
 * @modified By：
 * @version: 1.0$
 */
@RequestMapping("/user")
@Controller
public class StudentController {

    @Autowired
    private VerificationCodeController verificationCodeController;


    /**
     * create by: liukun
     * description: 跳转到注册页面
     * create time: 2020/4/18 12:52
     * @param
     * @return org.springframework.web.servlet.ModelAndView
     */
    @RequestMapping("register")
    public ModelAndView StuRegister(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("user/student/register");
        return modelAndView;
    }

    @RequestMapping("/stuRegister")
    public String stuRegister(String code , String key, HttpServletRequest request){

        if(code==null||"".equals(code)){
            return null;
        }else if(key==null|| "".equals(key)){
            return null;
        }

        String tag = verificationCodeController.checkCode(key, code, request);
        if(tag.equals("sucaaacess")){




        }
        return "aaa";

    }
}
