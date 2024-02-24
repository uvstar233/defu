package cn.itedus.lottery.domain.strategy.service.draw;

import cn.itedus.lottery.domain.strategy.annotation.Strategy;
import cn.itedus.lottery.domain.strategy.service.algorithm.IDrawAlgorithm;
import org.springframework.core.annotation.AnnotationUtils;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @description: 抽奖统一配置信息类
 *
 * @date: 2021/8/28
 *
 */
public class DrawConfig {

    @Resource
    private List<IDrawAlgorithm> algorithmList;

    /**
     * 抽奖策略组
     */
    protected static Map<Integer, IDrawAlgorithm> drawAlgorithmGroup = new ConcurrentHashMap<>();

    @PostConstruct
    public void init() {
        algorithmList.forEach(algorithm -> {
            Strategy strategy = AnnotationUtils.findAnnotation(algorithm.getClass(), Strategy.class);
            if (null != strategy) {
                drawAlgorithmGroup.put(strategy.strategyMode().getCode(), algorithm);
            }
        });
    }

}
