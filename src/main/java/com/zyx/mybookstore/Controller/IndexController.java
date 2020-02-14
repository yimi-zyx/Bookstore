package com.zyx.mybookstore.Controller;



import com.zyx.mybookstore.Pojo.Book;
import com.zyx.mybookstore.Pojo.User;
import com.zyx.mybookstore.Service.Impl.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class IndexController {
    @RequestMapping(value = "/head")
    public String Head() {
        return "head";
    }
    @RequestMapping(value = "/")
    public String Home(HttpServletRequest request) {
        //轮播显示
        SliderSeviceImpl sliderSevice=new SliderSeviceImpl();
        request.getSession().setAttribute("sliderbooks",sliderSevice.selectSliderbooks());
        //显示分类
        ClassSeviceImpl sevice=new ClassSeviceImpl();
        System.out.println(sevice.selectOuttype());
        request.getSession().setAttribute("outtypes",sevice.selectOuttype());
        //显示热门推荐
        HotSeviceImpl hotSevice=new HotSeviceImpl();
        request.getSession().setAttribute("hotbooks",hotSevice.selectHotbooks());
        //显示更多
        MoreSeviceImpl moreSevice=new MoreSeviceImpl();
        request.getSession().setAttribute("morebooks",moreSevice.SelectMorebooks());
        //显示新书上架

        NewbookSeviceImpl newbookSevice=new NewbookSeviceImpl();
        request.getSession().setAttribute("newbooks",newbookSevice.SelectNewBooks());
        //显示特色推荐
        FeatureSeviceImpl featureSevice=new FeatureSeviceImpl();
        request.getSession().setAttribute("featurebooks",featureSevice.SelectFeatureByType("预售书"));
        request.getSession().setAttribute("featurelimitbooks",featureSevice.SelectFeatureByTypelimit("预售书"));

        //显示作家推荐
        AuthortestSeviceImpl authortestSevice=new AuthortestSeviceImpl();
        List<String> authors=authortestSevice.selectAuthortest(0,7);
        request.getSession().setAttribute("authors",authors);
        String author=authors.get(0);
        request.getSession().setAttribute("authortest",authortestSevice.selectAtByAuthor(author));
        request.getSession().setAttribute("authorbooks",authortestSevice.selectBookByAuthor(author));
        //显示人气作家
        List<String> hotauthors=authortestSevice.selectAuthortest(7,24);
        request.getSession().setAttribute("hotauthors",hotauthors);

        return "index";
    }

    @RequestMapping(value = "/login")
    public String ReturnLogin() {
        return "login";
    }

    @RequestMapping(value = "/register")
    public String ReturnRegister() {
        return "register";
    }

    @RequestMapping(value = "/bookdetail")
    public String ReturnBookdetail(HttpServletRequest request,String bookid) {
        //int bookid=Integer.valueOf(request.getParameter("bookid"));
        int id=Integer.valueOf(bookid);
        System.out.println(id);
        BookSeviceImpl bookSevice=new BookSeviceImpl();
        Book book=bookSevice.SelectbookByid(id);
        request.getSession().setAttribute("book",book);
        request.getSession().setAttribute("relatebooks",bookSevice.SelectByBookclass2(book.getBookclass2()));
        request.getSession().setAttribute("authorbooks",bookSevice.SelectByAuthor(book.getBookauthor(),book.getBookid()));
        return "bookdetail";
    }

    @RequestMapping(value = "/forgetpwd")
    public String ReturnForgetpwd() {
        return "forgetpwd";
    }

    @RequestMapping(value = "/paging")
    public String ReturnPaging(HttpServletRequest request, String outtypenum){
        int id=Integer.valueOf(outtypenum);
        ClassSeviceImpl classSevice=new ClassSeviceImpl();
        request.getSession().setAttribute("types",classSevice.ClasslistMap(id));
        return "paging";
    }

    @RequestMapping(value = "/registersuccess")
    public String ReturnRegistersuccess(){return "registersuccess"; }

    @RequestMapping(value = "/registerfail")
    public String ReturnRegisterfail(){return "registerfail"; }

    @RequestMapping(value = "/mycart")
    public String ReturnMycart(HttpServletRequest request){
        User user=(User)request.getSession().getAttribute("user");
        CartServiceImpl cartService=new CartServiceImpl();
        request.getSession().setAttribute("mycartbooks",cartService.SelectMyCart(user.getUserid()));
        CityServiceImpl cityService=new CityServiceImpl();
        request.getSession().setAttribute("provinces",cityService.SelectProvince());
        return "mycart";
    }

    @RequestMapping(value = "/orderdetail")
    public String ReturnOrderdetail(){
        return "orderdetail";
    }

    @RequestMapping(value = "/paysuccess")
    public String ReturnPaysuccess(){
        return "paysuccess";
    }

    @RequestMapping(value = "/personalcenter")
    public String ReturnPersonalcenter(){
        return "personalcenter";
    }

    @RequestMapping(value = "/favorite")
    public String ReturnFavorite(){ return "favorite"; }

    @RequestMapping(value = "/integral")
    public String ReturnIntegral(){
        return "integral";
    }

    @RequestMapping(value = "/allclass")
    public String ReturnAllclass(HttpServletRequest request){
        ClassSeviceImpl classSevice=new ClassSeviceImpl();
        request.getSession().setAttribute("alltypes",classSevice.Classlist());
        return "allclass";
    }
    @RequestMapping(value = "/books")
    public String ReturnBooks(){
        return "books";
    }

}
