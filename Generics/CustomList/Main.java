package Generics.CustomList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String line = scan.nextLine();

        CustomList<String>list = new CustomList<>();

        while (!line.equals("END")){
            String [] info = line.split(" ");

            switch (info[0]){
                case "Add":
                    list.add(info[1]);
                    break;
                case "Remove":
                    list.remove(Integer.parseInt(info[1]));
                    break;
                case "Contains":
                    System.out.println(list.contains(info[1]));
                    break;
                case "Swap":
                    list.swap(Integer.parseInt(info[1]),Integer.parseInt(info[2]));
                    break;
                case "Greater":
                    System.out.println(list.countGreaterThan(info[1]));

                    break;
                case "Max":
                    System.out.println(list.getMax());
                    break;
                case "Min":
                    System.out.println(list.getMin());
                    break;
                case "Print":
                    list.print();
                    break;
                case"Sort":
                    Sort sort = new Sort();
                    sort.sort(list);
                    break;


            }
            line = scan.nextLine();
        }

    }
}
