package Loops;
import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, sum =0;
        do {
            System.out.println("EdedDaxilEdin: ");
            number = input.nextInt();
            if(number % 2 == 1){
                sum += number;
            }
        } while (number>0);
        System.out.print(sum);
    }
}
