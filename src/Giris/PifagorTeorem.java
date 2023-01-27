package Giris;

import java.util.Scanner;

public class PifagorTeorem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        double c = Math.sqrt( a*a + b*b );
        System.out.println("Hipotenus: "+ c);

        int triangleA = input.nextInt();
        int triangleB = input.nextInt();
        int triangleC = input.nextInt();
        double p = (triangleA + triangleB + triangleC)/2;
        double area = Math.sqrt(p * (p-triangleA) * (p - triangleB) * (p-triangleC));
        System.out.println("Area of Triangle: "+ area);
    }
}
