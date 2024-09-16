package com.gxl.lottery.domain.strategy.service.algorithm.impl;

import com.gxl.lottery.domain.strategy.model.vo.AwardRateInfo;
import com.gxl.lottery.domain.strategy.service.algorithm.BaseAlgorithm;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

/**
 * @author gxl
 *
 * ccmp的水球大作战抽奖逻辑
 */
@Component("wbDrawAlgorithm")
public class WbDrawAlgorithm extends BaseAlgorithm {

    @Override
    public String randomDraw(Long strategyId, List<String> excludeAwardIds) {

        BigDecimal differenceDenominator = BigDecimal.ZERO;

        // 排除掉不在抽奖范围的奖品ID集合
        List<AwardRateInfo> awardRateIntervalValList = awardRateInfoMap.get(strategyId);

        // 获取随机概率值
        SecureRandom secureRandom = new SecureRandom();
        int randomVal = secureRandom.nextInt(100) + 1;

        // 循环获取奖品
        String awardId = "";
        int sum = 0;
        for (AwardRateInfo awardRateInfo : awardRateIntervalValList) {
            sum += awardRateInfo.getAwardRate().multiply(new BigDecimal(100)).intValue();
            if (randomVal <= sum) {
                awardId = awardRateInfo.getAwardId();
                break;
            }
        }

        // 返回中奖结果
        return awardId;
    }

}
