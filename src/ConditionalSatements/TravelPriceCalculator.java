package ConditionalSatements;
import  java.lang.String;
public class TravelPriceCalculator {
    public static void main(String[] args) {
        int age = 20;
        int km = 1500;
        double priceForPerKm = 0.1;
        String userChoose = "1";
        double price=0;
        if(userChoose.equals("1")){
            price = 1.6 * km * priceForPerKm;
        }else if(userChoose.equals("2")){
            price = km * priceForPerKm;
        }

        if(age<12){
            price *= 0.5;
        }else if(age>=12 && age<24){
            price *= 0.9;
        }else if(age>=65){
            price *= 0.7;
        }
        System.out.println(price);

    }
}
