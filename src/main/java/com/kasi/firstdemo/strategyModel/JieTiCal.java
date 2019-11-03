package com.kasi.firstdemo.strategyModel;

import com.kasi.firstdemo.entity.User;
import org.springframework.boot.SpringApplication;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

/**
 * <pre> TODO </pre>
 *
 * @Author: HuangTao
 * @Date: 2019-11-02 05:42
 * @Version:
 */

public class JieTiCal extends StrategyTargetCal {


    @Override
    Integer cal(List<User> userList) {
        List<User> list = this.handleList(userList);
        list.stream().forEach(item -> System.out.print("day："+item.toString()));
        final Integer integer = list.stream().map(User::getAge).reduce(Integer::sum).get();
        return integer;
    }
}
