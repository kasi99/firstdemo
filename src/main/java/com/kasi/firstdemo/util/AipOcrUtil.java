package com.kasi.firstdemo.util;

import com.baidu.aip.ocr.AipOcr;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Value;

import java.util.HashMap;

/**
 * <pre> 百度云图像识别工具类 </pre>
 *
 * @Author: HuangTao
 * @Date: 2018-06-15 05:14
 * @Version:
 */

public class AipOcrUtil {

    public static JSONObject getMessage() {

        // 传入可选参数调用接口
        HashMap<String, String> options = new HashMap<String, String>();
        options.put("recognize_granularity", "big");
        options.put("detect_direction", "true");
        options.put("vertexes_location", "true");
        options.put("probability", "true");

        // 调用接口
        String path = "C:\\Users\\Administrator\\Desktop\\123.png";
        JSONObject res = AipOcrUtils.getAipOcr().accurateGeneral(path, new HashMap<String, String>());
        System.out.println(res.toString(2));
        return res;
    }
}
