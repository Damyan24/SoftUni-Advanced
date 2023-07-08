package IteratorsAndComparators.ListyIterator;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ListyIterator listy = new ListyIterator();

        String line = scan.nextLine();

        while (!line.equals("END")){

            String [] info = line.split("\\s+");

            switch (info[0]){
                case "Create":
                    String [] info1 = Arrays.copyOfRange(info,1,info.length);
                    listy.Create(info1);
                    break;
                case "Move":
                    System.out.println(listy.next());
                    break;
                case "HasNext":
                    System.out.println(listy.hasNext());
                    break;
                case "Print":
                    listy.Print();
                    break;
                case "PrintAll":
                    listy.PrintAll();
                    break;

            }

            line = scan.nextLine();
        }






    }
}
