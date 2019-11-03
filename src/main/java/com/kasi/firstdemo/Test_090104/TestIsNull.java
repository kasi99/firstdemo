package com.kasi.firstdemo.Test_090104;

import com.kasi.firstdemo.util.ToolUtil;

/**
 * <pre> TODO </pre>
 *
 * @Author: HuangTao
 * @Date: 2019-03-20 06:52
 * @Version:
 */

public class TestIsNull {
    public static void main(String[] args) {
        String a = "12";
        User user = null;
        boolean aNull = ToolUtil.isNull(null,null);
        System.out.println(aNull);
    }
}
