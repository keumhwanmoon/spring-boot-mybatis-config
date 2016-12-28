package com.jason.index;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author jason, Moon
 * @since 2016-12-24.
 */
@Controller
public class IndexController {

    @GetMapping("/")
    public ModelAndView list() {

        ModelAndView mv = new ModelAndView("index");

        mv.addObject("userName", "Jason");

        return mv;
    }
}
