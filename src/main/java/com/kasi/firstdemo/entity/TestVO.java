package com.kasi.firstdemo.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * <pre> TODO </pre>
 *
 * @Author: HuangTao
 * @Date: 2019-04-03 04:30
 * @Version:
 */
@Data
public class TestVO implements Serializable {
    private static final long serialVersionUID = 2636936081730315340L;

    @Data
    public class Home {
        private Integer size;
        private String address;
    }
    @Data
    public class Hobby {
        private Integer size;
        private String name;
    }
    private String name;
    private Integer age;
    private Home home;
    private List<Hobby> hobby;
//    private List<Home> homeList;



}
