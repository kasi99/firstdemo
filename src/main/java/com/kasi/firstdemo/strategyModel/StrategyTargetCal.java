package com.kasi.firstdemo.strategyModel;

import com.kasi.firstdemo.entity.User;
import com.kasi.firstdemo.util.ToolUtil;

import java.util.List;
import java.util.stream.Collectors;

/**
 * <pre> 战略目标实现策略 </pre>
 *
 * @Author: HuangTao
 * @Date: 2019-11-02 05:16
 * @Version:
 */

public abstract class StrategyTargetCal {


    abstract Integer cal(List<User> userList);

    List<User> handleList(List<User> userList) {
        if (userList!=null) {
            final List<User> collect = userList.stream().filter(item -> !ToolUtil.isNull(item)).collect(Collectors.toList());
            return collect;
        }
        return null;
    }
}
