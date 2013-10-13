package com.liruda.controller;

import org.springframework.context.i18n.LocaleContext;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Date;
import java.util.Locale;

@Controller
public class SampleController {

	@RequestMapping("boilerplate")
	public String loadHomePage(Model m) {
        Date now = new Date();

        DateFormatter df = new DateFormatter("yyyy/MM/dd, HH:mm:ss, EEEE");
		m.addAttribute("name", "liruda");
        m.addAttribute("serverTime", df.print(now, Locale.SIMPLIFIED_CHINESE));
		return "html5boilerplate";
	}
}
