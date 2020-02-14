package com.zyx.mybookstore.Mapper;

import com.zyx.mybookstore.Pojo.Book;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface HotDao {
    @Select(value = "SELECT book.bookid ,bookname,bookbrief,bookoldprice,booknewprice,bookimg FROM book,hot WHERE hot.bookid=book.bookid")
    List<Book> SelectHotbooks();
}
