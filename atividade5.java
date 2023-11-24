public class atividade5 {

    public static void main(String[] args) {
        // Inicializa a variável fatorial como 1 (alterada para long para acomodar valores maiores)
        long fatorial = 1;
        
        // Loop para variar o número de 1 a 40
        for (int n = 1; n <= 40; n++) {
            // Imprime o número atual e seu fatorial
            System.out.println("O fatorial de " + n + " é: " + fatorial);
            
            // Calcula o fatorial para o próximo número
            fatorial *= n + 1;
        }
    }
}