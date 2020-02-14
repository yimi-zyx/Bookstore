package com.zyx.mybookstore.Service;


import com.zyx.mybookstore.Pojo.User;
import com.zyx.mybookstore.util.BaseDto;

public interface UserService {

    //判断是否为有效用户
    BaseDto<User> isUser(String string);
    //判断是否为有效用户
    BaseDto<User> isUserByUsername(String string);
    //判断是否为有效用户
    BaseDto<User> isUserByUserphone(String string);
    //判断是否为有效用户
    BaseDto<User> isUserUseremail(String string);
    //修改密码
    boolean updatePwdById(User user);
//    插入数据实现用户注册
    BaseDto<User> insertUser(User user);
}
