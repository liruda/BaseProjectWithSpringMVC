package com.liruda.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created with IntelliJ IDEA.
 * User: liruda
 * Date: 13-10-13
 * Time: 00:35
 * To change this template use File | Settings | File Templates.
 */

@Controller
public class LoginController {

    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

    @RequestMapping(value = "/*", method = RequestMethod.GET)
    public String login(ModelMap model){
        return "home";  }

    @RequestMapping(value = "/j_spring_security_check", method = RequestMethod.POST)
    public String check(ModelMap model){
        return "welcome";  }


}
