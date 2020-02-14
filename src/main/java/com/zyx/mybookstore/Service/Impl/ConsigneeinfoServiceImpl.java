package com.zyx.mybookstore.Service.Impl;

import com.zyx.mybookstore.Mapper.ConsigneeinfoMapper;
import com.zyx.mybookstore.Pojo.Consigneeinfo;
import com.zyx.mybookstore.util.DBTools;
import org.apache.ibatis.session.SqlSession;

public class ConsigneeinfoServiceImpl {
    SqlSession session =DBTools.getSession();
    public void addConsigneeinfo(Consigneeinfo consigneeinfo){
        ConsigneeinfoMapper mapper=session.getMapper(ConsigneeinfoMapper.class);
        mapper.insertSelective(consigneeinfo);
        session.commit();
    }
}
