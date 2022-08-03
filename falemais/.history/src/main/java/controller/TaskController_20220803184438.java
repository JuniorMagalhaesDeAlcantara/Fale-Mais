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
        
        // Obtendo valor da tarifa
        int origem = (int) task.getOrigem();
        int destino = (int)task.getDestino();
        int duracao =(int) task.getDuracao();
        int plano = (int) task.getPlano();

        float tarifa = (float) 0.0;

        switch (origem) {
            case 11:
              switch (destino) {
                case 16: tarifa = (float) 1.9;
                System.out.println("Sem o Fale Mais você irá pagar R$: " + duracao * tarifa);
                break;
                case 17: tarifa = (float) 1.7;
                System.out.println("Sem o Fale Mais você irá pagar R$: " + duracao * tarifa);
                break;
                case 18: tarifa = (float) 0.9;
                System.out.println("Sem o Fale Mais você irá pagar R$: " + duracao * tarifa);
                break;
              }
            case 16:
              switch (destino) {
                case 11: tarifa = (float) 2.9;
                System.out.println("Sem o Fale Mais você irá pagar R$: " + duracao * tarifa);
                break;
              }
              case 17:
              switch (destino) {
                case 11: tarifa = (float) 2.7;
                System.out.println("Sem o Fale Mais você irá pagar R$: " + duracao * tarifa);
                break;
              }
            case 18:
              switch (destino) {
                case 11: tarifa = (float) 1.9;
                System.out.println("Sem o Fale Mais você irá pagar R$: " + duracao * tarifa);
                break;
              }
            break;
        }

        // Calculo com  o Plano Fale Mais        
        if (duracao <= plano){
          System.out.println("Com o Plano Fale Mais " +plano+ " você não paga nada por essa ligação");
        }else{
          int   minExcendente = duracao - plano;
          Float percentual = (float) (10.0 / 100.0);
          Float tarifaCorrigida = tarifa + (percentual * tarifa);
          Float valor =  minExcendente * tarifaCorrigida;
          System.out.println("Com o Plano Fale Mais " +plano+ " você irá pagar R$: " +valor);
        }
    }
    

}
