package com.zyx.mybookstore.Service.Impl;

import ch.qos.logback.core.db.dialect.DBUtil;
import com.zyx.mybookstore.Mapper.MoreDao;
import com.zyx.mybookstore.Pojo.Book;
import com.zyx.mybookstore.util.DBTools;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class MoreSeviceImpl {
    SqlSession session=DBTools.getSession();
    public List<Book> SelectMorebooks(){
        MoreDao moreDao=session.getMapper(MoreDao.class);
        return  moreDao.selectMorebooks();
    }


}
