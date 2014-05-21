package com.xgq.dao;

import com.xgq.model.User;

/**
 * Created by xieguoqiang on 14-5-21.
 */
public interface UserMapper {
    public User selectUser(User user);
    public void insertUser(User user);
    public void updateUser(User user);
    public void deleteUser(int userId);
}
