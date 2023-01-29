package Methods;
import  java.util.*;
public class Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("eded daxil edin: ");
        int a = sc.nextInt();
        int i = a/2;
        boolean result = isNumber(a, i);
        System.out.println(result == true ? "asal sayidir": "asal sayi deyil");
    }
    static boolean isNumber(int a,int i){
        if (a <= 1) {
            return false;
        }
        if (i == 1) {
            return true;
        }
        if (a % i == 0) {
            return false;
        }
        return isNumber(a, i-1);
    }
}
