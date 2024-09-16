package com.gxl.lottery.domain.activity.service.partake;

import com.gxl.lottery.domain.activity.model.req.PartakeReq;
import com.gxl.lottery.domain.activity.model.res.PartakeResult;

/**
 * @description: 抽奖活动参与接口
 * @author: gxl
 */
public interface IActivityPartake {

    /**
     * 参与活动
     * @param req 入参
     * @return    领取结果
     */
    PartakeResult doPartake(PartakeReq req);

}
