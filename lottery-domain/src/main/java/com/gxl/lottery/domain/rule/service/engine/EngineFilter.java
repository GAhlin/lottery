package com.gxl.lottery.domain.rule.service.engine;

import com.gxl.lottery.domain.rule.model.req.DecisionMatterReq;
import com.gxl.lottery.domain.rule.model.res.EngineResult;

/**
 * @description: 规则过滤器引擎
 * @author: gxl
 */
public interface EngineFilter {

    /**
     * 规则过滤器接口
     *
     * @param matter      规则决策物料
     * @return            规则决策结果
     */
    EngineResult process(final DecisionMatterReq matter);

}
