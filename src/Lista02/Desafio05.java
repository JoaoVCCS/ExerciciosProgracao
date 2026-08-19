package Lista02;

import java.util.Scanner;

public class Desafio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = Integer.parseInt(scanner.nextLine());

        boolean ehPrimo = true;

        if (numero < 2) {
            ehPrimo = false;
        } else {
            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    ehPrimo = false;
                    break;
                }
            }
        }

        if (ehPrimo) {
            System.out.println(numero + " é primo.");
        } else {
            System.out.println(numero + " não é primo.");
        }

        scanner.close();
    }
}