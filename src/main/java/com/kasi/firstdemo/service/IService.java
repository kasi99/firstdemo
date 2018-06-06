package com.kasi.firstdemo.service;

import java.util.List;

/**
 * ${TODO}
 *
 * @Author: HuangTao
 * @Date: 2018-05-30 06:28
 * @Version:
 */

public interface IService<T> {
    List<T> findAll();
}
