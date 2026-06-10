package Exercicios;

import java.util.Scanner;

public class CalculadoraBonusEscala {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        double bonus = 0;


        System.out.println("Qual seu Nome: ");
        var nome = scanner.nextLine();

        System.out.println("Qual o salario Base: ");
        var salarioBase = scanner.nextDouble();

        System.out.println("Quantos Plantoes foram feitos no mes: ");
        var plantaoMes = scanner.nextInt();

        System.out.println("Quantas faltas injustificadas o funcionário teve: ");
        int faltasMes = scanner.nextInt();

        boolean Bonussalario = plantaoMes > 3 && faltasMes <= 0;

        if (plantaoMes >3 && faltasMes <= 0 ) {
            bonus = 300.00;
        }else bonus = 0;

        double salarioTotal = salarioBase + bonus;

        System.out.println("Salario Base: R$ " +salarioBase );
        System.out.println("Bonus: R$ " +bonus);
        System.out.println("Salario Total: R$ " +salarioTotal);

        scanner.close();


    }
}
