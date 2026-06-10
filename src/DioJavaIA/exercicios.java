package DioJavaIA;



/*    Atividade #1

import java.util.Scanner;
 public class teste {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Qual é o seu nome?");
        var name = scanner.next();
        System.out.println("Quantos anos você tem?");
        var age = scanner.nextInt();
        System.out.printf("Ola %s voce tem %s anos \n", name, age);
    }
}
 */

 //=================================================================================

/*    Atividade #2
import java.util.Scanner;
 public class teste {
     public static void main(String[] args) {

         var scanner = new Scanner(System.in);
         System.out.println("Qual o tamanho do Lado do quadrado?");
         var side = scanner.nextDouble();

         double area = side * side;
         System.out.println("o Tamanho do Quadrado é " +area+ " de area!");
    }
}
 */

//===================================================================================

/*     Atividade #3
import java.util.Scanner;
 public class teste {
     public static void main(String[] args) {

         var scanner = new Scanner(System.in);
         System.out.println("Qual o tamanho da base?");
         var base = scanner.nextInt();
         System.out.println("Qual o tamanho da altura?");
         var high = scanner.nextInt();

         int area = base * high;

         System.out.println("A medida da area do seu retangulo é de " + area + ".");

         scanner.close();

     }

 }

 */

//===================================================================================

/*       Atividade #4
import java.util.Scanner;
 public class teste {
     public static void main(String[] args) {

         var scanner = new Scanner(System.in);
         System.out.println("Voce é o primeiro, qual seu nome?");
         var name1 = scanner.next();
         System.out.println("Voce é o primeiro, qual sua idade?");
         var age1 = scanner.nextInt();

         System.out.println("Voce é o segundo, qual seu nome?");
         var name2 = scanner.next();
         System.out.println("Voce é o ssegundo, qual sua idade?");
         var age2 = scanner.nextInt();

         int ageDifference = Math.abs(age1 - age2);

         System.out.println("A diferença de idade das duas pessoa é de " +ageDifference+ ".");

         scanner.close();

 */

/*  Atividade #5

import java.util.Scanner;

 public class exercicios {
     public static void main(String[] args) {

         var scanner = new Scanner(System.in);
         System.out.println("Digite qual o nome do seu Produto:");
         var productName = scanner.nextLine();
         System.out.println("Digite o valor do seu Produto em reais:");
         var productReal = scanner.nextInt();

         double dolarHoje = 5.17;

         double valorConvert = productReal / dolarHoje;

         System.out.println("O valor do seu " +productName+ " esta cotado hoje em " +valorConvert+ " Dolares." );

         scanner.close();

     }

}

 */

/* Atividade #6

import java.util.Scanner;

 public class exercicios {
     public static void main(String[] args) throws InterruptedException {

         double limiteHoraNormal = 160.0;
         double salarioNormal = 0;
         double salarioHoraExtra = 0;
         double salarioTotal = 0;

         var scanner = new Scanner(System.in);
         System.out.println("Qual é o Seu Nome?");
         var nome = scanner.nextLine();
         Thread.sleep(1000);
         System.out.println("Quantas horas você trabalhou esse mês?");
         var horaMes = scanner.nextDouble();
         Thread.sleep(1000);
         System.out.println("Quanto voçê recebe por hora?");
         var horaValor = scanner.nextDouble();
         Thread.sleep(1000);


         if (horaMes > limiteHoraNormal) {
             salarioNormal = limiteHoraNormal * horaValor;

             double qtdeHorasExtras = horaMes - limiteHoraNormal;
             salarioHoraExtra = qtdeHorasExtras * (horaValor * 2);
             salarioTotal = salarioNormal + salarioHoraExtra;

         }else {
             salarioTotal = horaMes * horaValor;
             salarioNormal = salarioTotal;

         }

         double discontoInss = salarioTotal * 0.11;
         double salarioLiquido = salarioTotal - discontoInss;
         double totalDesconto = salarioTotal - salarioLiquido;


         System.out.println("--- EXTRATO DE SALÁRIO ---");
         System.out.println("Funcionário: " + nome);
         System.out.println("Salário Base (Horas Normais): R$ " + salarioNormal);
         System.out.println("Valor recebido em Horas Extras: R$ " + salarioHoraExtra);
         System.out.println("Salariop Bruto: R$ " + salarioTotal);
         System.out.println("Salario Liquido a Receber: R$ " +salarioLiquido);
         System.out.printf("Valor de Descontos: R$ %.2f%n" , totalDesconto);


     }
}
*/



