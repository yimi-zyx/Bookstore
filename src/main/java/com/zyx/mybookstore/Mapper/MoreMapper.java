package com.zyx.mybookstore.Mapper;

import com.zyx.mybookstore.Pojo.More;
import com.zyx.mybookstore.Pojo.MoreExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MoreMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table more
     *
     * @mbg.generated Thu Sep 05 18:11:44 CST 2019
     */
    long countByExample(MoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table more
     *
     * @mbg.generated Thu Sep 05 18:11:44 CST 2019
     */
    int deleteByExample(MoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table more
     *
     * @mbg.generated Thu Sep 05 18:11:44 CST 2019
     */
    int deleteByPrimaryKey(Integer moreid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table more
     *
     * @mbg.generated Thu Sep 05 18:11:44 CST 2019
     */
    int insert(More record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table more
     *
     * @mbg.generated Thu Sep 05 18:11:44 CST 2019
     */
    int insertSelective(More record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table more
     *
     * @mbg.generated Thu Sep 05 18:11:44 CST 2019
     */
    List<More> selectByExample(MoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table more
     *
     * @mbg.generated Thu Sep 05 18:11:44 CST 2019
     */
    More selectByPrimaryKey(Integer moreid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table more
     *
     * @mbg.generated Thu Sep 05 18:11:44 CST 2019
     */
    int updateByExampleSelective(@Param("record") More record, @Param("example") MoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table more
     *
     * @mbg.generated Thu Sep 05 18:11:44 CST 2019
     */
    int updateByExample(@Param("record") More record, @Param("example") MoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table more
     *
     * @mbg.generated Thu Sep 05 18:11:44 CST 2019
     */
    int updateByPrimaryKeySelective(More record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table more
     *
     * @mbg.generated Thu Sep 05 18:11:44 CST 2019
     */
    int updateByPrimaryKey(More record);
}