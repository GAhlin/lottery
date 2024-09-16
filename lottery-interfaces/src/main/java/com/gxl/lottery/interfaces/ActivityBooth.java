package com.gxl.lottery.interfaces;

import com.gxl.lottery.common.Constants;
import com.gxl.lottery.common.Result;
import com.gxl.lottery.infrastructure.dao.IActivityDao;
import com.gxl.lottery.infrastructure.po.Activity;
import com.gxl.lottery.rpc.IActivityBooth;
import com.gxl.lottery.rpc.dto.ActivityDto;
import com.gxl.lottery.rpc.req.ActivityReq;
import com.gxl.lottery.rpc.res.ActivityRes;
import org.apache.dubbo.config.annotation.Service;

import javax.annotation.Resource;

/**
 * @Author Gavin
 * @Date 2024/9/15
 */
@Service
public class ActivityBooth implements IActivityBooth {

    @Resource
    private IActivityDao activityDao;

    @Override
    public ActivityRes queryActivityById(ActivityReq req) {

        Activity activity = activityDao.queryActivityById(req.getActivityId());

        ActivityDto activityDto = new ActivityDto();
        activityDto.setActivityId(activity.getActivityId());
        activityDto.setActivityName(activity.getActivityName());
        activityDto.setActivityDesc(activity.getActivityDesc());
        activityDto.setBeginDateTime(activity.getBeginDateTime());
        activityDto.setEndDateTime(activity.getEndDateTime());
        activityDto.setStockCount(activity.getStockCount());
        activityDto.setTakeCount(activity.getTakeCount());

        return new ActivityRes(new Result(Constants.ResponseCode.SUCCESS.getCode(), Constants.ResponseCode.SUCCESS.getInfo()), activityDto);
    }

}
