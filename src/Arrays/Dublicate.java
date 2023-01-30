package Arrays;

import java.util.Arrays;

public class Dublicate {
    public static void main(String[] args) {
        int[] arr = {1,4,3,61,4,62,1,3,4,5,61,4,5,77,89,67,435};
        int count =1;
        int[] counts = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i != j  && arr[i] == arr[j]){
                    count++;
                    counts[i]= count;
                }
            }
            System.out.println(arr[i] +" ededi "+ count +" denedir");
            count = 1;
            counts[i] = 1;
        }
    }
}
