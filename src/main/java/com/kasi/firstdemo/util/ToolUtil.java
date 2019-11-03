package com.kasi.firstdemo.util;

import org.apache.commons.lang3.StringUtils;
import org.springframework.util.ObjectUtils;

/**
 * <pre> TODO </pre>
 *
 * @Author: HuangTao
 * @Date: 2019-03-20 06:40
 * @Version:
 */

public class ToolUtil {

    public static boolean isNull(Object...obj) {
        boolean flag = false;
        if (ObjectUtils.isEmpty(obj)) {
            return true;
        }
        for (int i = 0; i < obj.length; i++) {
            if (obj[i] instanceof String) {
                flag = StringUtils.isBlank((String)obj[i]);
            } else {
                flag = ObjectUtils.isEmpty(obj[i]);
            }
            if (flag) {
                break;
            }
        }
        return flag;
    }
}
