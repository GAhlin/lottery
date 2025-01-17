package com.gxl.lottery.domain.rule.service.logic.impl;

import com.gxl.lottery.domain.rule.model.req.DecisionMatterReq;
import com.gxl.lottery.domain.rule.service.logic.BaseLogic;
import org.springframework.stereotype.Component;

/**
 * @description: 性别规则
 * @author: gxl
 */
@Component
public class UserGenderFilter extends BaseLogic {

    @Override
    public String matterValue(DecisionMatterReq decisionMatter) {
        return decisionMatter.getValMap().get("gender").toString();
    }
    
}
