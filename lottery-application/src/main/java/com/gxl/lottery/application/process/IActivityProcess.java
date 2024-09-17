package com.gxl.lottery.application.process;


import com.gxl.lottery.application.process.req.DrawProcessReq;
import com.gxl.lottery.application.process.res.DrawProcessResult;

/**
 * @Author Gavin
 * @Date 2024/9/17
 * 活动抽奖流程编排接口
 */
public interface IActivityProcess {

    /**
     * 执行抽奖流程
     * @param req 抽奖请求
     * @return    抽奖结果
     */
    DrawProcessResult doDrawProcess(DrawProcessReq req);

}
