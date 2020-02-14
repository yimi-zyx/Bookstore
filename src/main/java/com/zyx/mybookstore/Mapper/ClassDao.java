package com.zyx.mybookstore.Mapper;

import com.zyx.mybookstore.Pojo.Class;
import com.zyx.mybookstore.Pojo.Outtype;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ClassDao {
    @Select(value = {"select classid from class where class1name=#{class1name} and class2name=#{class2name} and class3name=#{class3name}"})
    Class SelectClassid(Class classes);
    @Select(value = "SELECT DISTINCT outtypename,outtypenum FROM outtype ")
    List<Outtype> SelectOuttype();
    @Select(value = "SELECT class1name FROM outtype WHERE outtypenum=#{arg0}")
    List<String> SelectCnameByOutnum(int arg0);
    @Select(value = "SELECT DISTINCT class2name FROM class WHERE class1name=#{string}")
    List<String> SelectC2nameByC1(String string);
    @Select(value = "SELECT DISTINCT class1name FROM class")
    List<String> SelectClass1();
}
