package Loops;
import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, sum =0;
        do {
            System.out.println("EdedDaxilEdin: ");
            number = input.nextInt();
            if(number % 4 == 0){
                sum += number;
            }
        } while (number%2 !=1);
        System.out.print(sum);
    }
}
