package com.gxl.lottery.domain.rule.service.logic.impl;

import com.gxl.lottery.domain.rule.model.req.DecisionMatterReq;
import com.gxl.lottery.domain.rule.service.logic.BaseLogic;
import org.springframework.stereotype.Component;

/**
 * @description: 年龄规则
 * @author: gxl
 */
@Component
public class UserAgeFilter extends BaseLogic {

    @Override
    public String matterValue(DecisionMatterReq decisionMatter) {
        return decisionMatter.getValMap().get("age").toString();
    }

}
