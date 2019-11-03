package com.kasi.firstdemo.strategyModel;

import com.kasi.firstdemo.entity.User;

import java.util.Arrays;
import java.util.List;

/**
 * <pre> TODO </pre>
 *
 * @Author: HuangTao
 * @Date: 2019-11-02 05:53
 * @Version:
 */

public class Test {
    public static void main(String[] args) {
        User user1 = new User();
        user1.setAge(3);
        User user2 = new User();
        user2.setAge(4);
        final List<User> users = Arrays.asList(user1, user2);
        final JieTiCal jieTiCal = new JieTiCal();
        final Integer cal = jieTiCal.cal(users);
        System.out.println("cal  "+cal);
    }
}
