package cn.itedus.lottery.domain.strategy.annotation;

import cn.itedus.lottery.common.Constants;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @description: 抽奖策略模型注解
 *
 * @date: 2022/1/11
 *
 *
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Strategy {

    Constants.StrategyMode strategyMode();

}
