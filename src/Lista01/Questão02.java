package Lista01;

import java.util.Scanner;

public class Questão02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite um numero: ");
        int num1 = scanner.nextInt();
        System.out.println("digite outro numero: ");
        int num2 = scanner.nextInt();

        System.out.println("----------------------------");

        if (num1 > num2) {
            System.out.println("seu numero maior é " + num1);
        }else {
            System.out.println("seu numero maior é " + num2);
        }
        System.out.println("----------------------------");
    }
}
