package Loops;
import java.util.Scanner;
public class OneToHundred {
    public static void main(String[] args) {
        int count;
        for(int i=1;i<100;i++){
            count = 0;
            for(int j=2;j<i;j++){
                if(i%j == 0){
                    count++;
                }
            }
            if(count == 0){
                System.out.print(i+" ");
            }
        }



    }
}
