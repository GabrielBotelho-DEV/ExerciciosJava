package academydevdojomaratonajava;

public class Aula04OperadoresAritimeticos {
    public static void main(String[] args) {
        // + * / -
        int n1 = 10;
        int n2 = 20;
        double resultado = n2 + n2;
        System.out.println(resultado);

        //%
        int resto = 21 % 2;
        System.out.println(resto);

        // < > <= >= !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualQueVinte = 10 == 20;
        boolean isDezigualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 20;
        boolean b1 = true;
        boolean b2 = true;
        boolean b3 = false;
        boolean b4 = b1 && b2 && (!b3);

        System.out.println("b4 = " + b4);
        System.out.println("IsDezMaiorQueVinte "+isDezMaiorQueVinte);
        System.out.println("IsDezMenorQueVinte "+isDezMenorQueVinte);
        System.out.println("IsDezIgualQueVinte "+isDezIgualQueVinte);
        System.out.println("IsDezIgualDez "+isDezigualDez);
        System.out.println("IsDezDiferenteDez "+isDezDiferenteDez);

    }
}
