package com.edison.back.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BackController {
	
	Logger log = LoggerFactory.getLogger(BackController.class);
	
	@RequestMapping(path = "/")
    public 
    String home(Model model) {
		model.addAttribute("name", "edison-back");
        return "index";
    }
	
}
