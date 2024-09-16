package com.gxl.lottery.domain.activity.model.res;

import com.gxl.lottery.common.Result;

/**
 * @description: 活动参与结果
 * @author: gxl
 */
public class PartakeResult extends Result {

    /**
     * 策略ID
     */
    private Long strategyId;

    public PartakeResult(String code, String info) {
        super(code, info);
    }

    public Long getStrategyId() {
        return strategyId;
    }

    public void setStrategyId(Long strategyId) {
        this.strategyId = strategyId;
    }
}
