package MultiDimensionalArrays;

import java.util.Scanner;

public class MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int row = scan.nextInt();
        int columns = scan.nextInt();
        String [][] matrix = new String[row][columns];

        for(int i = 0 ; i < row; i++){
            char firstLastLetter = (char) (97 + i);
            for(int j = 0 ; j < columns; j++){
               char middleLetter = (char) (firstLastLetter + j);
               StringBuilder newStr = new StringBuilder();
               newStr.append(firstLastLetter).append(middleLetter).append(firstLastLetter);
                matrix[i][j] =  newStr.toString();
            }
        }

        for(int i = 0 ; i < row; i++){

            for(int j = 0 ; j < columns ; j++){
                if(j == columns - 1){
                    System.out.print(matrix[i][j]+"\n");
                }else {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
    }
}
