package cn.itedus.lottery.domain.strategy.service.algorithm.impl;

import cn.itedus.lottery.common.Constants;
import cn.itedus.lottery.domain.strategy.annotation.Strategy;
import cn.itedus.lottery.domain.strategy.service.algorithm.BaseAlgorithm;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @description: 单项随机概率抽奖，抽到一个已经排掉的奖品则未中奖
 *
 * @date: 2021/8/28
 *
 */
@Component("singleRateRandomDrawAlgorithm")
@Strategy(strategyMode = Constants.StrategyMode.SINGLE)
public class SingleRateRandomDrawAlgorithm extends BaseAlgorithm {

    @Override
    public String randomDraw(Long strategyId, List<String> excludeAwardIds) {

        // 获取策略对应的元祖
        String[] rateTuple = super.rateTupleMap.get(strategyId);
        assert rateTuple != null;

        // 随机索引
        int randomVal = this.generateSecureRandomIntCode(100);
        int idx = super.hashIdx(randomVal);

        // 返回结果
        String awardId = rateTuple[idx];

        // 如果中奖ID命中排除奖品列表，则返回NULL
        if (excludeAwardIds.contains(awardId)) {
            return null;
        }

        return awardId;
    }

}
