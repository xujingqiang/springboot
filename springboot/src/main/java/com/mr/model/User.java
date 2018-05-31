package com.mr.model;

import java.sql.Date;

public class User {
    private Integer id;

    private String name;

    private Integer sex;

    private Date date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public User(Integer id, String name, Integer sex, Date date) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.date = date;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", date=" + date +
                '}';
    }
}