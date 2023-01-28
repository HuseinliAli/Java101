package Loops;

import java.util.Scanner;

public class Practise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println("for");
        for (int i=0; i<=number;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }

        System.out.println("\nwhile");
        int j = 0;
        while(j<=number){
            if(j%2 == 0){
                System.out.print(j+" ");
            }
            j++;
        }
        System.out.println("\ndo while");
        int k=0;
        do {
            if(k%2 == 0) {
                System.out.print(k+" ");

            }
            k++;
        }while(k<=number);

        /**for(boolean isNegative = false; isNegative=true; isNegative =false){
            number = input.nextInt();
            if(number<0){
                System.out.println("Menfi eded daxil etdiniz!"+number);
                isNegative = true;
            }else {
                System.out.println("menfi eded daxil edin");
            }
        }

        number = input.nextInt();
        while (number>0){
            if(number>=0){
                System.out.println("menfi eded daxil edin: ");
               number = input.nextInt();
            }else {
                System.out.println(number);
            }
        }*/

    }
}
