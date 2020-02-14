package com.zyx.mybookstore.Mapper;

import com.zyx.mybookstore.Pojo.Book;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface FeatureDao {
    @Select(value = "SELECT book.bookid ,bookname,bookbrief,bookoldprice,booknewprice ,bookimg FROM book,feature WHERE feature.bookid=book.bookid AND featuretype=#{string}")
    List<Book> SelectfeatureBytype(String string);
    @Select(value = "SELECT book.bookid ,bookname,bookbrief,bookoldprice,booknewprice ,bookimg FROM book,feature WHERE feature.bookid=book.bookid AND featuretype=#{string} ORDER BY salecount LIMIT 5")
    List<Book> SelectfeatureBytypelimit(String string);
}
