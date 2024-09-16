package com.gxl.lottery.infrastructure.dao;

import com.gxl.lottery.infrastructure.po.Activity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 活动基础信息表DAO
 */
@Mapper
public interface IActivityDao {

   /**
    * 插入数据
    * @param req 入参
    */
   void insert(Activity req);

   /**
    * 根据活动号查询活动信息
    *
    * @param activityId 活动号
    * @return           活动信息
    */
   Activity queryActivityById(Long activityId);

}