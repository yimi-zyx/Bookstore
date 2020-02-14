package com.zyx.mybookstore;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zyx.mybookstore.Mapper.UserDao;
import com.zyx.mybookstore.Mapper.UserMapper;
import com.zyx.mybookstore.Pojo.User;
import com.zyx.mybookstore.Pojo.UserExample;
import com.zyx.mybookstore.util.DBTools;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;


public class UserTest {
    public static void main(String[] args){
        Insert();
    }
    public static void Insert() {
        SqlSession session=DBTools.getSession();
        UserMapper mapper=session.getMapper(UserMapper.class);
        User user=new User();
        user.setUsername("test");
        user.setUserpwd("123");
        user.setUserphone("17761248243");
        user.setUseremail("2906219800@qq.com");
        user.setUserimg("defaultheadportrait.png");
        //mapper.insert(user);
        mapper.insertSelective(user);//可选数据库默认值，常用此方面插入
        session.commit();
    }
    public static void selectAll() {
        SqlSession session =  DBTools.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        PageHelper.startPage(1,1);//页码，查多少页
        UserExample example=new UserExample();
        UserExample.Criteria criteria=example.createCriteria();
        criteria.andUsernameEqualTo("test");
        System.out.println(mapper.selectByExample(example));
        List<User> uList=mapper.selectByExample(example);
        PageInfo<User> p=new PageInfo<User>();
        System.out.println(p);

    }
    public static void select() {
        SqlSession session =  DBTools.getSession();
        UserDao userDao=session.getMapper(UserDao.class);
        User user=new User();
        user.setUsername("test");
        user.setUserpwd("12345678");
        user.setUserphone("17761248243");
        user.setUseremail("2906219800@qq.com");
        user.setUserimg("defaultheadportrait.png");
        System.out.println(userDao.updateByUserid(user));
        session.commit();
        System.out.println(userDao.selectByUseremail("2906219800@qq.com"));
//        System.out.println(userDao.selectByUsername("est"));
//        System.out.println(userDao.selectByUserphone("7761248243"));

    }
    @Test
    public  void str(){
        String s="1";
        System.out.println(Integer.valueOf(s));


    }
}
