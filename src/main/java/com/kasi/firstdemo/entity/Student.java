package com.kasi.firstdemo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 学生
 *
 * @Author: HuangTao
 * @Date: 2018-05-26 07:02
 * @Version:
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Student implements Serializable {

    private String id;
    private String name;
    private String type;

    public Student(String name) {
        this.name = name;
    }

}
