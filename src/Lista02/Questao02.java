package Lista02;

import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de N: ");
        int n = Integer.parseInt(scanner.nextLine());

        int contador = 0;
        while (contador <= n) {
            System.out.println(contador);
            contador++;
        }

        scanner.close();
    }
}