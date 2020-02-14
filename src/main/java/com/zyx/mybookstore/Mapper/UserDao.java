package com.zyx.mybookstore.Mapper;

import com.zyx.mybookstore.Pojo.User;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface UserDao {
    @Select(value = {"select * from user where username=#{string}"})
    User selectByUsername(String string);
    @Select(value = {"select * from user where userphone=#{string}"})
    User selectByUserphone(String string);
    @Select(value = {"select * from user where useremail=#{string}"})
    User selectByUseremail(String string);

    @Update(value = {"update user set userpwd=#{userpwd} where username=#{username}"})
    int updateByUserid(User user);
}
