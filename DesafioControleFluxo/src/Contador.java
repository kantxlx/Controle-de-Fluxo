import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        // Inicializa o scanner para receber dados do usuário
        Scanner terminal = new Scanner(System.in);

        // Solicita o primeiro parâmetro ao usuário
        System.out.println("Digite o primeiro parâmetro");
        // Lê o primeiro parâmetro do usuário
        int parametrole = terminal.nextInt();

        // Solicita o segundo parâmetro ao usuário
        System.out.println("Digite o segundo parâmetro");
        // Lê o segundo parâmetro do usuário
        int parametroDois = terminal.nextInt();

        // Bloco try-catch para tratar a exceção
        try {
            // Chama o método contar para realizar a contagem e impressão
            contar(parametrole, parametroDois);
        } catch (ParametrosInvalidosException e) {
            // Imprime a mensagem de erro caso a exceção seja lançada
            System.out.println(e.getMessage());
        }
    }

    // Método contar para realizar a contagem e impressão
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Valida se o primeiro parâmetro é maior que o segundo
        if (parametroUm > parametroDois) {
            // Lança a exceção se o primeiro parâmetro for maior que o segundo
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
        // Calcula a quantidade de interações
        int contagem = parametroDois - parametroUm;

        // Realiza o loop para imprimir os números
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}

// Classe de exceção para representar erros de parâmetros inválidos
class ParametrosInvalidosException extends Exception {
    // Construtor da classe de exceção
    public ParametrosInvalidosException(String message) {
        super(message);
    }
}