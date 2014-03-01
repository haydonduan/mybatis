package com.demo.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.demo.service.IndexService;

@Controller
@RequestMapping("/views/")
public class IndexController {
    
   @Resource
   private IndexService indexService;
    
    @RequestMapping("index")
    public ModelAndView index(){
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("user",indexService.findUserById(2L));
        return mav;
    }
}
