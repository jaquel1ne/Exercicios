//Escreva um programa que leia o salário bruto de um funcionário e mostre o
//valor líquido.
//Se o salário for menor que
// R$ 1.000 o desconto é 6%
//Até R$ 2.500 é 8%
//Até R$ 4.800 é 10%
//Maior que 4.800 é 15%

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o salário bruto em R$: ");
        float salarioBruto = entrada.nextFloat();
        float desconto = 0;

        if (salarioBruto < 1000) {
            desconto = 6;
        } else if (salarioBruto <= 2500) {
            desconto = 8;
        } else if (salarioBruto <= 4800) {
            desconto = 10;
        } else {
            desconto = 15;
        }

        float salarioLiquido = salarioBruto - (salarioBruto * desconto / 100);

        System.out.printf("O valor do salário líquido é R$ %.2f ", salarioLiquido);
    }
}
