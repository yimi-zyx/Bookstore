package com.zyx.mybookstore.Service.Impl;

import com.zyx.mybookstore.Mapper.OuttypeMapper;
import com.zyx.mybookstore.util.DBTools;
import org.apache.ibatis.session.SqlSession;

public class TypeServiceImpl {

    SqlSession session =  DBTools.getSession();
     OuttypeMapper mapper = session.getMapper(OuttypeMapper.class);
    //查找一级分类
//    public List<Outtype> selectAllOuttype(){
//       //return
//    }

}
