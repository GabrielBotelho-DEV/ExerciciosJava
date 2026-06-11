package Exercicios;


import java.util.Scanner;

public class EstruturasSequencial04 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Numero de Funcionario: ");
        var nmrFuncionario = scanner.nextInt();

        System.out.println("Numero de Horas trabalhadas: ");
        var hrsTrabalhadas = scanner.nextDouble();

        System.out.println("Valor por Hora Trabalhada: ");
        var valorHrTrabalhada = scanner.nextDouble();

        double valorRecebimento = hrsTrabalhadas * valorHrTrabalhada;

        System.out.println("NUMBER = " +nmrFuncionario);
        System.out.printf("SALARY = U$: " +valorRecebimento);

        scanner.close();






    }

}
