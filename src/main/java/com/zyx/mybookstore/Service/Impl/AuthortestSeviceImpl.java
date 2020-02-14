package com.zyx.mybookstore.Service.Impl;

import com.zyx.mybookstore.Mapper.AuthortestDao;
import com.zyx.mybookstore.Pojo.Authortest;
import com.zyx.mybookstore.Pojo.Book;
import com.zyx.mybookstore.util.DBTools;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class AuthortestSeviceImpl {
    SqlSession session=DBTools.getSession();
    AuthortestDao authortestDao=session.getMapper(AuthortestDao.class);

    public List<String> selectAuthortest(int num1,int num2){
        return authortestDao.selectAuthor(num1,num2);
    }
    public Authortest selectAtByAuthor(String author){
        return  authortestDao.selectAtByAuthor(author);
    }
    public List<Book> selectBookByAuthor(String author){
        return  authortestDao.selectBookByauthor(author);
    }

}
