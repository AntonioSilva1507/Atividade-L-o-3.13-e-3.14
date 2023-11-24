public class atividade6 { 
        public static void main(String[] args) {
            int primeiro = 0;
            int segundo = 1;
    
            // Imprime os dois primeiros números da série de Fibonacci
            System.out.println(primeiro);
            System.out.println(segundo);
    
            int proximo = primeiro + segundo;
    
            // Loop para calcular e imprimir os números da série de Fibonacci até passar de 100
            while (proximo <= 100) {
                System.out.println(proximo);
                primeiro = segundo;
                segundo = proximo;
                proximo = primeiro + segundo;
            }
        }
    }
    

