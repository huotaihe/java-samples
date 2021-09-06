package com.github.huotaihe.pattern.strategy;

import javax.annotation.Resource;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author 寒溪
 * @date 2021/09/06
 */
@SpringBootTest
public class StrategyContextTest {

    private final static Logger log = LoggerFactory.getLogger(StrategyContextTest.class);

    @Resource
    private StrategyContext strategyContext;

    @Test
    public void testHandle() {

        String firstResult = strategyContext.handle("First", "Hello");
        log.info("First type result: {}", firstResult);

        String secondResult = strategyContext.handle("Second", "Hello");
        log.info("Second type result: {}", secondResult);

        String thirdResult = strategyContext.handle("Third", "Hello");
        log.info("Third type result: {}", thirdResult);
    }

}
