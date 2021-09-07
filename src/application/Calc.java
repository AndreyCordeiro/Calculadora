package application;

import java.util.Scanner;

public class Calc {

    public void menu() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("\n=-=-=-=-=-= CALCULADORA =-=-=-=-=-=");
            System.out.print("1 - Soma" +
                    "\n2 - Subtração" +
                    "\n3 - Divisão" +
                    "\n4 - Multiplicação" +
                    "\n5 - Verificar se um número é Par ou Ímpar" +
                    "\n6 - Raiz Quadrada" +
                    "\n7 - Número ao Quadrado" +
                    "\n8 - Sair" +
                    "\nEscolha uma opção: ");

            int escolha = sc.nextInt();

            if (escolha == 1) {
                System.out.print("Digite um número: ");
                double a = sc.nextDouble();
                System.out.print("Digite outro número: ");
                double b = sc.nextDouble();
                soma(a, b);
            } else if (escolha == 2) {
                System.out.print("Digite um número: ");
                double a = sc.nextDouble();
                System.out.print("Digite outro número: ");
                double b = sc.nextDouble();
                subtracao(a, b);
            } else if (escolha == 3) {
                System.out.print("Digite um número: ");
                double a = sc.nextDouble();
                System.out.print("Digite outro número: ");
                double b = sc.nextDouble();
                divisao(a, b);
            } else if (escolha == 4) {
                System.out.print("Digite um número: ");
                double a = sc.nextDouble();
                System.out.print("Digite outro número: ");
                double b = sc.nextDouble();
                multiplicacao(a, b);
            } else if (escolha == 5) {
                System.out.print("Informe um número para verificar se é par ou ímpar: ");
                double x = sc.nextDouble();
                if (x % 2 == 0) {
                    System.out.println("O número é par.");
                } else {
                    System.out.println("O número é ímpar.");
                }
            } else if (escolha == 6) {
                System.out.print("Digite um número: ");
                double a = sc.nextDouble();
                raizQuadrada(a);
            } else if (escolha == 7) {
                System.out.print("Digite um número: ");
                double a = sc.nextDouble();
                aoQuadrado(a);
            } else if (escolha == 8) {
                System.out.println("Programa finalizado!");
                break;
            } else {
                System.out.println("Opção inválida, tente novamente!");
            }
        }
    }

    private Double soma(Double a, Double b) {
        Double resultado = a + b;
        System.out.println("O resultado da soma é: " + resultado);
        return resultado;
    }

    private Double subtracao(Double a, Double b) {
        Double resultado = a - b;
        System.out.println("O resultado da subtração é: " + resultado);
        return resultado;
    }

    private Double divisao(Double a, Double b) {
        Double resultado = a / b;
        System.out.println("O resultado da divisão é: " + resultado);
        return resultado;
    }

    private Double multiplicacao(Double a, Double b) {
        Double resultado = a * b;
        System.out.println("O resultado da multiplicação é: " + resultado);
        return resultado;
    }

    private Double raizQuadrada(Double a) {
        Double rq = Math.sqrt(a);
        System.out.printf("A raiz quadrada de " + a + " é: %.2f", rq);
        return rq;
    }

    private Double aoQuadrado(Double a) {
        Double resultado = a * a;
        System.out.println("O número informado elevado ao quadrado é: " + resultado);
        return resultado;
    }
}