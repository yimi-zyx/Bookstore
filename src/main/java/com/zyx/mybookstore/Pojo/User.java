package com.zyx.mybookstore.Pojo;

public class User {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.userid
     *
     * @mbg.generated Thu Sep 05 18:11:44 CST 2019
     */
    private Integer userid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.username
     *
     * @mbg.generated Thu Sep 05 18:11:44 CST 2019
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.userpwd
     *
     * @mbg.generated Thu Sep 05 18:11:44 CST 2019
     */
    private String userpwd;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.userphone
     *
     * @mbg.generated Thu Sep 05 18:11:44 CST 2019
     */
    private String userphone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.useremail
     *
     * @mbg.generated Thu Sep 05 18:11:44 CST 2019
     */
    private String useremail;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.userimg
     *
     * @mbg.generated Thu Sep 05 18:11:44 CST 2019
     */
    private String userimg;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.userid
     *
     * @return the value of user.userid
     *
     * @mbg.generated Thu Sep 05 18:11:44 CST 2019
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.userid
     *
     * @param userid the value for user.userid
     *
     * @mbg.generated Thu Sep 05 18:11:44 CST 2019
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.username
     *
     * @return the value of user.username
     *
     * @mbg.generated Thu Sep 05 18:11:44 CST 2019
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.username
     *
     * @param username the value for user.username
     *
     * @mbg.generated Thu Sep 05 18:11:44 CST 2019
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.userpwd
     *
     * @return the value of user.userpwd
     *
     * @mbg.generated Thu Sep 05 18:11:44 CST 2019
     */
    public String getUserpwd() {
        return userpwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.userpwd
     *
     * @param userpwd the value for user.userpwd
     *
     * @mbg.generated Thu Sep 05 18:11:44 CST 2019
     */
    public void setUserpwd(String userpwd) {
        this.userpwd = userpwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.userphone
     *
     * @return the value of user.userphone
     *
     * @mbg.generated Thu Sep 05 18:11:44 CST 2019
     */
    public String getUserphone() {
        return userphone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.userphone
     *
     * @param userphone the value for user.userphone
     *
     * @mbg.generated Thu Sep 05 18:11:44 CST 2019
     */
    public void setUserphone(String userphone) {
        this.userphone = userphone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.useremail
     *
     * @return the value of user.useremail
     *
     * @mbg.generated Thu Sep 05 18:11:44 CST 2019
     */
    public String getUseremail() {
        return useremail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.useremail
     *
     * @param useremail the value for user.useremail
     *
     * @mbg.generated Thu Sep 05 18:11:44 CST 2019
     */
    public void setUseremail(String useremail) {
        this.useremail = useremail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.userimg
     *
     * @return the value of user.userimg
     *
     * @mbg.generated Thu Sep 05 18:11:44 CST 2019
     */
    public String getUserimg() {
        return userimg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.userimg
     *
     * @param userimg the value for user.userimg
     *
     * @mbg.generated Thu Sep 05 18:11:44 CST 2019
     */
    public void setUserimg(String userimg) {
        this.userimg = userimg;
    }

    public User(String username, String userpwd, String userphone, String useremail, String userimg) {
        this.username = username;
        this.userpwd = userpwd;
        this.userphone = userphone;
        this.useremail = useremail;
        this.userimg = userimg;
    }

    public User() {
    }
}