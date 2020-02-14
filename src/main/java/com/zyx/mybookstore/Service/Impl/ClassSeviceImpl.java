package com.zyx.mybookstore.Service.Impl;


import com.zyx.mybookstore.Mapper.BookDao;
import com.zyx.mybookstore.Mapper.ClassDao;
import com.zyx.mybookstore.Mapper.ClassMapper;
import com.zyx.mybookstore.Pojo.Outtype;
import com.zyx.mybookstore.Pojo.Type;
import com.zyx.mybookstore.util.DBTools;

import org.apache.ibatis.session.SqlSession;
import com.zyx.mybookstore.Pojo.Class;
import org.jsoup.Connection;

import java.util.*;

public class ClassSeviceImpl {
    SqlSession session =  DBTools.getSession();
    public void insertClass(Class classes){
        ClassMapper mapper = session.getMapper(ClassMapper.class);
        ClassDao classDao=session.getMapper(ClassDao.class);
        if(classDao.SelectClassid(classes)==null){
            mapper.insertSelective(classes);
            session.commit();
        }
    }
    public List<Outtype> selectOuttype(){
        ClassDao mapper=session.getMapper(ClassDao.class);
        List<Outtype> outtype=mapper.SelectOuttype();
        return  outtype;
    }
    public  List<Type> ClasslistMap( int outtypenum){
        ClassDao classDao=session.getMapper(ClassDao.class);
        BookDao bookDao=session.getMapper(BookDao.class);
        List<String> class1name=classDao.SelectCnameByOutnum(outtypenum);
        List<Type> types=new ArrayList<>();
        for(int i=0;i<class1name.size();i++){
            types.add(new Type(class1name.get(i),classDao.SelectC2nameByC1(class1name.get(i)),bookDao.selectByClass2(classDao.SelectC2nameByC1(class1name.get(i)).get(0))));
        }
        return types;
    }
    public  List<Type> Classlist(){
        ClassDao classDao=session.getMapper(ClassDao.class);
        BookDao bookDao=session.getMapper(BookDao.class);
        List<String> class1name=classDao.SelectClass1();
        List<Type> types=new ArrayList<>();
        for(int i=0;i<class1name.size();i++){
            types.add(new Type(class1name.get(i),classDao.SelectC2nameByC1(class1name.get(i))));
        }
        return types;
    }


}
