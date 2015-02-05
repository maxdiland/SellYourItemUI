package com.gmail.maxdiland.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * author Maksim Diland
 */

@Controller
@RequestMapping("/hello")
public class SimpleController {

    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {
        model.addAttribute("message", "Hello world from MVC!");
        return "MyView";
    }
}
