package com.gxl.lottery.application.process.res;

import com.gxl.lottery.common.Result;
import com.gxl.lottery.domain.strategy.model.vo.DrawAwardInfo;

/**
 * @Author Gavin
 * @Date 2024/9/17
 * 活动抽奖结果
 */
public class DrawProcessResult extends Result {

    private DrawAwardInfo drawAwardInfo;

    public DrawProcessResult(String code, String info) {
        super(code, info);
    }

    public DrawProcessResult(String code, String info, DrawAwardInfo drawAwardInfo) {
        super(code, info);
        this.drawAwardInfo = drawAwardInfo;
    }

    public DrawAwardInfo getDrawAwardInfo() {
        return drawAwardInfo;
    }

    public void setDrawAwardInfo(DrawAwardInfo drawAwardInfo) {
        this.drawAwardInfo = drawAwardInfo;
    }
}
