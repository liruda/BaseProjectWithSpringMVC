package com.liruda.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//import java.util.logging.Logger;

/**
 * Created with IntelliJ IDEA.
 * User: liruda
 * Date: 13-10-13
 * Time: 00:35
 * To change this template use File | Settings | File Templates.
 */

@Controller
public class LoginController {

    private static final Logger logger = Logger.getLogger(LoginController.class);

    @RequestMapping(value = "/*", method = RequestMethod.GET)
    public String login(ModelMap model){
        return "home";  }

    @RequestMapping(value = "/loginError*", method = RequestMethod.GET)
    public String loginError(ModelMap model) {
        model.addAttribute("loginerror", "true");
        logger.info("Login error");
        return "home";

    }


}
