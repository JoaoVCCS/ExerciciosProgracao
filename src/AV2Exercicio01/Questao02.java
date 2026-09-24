package AV2Exercicio01;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Double> lista = new ArrayList<>();

        int i = 0;
        while (i < 3) {
            System.out.println("Digite sua nota(0 a 10): ");
            lista.add(input.nextDouble());
            i++;
        }

        double soma = 0;
        for(int j = 0; j < lista.size(); j++){
            soma += lista.get(j);
        }

        double resultado = soma / lista.size();

        System.out.printf("O resultado da soma: %.2f\n", resultado);
        }
    }

