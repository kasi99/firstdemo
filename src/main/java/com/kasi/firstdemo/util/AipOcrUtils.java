package com.kasi.firstdemo.util;

import com.baidu.aip.ocr.AipOcr;

/**
 * <pre> TODO </pre>
 *
 * @Author: HuangTao
 * @Date: 2018-06-15 05:55
 * @Version:
 */

public class AipOcrUtils {
    private static final String APP_ID = "11401830";
    private static final String API_KEY = "yZaxmFtIgTLONfuwnSlZ0ad9";
    private static final String SECRET_KEY = "jSG8goj6FOGnfiTZrlxtUu8s7CN3QSjW";
    private AipOcrUtils(){};
    private static AipOcr client = new AipOcr(APP_ID, API_KEY, SECRET_KEY);
    public static AipOcr getAipOcr(){
        client.setConnectionTimeoutInMillis(2000);
        client.setSocketTimeoutInMillis(60000);
        return client;
    }
}
