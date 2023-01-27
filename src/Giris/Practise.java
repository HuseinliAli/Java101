package Giris;
import java.util.Scanner;
public class Practise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double math = input.nextDouble();
        double phys = input.nextDouble();
        double chem = input.nextDouble();
        double hist = input.nextDouble();
        double eng = input.nextDouble();
        double music = input.nextDouble();
        input.close();
        float avg = (float)(math + phys + chem + hist + eng + music)/6;

        String isPassed = avg >=60 ? "imtahani kecdiniz": "imtahandan qaldiniz";
        System.out.print(isPassed);
    }

}
