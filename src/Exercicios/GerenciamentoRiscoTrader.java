package Exercicios;

import java.util.Scanner;

public class GerenciamentoRiscoTrader {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Qual valor da banca Inicial: ");
        var bancaInicial = scanner.nextDouble();

        System.out.println("Qual valor total em Ganhos: ");
        var totalEmGanhos = scanner.nextDouble();

        System.out.println("Qual valor total em Perdas: ");
        var totalEmPerdas = scanner.nextDouble();

        double saldoFinal = bancaInicial + totalEmGanhos - totalEmPerdas;

        if (saldoFinal > bancaInicial) {
            double lucroPuro = saldoFinal - bancaInicial;
            System.out.println("Lucro do Dia: R$ " + lucroPuro);

        } else if (bancaInicial == saldoFinal) {
            System.out.println("Zero a Zero");

        } else {
            double prejuizo = bancaInicial - saldoFinal;
            System.out.println("Dia de stop loss. Prejuízo de: R$ " + prejuizo);

        }
        scanner.close();


    }
}
