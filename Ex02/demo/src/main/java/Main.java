//2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inicialização das variáveis
        int a = 0;
        int b = 1;

        System.out.print("Digite um numero: ");
        int numero = scanner.nextInt();
        scanner.close();

        boolean pertence = false;

        System.out.println("Sequencia de Fibonacci ate o numero " + numero + ":");

        while (a <= numero) {
            System.out.print(a + "| ");
            if (a == numero) {
                pertence = true;
                break;
            }
            int proximo = a + b;
            a = b;
            b = proximo;
        }

        System.out.println();

        if (pertence) {
            System.out.println(numero + " pertence a sequencia de Fibonacci.");
        } else {
            System.out.println(numero + " nao pertence a sequencia de Fibonacci.");
        }
    }
}
