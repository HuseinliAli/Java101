package Methods;
import java.util.*;
public class APowB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("eded daxil edin: ");
        int a = sc.nextInt();
        System.out.println();
        System.out.print("quvvetini daxil edin: ");
        int b= sc.nextInt();

        int result = pow(a, b);

        System.out.println("Cavab: "+result);
    }

    static int pow(int a, int b){
        if(b==0){
            return 1;
        }
        return a * pow(a, b-1);
    }
}
