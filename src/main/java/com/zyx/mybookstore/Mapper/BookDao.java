package com.zyx.mybookstore.Mapper;

import com.zyx.mybookstore.Pojo.Book;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;


import java.util.List;

public interface BookDao {
    @Select(value = "SELECT bookid,bookname,booknewprice,bookoldprice FROM book WHERE bookauthor=#{author} LIMIT 4")
    List<Book> selectByAuthor(String author);
    @Select(value = "SELECT DISTINCT bookid,bookimg,bookname,bookoldprice,booknewprice FROM `book` WHERE bookclass2=#{string} or book2class2=#{string}")
    List<Book> selectByClass2(String string);
    @Select(value = "SELECT * FROM book WHERE bookauthor=#{arg0} and bookid!=#{arg1}")
    List<Book> selectbookByAuthor(String arg0,int arg1);
    @Select(value = "SELECT DISTINCT * FROM book WHERE bookclass1 LIKE '%${str}'OR bookclass1 LIKE '${string}%' OR bookclass2 LIKE '%${string}' OR bookclass2 LIKE '${string}%' OR bookclass3 LIKE '%${string}' OR bookclass3 LIKE '${string}%' OR book2class1 LIKE '%${string}' OR book2class1 LIKE '${string}%' OR book2class2 LIKE '%${string}' OR book2class2 LIKE '${string}%' OR book2class3 LIKE '%${string}' OR book2class3 LIKE '${string}%' OR bookname LIKE '%${string}' OR bookname LIKE '${string}%' or bookauthor =#{str}")
    List<Book> SelectBookByLike(String str);
    @Update(value = "update book set bookcount=#{arg1} where bookid=#{arg0}")
    void updateBookcount(int arg0,int arg1);
}

