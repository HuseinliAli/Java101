package Loops;
import  java.util.*;
public class EBOB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int ebob=1;
        for(int i=2;i<=n1;i++){
            if(n1%i== 0 && n2%i == 0){
                ebob = i;
            }
        }
        System.out.println(n1+" "+n2+" ededlerinin ebobu: "+ebob);

        int ekob = n1*n2 / ebob;
        System.out.println(n1+" "+n2+" ededlerinin ekobu: "+ekob);
    }
}
