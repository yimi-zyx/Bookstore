package com.zyx.mybookstore.Service.Impl;

import com.zyx.mybookstore.Mapper.NewbookDao;
import com.zyx.mybookstore.Pojo.Book;
import com.zyx.mybookstore.util.DBTools;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class NewbookSeviceImpl {
    SqlSession session=DBTools.getSession();
    public List<Book> SelectNewBooks()
    {
        NewbookDao newbookDao=session.getMapper(NewbookDao.class);
        return newbookDao.selectNewbooks();
    }
}
