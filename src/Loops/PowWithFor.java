package Loops;
import  java.util.Scanner;
public class PowWithFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        double result=1;
        for(int i=0;i<b;i++){
            result *= a;
        }
        System.out.println(result);
    }
}
