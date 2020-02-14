package com.zyx.mybookstore.Controller;

import com.zyx.mybookstore.Service.Impl.CityServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class CityController {
    @RequestMapping("/getcity")
    @ResponseBody
    public String getCity(HttpServletRequest request, HttpServletResponse response, String value,int arg){
        response.setCharacterEncoding("utf-8");
        CityServiceImpl cityService=new CityServiceImpl();
        String code=cityService.SelectByname(value);
        List<String> cityname1=cityService.SelectCity(code,arg);
        String str="<option>%s</option>\n";
        String sumstr="";
        for(String string:cityname1){
            sumstr+=String.format(str,string);
        }
        return sumstr;
    }
}
