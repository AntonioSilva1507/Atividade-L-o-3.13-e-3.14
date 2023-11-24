public class atividade7 {
        public static void main(String[] args) {
            int x = 13; // Pode-se modificar o valor de x aqui
    
            // Enquanto x não for igual a 1, continua o loop
            while (x != 1) {
                // Imprime o valor atual de x
                System.out.print(x + " -> ");
    
                // Verifica se x é par
                if (x % 2 == 0) {
                    x = x / 2; // Se x for par, divide por 2
                } else {
                    x = 3 * x + 1; // Se x for ímpar, aplica a fórmula x = 3x + 1
                }
            }
    
            // Imprime o último valor de x (que é 1)
            System.out.print(x);
        }
    }
    

