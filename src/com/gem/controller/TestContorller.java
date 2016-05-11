package com.gem.controller;

import com.gem.entity.Test;
import com.gem.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by MaFei on 2016/5/11 0011.
 */
@Controller
public class TestContorller {

    @Autowired
    TestService testService;

    @RequestMapping(value = "/test")
    public ModelAndView test(){
        ModelAndView mv = new ModelAndView("/test.jsp");
        Test test = testService.selectTest(1);
        mv.addObject("test", test);
        return mv;
    }
}
