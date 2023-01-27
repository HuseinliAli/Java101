package Giris;

import java.sql.SQLOutput;
import java.util.Scanner;

public class IndexOfBody {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double kg = input.nextDouble();
        double height = input.nextDouble();
        double index = kg / (Math.pow(height,2));
        System.out.println(index);


    }
}
