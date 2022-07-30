import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Entradas
        Scanner entradaOrigem = new Scanner(System.in);
        System.out.println("Informe o DDD de Origem");
        Scanner entradaDestino = new Scanner(System.in);
        System.out.println("Informe o DDD de Destino");
        

        int origem = entradaOrigem.nextInt();
        int destino = entradaDestino.nextInt();

        switch (origem) {
            case 11:
                if(destino == 16){
                    System.out.println("Tarifa 1.9");
                }
                break;
            case 2:
            if(destino == 17){
                System.out.println("Tarifa 1.7");
            }
            break;
            case 3:
            if(destino == 18){
                System.out.println("Tarifa 0.9");
            }
            break;
           
          }
        }

    
}  