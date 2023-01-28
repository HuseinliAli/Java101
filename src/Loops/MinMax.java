package Loops;
import  java.util.*;
public class MinMax {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int element = sc.nextInt();
            if(element>max)
                max = element;
            if(element<min)
                min = element;
        }
        System.out.println(max+ " "+min);
    }
}
