package AV2Exercicio01;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    try {
        System.out.println("Digite o primeiro numero: ");
        double numero1 = input.nextInt();
        System.out.println("Digite o segundo numero: ");
        double numero2 = input.nextInt();

        double resultado = numero1 / numero2;

        System.out.println("O resultado da soma:  " + resultado);

    }catch (InputMismatchException e){
        System.out.println("Entrada invalida! digite apenas numeros");
    }catch (ArithmeticException e){
        System.out.println("Não é possivel dividir por 0!");
    }finally {
        input.close();
    }

    }
}
