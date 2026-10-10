import java.util.Arrays;
import java.util.Scanner;


  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a quantidade de números da série de Fibonacci (n): ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Por favor, informe um número maior que zero.");
        } else {

            long[] fibonacci = new long[n];


            if (n >= 1) {
                fibonacci[0] = 0;
            }
            if (n >= 2) {
                fibonacci[1] = 1;
            }


            for (int i = 2; i < n; i++) {
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            }


            System.out.println(Arrays.toString(fibonacci));
        }

        scanner.close();
  }

