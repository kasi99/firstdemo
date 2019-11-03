package com.kasi.firstdemo;

import com.kasi.firstdemo.service.StudentService;
import com.kasi.firstdemo.service.UserService;
import com.kasi.firstdemo.test.Test1;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FirstdemoApplicationTests{

    @Autowired
    StudentService student;
    @Autowired
    MongoTemplate mongoTemplate;
    @Autowired
    Test1 test1;
    @Autowired
    UserService userService;
//
//    @Test
//    public void listByType() {
//        String type = "1";
//        List<User> list = student.get(id)
//        list.stream().map(User::getName).forEach(System.out::println);
//    }

//    @Test
//    public void save(){
//        List<Student> student = student.list("3 or 1=1");
//        for (Student student1 : student) {
//            System.out.println(student1.toString());
//        }
//    }

    @Test
    public void get() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            String date = student.getDate();
            System.out.println("第"+i+"次请求:"+date);
        }
    }

     @Test
    public void test1() {
         AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(FirstdemoApplicationTests.class);
         Test1 test1 = context.getBean(Test1.class);

         Thread thread1 = new Thread(test1);
        Thread thread2 = new Thread(test1);
        Thread thread3 = new Thread(test1);
        Thread thread4 = new Thread(test1);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }

}
