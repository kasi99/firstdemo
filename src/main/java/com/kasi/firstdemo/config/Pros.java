package com.kasi.firstdemo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * <pre> TODO </pre>
 *
 * @Author: HuangTao
 * @Date: 2018-07-28 18:07
 * @Version:
 */
@Component
@ConfigurationProperties(prefix = "info")
@Data
public class Pros {

    private String message;
}
