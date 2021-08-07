package AulaPolimorfismo.Interface;

import java.util.Scanner;

public class FiguraGeometricaMain {
    public static void main(String[] args) {

        Scanner readln = new Scanner(System.in);

        Quadrado quadrado = new Quadrado();

        System.out.println("Selecione o lado: ");
        readln.nextInt();

        System.out.println(quadrado.getNomeFigura());
        System.out.println(quadrado.getArea());
        System.out.println(quadrado.getPerimetro());
        System.out.println(" ");

        Triangulo triangulo = new Triangulo(20,15,10,15,30);

        System.out.println(triangulo.getArea());
        System.out.println(triangulo.getPerimetro());
        System.out.println(triangulo.getNomeFigura());

    }
}
