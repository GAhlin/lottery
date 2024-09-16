package com.gxl.lottery.domain.activity.service.partake;

import com.gxl.lottery.domain.activity.model.req.PartakeReq;
import com.gxl.lottery.domain.activity.model.vo.ActivityBillVO;
import com.gxl.lottery.domain.activity.repository.IActivityRepository;

import javax.annotation.Resource;

/**
 * @description: 活动领取模操作，一些通用的数据服务
 * @author: gxl
 */
public class ActivityPartakeSupport {

    @Resource
    protected IActivityRepository activityRepository;

    protected ActivityBillVO queryActivityBill(PartakeReq req){
        return activityRepository.queryActivityBill(req);
    }

}
