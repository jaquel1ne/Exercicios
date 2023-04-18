
// As maçãs custam 0,30 cada se forem compradas menos que uma dúzia e 0,25
//se forem comprados pelo menos uma dúzia.
//Escreva um programa que leia a quantidade de maçãs compradas e depois
//imprima o valor total da compra no console.

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a quantidade de maçãs compradas: ");
        int quantidade = entrada.nextInt();
        float preco = quantidade < 12 ? 0.30f : 0.25f;
        float total = quantidade * preco;

        System.out.printf("O valor total da compra foi R$ %.2f", total);

    }
}
