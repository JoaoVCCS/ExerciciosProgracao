package Lista01;

import java.util.Scanner;

public class Questão07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Responda as perguntas com 'sim' ou 'não':");
        System.out.println("----------------------------------------");


        String[] perguntas = {
                "Telefonou para a vitima?",
                "Esteve no local do crime?",
                "Mora perto da vitima?",
                "Devia para a vitima?",
                "Já trabalhou com a vitima?"
        };

        int contadorSim = 0;

        for (String pergunta : perguntas) {
            String resposta = "";
            boolean respostaValida = false;

            while (!respostaValida) {
                System.out.print(pergunta + " (sim/não): ");
                resposta = scanner.nextLine().trim().toLowerCase();

                if (resposta.equals("sim") || resposta.equals("s")) {
                    contadorSim++;
                    respostaValida = true;
                } else if (resposta.equals("não") || resposta.equals("nao") ||
                        resposta.equals("n")) {
                    respostaValida = true;
                } else {
                    System.out.println("Resposta inválida! Digite 'sim' ou 'não'.");
                }
            }
        }

        System.out.println("----------------------------------------");
        System.out.println("Respostas positivas: " + contadorSim);


        String classificacao;

        if (contadorSim == 2) {
            classificacao = "suspeito";
        } else if (contadorSim >= 3 && contadorSim <= 4) {
            classificacao = "cúmplice";
        } else if (contadorSim == 5) {
            classificacao = "assassino";
        } else {
            classificacao = "inocente";
        }

        System.out.println("classificação: " + classificacao);

        scanner.close();
    }
}