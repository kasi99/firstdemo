package com.kasi.firstdemo.util;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * <pre> TODO </pre>
 *
 * @Author: HuangTao
 * @Date: 2018-07-27 05:10
 * @Version:
 */
//将接收的前端json数据转换成Long类型
public class LongJsonDeserializer extends JsonDeserializer<Long> {
    private static final Logger logger = LoggerFactory.getLogger(LongJsonDeserializer.class);

    @Override
    public Long deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String value = jsonParser.getText();
        try {
            return value == null ? null : Long.parseLong(value);
        } catch (NumberFormatException e) {
            logger.error("解析长整形错误", e);
            return null;
        }
    }
}