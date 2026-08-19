package Lista02;

import java.util.Scanner;

public class Desafio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = Integer.parseInt(scanner.nextLine());

        double soma = 0;
        double menor = Double.MAX_VALUE;
        double maior = Double.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
            System.out.print("Digite o número " + i + " (entre 0 e 1000): ");
            double numero = Double.parseDouble(scanner.nextLine());

            while (numero < 0 || numero > 1000) {
                System.out.println("Número inválido! Deve estar entre 0 e 1000.");
                System.out.print("Digite o número " + i + " (entre 0 e 1000): ");
                numero = Double.parseDouble(scanner.nextLine());
            }

            soma += numero;

            if (numero < menor) {
                menor = numero;
            }
            if (numero > maior) {
                maior = numero;
            }
        }

        System.out.println("\nMenor valor: " + menor);
        System.out.println("Maior valor: " + maior);
        System.out.println("Soma: " + soma);

        scanner.close();
    }
}