package com.gxl.lottery.rpc.req;

import java.io.Serializable;

/**
    * @Author Gavin
    * @Date 2024/9/15
    */
public class ActivityReq implements Serializable {

    private Long activityId;

    public Long getActivityId() {
        return activityId;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

}

