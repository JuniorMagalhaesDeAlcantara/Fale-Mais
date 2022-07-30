import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Entradas
        Scanner entradaOrigem = new Scanner(System.in);
        System.out.println("Informe o DDD de Origem");
        Scanner entradaDestino = new Scanner(System.in);
        System.out.println("Informe o DDD de Destino");
        Scanner entradaPlano = new Scanner(System.in);
        System.out.println("Informe o Plano Escolhido");
        Scanner entradaMinutos = new Scanner(System.in);
        System.out.println("Informe o tempo da ligação em minutos");

        int origem = entradaOrigem.nextInt();
        int destino = entradaDestino.nextInt();
        int plano = entradaPlano.nextInt();
        int minutos = entradaMinutos.nextInt();

        switch (origem) {
            case 1:
                if(origem == 11 & destino == 16){
                    System.out.println("Tarifa 1.9");
                }
                break;
            case 2:
            if(origem == 11 & destino == 17){
                System.out.println("Tarifa 1.7");
            }
            break;
            case 3:
            if(origem == 11 & destino == 18){
                System.out.println("Tarifa 0.9");
            }
            break;
           
          }
        }

    
}  