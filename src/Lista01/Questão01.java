package Lista01;

import java.util.Scanner;

public class Questão01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");
        int num = scanner.nextInt();

        int restoDivi = num % 2;

        System.out.println("----------------------------");

        if (restoDivi == 0) {
            System.out.println("este numero é par!");
        } else {
            System.out.println("este numero é impar!");
        }
        System.out.println("----------------------------");
    }
}
