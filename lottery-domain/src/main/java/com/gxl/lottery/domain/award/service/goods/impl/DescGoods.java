package com.gxl.lottery.domain.award.service.goods.impl;

import com.gxl.lottery.common.Constants;
import com.gxl.lottery.domain.award.model.req.GoodsReq;
import com.gxl.lottery.domain.award.model.res.DistributionRes;
import com.gxl.lottery.domain.award.service.goods.DistributionBase;
import com.gxl.lottery.domain.award.service.goods.IDistributionGoods;
import org.springframework.stereotype.Component;

/**
 * @Author Gavin
 * @Date 2024/9/16
 * 描述类商品，以文字形式展示给用户
 */
@Component
public class DescGoods extends DistributionBase implements IDistributionGoods {

    @Override
    public DistributionRes doDistribution(GoodsReq req) {

        super.updateUserAwardState(req.getuId(), req.getOrderId(), req.getAwardId(), Constants.GrantState.COMPLETE.getCode());

        return new DistributionRes(req.getuId(), Constants.AwardState.SUCCESS.getCode(), Constants.AwardState.SUCCESS.getInfo());
    }

    @Override
    public Integer getDistributionGoodsName() {
        return Constants.AwardType.DESC.getCode();
    }
}

