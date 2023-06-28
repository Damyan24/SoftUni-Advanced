package MultiDimensionalArrays;

import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] comands = scan.nextLine().split(", ");

        int n = Integer.parseInt(comands[0]);
        String patters = comands[1];

        int[][] matrix = new int[n][n];

        if (patters.equals("A")) {
            patternA(n, matrix);
        }else {
            patternB(n , matrix);
        }


        for(int i = 0; i < n; i++){

            for(int j = 0 ; j < n ; j++){
                if(j != n - 1){
                    System.out.print(matrix[i][j] + " ");
                }else {
                    System.out.print(matrix[i][j] + "\n");
                }
            }
        }


    }

    public static void patternA(int n, int[][] nums) {
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                if (j == 0) {
                    nums[i][j] = i + 1;
                } else {
                    nums[i][j] = nums[i][j - 1] + n;
                }
            }
        }
    }


    public static void patternB(int n, int[][] nums) {
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                if (i == 0) {

                    if (j == 0) {
                        nums[i][j] = i + 1;
                    }else {
                       if(j % 2 != 0){
                           nums[i][j] = n * (j + 1);
                       }else {
                           nums[i][j] = nums[i][j - 1] + 1;
                       }
                    }


                }else {
                    if(j % 2 != 0){
                        nums[i][j] = nums[i - 1][j] - 1;
                    }else {
                        nums[i][j] = nums[i - 1][j] + 1;
                    }
                }
            }

        }
    }
}
