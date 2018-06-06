package com.kasi.firstdemo.dao;

import com.kasi.firstdemo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * ${TODO}
 *
 * @Author: HuangTao
 * @Date: 2018-05-26 07:10
 * @Version:
 */
public interface BaseDao<T> {

    List<T> findAll();
}
