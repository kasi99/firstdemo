//package com.kasi.firstdemo.Test_090104;
//
//import com.kasi.firstdemo.entity.User;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
//import java.util.stream.Collectors;
//
///**
// * <pre> TODO </pre>
// *
// * @Author: HuangTao
// * @Date: 2019-01-04 04:57
// * @Version:
// */
//
//public class Lmabda2 {
//    public static void main(String[] args) {
//        List<User> list = new ArrayList<>();
//        User user1 = new User();
//        user1.setSex((byte)0);
//        user1.setAge(22);
//        user1.setName("东莞");
//        User user2 = new User();
//        user2.setName("东城");
//        user2.setSex((byte)2);
//        user2.setAge(44);
//        User user3 = new User();
//        user3.setName("城北");
//        user3.setSex((byte)1);
//        user3.setAge(55);
//        User user4 = new User();
//        user4.setName("城东");
//        user4.setSex((byte)1);
//        user4.setAge(11);
//        list.add(user1);
//        list.add(user2);
//        list.add(user3);
//        list.add(user4);
//        ArrayList<String> list1 = new ArrayList<>();
//        list1.add("aaa");
//        list1.add("bbb");
//        list1.add("ccc");
//        list1.add("abc");
//        list1.add("aaa");
////        Integer integer = list.stream().map(User::getAge).reduce(Integer::sum).get();
////        System.out.println(integer);
////        String s = list1.stream().reduce((x, y) -> x + y).get();
////        System.out.println(s);
////        List<String> collect = list.stream().map(User::getName).collect(Collectors.toList());
////        List<User> dong = list.stream().filter(item -> (item.getName().contains("东"))).collect(Collectors.toList());
////        System.out.println(dong);
////        System.out.println(collect);
////        Double collect1 = list.stream().map(User::getAge).collect(Collectors.averagingInt(x -> x));
//        String collect = list1.stream().collect(Collectors.joining(","));
//        Map<String, Integer> collect1 = list.stream().distinct().collect(Collectors.toMap(x -> x.getName(), y -> y.getAge()));
//        System.out.println(collect);
//        System.out.println(collect1);
//    }
//}
