package application;

import entities.Triangulo;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Triangulo x, y;
        x = new Triangulo();
        y = new Triangulo();

        Locale.setDefault(Locale.US);
        Scanner sc =  new Scanner(System.in);

        System.out.println("digite os valores de x");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        Scanner scanner =  new Scanner(System.in);
        System.out.println("digite os valores de ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double px = (x.a + x.b + x.c)/2;
        double areax = Math.sqrt(px*(px-x.a)*(px-x.b)*(px-x.c));

        double py = (y.a + y.b + y.c)/2;
        double areay = Math.sqrt(py*(py-y.a)*(py-y.b)*(py-y.c));

        System.out.printf("Triângulo x area: %.4f\n", areax);
        System.out.printf("entities.Triangulo y area:  %.4f\n", areay);

        if (areax > areay){
            System.out.println("Maior área: x");
        }
        else{
            System.out.println("Maior área: y");
        }
    }
}
