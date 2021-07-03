import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicios_arrays {
    public static void main(String[] args) {

        //Crie um programa que percorra um array de 10 posições e imprima o seu conteúdo.
        public class Ex_1_array {
            public static void main(String[] args) {

                int[] numero;
                numero = new int[10];

                Scanner readln = new Scanner(System.in);

                for (int i=0; i< numero.length; i++){
                    System.out.print("Digite um numero: ");
                    numero[i] = readln.nextInt();
                }

                for (int i=0; i< numero.length; i++){
                    System.out.print(numero[i] + " ");
                }

            }
        }

        //Escreva um programa que some todos os valores contidos em um array de inteiros e calcule a média.
        public class Ex_2_array {
            public static void main(String[] args) {

                Double[] numero;

                numero = new Double[3];

                Scanner readln = new Scanner(System.in);
                Double soma = 0.0;
                int i;

                for (i=0; i< numero.length; i++) {
                    System.out.print("Digite a nota do aluno: ");
                    numero[i] = readln.nextDouble();
                }

                int cont=0;
                for (i=0; i< numero.length;i++) {
                    soma += numero[i];
                    cont+=1;
                }

                System.out.println("A média do aluno foi: " + (soma/cont));
            }
        }

        //Faça um programa que inverta as posições de um array com 10 elementos.
        public class Ex_3_array {
            public static void main(String[] args) {

                int[] numero = {23,15,22,58,3556,848,8421,55,15,2};

                for (int i=9; i>=0; i--){
                    System.out.print(numero[i] + " ");
                }
            }
        }

        //Faça um programa que receba entrada de dados  e informe ao usuário através de uma caixa de diálogo qual foi o dados passados.
        public class Ex_4_array {
            public static void main(String[] args) {

                String nome_aluno = JOptionPane.showInputDialog("Digite o nome do aluno: ");

                JOptionPane.showMessageDialog(null, nome_aluno);
            }
        }

        //Desenvolva um programa que receba 10 parâmetros, inverta todas as posições e imprima o resultado.
        public class Ex_5_array {
            public static void main(String[] args) {

                int[] [] numero;
                numero = new int[2] [5];

                Scanner s = new Scanner(System.in);

                int i;
                int j;

                for (i=0; i<numero.length; i++) {
                    System.out.println(" ");
                    for (j=0; j< numero[i].length; j++){
                        System.out.print("Digite um numero: ");
                        numero[i] [j] = s.nextInt();
                    }
                }

                for (i=1; i>=0; i--) {
                    System.out.println(" ");
                    for (j = 4; j >=0; j--) {
                        System.out.print(numero[i] [j] + " ");
                    }
                }

            }
        }

        //Desenvolva um programa que calcule o IMC com telas gráficas usando JOptionPane.
        public class Ex_6_array {
            public static void main(String[] args) {

                String peso = JOptionPane.showInputDialog("Digite seu peso: ");
                String altura = JOptionPane.showInputDialog("Digite sua altura em metros: ");

                float peso_int, altura_int;
                peso_int = Float.parseFloat(peso);
                altura_int = Float.parseFloat(altura);

                float imc = (peso_int / (altura_int * altura_int));

                DecimalFormat casas_decimais = new DecimalFormat("0.00");

                JOptionPane.showMessageDialog(null, casas_decimais.format(imc));

            }
        }
    }
}
