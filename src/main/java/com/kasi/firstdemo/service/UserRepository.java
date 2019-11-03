package com.kasi.firstdemo.service;

import com.kasi.firstdemo.demo.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * <pre> TODO </pre>
 *
 * @Author: HuangTao
 * @Date: 2018-06-23 06:56
 * @Version:
 */

public interface UserRepository extends MongoRepository<User, String> {
    public User findByName(String name);

    public List<User> findAllByAddress(String address);
}
