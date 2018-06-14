package com.gxc.service.impl;

import com.gxc.bean.User;
import com.gxc.dao.userMapper;
import com.gxc.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userServiceImpl implements userService {


   @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
   @Autowired
   private userMapper usermapper;

    @Override
    public User selectUserById(int id) {
        return usermapper.selectUserById(id);
    }

    @Override
    public List<User> selectUserByName(String userName) {
        return usermapper.selectUserByName(userName);
    }

    @Override
    public void addUser(User user) {
        this.usermapper.addUser(user);
    }

    @Override
    public void updateUser(User user) {
     this.usermapper.updateUser(user);
    }

    @Override
    public void deleteUser(int id) {
     this.usermapper.deleteUser(id);
    }
}
