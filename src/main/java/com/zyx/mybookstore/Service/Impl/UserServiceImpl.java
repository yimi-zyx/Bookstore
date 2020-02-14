package com.zyx.mybookstore.Service.Impl;

import com.zyx.mybookstore.Mapper.UserDao;
import com.zyx.mybookstore.Mapper.UserMapper;
import com.zyx.mybookstore.Pojo.User;
import com.zyx.mybookstore.util.BaseDto;
import com.zyx.mybookstore.util.DBTools;
import org.apache.ibatis.session.SqlSession;


//@Service
public class UserServiceImpl {
     public BaseDto<User> isUser(String string){
         BaseDto<User> userBaseDto=new BaseDto<>();
         SqlSession session =  DBTools.getSession();
         UserDao userDao=session.getMapper(UserDao.class);
         if(userDao.selectByUseremail(string)==null )
         {
             userBaseDto.setCode(400);
             userBaseDto.setDate(null);
         }else {
             userBaseDto.setCode(200);
             userBaseDto.setDate(userDao.selectByUseremail(string));
             userBaseDto.setMeg("");
             return userBaseDto;
         }
         if(userDao.selectByUsername(string)==null){
             userBaseDto.setCode(400);
             userBaseDto.setDate(null);
         }else {
             userBaseDto.setCode(200);
             userBaseDto.setDate(userDao.selectByUsername(string));
             return userBaseDto;
         }
         if(userDao.selectByUserphone(string)==null){
             userBaseDto.setCode(400);
             userBaseDto.setDate(null);
         }else {
             userBaseDto.setCode(200);
             userBaseDto.setDate(userDao.selectByUserphone(string));
             return userBaseDto;
         }
         return userBaseDto;
     }
    public boolean updatePwdById(User user){
         boolean flag=false;
        SqlSession session =  DBTools.getSession();
        UserDao userDao=session.getMapper(UserDao.class);
        if(userDao.updateByUserid(user)==1){
            flag=true;
        }
        session.commit();
    return flag;
    }
    public BaseDto<User> isUserByUsername(String string){
        BaseDto<User> userBaseDto=new BaseDto<>();
        SqlSession session =  DBTools.getSession();
        UserDao userDao=session.getMapper(UserDao.class);
        if(userDao.selectByUsername(string)==null){
            userBaseDto.setCode(400);
            return userBaseDto;
        }else {
            userBaseDto.setCode(200);
            userBaseDto.setMeg(string);
            return userBaseDto;
        }
    }
    public BaseDto<User> isUserByUserphone(String string){
        BaseDto<User> userBaseDto=new BaseDto<>();
        SqlSession session =  DBTools.getSession();
        UserDao userDao=session.getMapper(UserDao.class);
        if(userDao.selectByUserphone(string)==null){
            userBaseDto.setCode(400);
            return userBaseDto;
        }else {
            userBaseDto.setCode(200);
            userBaseDto.setMeg(string);
            return userBaseDto;
        }
    }
    public BaseDto<User> isUserByUseremail(String string){
        BaseDto<User> userBaseDto=new BaseDto<>();
        SqlSession session =  DBTools.getSession();
        UserDao userDao=session.getMapper(UserDao.class);
        if(userDao.selectByUseremail(string)==null){
            userBaseDto.setCode(400);
            return userBaseDto;
        }else {
            userBaseDto.setCode(200);
            userBaseDto.setMeg(string);
            return userBaseDto;
        }
    }
    public BaseDto<User> loginUser(String username,String userpwd){
        BaseDto<User> userBaseDto=new BaseDto<>();
//        SqlSession session =  DBTools.getSession();
//        UserMapper userMapper=session.getMapper(UserMapper.class);
//        UserDao userDao=session.getMapper(UserDao.class);
        userBaseDto=isUser(username);
        if(userBaseDto.getCode()==200){
            User user=userBaseDto.getDate();
            if(user.getUserpwd().equals(userpwd)){
                userBaseDto.setMeg("注册成功！");
            }else {
                userBaseDto.setCode(400);
                userBaseDto.setMeg("用户或者密码错误！");
            }
        }else {
            userBaseDto.setMeg("该用户不存在！");
            userBaseDto.setDate(null);
        }
        return userBaseDto;
    }
    public BaseDto<User> insertUser(User user){
        BaseDto<User> userBaseDto=new BaseDto<>();
        SqlSession session =  DBTools.getSession();
        UserMapper userMapper=session.getMapper(UserMapper.class);
        UserDao userDao=session.getMapper(UserDao.class);
        if(userDao.selectByUsername(user.getUsername())!=null){
            userBaseDto.setMeg("“"+user.getUsername()+"”,太受欢迎，已被占用！");
            userBaseDto.setCode(400);
            return userBaseDto;
        }
        if(user.getUserphone()!=""&&userDao.selectByUserphone(user.getUserphone())!=null){
            userBaseDto.setMeg("“"+user.getUserphone()+"”已被占用！");
            userBaseDto.setCode(400);
            return userBaseDto;
        }
        if(user.getUseremail()!=""&&userDao.selectByUseremail(user.getUseremail())!=null){
            userBaseDto.setMeg("“"+user.getUseremail()+"”已被占用！");
            userBaseDto.setCode(400);
            return userBaseDto;
        }
        if(userMapper.insertSelective(user)==1){
            session.commit();
            userBaseDto.setCode(200);
            return userBaseDto;
        }else {
            userBaseDto.setMeg("发生未知错误！");
            userBaseDto.setCode(400);
            return userBaseDto;
        }
    }
}
