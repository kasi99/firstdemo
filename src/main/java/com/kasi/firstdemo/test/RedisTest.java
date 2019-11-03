package com.kasi.firstdemo.test;


import redis.clients.jedis.Jedis;

/**
 * <pre> TODO </pre>
 *
 * @Author: HuangTao
 * @Date: 2018-09-14 06:06
 * @Version:
 */

public class RedisTest {
    public static void main(String[] args) {
//        JedisPool jedisPool = new JedisPool("127.0.0.1", 6379, 100000);
        Jedis jedis = new Jedis("127.0.0.1",6379);
        int i = 0;
        for (i=0; i < 10000; i++) {
            jedis.set(String.valueOf(i), "第" + i + "次key值");
        }
        System.out.println(i);
        int a = 12_3232_23;
        String str = 3 + "";
    }
}
