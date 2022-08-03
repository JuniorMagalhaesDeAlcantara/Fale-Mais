package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class TaskController {

    @GetMapping("/index")
    public String create() {
        return "index";
    }
    
}
