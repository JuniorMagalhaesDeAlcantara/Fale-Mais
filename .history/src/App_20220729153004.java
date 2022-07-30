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

        float tarifa = (float) 0.0;

        switch (origem) {
            case 11:
              switch (destino) {
                case 16: tarifa = (float) 1.9;
                System.out.println("Valor Total = " + duracao * tarifa);
                break;
                case 17: tarifa = (float) 1.8;
                System.out.println("Valor Total = " + duracao * tarifa);
                break;
                case 18: tarifa = (float) 0.9;
                System.out.println("Valor Total = " + duracao * tarifa);
                break;
              }
        }

        System.out.println(tarifa);

    }
}