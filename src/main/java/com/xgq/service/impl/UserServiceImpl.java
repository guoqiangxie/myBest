package com.xgq.service.impl;

import com.xgq.dao.UserMapper;
import com.xgq.model.User;
import com.xgq.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xieguoqiang on 14-5-21.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    public UserMapper userMapper;

    public User selectUser(User user) {
        return userMapper.selectUser(user);
    }

    public void insertUser(User user){
        userMapper.insertUser(user);
    }

    public void updateUser(User user){
        userMapper.updateUser(user);
    }

    public void deleteUser(int userId){
        userMapper.deleteUser(userId);
    }
}
