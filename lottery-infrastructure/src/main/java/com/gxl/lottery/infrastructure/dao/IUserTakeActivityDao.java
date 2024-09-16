package com.gxl.lottery.infrastructure.dao;

import com.gxl.lottery.infrastructure.po.UserTakeActivity;
import org.apache.ibatis.annotations.Mapper;

/**
 * @description: 用户领取活动表DAO
 * @author: gxl
 */
@Mapper
public interface IUserTakeActivityDao {

    /**
     * 插入用户领取活动信息
     *
     * @param userTakeActivity 入参
     */
    void insert(UserTakeActivity userTakeActivity);

}
