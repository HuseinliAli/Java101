package Arrays;

public class Transpose {
    public static void main(String[] args) {
        int[][] arr = {{1,    2,    3},
                        {4,    5,    6 }};
        int[][] transpos = new int[3][2];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                transpos[j][i] = arr[i][j];
            }
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                System.out.print(transpos[i][j]+" ");
            }
            System.out.println();
        }
    }
}
