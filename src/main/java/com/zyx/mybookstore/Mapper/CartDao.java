package com.zyx.mybookstore.Mapper;

import com.zyx.mybookstore.Pojo.Book;
import com.zyx.mybookstore.Pojo.Cart;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface CartDao {
    @Select(value = "select cartid from cart where bookid=#{arg0}")
    Cart SelectBybookid(int arg0);

    @Update(value = "update cart set bookcount=bookcount+1 where cartid=#{arg0}")
    int UpdateBookcount(int arg0);

    @Select(value = "SELECT * FROM cart WHERE userid=#{arg0} AND state=0")
    List<Cart> SelectByuser(int arg0);

    @Select(value = "SELECT book.bookid,bookimg,bookbrief,bookname,booknewprice,bookoldprice FROM cart,book WHERE userid=#{arg0} AND state=0 and book.bookid=cart.bookid")
    List<Book> SelectbooksByuser(int agr0);
    @Update(value = "UPDATE cart SET state=#{arg0} WHERE bookid=#{arg1}")
    int UpdateState(String arg0,int arg1);
}
