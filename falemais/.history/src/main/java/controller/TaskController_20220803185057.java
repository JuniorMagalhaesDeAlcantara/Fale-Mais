package controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import model.Task;

@Controller
public class TaskController {

    List<Task> tasks = new ArrayList<>();

    @GetMapping("/index")
    public String create() {
        return "index";
    }
    
    @PostMapping("/index")
    public void entrada(Task task){
        System.out.println("Duração é : " + task.getDuracao());
        tasks.add(new Task(task.getOrigem(), task.getDestino(), task.getPlano(), task.getDuracao()));

        // Obtendo valor da tarifa
        int origem = (int) task.getOrigem();
        int destino = (int)task.getDestino();
        int duracao =(int) task.getDuracao();
        int plano = (int) task.getPlano();

        System.out.println("Duração é : " +duracao);

        
    }
    

}
