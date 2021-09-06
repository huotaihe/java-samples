package com.github.huotaihe.pattern.strategy;

import org.springframework.stereotype.Service;

/**
 * @author 寒溪
 * @date 2021/09/06
 */
@Service("SecondStrategy")
public class SecondStrategy implements Strategy{
    @Override
    public boolean support(String type) {
        return "Second".equalsIgnoreCase(type);
    }

    @Override
    public String handle(String parameter) {
        return parameter + " handled by SecondStrategy";
    }
}
