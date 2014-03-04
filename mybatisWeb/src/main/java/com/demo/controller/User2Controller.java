package com.demo.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.demo.domain.User2;
import com.demo.service.IndexService;

@Controller
@RequestMapping("/user2/")
public class User2Controller {
    
   @Resource
   private IndexService indexService;
    
    @RequestMapping("index")
    public ModelAndView index(){
        ModelAndView mav = new ModelAndView("user2");
        User2 user = indexService.findUserByUserId(new User2(1L));
        mav.addObject("user",user);
        return mav;
    }
    
    @RequestMapping("association")
    public ModelAndView association(){
        ModelAndView mav = new ModelAndView("association");
        User2 user = indexService.findCupAndUserByUserId(new User2(1L));
        mav.addObject("user",user);
        return mav;
    }
    
    @RequestMapping("collection")
    public ModelAndView collection(){
        ModelAndView mav = new ModelAndView("collection");
        User2 user = indexService.findBoxAndUserByUserId(new User2(1L));
        mav.addObject("user",user);
        mav.addObject("boxLength",user.getBox().size());
        return mav;
    }
}
