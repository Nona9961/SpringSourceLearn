package com.nona9961.springsourcecode.onlySpring;

/**
 * @author nona9961
 * @date 2021/10/19 14:28
 */
public abstract class Code {
    public void doSome() {
        step1();
        step2();
    }

    protected abstract void step1();

    protected abstract void step2();

}
