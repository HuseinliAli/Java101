package Loops;
import  java.util.Scanner;
public class PerfectNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int numIsEqual = 0;
        for(int i=1;i<num;i++){
            if(num%i ==0){
                numIsEqual+=i;
            }
        }
        System.out.println(numIsEqual == num ? "mukemmel ededdir": "mukemmel eded deyil");
    }
}
