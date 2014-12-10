package com.salesforce.jbactivity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author sprathivadi
 */
@Controller
@RequestMapping("/")
public class IndexController {

    @RequestMapping(method = RequestMethod.GET)
    public String hello() {
            return "index";
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/help")
    public String help() {
            return "help";
    }

}
