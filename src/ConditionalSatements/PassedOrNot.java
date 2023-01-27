package ConditionalSatements;

import java.util.Scanner;

public class PassedOrNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Riyaziyyat: ");
        double math = input.nextDouble();
        System.out.println(math);
        if(math>100 || math<0) {
            math = 0;
        }

        System.out.print("Fizika: ");
        double phys = input.nextDouble();
        System.out.println(phys);
        if(phys>100 || phys<0) {
            phys = 0;
        }

        System.out.print("Kimya: ");
        double chem = input.nextDouble();
        System.out.println(chem);
        if(chem>100 || chem<0) {
            chem = 0;
        }

        System.out.print("Tarix: ");
        double hist = input.nextDouble();
        System.out.println(hist);
        if(hist>100 || hist<0) {
            hist = 0;
        }

        System.out.print("Ingilis: ");
        double eng = input.nextDouble();
        System.out.println(eng);
        if(eng>100 || eng<0) {
            eng = 0;
        }

        System.out.print("Musiqi: ");
        double music = input.nextDouble();
        System.out.println(music);
        if(music>100 || music<0) {
            music = 0;
        }

        input.close();
        float avg = (float)(math + phys + chem + hist + eng + music)/6;

        if(avg>55){
            System.out.println("sinfi kecdiniz");
        }else{
            System.out.println("sinifde qaldiniz");
        }
        System.out.println("Ortalamaniz: "+ avg);
    }
}
