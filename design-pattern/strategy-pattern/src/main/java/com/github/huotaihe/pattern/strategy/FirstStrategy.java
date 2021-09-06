package com.github.huotaihe.pattern.strategy;

import org.springframework.stereotype.Service;

/**
 * @author 寒溪
 * @date 2021/09/06
 */
@Service("FirstStrategy")
public class FirstStrategy implements Strategy {

    @Override
    public boolean support(String type) {
        return "First".equalsIgnoreCase(type);
    }

    @Override
    public String handle(String parameter) {
        return  parameter + "handled by FirstStrategy";
    }
}
