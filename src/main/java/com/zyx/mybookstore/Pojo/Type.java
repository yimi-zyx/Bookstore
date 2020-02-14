package com.zyx.mybookstore.Pojo;

import java.util.List;

public class Type<T> {
    private String classname;
    private List<T> tList;
    private List<Book> books;

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public List<T> gettList() {
        return tList;
    }

    public void settList(List<T> tList) {
        this.tList = tList;
    }

    public Type(String classname, List<T> tList, List<Book> books) {
        this.classname = classname;
        this.tList = tList;
        this.books = books;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
    public Type(String classname, List<T> tList) {
        this.classname = classname;
        this.tList = tList;
    }
}
