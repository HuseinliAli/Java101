package Giris;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double r = inp.nextDouble();
        double area = Math.PI * Math.pow(r, 2);
        double length = 2 * Math.PI * r;
        System.out.println(area+" "+length);

        int alphaDegree = inp.nextInt();
        double areaOfDegree = (Math.PI * r * r * alphaDegree) /360;
        System.out.println(areaOfDegree);

    //Shopping
        double peach = 2.14;
        double apple = 3.67;
        double tomato = 1.11;
        double banana = 0.95;
        double pomegranate = 5.00;

        int peachCount = inp.nextInt();
        int appleCount = inp.nextInt();
        int tomatoCount = inp.nextInt();
        int bananaCount = inp.nextInt();
        int pomegranateCount = inp.nextInt();

        double price = peach*peachCount + apple*appleCount+ tomato*tomatoCount+ banana*bananaCount+ pomegranate*pomegranateCount;
        System.out.println(price);
    }
}
