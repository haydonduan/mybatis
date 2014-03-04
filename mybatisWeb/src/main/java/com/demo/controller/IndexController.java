package com.demo.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.demo.domain.User;
import com.demo.domain.User2;
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
    
    @RequestMapping("register")
    public ModelAndView register(){
        ModelAndView mav = new ModelAndView("register");
        return mav;
    }
    
    @RequestMapping("registerdo")
    public ModelAndView registerdo(User user){
        ModelAndView mav = new ModelAndView();
        int result = indexService.addUser(user);
        if(result != 0){
            mav.addObject("user", user);
           mav.setViewName("success");
        }else{
           mav.setViewName("fail");
        }
        return mav;
    }
    @RequestMapping("submit")
    public ModelAndView submit(User user){
        ModelAndView mav = new ModelAndView();
        User usernew = indexService.findByName(user.getName());
        if(user.getPassword().equals(usernew.getPassword())){
            mav.addObject("user", user);
            mav.setViewName("success");
        }else{
            mav.setViewName("fail");
        }
        return mav;
    }
    
    @RequestMapping("cupuser")
    public ModelAndView findByCupAndUser(){
        ModelAndView mav = new ModelAndView("association");
        User2 usernew = indexService.findCupAndUserByUserId(new User2(1L));
        mav.addObject("user", usernew);
        return mav;
    }
}
