package com.mr.service.impl;

import com.mr.mapper.UserMapper;
import com.mr.model.User;
import com.mr.model.UserExample;
import com.mr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Administrator on 2018/5/30.
 */
@Service
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> selectUser() {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        List<User> user = userMapper.selectByExample(example);
        return user;
    }

    @Transactional
    @Override
    public void delUserById(Integer id) {
        userMapper.deleteByPrimaryKey(id);
    }

    @Transactional
    @Override
    public void inserUser(User user) {
        userMapper.insertSelective(user);
    }

    @Transactional
    @Override
    public User updateByUserId(Integer id) {
        User user = userMapper.selectByPrimaryKey(id);
        return user;
    }

    @Transactional
    @Override
    public void update(User user) {
        userMapper.updateByPrimaryKeySelective(user);
    }
}
