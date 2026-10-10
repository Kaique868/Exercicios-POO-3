import java.util.Arrays;
import java.util.Scanner;

public class MegaSena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[6];
        int quantidadeInserida = 0;

        System.out.println("=== Simulador Jogo da Mega-Sena ===");
        System.out.println("Digite 6 números inteiros entre 1 e 60 (sem repetir):");

        while (quantidadeInserida < 6) {
            System.out.print("Digite o " + (quantidadeInserida + 1) + "º número: ");
            int numeroDigitado = scanner.nextInt();


            if (numeroDigitado < 1 || numeroDigitado > 60) {
                System.out.println("Erro: O número deve estar entre 1 e 60. Tente novamente.");
                continue;
            }


            boolean duplicado = false;
            for (int i = 0; i < quantidadeInserida; i++) {
                if (numeros[i] == numeroDigitado) {
                    duplicado = true;
                    break;
                }
            }

            if (duplicado) {
                System.out.println("Erro: Este número já foi escolhido. Escolha um número diferente.");
            } else {

                numeros[quantidadeInserida] = numeroDigitado;
                quantidadeInserida++;
            }
        }


        Arrays.sort(numeros);

        
        System.out.println("\nNúmeros da aposta ordenados:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + (i < numeros.length - 1 ? " - " : ""));
        }
        System.out.println();

        scanner.close();
    }
}