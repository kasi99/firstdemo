package com.kasi.firstdemo.demo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

/**
 * <pre> TODO </pre>
 *
 * @Author: HuangTao
 * @Date: 2018-06-23 06:54
 * @Version:
 */
@Document(collection = "user")
@Data
public class User implements Serializable {
    private static final long serialVersionUID = -5524219498066854233L;
    private String id;
    private String name;
    private String address;
}
