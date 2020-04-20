package com.fm.eduweb.puser.controller;

import cn.hutool.log.LogFactory;
import com.fm.edusys.util.ResponseUtils;
import com.google.code.kaptcha.impl.DefaultKaptcha;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.UUID;

@Api(tags = "图片验证码接口",description = "图片验证码接口")
@Controller
@RequestMapping("/verifica")
public class VerificationCodeController {

   // Logger logger = LoggerFactory.getLogger(Object.class);

    @Resource(name = "captchaProducerMath")
    private DefaultKaptcha defaultKaptchaMath;


    /**
     * create by: liukun
     * description: TODO
     * create time: 2020/4/18 12:21
     * @param request
     * @param response
     * @return void
     */
    @ApiOperation(value = "验证码生成")
    @RequestMapping("/generate")
    public String generateCode(HttpServletRequest request, HttpServletResponse response){
        //生成验证码文本
        String key =null;
        key = UUID.randomUUID().toString().replaceAll("-","");
        String str = defaultKaptchaMath.createText();
        //取出验证码
        String code = str.substring(0, str.lastIndexOf("@"));
        //取出 验证码的数值
        String math = str.substring(str.lastIndexOf("@") + 1);
        request.getSession().setAttribute(key,math);
        BufferedImage image = defaultKaptchaMath.createImage(code);
        try {
            ResponseUtils.responseBufferedImage(request,response,image);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


    /**
     * create by: liukun
     * description: 校验验证码
     * create time: 2020/4/18 16:56
     * @param key
	 * @param code
	 * @param request
     * @return java.lang.String
     */
    public String checkCode(String key,String code,HttpServletRequest request){
        if(key==null|| "".equals(key)){
            return "fail";
        }
        if (request.getSession().getAttribute(key).equals(code) ){
             return  "success";
        }
        return null;

    }
}
