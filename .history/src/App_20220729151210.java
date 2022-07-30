import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Entradas
        Scanner entradaOrigem = new Scanner(System.in);
        System.out.println("Informe o DDD de Origem");
        Scanner entradaDestino = new Scanner(System.in);
        System.out.println("Informe o DDD de Destino");
        Scanner entradaDuracao = new Scanner(System.in);
        System.out.println("Informe a duracao");
        

        int origem = entradaOrigem.nextInt();
        int destino = entradaDestino.nextInt();
        int duracao = entradaDuracao.nextInt();
        

        switch (origem) {
            case 11:
              switch (destino) {
                case 16:
                System.out.println("Valor Total = " + duracao * 1.9);
                break;
                case 17:
                System.out.println("Valor Total = " + duracao * 1.8);
                break;
                case 18:
                System.out.println("Valor Total = " + duracao * 0.9);
                break;
              }
        }

    }
}