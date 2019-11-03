package com.kasi.firstdemo.service;


import com.kasi.firstdemo.entity.User;

import java.util.List;

/**
 * <pre> User类 </pre>
 *
 * @Author: HuangTao
 * @Date: 2018-06-23 07:14
 * @Version:
 */

public interface UserService {
    void saveUser(User user);
    void deleteUser(User user);

}
