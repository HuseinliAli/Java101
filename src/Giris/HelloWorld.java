package Giris;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        //variables
        int numberOne = 10, numberTwo, numberThree;
        numberOne = 30;
        numberTwo = 345;
        numberThree = numberOne + numberTwo;

        int rectangleA, rectangleB, perimeter;
        rectangleA = 7;
        rectangleB = 9;
        perimeter = 2*(rectangleA + rectangleB);
        System.out.println(perimeter);

        float vFloat = 2.24F;
        double vDouble = 3.12D;
        String name = "ali";
        var bytesArr = name.getBytes();
        for(int i=0;i<name.length();i++){
            System.out.print(bytesArr[i]+" ");
        }

        int xb = 1, yb = 2, r=3;
        r *= xb + yb;
        //System.out.print("\n"+r);

        byte bb = -12;
        int aa = -5;
        System.out.print(bb%aa);

        //System.out.println("\n"+ vFloat+ " "+vDouble);

        Scanner input = new Scanner(System.in);
        /**
        var maas = input.nextInt();
        var strName = input.nextLine();
        var yas = input.nextInt();
        System.out.println(maas+" "+strName+" "+yas);
        */

        Scanner input2 = new Scanner(System.in);
        System.out.println();
        String str = input2.nextLine();
        System.out.println(str);

    }
}
