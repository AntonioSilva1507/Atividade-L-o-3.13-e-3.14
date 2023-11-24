public class atividade4 {

    public static void main(String[] args) {
        // Inicializa a variável fatorial como 1
        int fatorial = 1;
        
        // Loop para variar o número de 1 a 10
        for (int n = 1; n <= 10; n++) {
            // Imprime o número atual
            System.out.println("O fatorial de " + n + " é: " + fatorial);
            
            // Calcula o fatorial para o próximo número
            fatorial *= n + 1;
        }
    }
}


    

