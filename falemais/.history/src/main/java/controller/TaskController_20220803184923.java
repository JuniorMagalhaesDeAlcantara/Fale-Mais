package controller;

import java.util.ArrayList;
import java.util.List;

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
        
        // Obtendo valor da tarifa
        Number origem = (int) task.getOrigem();
        Number destino = (int)task.getDestino();
        Number duracao =(int) task.getDuracao();
        Number plano = task.getPlano();

        System.out.println("Com o Plano Fale Mais " +plano);

    }

}
