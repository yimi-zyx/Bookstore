package com.zyx.mybookstore.Service.Impl;

import com.zyx.mybookstore.Mapper.SliderDao;
import com.zyx.mybookstore.Pojo.Book;
import com.zyx.mybookstore.util.DBTools;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class SliderSeviceImpl {
    SqlSession session=DBTools.getSession();
    SliderDao sliderDao=session.getMapper(SliderDao.class);
    public List<Book> selectSliderbooks(){
        return sliderDao.selectSbooks();
    }
}
