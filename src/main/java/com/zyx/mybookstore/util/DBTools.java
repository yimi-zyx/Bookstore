package com.zyx.mybookstore.util;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DBTools {
    public static SqlSessionFactory sessionFactory;
    
    static{
        try {
            //ʹ��MyBatis�ṩ��Resources�����mybatis�������ļ�
            Reader reader = Resources.getResourceAsReader("mybatis.cfg.xml");
            //����sqlSession�Ĺ���
            sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    //������ִ��ӳ���ļ���sql��sqlSession
    public static SqlSession getSession(){
        return sessionFactory.openSession();
    }
    
}
