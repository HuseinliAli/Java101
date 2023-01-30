package Arrays;

import java.util.Arrays;

public class LetterB {
    public static void main(String[] args) {
        char[][] letterB = new char[7][5];

        for(int i=0;i < 7;i++){
            for(int j=0;j<5;j++){
                if(i==0||j==0){
                    letterB[i][j]='*';
                }else if(i==6){
                    letterB[i][j]='*';
                }else if(j==4){
                    letterB[i][j]='*';
                }else if(i==3){
                    letterB[i][j]='*';
                }else{
                    letterB[i][j]=' ';
                }

            }
            System.out.println();
        }

        for(int i=0;i<7;i++){
            for(int j=0;j<5;j++){
                System.out.print(letterB[i][j]);
            }
            System.out.println();
        }
    }
}
