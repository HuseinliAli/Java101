package Arrays;
import java.util.Arrays;
public class Avarage {
    public static void main(String[] args) {
        int[] arr = {96,56,5,0,13,58,43};
        int sum = 0;
        for(int i=0;i<arr.length; i++){
            sum+=arr[i];
        }
        double avarage =(double)sum/arr.length;
        System.out.println(sum);
        System.out.printf("%.2f",avarage);
    }
}
