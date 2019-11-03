package com.kasi.firstdemo.service;

import com.kasi.firstdemo.entity.Student;

import java.util.List;

/**
 * <pre> 学生类 </pre>
 *
 * @Author: HuangTao
 * @Date: 2018-06-30 14:10
 * @Version:
 */

public interface StudentService  {

    Boolean saveStudent(Student student);

    Integer deleteStudent(Long id);

    Student get(String id);
    List<Student> list(String type);

    String getDate() throws InterruptedException;

}
