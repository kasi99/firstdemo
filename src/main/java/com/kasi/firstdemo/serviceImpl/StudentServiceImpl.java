package com.kasi.firstdemo.serviceImpl;

import com.kasi.firstdemo.dao.StudentDao;
import com.kasi.firstdemo.entity.Student;
import com.kasi.firstdemo.service.StudentService;
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
public class StudentServiceImpl  implements StudentService {

    @Autowired
    StudentDao studentDao;

    private Long date;

    public StudentServiceImpl() {
        this.date = System.currentTimeMillis();
    }

    @Override
    public Boolean saveStudent(Student student) {
        return null;
    }

    @Override
    public Integer deleteStudent(Long id) {
        return null;
    }

    @Override
    public Student get(String id) {
        return studentDao.get(id);
    }

    @Override
    public List<Student> list(String type) {
        return studentDao.list(type);
    }
    @Override
    public synchronized String getDate() throws InterruptedException {
//        sleep(1000);
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

//        String format = simpleDateFormat.format(new Date());
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        return String.valueOf(date);
    }
}
