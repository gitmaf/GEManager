package com.gem.service.impl;

import com.gem.dao.TestMapper;
import com.gem.entity.Test;
import com.gem.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by MaFei on 2016/5/11 0011.
 */
public class TestServiceImpl implements TestService {

    @Autowired
    TestMapper testMapper;

    @Override
    public Test selectTest(int id) {
        return testMapper.selectByPrimaryKey(id);
    }
}
