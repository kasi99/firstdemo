package com.kasi.firstdemo.test1021;

import com.kasi.firstdemo.util.ToolUtil;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * <pre> TODO </pre>
 *
 * @Author: HuangTao
 * @Date: 2019-10-21 04:11
 * @Version:
 */

public class Test {
    public static void main(String[] args) {
        final List<Integer> list = Arrays.asList(0,3, 5, 10, 15, 20);
        for (int h = 0; h< 100; h++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("创建集合为"+list.toString()+"，请输入一个正整数");
            final int input = sc.nextInt();
            final Scanner scanner = new Scanner(System.in);
            System.out.println("请输入正向或负向，正向为1，负向为0");
            final int quality = scanner.nextInt();
            int index = list.size()-1;
            for (int i = 0; i < list.size()-2; i++) {
                if (list.get(i) <= input && list.get(i + 1) > input) {
                    index = quality==1?i+1:i;
                    break;
                }
            }
            System.out.println("你要取的值是 "+list.get(index));
        }
    }
}
