public class atividade8 {
    public static void main(String[] args) {
        int linhas = 5; // Defina o número de linhas desejadas para a tabela

        // Loop para gerar as linhas da tabela
        for (int i = 1; i <= linhas; i++) {
            int valor = i;

            // Loop para imprimir os valores de cada linha
            for (int j = 1; j <= i; j++) {
                System.out.print(valor + "\t"); // Imprime o valor seguido de um tab
                valor += i; // Incrementa o valor pela quantidade da linha atual
            }

            System.out.println(); // Pula para a próxima linha após cada linha ser impressa
        }
    }
}

