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
              switch (destino) {
                case 16:
                final var tarifa = (float) 1.9;
                System.out.println("O novo preço é 1.9");
                break;
                case 17:
                final var tarifa = (float) 1.8;
                System.out.println("O novo preço é 1.8");
                break;
                case 18:
                final var tarifa = (float) 0.9;
                System.out.println("O novo preço é 0.9");
                break;
              }
        }

    }
}