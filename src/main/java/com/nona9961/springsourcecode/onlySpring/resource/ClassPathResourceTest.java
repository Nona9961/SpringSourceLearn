package com.nona9961.springsourcecode.onlySpring.resource;

import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author nona9961
 * @date 2021/12/8 14:55
 */
public class ClassPathResourceTest {
    public static void main(String[] args) throws IOException {
        ClassPathResource classPathResource = new ClassPathResource("com/nona9961/springsourcecode/withSpringboot/entity/BeanWithId.class");
        InputStream inputStream = classPathResource.getInputStream();
        int available = inputStream.available();
        byte[] bytes = new byte[available];
        inputStream.read(bytes);
        System.out.println(new String(bytes));
        inputStream.close();
    }
}
