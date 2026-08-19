package Lista02;

import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Operação - Adição!");

        String resposta = "s";

        while (resposta.equalsIgnoreCase("s")) {
            System.out.println();
            System.out.print("Digite um número: ");
            int numero1 = Integer.parseInt(scanner.nextLine());

            System.out.print("Digite outro número: ");
            int numero2 = Integer.parseInt(scanner.nextLine());

            int soma = numero1 + numero2;
            System.out.println();
            System.out.println(numero1 + " + " + numero2 + " = " + soma);

            System.out.println();
            System.out.println("Deseja realizar mais uma soma? [S ou N]");
            System.out.print("Resposta: ");
            resposta = scanner.nextLine();
        }

        scanner.close();
    }
}