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

        double areaX = x.area();

        double areaY = y.area();

        System.out.printf("Triângulo x area: %.4f\n", areaX);
        System.out.printf("entities.Triangulo y area:  %.4f\n", areaY);

        if (areaX > areaY){
            System.out.println("Maior área: x");
        }
        else{
            System.out.println("Maior área: y");
        }
    }
}