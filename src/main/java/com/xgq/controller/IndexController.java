package com.xgq.controller;

import com.xgq.model.User;
import com.xgq.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by xieguoqiang on 14-5-20.
 */
@Controller
public class IndexController {

    @Autowired
    public UserService userService;

    @RequestMapping(value = "index")
    public ModelAndView index(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        ModelAndView mv = new ModelAndView("/index");
        mv.addObject("name", name);
        User paramUser = new User();
        paramUser.setName("1");
        paramUser.setPassword("1");
        User user = userService.selectUser(paramUser);
        return mv;
    }
}
