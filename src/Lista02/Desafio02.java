package Lista02;

import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];
        double soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = Integer.parseInt(scanner.nextLine());
        }

        int menor = numeros[0];
        int maior = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];

            if (numeros[i] < menor) {
                menor = numeros[i];
            }
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }

        System.out.println("\nMenor valor: " + menor);
        System.out.println("Maior valor: " + maior);
        System.out.println("Soma: " + soma);

        scanner.close();
    }
}