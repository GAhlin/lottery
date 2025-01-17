package com.gxl.lottery.domain.rule.service.engine.impl;

import com.gxl.lottery.domain.rule.model.aggregates.TreeRuleRich;
import com.gxl.lottery.domain.rule.model.req.DecisionMatterReq;
import com.gxl.lottery.domain.rule.model.res.EngineResult;
import com.gxl.lottery.domain.rule.model.vo.TreeNodeVO;
import com.gxl.lottery.domain.rule.repository.IRuleRepository;
import com.gxl.lottery.domain.rule.service.engine.EngineBase;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @description: 规则引擎处理器
 * @author: gxl
 */
@Service("ruleEngineHandle")
public class RuleEngineHandle extends EngineBase {

    @Resource
    private IRuleRepository ruleRepository;

    @Override
    public EngineResult process(DecisionMatterReq matter) {
        // 决策规则树
        TreeRuleRich treeRuleRich = ruleRepository.queryTreeRuleRich(matter.getTreeId());
        if (null == treeRuleRich) {
            throw new RuntimeException("Tree Rule is null!");
        }

        // 决策节点
        TreeNodeVO treeNodeInfo = engineDecisionMaker(treeRuleRich, matter);

        // 决策结果
        return new EngineResult(matter.getUserId(), treeNodeInfo.getTreeId(), treeNodeInfo.getTreeNodeId(), treeNodeInfo.getNodeValue());
    }

}
