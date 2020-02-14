package com.zyx.mybookstore.Mapper;

import com.zyx.mybookstore.Pojo.Authortest;
import com.zyx.mybookstore.Pojo.Book;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AuthortestDao {
    @Select(value = "SELECT authorname FROM authortest LIMIT #{arg0},#{arg1}")
    List<String> selectAuthor(int num,int nums);
    @Select(value = "SELECT bookid,bookname,booknewprice,bookoldprice,bookimg FROM book WHERE bookauthor=#{author} LIMIT 4")
    List<Book> selectBookByauthor(String author);
    @Select(value = "SELECT * FROM authortest WHERE authorname=#{author}")
    Authortest selectAtByAuthor(String author);
}
