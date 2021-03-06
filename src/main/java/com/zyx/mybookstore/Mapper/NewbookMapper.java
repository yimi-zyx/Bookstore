package com.zyx.mybookstore.Mapper;

import com.zyx.mybookstore.Pojo.Newbook;
import com.zyx.mybookstore.Pojo.NewbookExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NewbookMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table newbook
     *
     * @mbg.generated Thu Sep 05 18:11:44 CST 2019
     */
    long countByExample(NewbookExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table newbook
     *
     * @mbg.generated Thu Sep 05 18:11:44 CST 2019
     */
    int deleteByExample(NewbookExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table newbook
     *
     * @mbg.generated Thu Sep 05 18:11:44 CST 2019
     */
    int deleteByPrimaryKey(Integer newbookid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table newbook
     *
     * @mbg.generated Thu Sep 05 18:11:44 CST 2019
     */
    int insert(Newbook record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table newbook
     *
     * @mbg.generated Thu Sep 05 18:11:44 CST 2019
     */
    int insertSelective(Newbook record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table newbook
     *
     * @mbg.generated Thu Sep 05 18:11:44 CST 2019
     */
    List<Newbook> selectByExample(NewbookExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table newbook
     *
     * @mbg.generated Thu Sep 05 18:11:44 CST 2019
     */
    Newbook selectByPrimaryKey(Integer newbookid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table newbook
     *
     * @mbg.generated Thu Sep 05 18:11:44 CST 2019
     */
    int updateByExampleSelective(@Param("record") Newbook record, @Param("example") NewbookExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table newbook
     *
     * @mbg.generated Thu Sep 05 18:11:44 CST 2019
     */
    int updateByExample(@Param("record") Newbook record, @Param("example") NewbookExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table newbook
     *
     * @mbg.generated Thu Sep 05 18:11:44 CST 2019
     */
    int updateByPrimaryKeySelective(Newbook record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table newbook
     *
     * @mbg.generated Thu Sep 05 18:11:44 CST 2019
     */
    int updateByPrimaryKey(Newbook record);
}