package Lista01;

import java.util.Scanner;

public class Questão04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite sua nota: ");
        float nota1 = scanner.nextFloat();
        System.out.println("digite sua 2 nota: ");
        float nota2 = scanner.nextFloat();

        float media = (nota1 + nota2) / 2;
        System.out.println("----------------------------");
        System.out.println("sua media é: " + media);

        if (media == 10) {
            System.out.println("APROVADO COM DISTINÇÃO!");
        } else if (media >= 7) {
            System.out.println("APROVADO!");
        } else {
            System.out.println("REPROVADO!");
        }
        System.out.println("----------------------------");
    }
}
