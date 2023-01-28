package Loops;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int first = 0;
        int second = 1;
        int result;
        for(int i=0;i<n-1;i++){

            result = first + second;
            first = second;
            second = result;
            System.out.print(result+" ");
        }

    }
}
