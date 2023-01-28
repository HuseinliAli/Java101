package Loops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /**int num = input.nextInt();
        int fac = 1;

        for (int i=1; i<=num ; i++){
            fac *= i;
        }
        System.out.println(fac);
        */
        int a = input.nextInt();
        int b = input.nextInt();
        int factorialA = 1;
        for(int i=1;i<=a;i++){
            factorialA *= i;
        }

        int factorialB = 1;
        for(int i=1;i<=b;i++){
            factorialB *= i;
        }

        int factorialC = 1;
        for(int i=1;i<=(a-b) ;i++){
            factorialC *= i;
        }

        double result = factorialA / (factorialB * factorialC);

        System.out.println(result);
    }
}
