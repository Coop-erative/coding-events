package org.codingevents.codingevents.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    //Get handler returning template Index
    @RequestMapping
    public String index() {
        return "index";
    }

}
