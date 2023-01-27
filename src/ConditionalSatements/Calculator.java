package ConditionalSatements;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("1ci ededi daxil edin: ");
        int first = input.nextInt();
        System.out.println();

        System.out.print("emeli daxil edin: + - * / : ");
        String str = input.next();
        System.out.println();

        System.out.print("2ci ededi daxil edin: ");
        int second = input.nextInt();
        System.out.println();

        switch (str){
            case "+":
                System.out.println(first+second);
                break;
            case "-":
                System.out.println(first-second);
                break;
            case "*":
                System.out.println(first*second);
                break;
            case "/":
                System.out.println(first/second);
                break;
            default:
                System.out.println("duzgun emel deyil");
        }
    }
}
