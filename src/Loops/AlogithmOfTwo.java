package Loops;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class AlogithmOfTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double number = input.nextDouble();
        for(int i=0;i<number;i++){
            if(Math.pow(2,i)<=number){
                System.out.print(Math.pow(2,i)+" ");
            }
        }
        System.out.println();
        for(int i=1; i<number; i*=4) {
            System.out.print(i+" ");
        }

        System.out.println();
        for(int i=1; i<number; i*=5) {
            System.out.print(i+" ");
        }
    }
}
