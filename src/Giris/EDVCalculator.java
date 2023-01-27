package Giris;

import java.util.Scanner;

public class EDVCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double price = input.nextDouble();
        double edvPrice = price<=1000 ? price * 0.18: price * 0.08;
        double addEdvPrice = price + edvPrice;
        System.out.println("edv olmadan qiymet: "+ price);
        System.out.println("edv qiymeti: " + edvPrice);
        System.out.println("edv elave edilmis qiymeti: "+ addEdvPrice);
    }
}
