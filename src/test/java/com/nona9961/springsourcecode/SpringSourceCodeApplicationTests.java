package com.nona9961.springsourcecode;

import com.nona9961.springsourcecode.withSpringboot.entity.InnerClass;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringSourceCodeApplicationTests {

    @Test
    void contextLoads() {
    }

    public static void main(String[] args) {
        Class<?>[] declaredClasses = InnerClass.class.getDeclaredClasses();
        for (Class<?> declaredClass : declaredClasses) {

            System.out.println(declaredClass);
        }
    }

}
