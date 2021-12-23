package com.hzdl.bootdemo02;

import com.hzdl.bootdemo02.bean.User;
import com.hzdl.bootdemo02.mapper.UserMapper;
import com.hzdl.bootdemo02.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Bootdemo02Application.class)
public class BootTest {
    @Autowired
    private UserService userService;

    @Test
    public void test01(){
        List<User> users = new ArrayList<>();
        users = userService.getAllUsers();
        System.out.println(users);
    }
}
