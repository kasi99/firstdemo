package com.kasi.firstdemo.test;

import com.kasi.firstdemo.entity.User;
import com.kasi.firstdemo.service.UserService;
import com.kasi.firstdemo.serviceImpl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <pre> TODO </pre>
 *
 * @Author: HuangTao
 * @Date: 2018-09-08 18:41
 * @Version:
 */

public class Test3 {
    static {
        UserService userService = new UserServiceImpl();
    }
    @Autowired
    private static UserService userService;
    public static void test(User user) {
        userService.saveUser(user);
    }
}
