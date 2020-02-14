package com.zyx.mybookstore.Service.Impl;

import com.zyx.mybookstore.Mapper.FavortieMapper;
import com.zyx.mybookstore.Pojo.Favortie;
import com.zyx.mybookstore.util.DBTools;
import org.apache.ibatis.session.SqlSession;

public class FavoriteSeviceImpl {
    SqlSession session=DBTools.getSession();
    public void InsertFavorite(Favortie favortie){
        FavortieMapper favortieMapper=session.getMapper(FavortieMapper.class);
        favortieMapper.insertSelective(favortie);
        session.commit();
    }
}
