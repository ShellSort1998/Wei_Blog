package com.blog.weiblog.controller.test;

import com.blog.weiblog.dao.TestMapper;
import org.apache.ibatis.annotations.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    TestMapper testMapper;

    @GetMapping("/test")
    @ResponseBody
    public String test(){
        Logger logger = LoggerFactory.getLogger(getClass());
        int id = 1;
        String nick_name = testMapper.selectNick_nameById(id);
        logger.info(nick_name);
        return nick_name;
    }

}
