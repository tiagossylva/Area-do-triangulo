package application;

import java.util.Locale;
import java.util.Scanner;

public class program {

    public static void main(String[] args) {

        double  xa, xb, xc, ya,yb, yc;
        Locale.setDefault(Locale.US);
        Scanner sc =  new Scanner(System.in);

        System.out.println("digite os valores de x");
         xa = sc.nextDouble();
         xb = sc.nextDouble();
         xc = sc.nextDouble();

        Scanner scanner =  new Scanner(System.in);
        System.out.println("digite os valores de ");
        ya = sc.nextDouble();
        yb = sc.nextDouble();
        yc = sc.nextDouble();

        double px = (xa + xb + xc)/2;
        double areax = Math.sqrt(px*(px-xa)*(px-xb)*(px-xc));

        double py = (ya + yb + yc)/2;
        double areay = Math.sqrt(py*(py-ya)*(py-yb)*(py-yc));

        System.out.printf("Triângulo x area: %.4f\n", areax);
        System.out.printf("Triangulo y area:  %.4f\n", areay);

        if (areax > areay){
            System.out.println("Maior área: x");
        }
        else{
            System.out.println("Maior área: y");
        }

    }
}
