package Lista01;

import java.util.Scanner;

public class Questão03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite uma letra");
        char letra = sc.next().charAt(0);

        System.out.println("----------------------------");

        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            System.out.println("esta letra é uma vogal");
        } else {
            System.out.println("essa letra é uma consoante");
        }

        System.out.println("----------------------------");
    }

}
