package com.zyx.mybookstore.Service.Impl;

import com.zyx.mybookstore.Mapper.CartDao;
import com.zyx.mybookstore.Mapper.CartMapper;
import com.zyx.mybookstore.Pojo.Book;
import com.zyx.mybookstore.Pojo.Cart;
import com.zyx.mybookstore.util.DBTools;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class CartServiceImpl {
    SqlSession session=DBTools.getSession();
    public void AddCart(Cart cart){
        CartMapper cartMapper=session.getMapper(CartMapper.class);
        CartDao cartDao=session.getMapper(CartDao.class);
        if(cartDao.SelectBybookid(cart.getBookid())==null){
            cartMapper.insertSelective(cart);
        }else {
            cart=cartDao.SelectBybookid(cart.getBookid());
            cartDao.UpdateBookcount(cart.getCartid());
        }
        session.commit();
    }
    public List<Book> SelectMyCart(int userid){
        CartDao cartDao=session.getMapper(CartDao.class);
        List<Cart> carts=cartDao.SelectByuser(userid);
        List<Book> books=cartDao.SelectbooksByuser(userid);
        for (int i=0;i<carts.size();i++) {
            books.get(i).setBookcount(carts.get(i).getBookcount());
        }
        return books;
    }
    public void  UpdateState(String state,int bookid){
        CartDao cartDao=session.getMapper(CartDao.class);
        cartDao.UpdateState(state,bookid);
        session.commit();
    }

}
