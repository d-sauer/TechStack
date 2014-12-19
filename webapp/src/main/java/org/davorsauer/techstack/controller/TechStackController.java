package org.davorsauer.techstack.controller;

import org.davorsauer.techstack.common.logging.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TechStackController implements Logger {

    @RequestMapping(value = {"", "/"})
    public ModelAndView index() {
        info("!! INDEX !!");
        return new ModelAndView("index");
    }
    
}
