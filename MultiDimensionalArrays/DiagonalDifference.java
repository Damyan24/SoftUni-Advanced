package MultiDimensionalArrays;

import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int [][] matrix = new int[n][n];

        for(int i = 0 ; i < n; i++){
            String [] line = scan.nextLine().split("\\s+");
            for(int j = 0; j < line.length; j++){
                matrix[i][j] = Integer.parseInt(line[j]);
            }
        }

        int firstDiagonal = 0;

        for(int i = 0 ; i < n; i++){
            firstDiagonal += matrix[i][i];
        }

        int secondDiagonal = 0;

        for(int i = 0 ; i < n; i++){
            secondDiagonal += matrix[i][n - 1 - i];
        }

        System.out.println(Math.abs(firstDiagonal - secondDiagonal));
    }
}
