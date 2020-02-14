package com.zyx.mybookstore.Service.Impl;

import com.zyx.mybookstore.Mapper.HotDao;
import com.zyx.mybookstore.Pojo.Book;
import com.zyx.mybookstore.util.DBTools;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class HotSeviceImpl {
    SqlSession session=DBTools.getSession();
    public List<Book> selectHotbooks(){
        HotDao hotDao=session.getMapper(HotDao.class);
        List<Book> books=hotDao.SelectHotbooks();
        return  books;
    }


}
