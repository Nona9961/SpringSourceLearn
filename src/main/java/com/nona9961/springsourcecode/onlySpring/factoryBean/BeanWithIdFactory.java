package com.nona9961.springsourcecode.onlySpring.factoryBean;

import com.nona9961.springsourcecode.withSpringboot.entity.BeanWithId;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author hu mingcheng
 * @date 2021/10/28 16:46
 */
public class BeanWithIdFactory implements FactoryBean<BeanWithId> {
    @Override
    public BeanWithId getObject() throws Exception {
        BeanWithId beanWithId = new BeanWithId();
        beanWithId.setId("from factory");
        return beanWithId;
    }

    @Override
    public Class<?> getObjectType() {
        return BeanWithId.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
