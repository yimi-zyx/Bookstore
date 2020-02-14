package com.zyx.mybookstore.Controller;

import com.zyx.mybookstore.util.VerifyCode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.IOException;

@Controller
public class VerifyCodeController{
//    生成验证码
    @RequestMapping(value = "/verifycode.action")
    @ResponseBody
     public void doAction(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        VerifyCode vc = new VerifyCode();
        response.setHeader("Cache-Control", "no-cache");
        response.setContentType("image/jpeg");
        BufferedImage bim = vc.getImage();
        String verifycode = vc.getText();
        request.getSession().setAttribute("verifyCode", verifycode);
        ImageIO.write(bim, "JPEG", response.getOutputStream());
    }
//    验证验证码
    @RequestMapping(value = "/vcode.action")
    @ResponseBody
    public void doVcode(HttpServletRequest request,HttpServletResponse response)throws IOException{
        String verifyCode=(String)request.getSession().getAttribute("verifyCode");
        String vcode=request.getParameter("vcode");
        System.out.println("输入的值："+vcode);
        System.out.println("取出的值："+verifyCode);
        if(verifyCode.equalsIgnoreCase(vcode)){
            response.getWriter().write("true");
            System.out.println("true");
        }else {
            response.getWriter().write("false");
            System.out.println("false");
        }
    }
}
