package com.kasi.firstdemo;

import com.kasi.firstdemo.entity.Student;
import com.kasi.firstdemo.entity.User;
import com.kasi.firstdemo.serviceImpl.StudentServiceImpl;
import com.kasi.firstdemo.serviceImpl.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FirstdemoApplicationTests {

    @Autowired
    UserServiceImpl userService;
    @Autowired
    StudentServiceImpl studentService;
    @Test
    public void test() {
        List<User> userList = userService.findAll();
        for (User user:userList){
            System.out.println(user.toString());
        }
    }

    @Test
    public void test2(){
        List<Student> studentList = studentService.findAll();
        for (Student student:studentList){
            System.out.println(student.toString());
        }
    }

}
