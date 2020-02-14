package com.zyx.mybookstore;

import com.zyx.mybookstore.Mapper.CityDao;
import com.zyx.mybookstore.Mapper.CityMapper;
import com.zyx.mybookstore.Mapper.ClassDao;
import com.zyx.mybookstore.Mapper.ClassMapper;
import com.zyx.mybookstore.Pojo.City;
import com.zyx.mybookstore.Pojo.Class;
import com.zyx.mybookstore.Pojo.Type;
import com.zyx.mybookstore.Service.Impl.AuthortestSeviceImpl;
import com.zyx.mybookstore.util.DBTools;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class BookTest {
    @Test
    public void insertClass(){
        SqlSession session =  DBTools.getSession();
        ClassMapper mapper = session.getMapper(ClassMapper.class);
        ClassDao classDao=session.getMapper(ClassDao.class);
        Class classes=new Class();
        classes.setClass1name("a");
        classes.setClass2name("a");
        classes.setClass3name("a");
        System.out.println(classDao.SelectClassid(classes));
        if(classDao.SelectClassid(classes)==null){
            mapper.insertSelective(classes);
            session.commit();
        }
    }
    @Test
    public void  Str(){
        String  string=
                "<table border=\"1\">\n" +
                "  <tbody>\n"+
                "    <tr>\n%s" +
                "    </tr>\n" +
                "    <tr>\n" +
                "    </tr>\n" +
                "  </tbody>\n" +
                "</table>";
        String string2="      <td>\n" +
                "        <div class=\"feature-book\">\n" +
                "          <a href=\"/bookdetail\" title=\"%s\">\n" +
                "            <img src=\"%s\" alt=\"\">\n" +
                "            <span class=\"bookname\">%s</span>\n" +
                "          </a>\n" +
                "          <div class=\"price \">\n" +
                "            <span class=\"price-left\">￥%s</span>\n" +
                "            <s class=\"price-right\">￥%s</s>\n" +
                "          </div>\n" +
                "        </div>\n" +
                "      </td>\n";
        String string3="            <div class=\"feature-righrcontent\">\n" +
                "                <div class=\"clearfix\">\n" +
                "                    <div class=\"feature-bookimg\">\n" +
                "                        <a href=\"/bookdetail\">\n" +
                "                            <img src=\"image/1201658694_0_1_350x350.jpg\">\n" +
                "                        </a>\n" +
                "                    </div>\n" +
                "                    <div class=\"feature-booktext\">\n" +
                "                        <a href=\"/bookdetail\">\n" +
                "                            <div class=\"feature-bookname\"> 时光背影</div>\n" +
                "                        </a>\n" +
                "                        <div class=\"feature-bookprice\">\n" +
                "                            <span class=\"feature-bookpricel\">￥22.12</span>\n" +
                "                            <span class=\"feature-bookpricer\">￥29.90</span>\n" +
                "                        </div>\n" +
                "                    </div>\n" +
                "                </div>\n" +
                "                <div class=\"feature-divider\"></div>\n" +
                "            </div>";
        string2=String.format(string2, "fdhyvgfg","dfygf.jsp","fdhyvgfg",12,23);
        //System.out.println(String.format(string,string2+string2));
        String s= "特 价 书";
        s=s.replace("&ensp;","");

        String s1=
                "                <div class=\"author-detailin clearfix\">\n" +
                "                    <div class=\"author-img\">\n" +
                "                        <img src=\"%s\">\n" +
                "                    </div>\n" +
                "                    <div class=\"author-detailtext\">\n" +
                "                        <div class=\"author-name\">%s</div>\n" +
                "                        <div class=\"author-detailbrief\">%s</div>\n" +
                "                    </div>\n" +
                "                </div>\n" ;
        String s2=
                "                    <table border=\"1\">\n" +
                "                        <tbody><tr>\n" +
                "                            <td>\n" +
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
                "                            </td>\n" +
                "                        </tr>\n" +
                "                    </tbody></table>\n";
    }
    @Test
    public void books(){
        AuthortestSeviceImpl authortestSevice=new AuthortestSeviceImpl();
        System.out.println(authortestSevice.selectAuthortest(0,7));
    }
//    @Test
//    public void ClasslistMap(){
//        SqlSession session=DBTools.getSession();
//        ClassDao classDao=session.getMapper(ClassDao.class);
//        List<String> class1name=classDao.SelectCnameByOutnum(1);
//        List<String> class2name=classDao.SelectC2nameByC1(class1name.get(0));
//        List<Type> types=new ArrayList<>();
//        for(int i=0;i<class1name.size();i++){
//            types.add(new Type(class1name.get(i),classDao.SelectC2nameByC1(class1name.get(i))));
//        }
//        System.out.println(types);
//
//    }
@Test
    public void s(){
        SqlSession sqlSession=DBTools.getSession();
        CityDao cityDao=sqlSession.getMapper(CityDao.class);
        System.out.println(cityDao.Selectctiy("1101",6));
    }
}
