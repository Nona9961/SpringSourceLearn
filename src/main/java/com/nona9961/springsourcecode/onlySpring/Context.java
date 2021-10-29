package com.nona9961.springsourcecode.onlySpring;

import com.nona9961.springsourcecode.onlySpring.config.SpringConfig;
import com.nona9961.springsourcecode.onlySpring.factoryBean.BeanWithIdFactory;
import com.nona9961.springsourcecode.withSpringboot.entity.BeanWithId;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author nona9961
 * @date 2021/10/18 17:41
 */
public class Context {
    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class, BeanWithIdFactory.class);
        Object normalBean = applicationContext.getBean("normalBean");
        if (normalBean instanceof BeanWithId) {
            BeanWithId realBean = (BeanWithId) normalBean;
            String id = realBean.getId();
            System.out.println("id = " + id);
        }
        Object beanWithIdFactory = applicationContext.getBean("beanWithIdFactory");
        Object beanWithIdFactoryAnother = applicationContext.getBean("beanWithIdFactory");

        if (beanWithIdFactory instanceof BeanWithId) {
            BeanWithId beanWithId = (BeanWithId) beanWithIdFactory;
            BeanWithId beanWithIdAnother = (BeanWithId) beanWithIdFactoryAnother;
            System.out.println(beanWithId.getId());
            System.out.println(beanWithIdAnother == beanWithId);
        }
        Object factory = applicationContext.getBean("&beanWithIdFactory");
        if (factory instanceof BeanWithIdFactory) {
            System.out.println("I am factory bean");
        }
    }
}
