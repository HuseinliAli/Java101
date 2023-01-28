package Methods;

public class Palindrom {
    public static void main(String[] args) {
        System.out.println(palindrom(4004));
    }

    public static boolean palindrom(int num){
        int temp = num;
        int count = 0;
        while (temp!=0){
            temp/=10;
            count++;
        }

        int tempSec = num;
        int reverseNum = 0;
        for(int i=count-1; i>=0;i--){
            int mod = tempSec % 10;
            tempSec/=10;
            reverseNum += mod * Math.pow(10,i);
        }
        if(reverseNum == num ){
            return true;
        }
        return false;
    }
}
