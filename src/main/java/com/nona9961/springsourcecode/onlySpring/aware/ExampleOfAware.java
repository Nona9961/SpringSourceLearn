package com.nona9961.springsourcecode.onlySpring.aware;

import com.nona9961.springsourcecode.withSpringboot.entity.BeanWithId;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

import javax.annotation.Resource;

/**
 * @author nona9961
 * @date 2021/11/4 10:50
 */
public class ExampleOfAware implements BeanFactoryAware {
    private BeanFactory beanFactory;
    @Resource
    private BeanWithId beanWithId;

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }
}
