package com.github.huotaihe.pattern.strategy;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

/**
 * @author 寒溪
 * @date 2021/09/06
 */
@Service
public class StrategyContext {

    @Resource
    private List<Strategy> strategyList;

    public String handle(String type, String param) {
        if (CollectionUtils.isEmpty(strategyList)) {
            throw new UnsupportedOperationException();
        }

        Strategy supportedStrategy = strategyList.stream().filter(strategy -> strategy.support(type)).findFirst().orElseThrow(
            UnsupportedOperationException::new);

        return supportedStrategy.handle(param);
    }

}
