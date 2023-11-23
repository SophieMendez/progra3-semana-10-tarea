package com.sophiamendez.semana10tarea;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/Tarea")

public class WebController {

     @GetMapping()
    public String index () {
        return "index";
    }
    
}
