public class Fibonacci {
    public static void main(String[] args) {
        int limite = 100;

        int primeiro = 0;
        int segundo = 1;

        System.out.println("Os primeiros números da série de Fibonacci até ultrapassar 100 são:");

        // Imprime os dois primeiros números da sequência
        System.out.println(primeiro);
        System.out.println(segundo);

        // Loop para calcular e imprimir os próximos números da sequência
        while (primeiro + segundo <= limite) {
            int proximo = primeiro + segundo;
            System.out.println(proximo);
            primeiro = segundo;
            segundo = proximo;
        }
    }
}
