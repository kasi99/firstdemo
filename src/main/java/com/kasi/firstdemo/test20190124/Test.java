package com.kasi.firstdemo.test20190124;

import java.io.*;

/**
 * <pre> TODO </pre>
 *
 * @Author: HuangTao
 * @Date: 2019-01-24 05:59
 * @Version:
 */

public class Test {
    public static void main(String[] args) throws IOException {
        File file = new File("d:\\4.sql");
        if (!file.isFile()) {
            System.out.println("error arg[0] not a file");
            return;
        }

        System.out.println(file.getName() + "begin!");
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(file), "utf-8"));

        BufferedReader br = new BufferedReader(new InputStreamReader(
                new FileInputStream(file), "utf-8"/* 指定源文件的字符集编码 */));

        String line = br.readLine();
        while (line != null) {
            if (line.contains(", c_dzd.voucher='"/* 匹配需要留下的sql片段 */)) {
                System.out.println(line);
                bw.append(line + ";\n"/* 追加分号和换行 */);
            }
            line = br.readLine();
        }
        br.close();
        bw.close();
        System.out.println(file.getName() + "ok!");
    }
}
