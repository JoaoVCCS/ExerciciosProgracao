package AV2Exercicio01;

import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Digite o numeros de horas que voce trabalhou na semana: ");
        double horasTrablahadas = input.nextDouble();

        if(horasTrablahadas >= 40.0){
            System.out.println("Carga completa!");
        }else{
            System.out.println("Carga incompleta!");
        }
    }
}
