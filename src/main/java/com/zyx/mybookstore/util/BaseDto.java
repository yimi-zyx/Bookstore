package com.zyx.mybookstore.util;

public class BaseDto<T> {
    private String meg;
    private Integer code;
    private T date;

    public String getMeg() {
        return meg;
    }

    public void setMeg(String meg) {
        this.meg = meg;
    }

    public BaseDto(String meg, Integer code, T date) {
        this.meg = meg;
        this.code = code;

        this.date = date;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public T getDate() {
        return date;
    }

    public void setDate(T date) {
        this.date = date;
    }

    public BaseDto() {

    }
}
