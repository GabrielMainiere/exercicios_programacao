//Escreva um programa que inverta os caracteres de um string.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite uma string: ");
        String entrada = scanner.nextLine();
        scanner.close();

        // Convertendo a string para um array de caracteres
        char[] caracteres = entrada.toCharArray();

        // Invertendo os caracteres no array
        int comeco = 0;
        int fim = caracteres.length - 1;
        while (comeco < fim) {
            // Troca os caracteres nas posições comeco e fim
            char temp = caracteres[comeco];
            caracteres[comeco] = caracteres[fim];
            caracteres[fim] = temp;
            comeco++;
            fim--;
        }

        // Reconstruindo a string invertida a partir do array de caracteres
        String stringInvertida = new String(caracteres);

        System.out.println("String invertida: " + stringInvertida);
    }
}
