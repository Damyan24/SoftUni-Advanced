package MultiDimensionalArrays;

import java.util.Scanner;

public class MaximalSum {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] NxM = scan.nextLine().split(" ");

        int n = Integer.parseInt(NxM[0]);
        int m = Integer.parseInt(NxM[1]);
        int [][] matrix = new int[n][m];

        for(int i = 0 ; i < n; i++){
            String[]line = scan.nextLine().split("\\s+");
            for(int j = 0 ; j <m; j++){
                matrix[i][j] = Integer.parseInt(line[j]);
            }
        }


        int maxSum = 0;
        int start = 0;


        for(int i = 0 ; i < 


    }
}
