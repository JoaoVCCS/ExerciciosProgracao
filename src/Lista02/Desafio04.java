package Lista02;

import java.util.Scanner;

public class Desafio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();
        while (nome.length() <= 3) {
            System.out.println("Nome inválido! Deve ter mais de 3 caracteres.");
            System.out.print("Digite o nome: ");
            nome = scanner.nextLine();
        }

        System.out.print("Digite a idade: ");
        int idade = Integer.parseInt(scanner.nextLine());
        while (idade < 0 || idade > 150) {
            System.out.println("Idade inválida! Deve estar entre 0 e 150.");
            System.out.print("Digite a idade: ");
            idade = Integer.parseInt(scanner.nextLine());
        }

        System.out.print("Digite o salário: ");
        double salario = Double.parseDouble(scanner.nextLine());
        while (salario <= 0) {
            System.out.println("Salário inválido! Deve ser maior que zero.");
            System.out.print("Digite o salário: ");
            salario = Double.parseDouble(scanner.nextLine());
        }

        System.out.print("Digite o sexo (f/m): ");
        String sexo = scanner.nextLine().toLowerCase();
        while (!sexo.equals("f") && !sexo.equals("m")) {
            System.out.println("Sexo inválido! Digite 'f' ou 'm'.");
            System.out.print("Digite o sexo (f/m): ");
            sexo = scanner.nextLine().toLowerCase();
        }

        System.out.print("Digite o estado civil (s/c/v/d): ");
        String estadoCivil = scanner.nextLine().toLowerCase();
        while (!estadoCivil.equals("s") && !estadoCivil.equals("c")
                && !estadoCivil.equals("v") && !estadoCivil.equals("d")) {
            System.out.println("Estado civil inválido! Digite 's', 'c', 'v' ou 'd'.");
            System.out.print("Digite o estado civil (s/c/v/d): ");
            estadoCivil = scanner.nextLine().toLowerCase();
        }

        System.out.println("\n--- Dados cadastrados com sucesso ---");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado Civil: " + estadoCivil);

        scanner.close();
    }
}