package ConditionalSatements;

import java.util.*;

public class ChinaZodiac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        int result = year % 12;
        switch (result){
            case 0:
                System.out.println("meymun");
                break;
            case 1:
                System.out.println("xoruz");
                break;
            case 2:
                System.out.println("it");
                break;
            case 3:
                System.out.println("donuz");
                break;
            case 4:
                System.out.println("sican");
                break;
            case 5:
                System.out.println("okuz");
                break;
            case 6:
                System.out.println("shir");
                break;
            case 7:
                System.out.println("dovsan");
                break;
            case 8:
                System.out.println("ejdaha");
                break;
            case 9:
                System.out.println("ilan");
                break;
            case 10:
                System.out.println("at");
                break;
            case 11:
                System.out.println("qoyun");
                break;
            default:
                System.out.printf("cavab tapilmadi");
        }
    }
}
