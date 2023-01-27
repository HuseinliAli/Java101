package ConditionalSatements;

import java.util.Scanner;



public class EventAdviser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double heat = input.nextDouble();

        if(heat<5){
            System.out.println("qartopu oyna");
        }else if(heat>=5 && heat<15){
            System.out.println("sinemaya get");
        }else if(heat>=15 && heat <25){
            System.out.println("pikniye get");
        }else {
            System.out.println("uzmeye get");
        }
    }
}
