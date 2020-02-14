package com.zyx.mybookstore.Controller;

import com.zyx.mybookstore.Pojo.User;
import com.zyx.mybookstore.Service.Impl.UserServiceImpl;
import com.zyx.mybookstore.util.BaseDto;
import com.zyx.mybookstore.util.MD5Util;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class UserController {

    @RequestMapping(value = "/register.action")
    @ResponseBody
    public void Register(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username=request.getParameter("username");
        System.out.println("username:"+username);
        String userphone=request.getParameter("userphone");
        System.out.println("usephone:"+userphone);
        String useremail=request.getParameter("useremail");
        System.out.println("useremail:"+useremail);
        String userpwd=request.getParameter("userpwd");
        System.out.println("userpwd:"+userpwd);
        User user=new User(username,MD5Util.MD55(userpwd),userphone,useremail,"defaultheadportrait.png");
        UserServiceImpl userService=new UserServiceImpl();
        BaseDto<User> userBaseDto=userService.insertUser(user);
        if(userBaseDto.getCode()==200){
            request.getSession().setAttribute("errorMsg",userBaseDto.getMeg());
            response.getWriter().write("true");
        }
        else{
            request.getSession().setAttribute("errorMsg",userBaseDto.getMeg());
            response.getWriter().write("false");
        }
    }
    @RequestMapping(value = "/login.action")
    @ResponseBody
    public void Login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("utf8");
        String username=request.getParameter("username");
        System.out.println("username:"+username);
        String userpwd=request.getParameter("userpwd");
        System.out.println("userpwd:"+userpwd);
        String verifyCode=(String)request.getSession().getAttribute("verifyCode");
        String uservcode=request.getParameter("uservcode");
        UserServiceImpl userService=new UserServiceImpl();
        BaseDto<User> userBaseDto=userService.loginUser(username,MD5Util.MD55(userpwd));
        if(verifyCode.equalsIgnoreCase(uservcode)){
            if(userBaseDto.getCode()==200){
                request.getSession().setAttribute("user",userBaseDto.getDate());
                response.getWriter().write("true");
            }
            else{
                response.getWriter().write(userBaseDto.getMeg());
            }
        }else {
            response.getWriter().write("验证码错误");
        }
    }
    @RequestMapping(value = "/logout.action")
    public void Logout(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user= (User) request.getSession().getAttribute("user");
        if(user!=null){
            request.getSession().invalidate();
            request.getRequestDispatcher("/").forward(request,response);
        }
    }
}
