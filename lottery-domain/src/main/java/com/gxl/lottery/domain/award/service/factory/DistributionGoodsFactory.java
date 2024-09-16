package com.gxl.lottery.domain.award.service.factory;

import com.gxl.lottery.domain.award.service.goods.IDistributionGoods;
import org.springframework.stereotype.Service;

/**
 * @Author Gavin
 * @Date 2024/9/16
 * 配送商品简单工厂，提供获取配送服务
 */
@Service
public class DistributionGoodsFactory extends GoodsConfig {

    public IDistributionGoods getDistributionGoodsService(Integer awardType){
        return goodsMap.get(awardType);
    }

}
