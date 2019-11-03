package com.kasi.firstdemo.dao;

import com.kasi.firstdemo.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * ${TODO}
 *
 * @Author: HuangTao
 * @Date: 2018-05-30 06:25
 * @Version:
 */

public interface UserDao extends MongoRepository<User,String> {
    User save(User user);

    void delete(User user);

}
