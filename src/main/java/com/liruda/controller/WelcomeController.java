package com.liruda.controller;

/**
 * Created with IntelliJ IDEA.
 * User: liruda
 * Date: 13-10-13
 * Time: 01:03
 * To change this template use File | Settings | File Templates.
 */

import org.springframework.format.datetime.DateFormatter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.Locale;
import org.springframework.context.i18n.LocaleContext;
import org.springframework.web.bind.annotation.RequestMethod;

import java.security.Principal;



@Controller
public class WelcomeController {

    private String currentUserName="";

    @RequestMapping(value="/welcome",method = RequestMethod.GET)
    public String welcome(Model model,Principal principal){

        currentUserName = principal.getName();
        model.addAttribute("userName",currentUserName);

        return "user/welcome";
    }
}
