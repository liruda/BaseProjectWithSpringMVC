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
import org.springframework.format.datetime.DateFormatter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Date;
import java.util.Locale;

@Controller
public class HomeController {

    @RequestMapping("home")
    public String loadHomePage(Model m) {
        Date now = new Date();

        DateFormatter df = new DateFormatter("yyyy/MM/dd, HH:mm:ss, EEEE");
        m.addAttribute("name", "liruda");
        m.addAttribute("serverTime", df.print(now, Locale.SIMPLIFIED_CHINESE));
        return "home";
    }
}
