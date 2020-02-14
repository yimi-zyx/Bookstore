package com.zyx.mybookstore.Mapper;

import com.zyx.mybookstore.Pojo.City;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface CityDao {
    @Select(value = "Select cityname FROM city WHERE LENGTH(citycode)=2")
    List<String> Selectprovince();
    @Select(value = "Select cityname FROM city WHERE citycode LIKE '${arg0}%' AND LENGTH(citycode)=#{arg1}")
    List<String> Selectctiy(String arg0,int arg1);
    @Select(value = "Select citycode FROM city WHERE cityname=#{str}")
    String selectByname(String string);
    @Select(value = "SELECT citycode FROM city WHERE citycode IN (SELECT citycode FROM `city` WHERE citycode not LIKE '%00') AND citycode not LIKE '%01' LIMIT 2136,3")
    List<String> SelectCitycde();
}
