package com.kasi.firstdemo.util;

import com.aspose.diagram.License;

import java.text.ParseException;
import java.util.Date;

/**
 * <pre> TODO </pre>
 *
 * @Author: HuangTao
 * @Date: 2018-11-10 05:22
 * @Version:
 */

public class TestMain {
    public static void main(String[] args) throws Exception {
        License license = new License();
        license.setLicense(new java.io.FileInputStream("Aspose.Diagram.Java.lic"));

    }
}
