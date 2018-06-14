package com.gxc.Controller;

import com.gxc.bean.User;
import com.gxc.dao.userMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class userController {

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private userMapper userMapper;

    @RequestMapping(value={"/selectUserById"}, method=RequestMethod.GET)
    public User selectUserById(String id){
        User user = userMapper.selectUserById(Integer.parseInt(id));
        return user;
    }

    @RequestMapping(value={"/selectUserByName"}, method=RequestMethod.GET)
    public List<User> selectUserByName(String userName){
        return userMapper.selectUserByName(userName);
    }

    @RequestMapping(value={"/addUser"}, method=RequestMethod.POST)
    public void addUser(User user){
        userMapper.addUser(user);
    }

    @RequestMapping(value={"/updateUser"}, method=RequestMethod.POST)
    public void updateUser(User user){
        userMapper.updateUser(user);
    }

    @RequestMapping(value={"/deleteUser"}, method=RequestMethod.POST)
    public void deleteUser(String id){
        userMapper.deleteUser(Integer.parseInt(id));
    }

}
