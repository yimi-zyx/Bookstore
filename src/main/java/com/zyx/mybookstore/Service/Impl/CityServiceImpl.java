package com.zyx.mybookstore.Service.Impl;

import com.zyx.mybookstore.Mapper.CityDao;
import com.zyx.mybookstore.util.DBTools;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class CityServiceImpl {
    SqlSession session=DBTools.getSession();
    CityDao cityDao=session.getMapper(CityDao.class);
    public String SelectByname(String string){
       return cityDao.selectByname(string);
    }
    public List<String> SelectProvince(){
        return cityDao.Selectprovince();
    }
    public List<String> SelectCity(String string,int arg){
        return  cityDao.Selectctiy(string,arg);
    }
}
