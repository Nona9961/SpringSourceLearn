package com.nona9961.springsourcecode.onlySpring.inherit;

import com.nona9961.springsourcecode.withSpringboot.entity.BeanWithId;

/**
 * @author nona9961
 * @date 2021/11/15 16:11
 */
public class InheritBean extends BeanWithId {

    public static class AnotherBean extends InheritBean {

    }
}

