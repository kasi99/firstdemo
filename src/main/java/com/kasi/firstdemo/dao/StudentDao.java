package com.kasi.firstdemo.dao;

import com.kasi.firstdemo.entity.Student;
import com.kasi.firstdemo.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * ${TODO}
 *
 * @Author: HuangTao
 * @Date: 2018-05-30 06:26
 * @Version:
 */

public interface StudentDao extends BaseDao<Student>{
    Boolean save(User user);

    Integer delete(Long id);

    Student get(@Param("id") String id);
    List<Student> list(@Param("type") String type);
}
