package com.zyx.mybookstore.Service.Impl;

import com.zyx.mybookstore.Mapper.OrdersMapper;
import com.zyx.mybookstore.Pojo.Orders;
import com.zyx.mybookstore.util.DBTools;
import org.apache.ibatis.session.SqlSession;

public class OrderServiceImpl {
    SqlSession session=DBTools.getSession();
    public void  addOrder(Orders order){
        OrdersMapper mapper=session.getMapper(OrdersMapper.class);
        mapper.insertSelective(order);
        session.commit();
    }
}
