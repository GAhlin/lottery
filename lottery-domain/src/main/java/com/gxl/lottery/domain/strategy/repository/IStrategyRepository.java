package com.gxl.lottery.domain.strategy.repository;

import com.gxl.lottery.domain.strategy.model.aggregates.StrategyRich;
import com.gxl.lottery.domain.strategy.model.vo.AwardBriefVO;

import java.util.List;

/**
 * 策略表仓储服务
 * @author guo
 */
public interface IStrategyRepository {

    StrategyRich queryStrategyRich(Long strategyId);

    AwardBriefVO queryAwardInfo(String awardId);

    List<String> queryNoStockStrategyAwardList(Long strategyId);

    /**
     * 扣减库存
     * @param strategyId 策略ID
     * @param awardId    奖品ID
     * @return           扣减结果
     */
    boolean deductStock(Long strategyId, String awardId);

}
