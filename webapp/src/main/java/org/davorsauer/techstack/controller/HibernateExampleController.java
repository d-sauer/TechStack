package org.davorsauer.techstack.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HibernateExampleController {

    @RequestMapping("/hibernate")
    public ModelAndView getList() {
        
        return new ModelAndView("HList");
    }
    
    
}
