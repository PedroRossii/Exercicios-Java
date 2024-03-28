import java.util.Scanner;

public class MainEx1 {
    public static void main(String[] args) {

        int op;
        Scanner leitor = new Scanner(System.in);

        do {

            System.out.println("Digite: \n");
            System.out.println("[1] para soma");
            System.out.println("[2] para subtração");
            System.out.println("[3] para multiplicação");
            System.out.println("[4] para divisão");

            op = leitor.nextInt();

        }while((op < 1) || (op > 4));

        switch (op){

            // Scanner valores = new Scanner(System.in);

            case 1:
                double num1, num2, resultado;
                System.out.println("Digite o primeiro número da soma: ");
                num1 = leitor.nextDouble();

                System.out.println("Digite o segundo número da soma: ");
                num2 = leitor.nextDouble();

                resultado = CalculadoraEx1.soma(num1, num2);

                System.out.println("Resultado da soma: " + resultado);

                break;

            case 2:

                double num3, num4, resultado2;
                System.out.println("Digite o primeiro número da subtração: ");
                num3 = leitor.nextDouble();

                System.out.println("Digite o segundo número da subtração: ");
                num4 = leitor.nextDouble();

                resultado2 = CalculadoraEx1.subtracao(num3, num4);

                System.out.println("Resultado da subtração: " + resultado2);

                break;

            case 3:

                double num5, num6, resultado3;
                System.out.println("Digite o primeiro número da multiplicação: ");
                num5 = leitor.nextDouble();

                System.out.println("Digite o segundo número da multiplicação: ");
                num6 = leitor.nextDouble();

                resultado3 = CalculadoraEx1.multiplicacao(num5, num6);

                System.out.println("Resultado da multiplicação: " + resultado3);

                break;

            case 4:

                double num7, num8, resultado4;
                System.out.println("Digite o primeiro número da divisão: ");
                num7 = leitor.nextDouble();


                do{
                    System.out.println("Digite o segundo número da divisão: ");
                    num8 = leitor.nextDouble();
                }while(num8 == 0);

                resultado4 = CalculadoraEx1.divisao(num7, num8);

                System.out.println("Resultado da divisão: " + resultado4);

                break;
        }


    }
}