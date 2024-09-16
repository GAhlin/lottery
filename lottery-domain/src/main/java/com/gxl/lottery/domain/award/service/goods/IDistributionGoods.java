package com.gxl.lottery.domain.award.service.goods;

import com.gxl.lottery.domain.award.model.req.GoodsReq;
import com.gxl.lottery.domain.award.model.res.DistributionRes;

/**
 * @Author Gavin
 * @Date 2024/9/16
 * 配送货物基础共用类
 */
public interface IDistributionGoods {

    /**
     * 奖品配送接口，奖品类型（1:文字描述、2:兑换码、3:优惠券、4:实物奖品）
     *
     * @param req   物品信息
     * @return      配送结果
     */
    DistributionRes doDistribution(GoodsReq req);

    Integer getDistributionGoodsName();

}

