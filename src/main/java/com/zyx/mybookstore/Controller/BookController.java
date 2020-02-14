package com.zyx.mybookstore.Controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.fasterxml.jackson.databind.util.JSONWrappedObject;
import com.zyx.mybookstore.Pojo.Authortest;
import com.zyx.mybookstore.Pojo.Book;
import com.zyx.mybookstore.Pojo.Displaystr;
import com.zyx.mybookstore.Service.Impl.AuthortestSeviceImpl;
import com.zyx.mybookstore.Service.Impl.BookSeviceImpl;
import com.zyx.mybookstore.Service.Impl.FeatureSeviceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class BookController {

    @RequestMapping(value ="/changnewbook.action")
    @ResponseBody
    public Book returnNewbookinfo(HttpServletResponse response,HttpServletRequest request,String callback) throws IOException {
        response.setCharacterEncoding("utf-8");
        String num=request.getParameter("num");
        System.out.println(num);
        if (num==null){
            num="0";
        }
        int index = Integer.valueOf(num);
        List<Book> books= (List<Book>) request.getSession().getAttribute("newbooks");
        Book book=books.get(index);
        System.out.println("鼠标"+book);
        Map<String,String> bookmap=new HashMap<>();
        bookmap.put("bookname",book.getBookname());
        bookmap.put("booknewprice","￥"+book.getBooknewprice());
        bookmap.put("bookoldprice","￥"+book.getBookoldprice());
        bookmap.put("bookbrief",book.getBookbrief());
        JSONPObject jsonpObject=new JSONPObject(callback,bookmap);
        System.out.println(jsonpObject.toString());
        return book;
    }
    @RequestMapping(value ="/featuretype.action")
    @ResponseBody
    public Displaystr getType(HttpServletResponse response, HttpServletRequest request) throws IOException, ServletException {
        response.setCharacterEncoding("utf-8");
        String type=request.getParameter("type");
        if (type==null){
            type="预售书";
        }
         FeatureSeviceImpl featureSevice=new FeatureSeviceImpl();
         List<Book> books=featureSevice.SelectFeatureByType(type);
        String  string= "<table border=\"1\">\n" +
                        "  <tbody>\n"+
                        "    <tr>\n%s" +
                        "    </tr>\n" +
                        "    <tr>\n%s" +
                        "    </tr>\n" +
                        "  </tbody>\n" +
                        "</table>";
        String string2="      <td>\n" +
                "        <div class=\"feature-book\">\n" +
                "          <a href=\"/bookdetail?bookid=%s\" title=\"%s\">\n" +
                "            <img src=\"%s\" alt=\"\">\n" +
                "            <span class=\"bookname\">%s</span>\n" +
                "          </a>\n" +
                "          <div class=\"price \">\n" +
                "            <span class=\"price-left\">￥%s</span>\n" +
                "            <s class=\"price-right\">￥%s</s>\n" +
                "          </div>\n" +
                "        </div>\n" +
                "      </td>\n";
        List<Book> books1=featureSevice.SelectFeatureByTypelimit(type);
        String string3="                <div>\n" +
                "                <div class=\"clearfix \">\n" +
                        "                    <div class=\"feature-bookimg\">\n" +
                        "                        <a href=\"/bookdetail?bookid=%s\">\n" +
                        "                            <img src=\"%s\" title=\"%s\">\n" +
                        "                        </a>\n" +
                        "                    </div>\n" +
                        "                    <div class=\"feature-booktext\">\n" +
                        "                        <a href=\"/bookdetail?bookid=%s\">\n" +
                        "                            <div class=\"feature-bookname\" title=\"%s\">%s</div>\n" +
                        "                        </a>\n" +
                        "                        <div class=\"feature-bookprice\">\n" +
                        "                            <span class=\"feature-bookpricel\">￥%s</span>\n" +
                        "                            <span class=\"feature-bookpricer\">￥%s</span>\n" +
                        "                        </div>\n" +
                        "                    </div>\n" +
                        "                </div>\n" +
                        "                <div class=\"feature-divider\"></div>\n"+
                        "                 </div>\n";

        String sumStr3="";
        for (int i=0;i<5;i++){
            Book book=books1.get(i);
            String str=String.format(string3,book.getBookid(),book.getBookimg(),book.getBookname(),book.getBookid(),book.getBookname(),book.getBookname(),book.getBooknewprice(),book.getBookoldprice());
            sumStr3+=str;
        }
        String sumStr1="",sumStr2="";
        for (int i=0;i<10;i++){
            Book book=books.get(i);
            String str=String.format(string2,book.getBookid(),book.getBookname(),book.getBookimg(),book.getBookname(),book.getBooknewprice(),book.getBookoldprice());
            if (i<5){
                sumStr1+=str;
            }else {
                sumStr2+=str;
            }
        }
         string=String.format(string,sumStr1,sumStr2);
         Displaystr displaystr=new Displaystr(string,sumStr3);
         return displaystr;
    }
    @RequestMapping(value ="/authortype.action")
    @ResponseBody
    public Displaystr getaType(HttpServletResponse response, HttpServletRequest request) throws IOException, ServletException {
        response.setCharacterEncoding("utf-8");
        String type = request.getParameter("atype");
        if (type == null) {
            type = "胡适";
        }
        String s1="                   <div class=\"author-img\">\n" +
                "                        <img src=\"%s\">\n" +
                "                    </div>\n" +
                "                    <div class=\"author-detailtext\">\n" +
                "                        <div class=\"author-name\">%s</div>\n" +
                "                        <div class=\"author-detailbrief\">%s</div>\n" +
                "                    </div>\n";
        String s2="                            <td>\n" +
                "                                <div class=\"relation-book\">\n" +
                "                                    <a href=\"/bookdetail?bookid=%s\" title=\"%s\">\n" +
                "                                        <img src=\"%s\" alt=\"\">\n" +
                "                                        <span class=\"bookname\">%s</span>\n" +
                "                                    </a>\n" +
                "                                    <div class=\"price \">\n" +
                "                                        <span class=\"price-left\">￥%s</span>\n" +
                "                                        <s class=\"price-right\">￥%s</s>\n" +
                "                                    </div>\n" +
                "                                </div>\n" +
                "                            </td>";
        AuthortestSeviceImpl authortestSevice=new AuthortestSeviceImpl();
        Authortest authortest=authortestSevice.selectAtByAuthor(type);
        s1=String.format(s1,authortest.getAuthorimg(),authortest.getAuthorname(),authortest.getAuthorbrief());
        List<Book> books=authortestSevice.selectBookByAuthor(type);
        String sumstr="";
        for (int i=0;i<books.size();i++){
            Book book=books.get(i);
            String s=String.format(s2,book.getBookid(),book.getBookname(),book.getBookimg(),book.getBookname(),book.getBooknewprice(),book.getBookoldprice());
            sumstr+=s;
        }
        Displaystr displaystr=new Displaystr(s1,sumstr);
        return  displaystr;
    }
    @RequestMapping(value ="/paging.action")
    @ResponseBody
    public String getPaging(HttpServletResponse response, HttpServletRequest request,String classname) throws IOException, ServletException {
        response.setCharacterEncoding("utf-8");
        String s1="             <div class=\"paging-content-detail\">\n" +
                "                <a href=\"/bookdetail?bookid=%s\" title=\"%s\">\n" +
                "                    <img src=\"%s\" alt=\"\">\n" +
                "                    <div class=\"paging-bookname\">%s</div>\n" +
                "                </a>\n" +
                "                <div class=\"paging-price \">\n" +
                "                    <span class=\"paging-price-left\">￥%s</span>\n" +
                "                    <s class=\"paging-price-right\">￥%s</s>\n" +
                "                </div>\n" +
                "            </div>";
        String sumstr="";
        BookSeviceImpl bookSevice=new BookSeviceImpl();
        List<Book> books=bookSevice.SelectByBookclass2(classname);
        for (Book book:books){
            String str=String.format(s1,book.getBookid(),book.getBookname(),book.getBookimg(),book.getBookname(),book.getBooknewprice(),book.getBookoldprice());
            sumstr+=str;
        }
        return sumstr;


    }
    @RequestMapping(value = "/allclass.action")
    public void allClass(HttpServletRequest request,HttpServletResponse response,String text) throws ServletException, IOException {
        response.setCharacterEncoding("utf-8");
        BookSeviceImpl bookSevice =new BookSeviceImpl();
        List<Book> books=bookSevice.SelectByBookclass2(text);
        request.getSession().setAttribute("books",books);
        request.getRequestDispatcher("/books").forward(request,response);
    }
    @RequestMapping(value = "/search.action")
    public void Search(HttpServletRequest request,HttpServletResponse response,String text) throws ServletException, IOException {
        response.setCharacterEncoding("utf-8");
        BookSeviceImpl bookSevice =new BookSeviceImpl();
        //String text=request.getParameter("search");
        System.out.println("sdhfgtuyfguygf"+text);
        List<Book> books=bookSevice.SelectByLike(text);
        request.getSession().setAttribute("books",books);
    }
}
