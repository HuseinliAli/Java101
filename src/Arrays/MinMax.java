package Arrays;
import java.util.*;
public class MinMax {
    public static void main(String[] args) {
        int[] arr2 = {34,123,45,275,524,87};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int element:arr2) {
            if(element>max){
                max = element;
            }
            if(element<min){
                min = element;
            }
        }
        System.out.println(min + " "+ max);

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = {34,123,45,275,524,87, num};
        Arrays.sort(arr);
        var index = Arrays.binarySearch(arr, num);
        System.out.println(index);
        int nearMin = arr[index-1];
        int nearMax = arr[index+1];
        System.out.println(nearMin + " "+ nearMax);
    }
}
