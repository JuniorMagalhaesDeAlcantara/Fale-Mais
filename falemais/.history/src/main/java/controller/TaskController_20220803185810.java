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

        Number origem = task.getOrigem();
        Number destino = task.getDestino();
        Number duracao = task.getDuracao();
        Number plano = task.getPlano();
        System.out.println("Duração é : " + duracao);
        System.out.println("Origem é : " + origem);
        System.out.println("Destino é : " + destino);
        System.out.println("Destino é : " + destino);

    }
    
}
