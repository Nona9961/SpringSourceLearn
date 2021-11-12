package com.nona9961.springsourcecode.onlySpring;

import com.nona9961.springsourcecode.onlySpring.autowire.NotControlBySpring;
import com.nona9961.springsourcecode.onlySpring.aware.ExampleOfAware;
import com.nona9961.springsourcecode.onlySpring.config.SpringConfig;
import com.nona9961.springsourcecode.onlySpring.factoryBean.BeanWithIdFactory;
import com.nona9961.springsourcecode.withSpringboot.entity.BeanWithId;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.security.AccessControlContext;

/**
 * @author nona9961
 * @date 2021/10/18 17:41
 */
public class Context {
    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class, ExampleOfAware.class);
//        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.nona9961.springsourcecode.withSpringboot.config");
/*        AutowireCapableBeanFactory autowireCapableBeanFactory = applicationContext.getAutowireCapableBeanFactory();
        Object autowire = autowireCapableBeanFactory.autowire(NotControlBySpring.class, AutowireCapableBeanFactory.AUTOWIRE_BY_NAME, false);
        System.out.println(autowire);*/
//        AccessControlContext accessControlContext = applicationContext.getBeanFactory().getAccessControlContext();
//        System.out.println(accessControlContext);
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
