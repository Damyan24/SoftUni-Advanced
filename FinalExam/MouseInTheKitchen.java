package FinalExam;

import java.util.Scanner;

public class MouseInTheKitchen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String [] info = scan.nextLine().split(",");

        int rows = Integer.parseInt(info[0]);
        int cols = Integer.parseInt(info[1]);

        String [][]map = new String[rows][cols];

        int startRow = Integer.MAX_VALUE;
        int startCol = Integer.MAX_VALUE;
        int cheeseCounter = 0;

        for(int row = 0; row < rows; row++){
            String line = scan.nextLine();
            for(int col = 0; col < cols ; col++){
                map[row][col] = String.valueOf(line.charAt(col));
                if(map[row][col].equals("M")){
                    startRow = row;
                    startCol = col;
                }

                if(map[row][col].equals("C")){
                    cheeseCounter++;
                }



            }
        }




        String command = scan.nextLine();

        boolean toPrint = true;

        while (!command.equals("danger") || toPrint == false) {

            int oldrow = startRow;
            int oldcol = startCol;

            switch (command) {
                case "left":
                        map[startRow][startCol] = "*";
                        startCol -= 1;
                        break;
                case "right":
                    map[startRow][startCol] = "*";
                    startCol += 1;
                    break;
                case "up":
                    map[startRow][startCol] = "*";
                    startRow -= 1;
                    break;
                case "down":
                    map[startRow][startCol] = "*";
                    startRow += 1;
                    break;
                    }



                    if(startRow > rows - 1  || startRow < 0 || startCol > cols - 1  || startCol <0){
                        System.out.println("No more cheese for tonight!");
                        toPrint = false;


                        map[oldrow][oldcol] = "M";


                        for(int i = 0 ; i < rows; i++){
                            for(int j = 0 ; j < cols ; j++){
                                if(j != cols - 1){
                                    System.out.print(map[i][j]);
                                }else System.out.print(map[i][j]+"\n");
                            }
                        }
                        break;
                    }



                    if(map[startRow][startCol].equals("T")){
                        System.out.println("Mouse is trapped!");
                        map[startRow][startCol] = "M";
                        toPrint = false;

                        for(int i = 0 ; i < rows; i++){
                            for(int j = 0 ; j < cols ; j++){
                                if(j != cols - 1){
                                    System.out.print(map[i][j]);
                                }else System.out.print(map[i][j]+"\n");
                            }
                        }
                        break;
                    }

                    if(map[startRow][startCol].equals("C")){
                        cheeseCounter--;
                        map[startRow][startCol] = "M";
                        if(cheeseCounter == 0){
                            System.out.println("Happy mouse! All the cheese is eaten, good night!");
                            toPrint = false;
                            for(int i = 0 ; i < rows; i++){
                                for(int j = 0 ; j < cols ; j++){
                                    if(j != cols - 1){
                                        System.out.print(map[i][j]);
                                    }else System.out.print(map[i][j]+"\n");
                                }
                            }
                            break;
                        }


                    }


                    if(map[startRow][startCol].equals("@")){
                        startRow = oldrow;
                        startCol = oldcol;
                        map[startRow][startCol] = "M";
                    }

                    if(map[startRow][startCol].equals("*")){
                        map[startRow][startCol] ="M";
                    }
                    command = scan.nextLine();
            }


        if(toPrint){
            System.out.println("Mouse will comeback later!");
            for(int i = 0 ; i < rows; i++){
                for(int j = 0 ; j < cols ; j++){
                    if(j != cols - 1){
                        System.out.print(map[i][j]);
                    }else System.out.print(map[i][j]+"\n");
                }
            }

        }




        }


    }

