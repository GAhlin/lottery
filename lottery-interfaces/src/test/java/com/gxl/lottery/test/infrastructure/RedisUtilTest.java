package com.gxl.lottery.test.infrastructure;

import com.gxl.lottery.infrastructure.util.RedisUtil;
import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @description: Redis 使用测试
 * @author: gxl
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisUtilTest {

    private Logger logger = LoggerFactory.getLogger(RedisUtilTest.class);

    @Resource
    private RedisUtil redisUtil;

    @Test
    public void test_set() {
        redisUtil.set("lottery_user_key","gxl");
    }


    @Test
    public void test_get() {
        Object user = redisUtil.get("lottery_user_key");
        logger.info("测试结果：{}", JSON.toJSONString(user));
    }

}
