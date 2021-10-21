package com.nona9961.springsourcecode.onlySpring;

import com.nona9961.springsourcecode.onlySpring.config.SpringConfig;
import com.nona9961.springsourcecode.withSpringboot.entity.BeanWithId;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author nona9961
 * @date 2021/10/18 17:41
 */
public class Context {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        Object normalBean = annotationConfigApplicationContext.getBean("normalBean");
        if (normalBean instanceof BeanWithId) {
            BeanWithId realBean = (BeanWithId) normalBean;
            String id = realBean.getId();
            System.out.println("id = " + id);
        }
    }
}
