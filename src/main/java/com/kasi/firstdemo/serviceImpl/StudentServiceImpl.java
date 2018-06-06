package com.kasi.firstdemo.serviceImpl;

import com.kasi.firstdemo.dao.StudentDao;
import com.kasi.firstdemo.entity.Student;
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

@Service("studentService")
public class StudentServiceImpl implements IService<Student> {

    @Autowired
    StudentDao studentDao;
    @Override
    public List<Student> findAll() {
        return studentDao.findAll();
    }
}
