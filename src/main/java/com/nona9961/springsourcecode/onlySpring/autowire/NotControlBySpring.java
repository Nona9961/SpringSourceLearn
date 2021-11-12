package com.nona9961.springsourcecode.onlySpring.autowire;

import com.nona9961.springsourcecode.withSpringboot.entity.BeanWithId;
import lombok.Data;

import javax.annotation.Resource;

/**
 * @author nona9961
 * @date 2021/11/4 14:54
 */
@Data
public class NotControlBySpring {
    @Resource
    private BeanWithId beanWithId;
}
