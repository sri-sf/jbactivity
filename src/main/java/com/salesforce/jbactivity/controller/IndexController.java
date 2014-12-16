package com.salesforce.jbactivity.controller;

import com.salesforce.jbactivity.service.JBLogFileWriterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author sprathivadi
 */
@Controller
@RequestMapping("/")
public class IndexController {
    
    @Autowired
    private JBLogFileWriterService logFileWriterService;

    @RequestMapping(method = RequestMethod.GET)
    public String hello() {
        return "index";
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/help")
    public String help() {
        return "help";
    }
    
    @RequestMapping(method = RequestMethod.POST, value = "/save")
    public String save() {
        return "save";
    }
    
    @RequestMapping(method = RequestMethod.POST, value = "/publish")
    public String publish() {
        return "publish";
    }
    
    @RequestMapping(method = RequestMethod.POST, value = "/validate")
    public String validate() {
        return "validate";
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/edit")
    public String edit() {
        return "edit";
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/execute/{message}")
    public String writeJBLog(Model model, @PathVariable String message) {
        message = message == null || message.length()<1 ? "default message" : message;
        logFileWriterService.writeToLog(message);
        model.addAttribute("log", logFileWriterService.retrieveLog());
        return "log";
    }
    
    @RequestMapping(method = RequestMethod.POST, value = "/execute")
    public String writeJBLog(Model model) {
        logFileWriterService.writeToLog("default message");
        model.addAttribute("log", logFileWriterService.retrieveLog());
        return "log";
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/getlogs")
    public String retrieveJBLogs(Model model) {
        model.addAttribute("log", logFileWriterService.retrieveLog());
        return "log";
    }    

    @RequestMapping(method = RequestMethod.GET, value = "/deletelogs")
    public String deleteJBLogs(Model model) {
        logFileWriterService.deleteLog();
        model.addAttribute("log", logFileWriterService.retrieveLog());
        return "log";
    }    
}
