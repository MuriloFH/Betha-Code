import java.util.Scanner;

public class exercicio_1 {


    public static void main(String[] args) {

        //Exercicio_1
        Scanner s = new Scanner(System.in);

        System.out.println("Digite um numero de 1 a 7: ");
        int numero = s.nextInt();

        switch (numero) {
            case '1':
                System.out.println("Domingo");
                break;
            case '2':
                System.out.println("Segunda-feira");
                break;
            case '3':
                System.out.println("Terça-feira");
                break;
            case '4':
                System.out.println("Quarta-feira");
                break;
            case '5':
                System.out.println("Quinta-feira");
                break;
            case '6':
                System.out.println("Sexta-feira");
                break;
            default:
                System.out.println("Numero digitado não é valido?");
                break;
        }

        //exercicio_2
        int x = 10;

        while (x < 30) {
            System.out.println("N°: " + x);
            x++;
        }

        //exercicio_3
        int x = 10;

        do {
            System.out.println("N°: " + x);
            x++;
        } while (x < 30);


        //exercicio_4
        Scanner readln = new Scanner(System.in);

        System.out.print("Digite um numero inteiro de quatro digitos: ");
        int numeroUsuario = readln.nextInt();

        int numeroInvertido = 0;

        while (numeroUsuario > 0) {
            numeroInvertido = numeroInvertido * 10;
            numeroInvertido = numeroInvertido + (numeroUsuario % 10);
            numeroUsuario = numeroUsuario / 10;
        }
        System.out.println("O numero invertido de digitado é " + numeroInvertido);

        //exercicio_5
        int altura, baseMenor, baseMaior, area = 0;

        Scanner readln = new Scanner(System.in);

        System.out.print("Digite o valor da altura: ");
        altura = readln.nextInt();

        System.out.print("Digite o valor da base menor: ");
        baseMenor = readln.nextInt();

        System.out.print("Digite o valor da base maior: ");
        baseMaior = readln.nextInt();

        area = (altura * (baseMenor + baseMaior)) / 2;

        System.out.println("A área do trapézio é: " + area);

        //exercicio_6
        int numero = 15;
        double resultado = 0;

        while (numero <= 35) {
            if (numero % 2 == 1) {
                //resultado = numero * numero;
                resultado = Math.pow(numero, 2);
                System.out.println(resultado);
            }
            numero++;

        }
    }
}

