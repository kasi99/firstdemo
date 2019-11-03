package com.kasi.firstdemo.serviceImpl;

import com.kasi.firstdemo.dao.UserDao;
import com.kasi.firstdemo.entity.User;
import com.kasi.firstdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ${TODO}
 *
 * @Author: HuangTao
 * @Date: 2018-05-29 05:01
 * @Version:
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public void saveUser(User user) {
        userDao.save(user);
    }

    @Override
    public void deleteUser(User user) {
        userDao.delete(user);
    }

}
