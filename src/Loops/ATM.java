package Loops;
import java.util.*;
public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String usernameDb = "alihuseynli";
        String passwordDb = "1234";
        double cash = 2345;
        boolean account = true;

        System.out.println("Parol daxil edin: ");
        String password = sc.nextLine();
        byte countOfMistake=3;

        String input;
            if(password.equals(passwordDb)){
                System.out.println("pul cekmek ucun 1");
                System.out.println("pul elave etmek ucun 2");
                System.out.println("hesabdan cixaris ucun 3");
                System.out.println("hesabdan cixis ucun 4");
                do {
                    input = sc.nextLine();
                    switch (input){
                        case "1":{
                            System.out.println("hesabinizda olan pul: "+cash+"\ncixarmaq istediyiniz miqdari secin: ");
                            int money = sc.nextInt();
                            if(money<=cash){
                                cash -=money;
                                System.out.println("emeliyyat ugurla sona catdi. hesabinizda qalan miqdar: "+ cash);
                            }else{
                                System.out.println("yigdiniz miqdar hesabinizda movcud deyil");
                            }
                            break;
                        }
                        case "2":{
                            System.out.println("hesabinizda olan pul: "+cash+"\ndaxil etmek istedyiniz miqdar: ");
                            int money = sc.nextInt();
                            cash+=money;
                            System.out.println("emeliyyat ugurla basa catdi hesabinizdaki pul: "+ cash);
                            break;
                        }
                        case "3":{
                            System.out.println("hesabinizda olan pul: "+cash);
                            break;
                        }
                        case "4":{
                            System.out.println("hesabdan cixdiniz");
                            break;
                        }
                        default:
                            System.out.println("pul cekmek ucun 1");
                            System.out.println("pul elave etmek ucun 2");
                            System.out.println("hesabdan cixaris ucun 3");
                            System.out.println("hesabdan cixis ucun 4");
                            break;
                    }
                }while(!input.equals("4"));
            }else{
                if(countOfMistake>0){
                    System.out.println("sehv deyer daxil etdiniz");
                    countOfMistake--;
                    System.out.println("yeniden yoxlayin qalan sansiniz: "+countOfMistake);
                }else {
                    account = false;
                    System.out.println("hesabiniz blok olunmusdur");
                }
            }
    }
}
