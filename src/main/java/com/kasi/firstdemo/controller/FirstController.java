package com.kasi.firstdemo.controller;

import com.kasi.firstdemo.entity.Student;
import com.kasi.firstdemo.entity.User;
import com.kasi.firstdemo.service.IService;
import com.kasi.firstdemo.serviceImpl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * ${TODO}
 *
 * @Author: HuangTao
 * @Date: 2018-05-26 06:08
 * @Version:
 */
@RestController
public class FirstController {

    @Value("${user.name}")
    private String name;

    @Autowired
    IService studentService;
    @RequestMapping("/hello")
    public List<Student> myFirstMethod(){
        List<Student> userList = studentService.findAll();
/*        for (User user:userList){
            System.out.println(user.toString());
        }*/
        System.out.println("========================================="+name);
        return userList;
    }
}
