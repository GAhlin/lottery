package com.gxl.lottery.domain.award.service.factory;

import com.gxl.lottery.common.Constants;
import com.gxl.lottery.domain.award.service.goods.IDistributionGoods;
import com.gxl.lottery.domain.award.service.goods.impl.CouponGoods;
import com.gxl.lottery.domain.award.service.goods.impl.DescGoods;
import com.gxl.lottery.domain.award.service.goods.impl.PhysicalGoods;
import com.gxl.lottery.domain.award.service.goods.impl.RedeemCodeGoods;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author Gavin
 * @Date 2024/9/16
 * 各类发奖奖品配置类
 */
public class GoodsConfig {

    /** 奖品发放策略组 */
    protected static Map<Integer, IDistributionGoods> goodsMap = new ConcurrentHashMap<>();

    @Resource
    private DescGoods descGoods;

    @Resource
    private RedeemCodeGoods redeemCodeGoods;

    @Resource
    private CouponGoods couponGoods;

    @Resource
    private PhysicalGoods physicalGoods;

    @PostConstruct
    public void init() {
        goodsMap.put(Constants.AwardType.DESC.getCode(), descGoods);
        goodsMap.put(Constants.AwardType.RedeemCodeGoods.getCode(), redeemCodeGoods);
        goodsMap.put(Constants.AwardType.CouponGoods.getCode(), couponGoods);
        goodsMap.put(Constants.AwardType.PhysicalGoods.getCode(), physicalGoods);
    }

}
