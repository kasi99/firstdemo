package com.kasi.firstdemo.serviceImpl;

import com.kasi.firstdemo.dao.UserDao;
import com.kasi.firstdemo.entity.User;
import com.kasi.firstdemo.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ${TODO}
 *
 * @Author: HuangTao
 * @Date: 2018-05-29 05:01
 * @Version:
 */
@Service(value = "userService")
public class UserServiceImpl implements IService<User> {
    @Autowired
    UserDao userDao;
    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }
}
