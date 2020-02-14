package com.zyx.mybookstore.Mapper;

import com.zyx.mybookstore.Pojo.Book;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface SliderDao {
    @Select(value = "SELECT book.bookid,bookimg FROM book,slider WHERE book.bookid=slider.bookid")
    List<Book> selectSbooks();
}
