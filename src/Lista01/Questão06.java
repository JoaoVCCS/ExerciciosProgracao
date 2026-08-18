package Lista01;

import java.util.Scanner;

public class Questão06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("em que turno voce estuda ? ");
        char letra = scanner.next().charAt(0);

        if (letra == 'M' || letra == 'm') {
            System.out.println("bom dia!");
        }else if (letra == 'V' || letra == 'v') {
            System.out.println("boa tarde");
        }else if (letra == 'N' || letra == 'n') {
            System.out.println("boa noite");
        }else if (letra != 'M' || letra != 'V' || letra != 'N') {
            System.out.println("valor invalido!");
        }

    }
}
