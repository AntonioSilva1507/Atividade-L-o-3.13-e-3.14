public class atividade3 {
    public static void main(String[] args) {
        // Imprime o cabeçalho
        System.out.println("Múltiplos de 3 entre 1 e 100:");

        // Loop de 1 a 100 para verificar os números
        for (int i = 1; i <= 100; i++) {
            // Verifica se o número é múltiplo de 3
            if (i % 3 == 0) {
                // Se for múltiplo de 3, imprime o número
                System.out.println(i);
            }
        }
    }
}