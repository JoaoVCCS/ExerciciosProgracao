package AV2Exercicio01;

import java.util.ArrayList;
import java.util.List;

public class Questao05 {

    public static List<Double> alunosAprovados(List<Double> notas) {
        List<Double> aprovados = new ArrayList<>();

        for (double nota : notas) {
            if (nota >= 7) {
                aprovados.add(nota);
            }
        }

        return aprovados;
    }

    public static void main(String[] args) {
        List<Double> notas = new ArrayList<>();
        notas.add(5.5);
        notas.add(7.0);
        notas.add(9.2);
        notas.add(6.8);
        notas.add(10.0);
        notas.add(3.0);

        List<Double> aprovados = alunosAprovados(notas);

        System.out.println("Notas de alunos aprovados: " + aprovados);
    }
}