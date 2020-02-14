package com.zyx.mybookstore;

import com.zyx.mybookstore.Mapper.CityDao;
import com.zyx.mybookstore.Mapper.CityMapper;
import com.zyx.mybookstore.Pojo.Book;
import com.zyx.mybookstore.Pojo.Cart;
import com.zyx.mybookstore.Pojo.City;
import com.zyx.mybookstore.Pojo.Class;
import com.zyx.mybookstore.Service.Impl.BookSeviceImpl;
import com.zyx.mybookstore.Service.Impl.CartServiceImpl;
import com.zyx.mybookstore.Service.Impl.ClassSeviceImpl;
import com.zyx.mybookstore.util.DBTools;
import org.apache.ibatis.session.SqlSession;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybookstoreApplicationTests {

    @Test
    public void pachong3() throws IOException {
        //设置需要下载多少页
        int page=10;//先爬取10页的内容

      for(int i=496523;i<990011;i++){
            pachong_page("http://product.dangdang.com/23"+i+".html");
            //book.setBookid(i);

     }

        System.out.println("爬取结束！");
    }
    public int pachong_page(String url) throws IOException {
        Document doc = null;
        boolean flag=false;
        try {

            doc = Jsoup.connect(url).userAgent("Mozilla").cookie("auth","token").get();//模拟火狐浏览器
            System.out.println("成功");
            System.out.println(url);
            flag=true;
        } catch (IOException e) {
            System.out.println("错误");
            flag=false;
            e.printStackTrace();
        }
        Book book=new Book();
        if(flag) {
            System.out.println(doc.title().substring(1,3));
            //这里根据在网页中分析的类选择器来获取电影列表所在的节点
            Elements div = doc.select("[class=name_info]");
            //获取电影列表

            String bookname=div.select("h1").text();
            System.out.println("书名:"+bookname);
            book.setBookname(bookname);

            String bookbrief=div.select("h2").text();
            System.out.println("书简介："+bookbrief);
            book.setBookbrief(bookbrief);

            Elements div2 = doc.select("[class=messbox_info]").select("span");
            String bookauthor=div2.get(0).select("a").text();
            System.out.println("作者："+bookauthor);
            book.setBookauthor(bookauthor);

            String bookpress=div2.get(1).select("a").text();
            System.out.println("出版社："+bookpress);
            book.setBookpress(bookpress);

            String bookpresstime=div2.get(2).text();
            if(bookpresstime.length()>5){
                System.out.println("出版时间："+bookpresstime.substring(5));
                book.setBookpresstime(bookpresstime.substring(5));
            }else {
                book.setBookpresstime("");
            }

            //Elements div3 = doc.select("[class=price_pc]");
            String booknewprice=doc.select("[id=dd-price]").text();
            double booknewprices=Double.parseDouble(booknewprice.substring(1));
            book.setBooknewprice(booknewprices);
            System.out.println("定价："+booknewprices);

            String bookoldprice=doc.select("[class=price_m]").text();
            // Elements div4= doc.select("[class=price_m]");
            if(bookoldprice.length()>1){
                double bookoldprices=Double.parseDouble(bookoldprice.substring(1));
                book.setBookoldprice(bookoldprices);
                System.out.println("原价："+bookoldprices);
            }else {
                book.setBookoldprice(null);
            }


            String bookimg=doc.select("[class=pic]").select("img").attr("abs:src");
            System.out.println("图片："+bookimg);
            book.setBookimg(bookimg);

            Elements bookinfo=doc.select("[class=key clearfix]").select("li");
            String booksize=bookinfo.get(0).text().substring(4);
            book.setBooksize(booksize);
            System.out.println("目录："+booksize);

            String bookisbn=bookinfo.get(4).text().substring(11);
            book.setBookisbn(bookisbn);
            System.out.println("目录："+bookisbn);

            Elements bookclass=doc.select("[class=lie]");
            System.out.println("分类："+bookclass);
            if(bookclass.size()>0){
                ClassSeviceImpl classSevice=new ClassSeviceImpl();
                Class classes=new Class();
                Elements bookclassinfo=bookclass.get(0).select("a");
                book.setBookclass1(bookclassinfo.get(1).text());
                book.setBookclass2(bookclassinfo.get(2).text());
                classes.setClass1name(bookclassinfo.get(1).text());
                classes.setClass2name(bookclassinfo.get(2).text());
                if(bookclassinfo.size()>3){
                    book.setBookclass3(bookclassinfo.get(3).text());
                    classes.setClass3name(bookclassinfo.get(3).text());
                }else {
                    book.setBook2class3("");
                    classes.setClass3name("");
                }
                classSevice.insertClass(classes);
            }
            if(bookclass.size()>1){
                ClassSeviceImpl classSevice=new ClassSeviceImpl();
                Class classes=new Class();
                Elements bookclassinfo=bookclass.get(1).select("a");
                book.setBook2class1(bookclassinfo.get(1).text());
                book.setBook2class2(bookclassinfo.get(2).text());
                classes.setClass1name(bookclassinfo.get(1).text());
                classes.setClass2name(bookclassinfo.get(2).text());
                if(bookclassinfo.size()>3){
                    book.setBook2class3(bookclassinfo.get(3).text());
                    classes.setClass3name(bookclassinfo.get(3).text());
                }else {
                    book.setBook2class3("");
                    classes.setClass3name("");
                }
                classSevice.insertClass(classes);
            }
            System.out.println(book);
            BookSeviceImpl bookSevice=new BookSeviceImpl();
            bookSevice.InsertBook(book);
        }
        return 0;
    }
    @Test
    public void addcart(){
        CartServiceImpl cartService=new CartServiceImpl();
        Cart cart=new Cart();
        cart.setBookcount(1);
        cart.setBookid(1);
        cart.setUserid(1);
        cartService.AddCart(cart);
    }
    @Test
    public void contextLoads() throws  IOException{
        //cityinfo("http://www.ip33.com/area_code.html");
        /* cityinfo("http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/2013/11/01/110101.html"); */
        List<String> listcitycode=SelectCity();
        for (String citycode:listcitycode){
            String str1=citycode.substring(0,2);
            String str2=citycode.substring(2,4);
            cityinfo2("http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/2013/"+str1+"/"+str2+"/"+citycode+".html");

        }
    }
    public  int cityinfo(String url) throws  IOException{
        Document doc = null;
        boolean flag=false;
        try {

            doc = Jsoup.connect(url).userAgent("Mozilla").cookie("auth","token").get();//模拟火狐浏览器
            System.out.println("成功");
            System.out.println(url);
            flag=true;
        } catch (IOException e) {
            System.out.println("错误");
            flag=false;
            e.printStackTrace();
        }
        Elements elements=doc.select("[class=ip]");
//        for (int i=15;i<16;i++){
        for (int i=0;i<elements.size();i++){
            Element elementsip=elements.get(i);
            String str=elementsip.select("h4").text();
            City city=new City();
            city.setCityname(str.split(" ")[0]);
            city.setCitycode(str.split(" ")[1]);
            //add(city);

            System.out.println("sheng:"+i+" "+city);
            Elements element=elementsip.select("ul").select("li");
//            for(int i2=163;i2<174;i2++){
            for(int i2=0;i2<element.size();i2++){
                String str2=element.get(i2).text();
                City city2=new City();
                city2.setCityname(str2.split(" ")[0]);
                city2.setCitycode(str2.split(" ")[1]);
                //add(city2);
                //System.out.println("x"+i2+""+city2);
            }

        }
        return 0;
    }

    public  void cityinfo2(String url) throws  IOException {


        Document doc = null;
        boolean flag = false;
        try {

            doc = Jsoup.connect(url).userAgent("Mozilla").cookie("auth", "token").get();//模拟火狐浏览器
            System.out.println("成功");
            System.out.println(url);
            flag = true;
        } catch (IOException e) {
            System.out.println("错误");
            flag = false;
            e.printStackTrace();
        }
        Elements elements = doc.select("[class=towntr]");
        for (Element element:elements){
            String strcode=element.select("td").get(0).text();
            String strname=element.select("td").get(1).text();
            City city= new City();
            city.setCitycode(strcode);
            city.setCityname(strname);
            add(city);
            System.out.println(city);
        }
    }
    public void  add(City city){
        SqlSession session =  DBTools.getSession();
        CityMapper citymapper=session.getMapper(CityMapper.class);
        citymapper.insertSelective(city);
        session.commit();
    }
    public List<String> SelectCity(){
        SqlSession session =  DBTools.getSession();
        CityDao cityDao=session.getMapper(CityDao.class);
        List<String> liststr=cityDao.SelectCitycde();
        // System.out.println(liststr);
        return liststr;
    }
    @Test
    public void  dealStr(){
        String string="北京 11";
        String[] strs=string.split(" ");
        System.out.println(strs[1]);
    }

}
