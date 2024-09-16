package com.gxl.lottery.domain.strategy.repository.impl;

import com.gxl.lottery.domain.strategy.model.aggregates.StrategyRich;
import com.gxl.lottery.domain.strategy.repository.IStrategyRepository;
import com.gxl.lottery.infrastructure.dao.IAwardDao;
import com.gxl.lottery.infrastructure.dao.IStrategyDao;
import com.gxl.lottery.infrastructure.dao.IStrategyDetailDao;
import com.gxl.lottery.infrastructure.po.Award;
import com.gxl.lottery.infrastructure.po.Strategy;
import com.gxl.lottery.infrastructure.po.StrategyDetail;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;


@Component
public class StrategyRepository implements IStrategyRepository {

    @Resource
    private IStrategyDao strategyDao;

    @Resource
    private IStrategyDetailDao strategyDetailDao;

    @Resource
    private IAwardDao awardDao;

    @Override
    public StrategyRich queryStrategyRich(Long strategyId) {
        Strategy strategy = strategyDao.queryStrategy(strategyId);
        List<StrategyDetail> strategyDetailList = strategyDetailDao.queryStrategyDetailList(strategyId);
        return new StrategyRich(strategyId, strategy, strategyDetailList);
    }

    @Override
    public Award queryAwardInfo(String awardId) {
        return awardDao.queryAwardInfo(awardId);
    }

}
