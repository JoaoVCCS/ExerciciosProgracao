package AV2Exercicio01;

public class Questao04 {
    public static double calcularSaldo(double saldoAtual, double valor, String tipoOperacao) {
        if (tipoOperacao.equalsIgnoreCase("deposito")) {
            return saldoAtual + valor;
        } else if (tipoOperacao.equalsIgnoreCase("saque")) {
            if (valor > saldoAtual) {
                System.out.println("Saldo insuficiente para realizar o saque.");
                return saldoAtual;
            }
            return saldoAtual - valor;
        } else {
            System.out.println("Tipo de operação invalido. Use 'deposito' ou 'saque'.");
            return saldoAtual;
        }
    }

    public static void main(String[] args) {
        double saldo = 1000.0;

        saldo = calcularSaldo(saldo, 500.0, "deposito");
        System.out.println("Saldo apos deposito: " + saldo);

        saldo = calcularSaldo(saldo, 300.0, "saque");
        System.out.println("Saldo apos saque: " + saldo);

        saldo = calcularSaldo(saldo, 10000.0, "saque");
        System.out.println("Saldo apos tentativa de saque invalido: " + saldo);
    }
}
