package com.zyx.mybookstore.Service.Impl;

import com.zyx.mybookstore.Mapper.BookDao;
import com.zyx.mybookstore.Mapper.BookMapper;
import com.zyx.mybookstore.Pojo.Book;
import com.zyx.mybookstore.util.DBTools;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class BookSeviceImpl {
    SqlSession session =  DBTools.getSession();

    public void InsertBook(Book book){
        BookMapper mapper = session.getMapper(BookMapper.class);
        mapper.insert(book);
        session.commit();
    }
    public Book SelectbookByid(int bookid){
        BookMapper mapper = session.getMapper(BookMapper.class);
        return mapper.selectByPrimaryKey(bookid);
    }
    public List<Book> SelectByBookclass2(String string){
        BookDao bookDao=session.getMapper(BookDao.class);
        return  bookDao.selectByClass2(string);
    }
    public List<Book> SelectByAuthor(String author,int id){
        BookDao bookDao=session.getMapper(BookDao.class);
        return  bookDao.selectbookByAuthor(author,id);
    }
    public List<Book> SelectByLike(String string){
        BookDao bookDao=session.getMapper(BookDao.class);
        return  bookDao.SelectBookByLike(string);
    }
    public void Updatebookcout(int arg0,int arg1){
        BookDao bookDao=session.getMapper(BookDao.class);
        bookDao.updateBookcount(arg0,arg1);
        session.commit();
    }
}
