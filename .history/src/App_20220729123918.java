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
        
       int tarifa;

        switch (tarifa) {
            case 1:
                if(origem == 11 & destino == 16){
                    System.out.println("Tarifa 1.9");
                    break;
                }
             
            case 2:
              System.out.println("O número escolhido foi: 2.");
              break;
            case 3:
              System.out.println("O número escolhido foi: 3.");
              break;
            case 4:
              System.out.println("O número escolhido foi: 4.");
              break;
            case 5:
              System.out.println("O número escolhido foi: 5.");
              break;
            case 6:
              System.out.println("O número escolhido foi: 6.");
              break;
            case 7:
              System.out.println("O número escolhido foi: 7.");
              break;
            case 8:
              System.out.println("O número escolhido foi: 8.");
              break;
            case 9:
              System.out.println("O número escolhido foi: 9.");
              break;
            case 10:
              System.out.println("O número escolhido foi: 10.");
              break;
            default:
              System.out.println("O número escolhido é inválido! Digite um número entre 1 a 10.");
          }
        }

    }
}  