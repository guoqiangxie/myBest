package com.xgq.service;

import com.xgq.model.User;

/**
 * Created by xieguoqiang on 14-5-21.
 */
public interface UserService {
    public User selectUser(User user);
    public void insertUser(User user);
    public void updateUser(User user);
    public void deleteUser(int userId);
}
