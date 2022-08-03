package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import model.Task;

@Controller

public class TaskController {

    @GetMapping("/index")
    public String create() {
        return "index";
    }
    
    @PostMapping("/index")
    public void entrada(Task task){
        System.out.println("Duração é : " + task.getOrigem());
    }

}
