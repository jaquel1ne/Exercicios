import java.util.Arrays;
import java.util.Scanner;

// Exercício 01 - Escreva um programa para ler 3 valores e printe o maior e o menor entre eles.

public class Exercicio01 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int[] numeros =  new int[3];

        System.out.println("Digite o primeiro número: ");
        numeros[0] = entrada.nextInt();
        System.out.println("Digite o segundo número: ");
        numeros[1] = entrada.nextInt();
        System.out.println("Digite o terceiro número: ");
        numeros[2] = entrada.nextInt();

        Arrays.sort(numeros);

        System.out.println("O maior número é: " + numeros[2]);
        System.out.println("O menor número é: " + numeros[0]);

    }
}

