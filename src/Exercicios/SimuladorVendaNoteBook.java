package Exercicios;

import java.util.Scanner;

public class SimuladorVendaNoteBook {
    public static void main(String[] args) throws InterruptedException {
         var scanner = new Scanner(System.in);

         double valorTaxa = 0;

        System.out.println("=====Bem-Vindo a TechSell=====");
        Thread.sleep(350);

        System.out.println("Qual o modelo do seu NoteBook: ");
        var modeloNot = scanner.nextLine();
        Thread.sleep(250);

        System.out.println("Qual o valor desejado para venda: ");
        var valorVenda = scanner.nextDouble();
        Thread.sleep(250);

        System.out.println("Qual será o custo fixo do frete/embalagem: ");
        var custoFrete = scanner.nextDouble();
        Thread.sleep(1000);

        if (valorVenda > 1500){
            valorTaxa = valorVenda * 0.15;
        }else{
            valorTaxa = valorVenda * 0.10;
        }


        double valorLiquido = valorVenda - valorTaxa - custoFrete;

        System.out.println("Nome modelo do notebook: " +modeloNot);
        System.out.println("Valor Bruto da venda: R$ " +valorVenda);
        System.out.println("Valor dos descontado pela taxa: R$ " +valorTaxa);
        System.out.println("Gasto com frete: R$ " +custoFrete);
        System.out.println("==============================");
        System.out.println("VALOR LIQUIDO A RECEBER: R$ " +valorLiquido);
        System.out.println("==============================");

        scanner.close();

    }
}
