package Methods;

public class ExitTask {

    public static void main(String[] args) {
        int a = 16;
        int temp =a;
        System.out.println(pattern(a,temp));
    }
    static int pattern(int a, int temp){
        if(a>=0){
            System.out.print(a+ " ");
            return pattern(a-5, temp);
        }
        return reversePattern(a, temp);
    }
    static int reversePattern(int a, int temp){
        if(a!=temp){
            System.out.print(a+ " ");
            return reversePattern(a+5, temp);
        }
        return a;
    }

}
