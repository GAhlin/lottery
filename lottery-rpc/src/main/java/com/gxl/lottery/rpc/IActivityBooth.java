package com.gxl.lottery.rpc;

import com.gxl.lottery.rpc.req.ActivityReq;
import com.gxl.lottery.rpc.res.ActivityRes;

/**
 * @Author Gavin
 * @Date 2024/9/15
 *  * 活动展台
 *  * 1. 创建活动
 *  * 2. 更新活动
 *  * 3. 查询活动
 */
public interface IActivityBooth {

    ActivityRes queryActivityById(ActivityReq req);

}
