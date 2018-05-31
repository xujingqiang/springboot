package com.mr.service;

import com.mr.model.User;

import java.util.List;

/**
 * Created by Administrator on 2018/5/30.
 */
public interface UserService {
    List<User> selectUser();

    void delUserById(Integer id);

    void inserUser(User user);

    User updateByUserId(Integer id);

    void update(User user);
}
