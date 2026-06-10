package Exercicios;


import java.util.Scanner;

public class sistemaVigilante {

    public static void main(String[] args) throws InterruptedException {

        double valorFt = 300.0;
        double valorPlantao = 139.9;

        var scanner = new Scanner(System.in);

        System.out.println("========Sistema de Calculo Mensal========");
        Thread.sleep(200);

        System.out.println("Bem-Vindo! ");
        Thread.sleep(500);

        System.out.println("Digite seu nome: ");
        var nome = scanner.nextLine();
        Thread.sleep(200);

        System.out.println("Qual é o seu posto: ");
        var nomePosto = scanner.nextLine();
        Thread.sleep(200);

        System.out.println("Qual é sua cidade: ");
        var cidade = scanner.nextLine();
        Thread.sleep(200);

        System.out.println("Quantos plantões(turnos) voçê trabalhou esse mês: ");
        var qtdPlantao = scanner.nextInt();
        Thread.sleep(200);

        System.out.println("Quantas FTs (Folgas) você fez esse mês: ");
        var qtdFt = scanner.nextDouble();
        Thread.sleep(200);

        System.out.println("========Aguarde um Momento========");
        Thread.sleep(1000);
        System.out.println("Calculando...");
        Thread.sleep(1500);

        double salarioBase = qtdPlantao * valorPlantao;
        double totalFt = qtdFt * valorFt;
        double bonusAssiduidade = 0;

        if (qtdPlantao > 15) {
            bonusAssiduidade = 150.0;
        }else bonusAssiduidade = 0;

        double salarioFinal = salarioBase + bonusAssiduidade + totalFt;

        System.out.println("======== EXTRATO DE PAGAMENTO ========");
        System.out.println("Vigilante: " + nome);
        System.out.println("Posto: " + nomePosto);
        System.out.println("Local: " + cidade);
        System.out.println("------------------------------------");
        System.out.println("Salario Base (" +qtdPlantao + " plantões): R$ " + salarioBase);
        System.out.println("Bônus Assiduidade: R$ " + bonusAssiduidade);
        System.out.println("Valor FTs (" + qtdFt + "folgas a R$ " + valorFt + "): R$ " +totalFt);
        System.out.println("Salario Final a Receber: R$ " + salarioFinal);
        System.out.println("=======================================");








    }
}
