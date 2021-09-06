package com.github.huotaihe.pattern.strategy;

/**
 * @author 寒溪
 * @date 2021/09/04
 */
public interface Strategy {

    /**
     * 判断是否可以处理该类型的策略
     *
     * @param type 策略类型
     * @return 是否支持
     */
    boolean support(String type);

    /**
     * 策略处理
     *
     * @param parameter 入参
     * @return Result
     */
    String handle(String parameter);

}
