package Generics.GenericBox;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

       /* for(int i = 0 ; i < n ; i++){
            String line = scan.nextLine();
            Box<String> box = new Box<>(line);

            System.out.println(box.toString(line));
        }
*/

        for(int i = 0 ; i < n ; i++){
            int number = Integer.parseInt(scan.nextLine());

            Box<Integer>box = new Box<>(number);

            System.out.println(box.toString(box.obj));


        }
    }
}
