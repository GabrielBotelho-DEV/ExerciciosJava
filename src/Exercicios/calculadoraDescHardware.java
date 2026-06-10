package Exercicios;

import java.math.BigDecimal;
import java.util.Scanner;

public class calculadoraDescHardware {
    public static void main(String[] args) throws InterruptedException {

        double valorDesconto = 0;
        double valorMaximoParaDesconto = 3000;

        var scanner = new Scanner(System.in);

        System.out.println("=== SEJA BEM-VINDO ===");
        Thread.sleep(750);

        System.out.println("Qual seu Nome: ");
        var nomeCliente = scanner.nextLine();
        Thread.sleep(500);

        System.out.println("Qual o valor do Processador que voce deseja: ");
        var valorProcessador = scanner.nextDouble();
        Thread.sleep(500);

        System.out.println("Qual o valor da Placa de video que voce deseja: ");
        var valorPlacaDeVideo = scanner.nextDouble();
        Thread.sleep(500);

        double calculoDasPecas = valorProcessador + valorPlacaDeVideo;
        double result = calculoDasPecas;

        if (calculoDasPecas >= valorMaximoParaDesconto ) {
            valorDesconto = 150.0;
        }else valorDesconto = 0;

        double totalComDesconto = result - valorDesconto;
        double result1 = totalComDesconto;


        System.out.println("Calculando recibo aguarde... ");
        Thread.sleep(1500);
        System.out.println("===== Recibo =====");
        System.out.println("Nome do Cliente: " +nomeCliente);
        System.out.println("Valor total das peças: " +result);
        System.out.println("Valor de Desconto: " +valorDesconto);
        System.out.println("Valor total a pagar com desconto: " +result1);

        scanner.close();

        
    }
    }



