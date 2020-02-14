package com.zyx.mybookstore.Service.Impl;

import com.zyx.mybookstore.Mapper.FeatureDao;
import com.zyx.mybookstore.Pojo.Book;
import com.zyx.mybookstore.util.DBTools;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class FeatureSeviceImpl {
    SqlSession session=DBTools.getSession();
    public List<Book> SelectFeatureByType(String string){
        FeatureDao featureDao=session.getMapper(FeatureDao.class);
        return featureDao.SelectfeatureBytype(string);
    }
    public List<Book> SelectFeatureByTypelimit(String string){
        FeatureDao featureDao=session.getMapper(FeatureDao.class);
        return featureDao.SelectfeatureBytypelimit(string);
    }
}
