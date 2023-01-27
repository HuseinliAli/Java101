package Giris;

import java.util.Scanner;

public class TaxiMeter {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        double km = input.nextDouble();
        double taxiMeterMinimumPrice = 10;
        double price = km*2.2 + taxiMeterMinimumPrice <=20 ? 20: km*2.2 + taxiMeterMinimumPrice;
        System.out.printf("Price is: "+ String.format("%.2f", price) + "$");
    }
}
