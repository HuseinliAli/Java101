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
    }
}
