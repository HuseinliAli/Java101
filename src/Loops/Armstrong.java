package Loops;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int temp = number;
        int length = 0;
        while (temp!=0){
            temp/=10;
            length++;
        }
        System.out.println("ededin uzunlugu: "+length);

        int numberEquals = 0;
        int lastNumOfNumber;
        int lastNumOfNumberUpLength;
        while(number!=0){
            lastNumOfNumber = number % 10;
            lastNumOfNumberUpLength=1;
            for(int i=0;i<length;i++){
                lastNumOfNumberUpLength *= lastNumOfNumber;
            }
            numberEquals += lastNumOfNumberUpLength;
            number /=10;
        }

        System.out.println(numberEquals==number? "armstrongdur": "armstrong deyil");
    }
}
