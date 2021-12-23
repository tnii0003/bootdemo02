package com.hzdl.bootdemo02.service;

import com.hzdl.bootdemo02.bean.User;
import com.hzdl.bootdemo02.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public int insert(User user){
        int status = userMapper.insert(user);
        return status;
    }

    public int deleteByPrimaryKey(Integer id){
        int status = userMapper.deleteByPrimaryKey(id);
        return status;
    }

    public int updateByPrimaryKey(User user){
        int status = userMapper.updateByPrimaryKey(user);
        return status;
    }

    public User selectByPrimaryKey(Integer id){
        User user = userMapper.selectByPrimaryKey(id);
        return user;
    }

    public List<User> getAllUsers(){
        List<User> users = new ArrayList<>();
        users = userMapper.getAllUsers();
        return users;
    }
}
