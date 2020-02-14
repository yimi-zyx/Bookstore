package com.zyx.mybookstore.Pojo;

import org.springframework.beans.factory.annotation.Autowired;

public class Displaystr {
    private String leftstr;
    private String rightstr;

    public String getLeftstr() {
        return leftstr;
    }

    public void setLeftstr(String leftstr) {
        this.leftstr = leftstr;
    }

    public String getRightstr() {
        return rightstr;
    }

    public void setRightstr(String rightstr) {
        this.rightstr = rightstr;
    }

    @Override
    public String toString() {
        return "Displaystr{" +
                "leftstr='" + leftstr + '\'' +
                ", rightstr='" + rightstr + '\'' +
                '}';
    }

    public Displaystr(String leftstr, String rightstr) {
        this.leftstr = leftstr;
        this.rightstr = rightstr;
    }
}
