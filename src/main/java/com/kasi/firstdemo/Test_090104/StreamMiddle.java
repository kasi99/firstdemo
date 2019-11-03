package com.kasi.firstdemo.Test_090104;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * <pre> TODO </pre>
 *
 * @Author: HuangTao
 * @Date: 2019-01-05 04:50
 * @Version:
 */
/* 先构造一个集合 */
public class StreamMiddle {
    public static void main(String[] args) {
        List<User> list = new ArrayList<>();
        list.add(new User("谢逊", 49));
        list.add(new User("黛绮丝", 29));
        list.add(new User("殷天正", 59));
        list.add(new User("韦一笑", 39));
        list.add(new User("谢逊", 49));

        /* 将对象集合中的name取出拼接成list集合 */
        List<String> collect1 = list.stream().map(User::getName).collect(Collectors.toList());
        System.out.println("-------将对象集合中的name取出拼接成list集合----------");
        collect1.forEach(System.out::println);
        /* 将对象属性转成map */
        Map<String, Integer> collect2= list.stream().distinct().collect(Collectors.toMap(x -> x.getName(), y -> y.getAge()));
        System.out.println("-------将对象属性转成map----------");
        collect2.forEach((x,y)-> System.out.println("key-"+x+"：：："+ "value-"+y));
        /* 将对象姓名拼接成String并用分隔符隔开*/
        String collect3 = list.stream().map(User::getName).collect(Collectors.joining(","));
        System.out.println("-------将对象姓名拼接成String并用分隔符隔开----------");
        System.out.println(collect3);

//        /* 将年龄加总 */
//        Integer integer = list.stream().map(User::getAge).reduce(Integer::sum).get();
//        System.out.println("将年龄加总:" + integer);
//        /* 拼接30岁以上对象姓名 */
//        String s = list.stream().filter(x -> x.getAge() > 30).map(User::getName).reduce((x, y) -> x + y).get();
//        System.out.println("拼接30岁以上对象姓名:" + s);
//        /* 将30岁以上人员的姓名取出构造成一个新的list集合 */
//        List<User> newUserList = list.stream().filter(x -> x.getAge() > 30).reduce(new ArrayList<User>(),(x,y) -> {
//            List<User> users = new ArrayList<>();
//            users.add(x);
//            return users;
//        }).

//        /* 判断是否所有对象年龄超过20岁 */
//        boolean b = list.stream().allMatch(x -> x.getAge() > 20);
//        System.out.println("判断是否所有对象年龄超过20岁:" + b);
//        /* 返回年龄最大的对象 */
//        User user = list.stream().max((e1, e2) -> e1.getAge().compareTo(e2.getAge())).get();
//        System.out.println("返回年龄最大的对象" +user);
        /**/

//        for (User user : list) {
//            System.out.println("for循环"+user);
//        }
//        System.out.println("-------------------------");
//        /* distinct去重*/
//        list.stream().distinct().forEach(System.out::println);

//        /* 条件：循环list */
//        /* 使用for循环 */
//        for (User user : list) {
//            System.out.println(user);
//        }
//        /* 使用forEach*/
//        list.forEach(x-> System.out.println(x));

        /* 条件：获取30岁以上人员姓名组成新的list集合 */
        /* 使用for循环 */
//        List<String> nameList = new ArrayList<>();
//        for (User user : list) {
//            if (user.getAge() > 30) {
//                nameList.add(user.getName());
//            }
//        }
//        /* 筛选30岁以上人员姓名，并倒序排列后取前两位 */
//        list.stream().filter(x->x.getAge()>30).sorted((e1,e2)->{
//            return e2.getAge().compareTo(e1.getAge());
//        }).limit(2).forEach(System.out::println);
    }
}
