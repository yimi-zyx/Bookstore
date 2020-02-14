package com.zyx.mybookstore.Controller;

import com.zyx.mybookstore.Pojo.User;
import com.zyx.mybookstore.Service.Impl.UserServiceImpl;
import com.zyx.mybookstore.util.BaseDto;
import com.zyx.mybookstore.util.MD5Util;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class VerifyUserController {


   // @Autowired
   // UserServiceImpl userService;
//    忘记密码填写用户信息中验证用户信息
    @RequestMapping(value = "/verifyuser.action")
    @ResponseBody
    public void doAction(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String userinfo=request.getParameter("userinfo");
        String verifycode=request.getParameter("verifycode");
        UserServiceImpl userService=new UserServiceImpl();
        BaseDto<User> userBaseDto=userService.isUser(userinfo);
        if(userBaseDto.getCode()==200){
            request.getSession().setAttribute("User",userBaseDto.getDate());
            String verifyCode= (String) request.getSession().getAttribute("verifyCode");
            System.out.println(userBaseDto.getDate());
            if(verifyCode.equalsIgnoreCase(verifycode)){
                response.getWriter().write(userBaseDto.getDate().getUserphone());
            }else {
                response.getWriter().write("false2");
            }
        }else {
            response.getWriter().write("false1");
        }
    }
//    设置新密码
    @RequestMapping(value = "/settingnewpwd.action")
    @ResponseBody
    public void settingNewpwd(HttpServletRequest request,HttpServletResponse response) throws IOException {
        String userpwd=request.getParameter("userpwd");
        User user=(User) request.getSession().getAttribute("User");
        user.setUserpwd(MD5Util.MD55(userpwd));
        UserServiceImpl userService=new UserServiceImpl();
        if(userService.updatePwdById(user)){
            response.getWriter().write("true");
        }else {
            response.getWriter().write("false");
        }

    }
}
