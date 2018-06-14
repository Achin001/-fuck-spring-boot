package com.gxc.service;

import com.gxc.bean.User;

import java.util.List;

public interface userService {

    User selectUserById(int id);

    List<User> selectUserByName(String userName);

    void addUser(User user);

    void updateUser(User user);

    void deleteUser(int id);
}
