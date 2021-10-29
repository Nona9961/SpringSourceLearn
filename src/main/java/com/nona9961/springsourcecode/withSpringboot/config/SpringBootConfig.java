package com.nona9961.springsourcecode.withSpringboot.config;

import com.nona9961.springsourcecode.withSpringboot.entity.BeanWithId;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author nona9961gcheng
 * @date 2021/10/29 14:20
 */
@Configuration
public class SpringBootConfig {
    @Bean
    public BeanWithId beanWithId() {
        return new BeanWithId();
    }
}
