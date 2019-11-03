//package com.kasi.firstdemo.Test_090104;
//
//import com.kasi.firstdemo.entity.User;
//
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * <pre> TODO </pre>
// *
// * @Author: HuangTao
// * @Date: 2019-01-04 04:57
// * @Version:
// */
//
//public class Lmabda {
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
////        for (User user : list) {
////            System.out.println(user.getName());
////        }
////        System.out.println("=====================================");
//        ArrayList<String> list1 = new ArrayList<>();
////        list1.add("aaa");
////        list1.add("bbb");
////        list1.add("ccc");
//        list1.add("abc");
////        list1.add("aaa");
////        list.stream().filter((item) -> ("东城".equals(item.getName()))).map(User::getAge).forEach(System.out::println);
////        list.stream().map(User::getAge).sorted((e1,e2) -> {
////            return e2.compareTo(e1);
////        }).forEach(System.out::println);
////        System.out.println("=====================================");
////        ArrayList<User> list2 = new ArrayList<>();
////        list.stream().limit(2).forEach(System.out::println);
////        list2.stream().forEach(System.out::println);
////        list1.forEach(System.out::println);
////        System.out.println("=====================================");
////        list1.stream().distinct().forEach(System.out::println);
//        boolean a = list1.stream().allMatch(item -> "aaa".equals(item));
//        System.out.println(a);
//        boolean b = list1.stream().anyMatch(item -> "aaa".equals(item));
//        System.out.println(b);
//        boolean c = list1.stream().noneMatch(item -> item.contains("a"));
//        System.out.println(c);
//        String s = list1.stream().findFirst().get();
//        long count = list1.stream().count();
//        User max = list.stream().max((e1, e2) -> Integer.compare(e1.getAge(), e2.getAge())).get();
//        System.out.println(max);
//        User min = list.stream().min((e1, e2) -> Integer.compare(e1.getAge(), e2.getAge())).get();
//        System.out.println(min);
//    }
//}
