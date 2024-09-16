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
 * 实物发货类商品
 */
@Component
public class PhysicalGoods extends DistributionBase implements IDistributionGoods {

    @Override
    public DistributionRes doDistribution(GoodsReq req) {

        // 模拟调用实物发奖
        logger.info("模拟调用实物发奖 uId：{} awardContent：{}", req.getuId(), req.getAwardContent());

        // 更新用户领奖结果
        super.updateUserAwardState(req.getuId(), req.getOrderId(), req.getAwardId(), Constants.AwardState.SUCCESS.getCode(), Constants.AwardState.SUCCESS.getInfo());

        return new DistributionRes(req.getuId(), Constants.AwardState.SUCCESS.getCode(), Constants.AwardState.SUCCESS.getInfo());
    }

    @Override
    public Integer getDistributionGoodsName() {
        return Constants.AwardType.PhysicalGoods.getCode();
    }

}
