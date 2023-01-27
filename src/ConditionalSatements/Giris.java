package ConditionalSatements;

import java.sql.SQLOutput;

public class Giris {
    public static void main(String[] args) {
        boolean a = true, b = false;
        System.out.println((a && b) || (a || b));

        int day = 3;
        switch (day) {
            case 1:
                System.out.println("bazar ertesi");
                break;
            case 2:
                System.out.println("cersembe axsami");
                break;
            case 3:
                System.out.println("cersembe");
                break;
            case 4:
                System.out.println("cume axsami");
                break;
            case 5:
                System.out.println("cume");
                break;
            case 6:
                System.out.println("senbe");
                break;
            case 7:
                System.out.println("bazar");
                break;
            default:
                System.out.printf("hefte gunu deyil");
                break;
        }
    }
}
