package Lista02;

public class Desafio01 {
    public static void main(String[] args) {
        int anterior = 0;
        int atual = 1;

        System.out.print(anterior + ", " + atual);

        while (atual <= 500) {
            int proximo = anterior + atual;
            if (proximo <= 500) {
                System.out.print(", " + proximo);
            }
            anterior = atual;
            atual = proximo;
        }
        System.out.println();
    }
}