package com.kasi.firstdemo.improve;

import lombok.Data;

import java.util.List;

/**
 * <pre> TODO </pre>
 *
 * @Author: HuangTao
 * @Date: 2019-04-02 06:54
 * @Version:
 */
@Data
public class Test3 {

    private Long id;
    private String name;

    @Data
    private class Home {
        private String address;
        private String size;
    }

    private List<Home> homeList;
}
