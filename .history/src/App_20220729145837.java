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
        var tarifa = (float)0.0;

        switch (origem) {
            
            case 11:
              switch (destino) {
                case 16:
                var tarifa = (float) 1.9;
                System.out.println(tarifa);
                break;
                case 17:
                var tarifa = (float) 1.8;
                System.out.println(tarifa);
                break;
                case 18:
                var tarifa = (float) 0.9;
                System.out.println(tarifa);
                break;
              }
        }

    }
}