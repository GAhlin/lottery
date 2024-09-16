package com.gxl.lottery.domain.strategy.repository;

import com.gxl.lottery.domain.strategy.model.aggregates.StrategyRich;
import com.gxl.lottery.infrastructure.po.Award;

public interface IStrategyRepository {

    StrategyRich queryStrategyRich(Long strategyId);

    Award queryAwardInfo(String awardId);

}
