package com.nona9961.springsourcecode.onlySpring.resource;

import org.springframework.core.io.UrlResource;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/**
 * @author nona9961
 * @date 2021/12/7 15:09
 */
public class UrlResourceTest {
    void test() throws IOException {
        URL url = new URL("file:/C:/Users/Administrator/Desktop/20210928-000010.png");
        UrlResource urlResource = new UrlResource(url);
        File file = urlResource.getFile();
        InputStream inputStream = urlResource.getInputStream();
        inputStream.close();
        UrlResource anotherResource = new UrlResource("http://www.baidu.com");
//        File notExistFile = anotherResource.getFile();
        InputStream webIS = anotherResource.getInputStream();
        webIS.close();
    }

    public static void main(String[] args) throws IOException {
        UrlResourceTest urlResourceTest = new UrlResourceTest();
        urlResourceTest.test();
    }
}
