package com.hzdl.bootdemo02.controller;

import com.hzdl.bootdemo02.bean.User;
import com.hzdl.bootdemo02.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class Controller02 {
    @Autowired
    private UserService userService;

    @RequestMapping("/quick")
    @ResponseBody
    public String quick(){
        return "success";
    }

    @RequestMapping("/hello")
    public String demo02(HttpServletRequest request){
        User user = userService.selectByPrimaryKey(1);
        request.setAttribute("user",user);
        return "hello";
    }

    @RequestMapping("/thymeleaf")
    public String demo03(Model model){
        User user = userService.selectByPrimaryKey(1);
        model.addAttribute("user",user);
        return "thymeleaf";
    }

    @RequestMapping("/all")
    public String demo04(HttpServletRequest request){
        List<User> users = userService.getAllUsers();
        request.setAttribute("users",users);
        return "thymeleaf";
    }
}
