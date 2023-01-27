package ConditionalSatements;

import java.util.Scanner;

public class LoginDemo {
    public static void main(String[] args) {
        String usernameFromDb = "abicim";
        String passwordFromDb ="12345";

        Scanner input = new Scanner(System.in);
        System.out.println("istifadeci adini daxil edin: ");
        String username = input.nextLine();
        System.out.println(username);

        System.out.println("parolu daxil edin: ");
        String password = input.nextLine();
        System.out.println(password);



        if(( username.equals(usernameFromDb) )&&( password.equals(passwordFromDb))){
            System.out.println("sisteme daxil oldunuz");
        }else if(!username.equals(usernameFromDb)){
            System.out.println("bu adda istifadeci tapilmadi");
        }else if(username.equals(usernameFromDb) && !password.equals(passwordFromDb)){
            System.out.println("parol sehvdir");
            System.out.println("parolu unutmusunuz? y/n : ");
            String yesOrNo = input.nextLine();
            switch (yesOrNo){
                case "y":
                    System.out.print("yeni parolu daxil edin:");
                    String newPassword = input.nextLine();
                    System.out.println();
                    if(newPassword.equals(passwordFromDb)) {
                        System.out.println("daxil etdiyiniz parol kohne parol ile eynidir");
                    }else{
                        passwordFromDb = newPassword;
                        System.out.println("parolunuz ugurla deyisdirildi");
                    }
                    break;
                case "n":
                    System.out.println("xos getdiniz");
                    break;
                default:
                    System.out.println("duzgun deyer daxil edin");
            }
        }
    }
}
