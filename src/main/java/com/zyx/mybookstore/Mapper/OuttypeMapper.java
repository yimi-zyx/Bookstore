package com.zyx.mybookstore.Mapper;

import com.zyx.mybookstore.Pojo.Outtype;
import com.zyx.mybookstore.Pojo.OuttypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OuttypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table outtype
     *
     * @mbg.generated Thu Sep 05 18:11:44 CST 2019
     */
    long countByExample(OuttypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table outtype
     *
     * @mbg.generated Thu Sep 05 18:11:44 CST 2019
     */
    int deleteByExample(OuttypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table outtype
     *
     * @mbg.generated Thu Sep 05 18:11:44 CST 2019
     */
    int deleteByPrimaryKey(Integer outtypeid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table outtype
     *
     * @mbg.generated Thu Sep 05 18:11:44 CST 2019
     */
    int insert(Outtype record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table outtype
     *
     * @mbg.generated Thu Sep 05 18:11:44 CST 2019
     */
    int insertSelective(Outtype record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table outtype
     *
     * @mbg.generated Thu Sep 05 18:11:44 CST 2019
     */
    List<Outtype> selectByExample(OuttypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table outtype
     *
     * @mbg.generated Thu Sep 05 18:11:44 CST 2019
     */
    Outtype selectByPrimaryKey(Integer outtypeid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table outtype
     *
     * @mbg.generated Thu Sep 05 18:11:44 CST 2019
     */
    int updateByExampleSelective(@Param("record") Outtype record, @Param("example") OuttypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table outtype
     *
     * @mbg.generated Thu Sep 05 18:11:44 CST 2019
     */
    int updateByExample(@Param("record") Outtype record, @Param("example") OuttypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table outtype
     *
     * @mbg.generated Thu Sep 05 18:11:44 CST 2019
     */
    int updateByPrimaryKeySelective(Outtype record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table outtype
     *
     * @mbg.generated Thu Sep 05 18:11:44 CST 2019
     */
    int updateByPrimaryKey(Outtype record);
}