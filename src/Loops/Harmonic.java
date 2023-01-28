package Loops;
import java.util.*;
public class Harmonic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double result = 0;
        for(int i=1;i<=n;i++){
            result +=((double) 1/i);
        }
        System.out.println(result);

    }
}
