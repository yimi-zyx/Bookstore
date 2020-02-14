package com.zyx.mybookstore.Controller;

import com.zyx.mybookstore.Pojo.*;
import com.zyx.mybookstore.Service.Impl.*;
import com.zyx.mybookstore.util.Ordernum;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class CartController {
    @RequestMapping(value = "/addcart.action")
    @ResponseBody
    public String addCart(HttpServletRequest request ,HttpServletResponse response,String booknumber) throws IOException {
        Book book=(Book)request.getSession().getAttribute("book");
        User user=(User)request.getSession().getAttribute("user");
        Cart cart=new Cart();
        if(booknumber==null){
            booknumber="1";
        }
        int bookcount=Integer.valueOf(booknumber);
        cart.setBookcount(bookcount);
        cart.setBookid(book.getBookid());
        cart.setUserid(user.getUserid());
        cart.setState("0");
        CartServiceImpl cartService=new CartServiceImpl();
        cartService.AddCart(cart);
        System.out.println("xjkvdfgvu"+cart);
        return "true";
    }
    @RequestMapping(value = "/deleteselect.action")
    public void deleteSelect(HttpServletRequest request,HttpServletResponse response,String cartbookid) throws ServletException, IOException {
        CartServiceImpl cartService=new CartServiceImpl();
        System.out.println(cartbookid);
        String[] strings=cartbookid.split(",");
        for(int i=0;i<strings.length;i++){
            if(strings[i]!=null){ ;
                System.out.println(i+"sdhfg"+strings[i]);
                cartService.UpdateState("1",Integer.valueOf(strings[i]));
            }
        }
        response.getWriter().write("true");
    }
    @RequestMapping(value = "/favoriteselect.action")
    public void favoriteselect(HttpServletRequest request,HttpServletResponse response,String cartbookid) throws ServletException, IOException {
        System.out.println(cartbookid);
        FavoriteSeviceImpl favoriteSevice=new FavoriteSeviceImpl();
        String[] strings=cartbookid.split(",");
        User user= (User) request.getSession().getAttribute("user");
        for(int i=0;i<strings.length;i++){
            if(strings[i]!=null){ ;
                System.out.println(i+"sdhfg"+strings[i]);
                Favortie favortie=new Favortie(user.getUserid(),Integer.valueOf(strings[i]),"0");
                favoriteSevice.InsertFavorite(favortie);
            }
        }
        response.getWriter().write("true");
    }
    @RequestMapping(value = "/singledelete.action")
    public void singledelete(HttpServletRequest request,HttpServletResponse response,String cartbookid) throws ServletException, IOException {
        CartServiceImpl cartService=new CartServiceImpl();
        System.out.println(cartbookid);
        if (cartbookid!=null){
            cartService.UpdateState("1",Integer.valueOf(cartbookid));
            response.getWriter().write("true");
        }
    }
    @RequestMapping(value = "/closeaccounts.action")
    public void closeaCcounts(HttpServletRequest request,HttpServletResponse response,String cartbookid,String bookcount) throws ServletException, IOException {
        response.setCharacterEncoding("utf-8");
        System.out.println(cartbookid);
        BookSeviceImpl bookSevice=new BookSeviceImpl();
        String[] strid=cartbookid.split(",");
        String[] strcount=bookcount.split(",");
        //List<Book> books=new ArrayList<>();
        //User user= (User) request.getSession().getAttribute("user");
      String str="<div class=\"mycart-goodsdisplay clearfix\">\n" +
                "                        <div class=\"goodsdisplay-left\">\n" +
                "                            <img src=\"%s\">\n" +
                "                        </div>\n" +
                "                        <div class=\"goodsdisplay-right1 v-center\">\n" +
                "                            <div>%s</div>\n" +
                "                            <div>%s</div>\n" +
                "                        </div>\n" +
                "                        <div class=\"goodsdisplay-rights v-center\">\n" +
                "                            ￥%s\n" +
                "                        </div>\n" +
                "                        <div class=\"goodsdisplay-rights v-center\">\n" +
                "                            ×%s\n" +
                "                        </div>\n" +
                "                    </div>\n";
        String sumstr="";
        for(int i=0;i<strid.length;i++){
            if(strid[i]!=null){ ;
                bookSevice.Updatebookcout(Integer.valueOf(strid[i]),Integer.valueOf(strcount[i]));
                Book book=bookSevice.SelectbookByid(Integer.valueOf(strid[i]));
                sumstr+=String.format(str,book.getBookimg(),book.getBookname(),book.getBookbrief(),book.getBooknewprice(),book.getBookcount());
                //books.add(book);
            }
        }
       // request.getSession().setAttribute("mycartbooks",books);
       response.getWriter().write(sumstr);
    }
    @RequestMapping(value = "/consigneeinfo")
    public void consigneeinfo(HttpServletRequest request,HttpServletResponse response,String receiver,String phone,String address) throws IOException {
        ConsigneeinfoServiceImpl service=new ConsigneeinfoServiceImpl();
        User user=(User)request.getSession().getAttribute("user");
        Consigneeinfo consigneeinfo=new Consigneeinfo();
        consigneeinfo.setConsigneeadd(address);
        consigneeinfo.setConsigneename(receiver);
        consigneeinfo.setPhone(phone);
        consigneeinfo.setState("0");
        consigneeinfo.setUserid(user.getUserid());
        service.addConsigneeinfo(consigneeinfo);
        request.getSession().setAttribute("consigneeinfo",consigneeinfo);
        response.getWriter().write("true");
    }
    @RequestMapping(value = "/submitinfo")
    public void submitinfo(HttpServletRequest request,HttpServletResponse response,String totals) throws IOException {
        List<Book> books= (List<Book>) request.getSession().getAttribute("mycartbooks");
        CartServiceImpl cartService=new CartServiceImpl();
        for (Book book:books){
            cartService.UpdateState("2",book.getBookid());
        }
        double money=0;
        if (totals!=null){
            money=Double.valueOf(totals);
        }
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String newDate=sdf.format(new Date());

        OrderServiceImpl service=new OrderServiceImpl();
        Ordernum ordernum=new Ordernum();
        String ordernumber=ordernum.getOrdernumber();

        Consigneeinfo consigneeinfo=(Consigneeinfo) request.getSession().getAttribute("consigneeinfo");
        Orders order=new Orders();
        order.setOrdernumber(ordernumber);
        order.setConsigneeinfoid(consigneeinfo.getConsigneeinfoid());
        order.setOrderpay(money);
        order.setOrderstate("0");
        order.setOrdertime(newDate);
        order.setPaystate("0");
        order.setOrderremark("0");
        service.addOrder(order);
        response.getWriter().write(ordernumber);
    }
}
