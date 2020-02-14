package com.zyx.mybookstore.Mapper;

import com.zyx.mybookstore.Pojo.Book;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface MoreDao {
    @Select(value = "SELECT book.bookid ,bookname,bookbrief,bookoldprice,booknewprice ,bookimg FROM book,more WHERE more.bookid=book.bookid")
    List<Book> selectMorebooks();
}
