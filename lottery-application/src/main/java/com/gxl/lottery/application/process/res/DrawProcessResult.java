package com.gxl.lottery.application.process.res;

import com.gxl.lottery.common.Result;
import com.gxl.lottery.domain.strategy.model.vo.DrawAwardVO;

/**
 * @Author Gavin
 * @Date 2024/9/17
 * 活动抽奖结果
 */
public class DrawProcessResult extends Result {

    private DrawAwardVO drawAwardVO;

    public DrawProcessResult(String code, String info) {
        super(code, info);
    }

    public DrawProcessResult(String code, String info, DrawAwardVO drawAwardVO) {
        super(code, info);
        this.drawAwardVO = drawAwardVO;
    }

    public DrawAwardVO getDrawAwardVO() {
        return drawAwardVO;
    }

    public void setDrawAwardVO(DrawAwardVO drawAwardVO) {
        this.drawAwardVO = drawAwardVO;
    }

}
