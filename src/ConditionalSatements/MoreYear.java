package ConditionalSatements;

import java.util.Scanner;

public class MoreYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();

        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println("artmis ildir");
                }
                else {
                    System.out.println("artmis il deyildir");
                }
            }
            else {
                System.out.println("artmis ildir");
            }
        }else {
            System.out.println("artmis il deyildir");
        }
    }
}
