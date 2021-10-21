package com.nona9961.springsourcecode.onlySpring.config;

import com.nona9961.springsourcecode.withSpringboot.entity.BeanWithId;
import org.springframework.context.annotation.Bean;

/**
 * @author nona9961
 * @date 2021/10/18 17:44
 */
public class SpringConfig {
    @Bean
    public BeanWithId normalBean() {
        BeanWithId beanWithId = new BeanWithId();
        beanWithId.setId("first bean");
        return beanWithId;
    }
}
