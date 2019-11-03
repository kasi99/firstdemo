package com.kasi.firstdemo.controller;

import com.kasi.firstdemo.config.Pros;
import com.kasi.firstdemo.entity.Student;
import com.kasi.firstdemo.entity.TestVO;
import com.kasi.firstdemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <pre> TODO </pre>
 *
 * @Author: HuangTao
 * @Date: 2018-07-27 04:51
 * @Version:
 */
@RestController
@RequestMapping("/student/")
public class StudentController {

    @Value("${user.name}")
    private String name;

    @Autowired
    private StudentService studentService;
//    @Autowired
//    private UserService userService;

    @Autowired
    private Pros pros;

//    @PostMapping("get")
//    public List<User> get(String id) {
//        String type = "1";
//        List<User> list = userService.listByType(type);
//        return list;
//    }

    @PostMapping("getDate")
    public String getDate() throws InterruptedException {
        String date = studentService.getDate();
        return date;
    }

    @GetMapping("list")
    public Object list(String type){
        List<Student> list = studentService.list(type);
        return list;
    }

    @PostMapping("test")
    @ResponseBody
    public Object test(@RequestBody TestVO testVO){
        System.out.println(testVO);
        return null;
    }
}
