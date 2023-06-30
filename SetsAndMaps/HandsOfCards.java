package SetsAndMaps;

import java.util.*;

public class HandsOfCards {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String line = scan.nextLine();
        HashMap<String, Set<String>> hands = new LinkedHashMap<>();

        while (!line.equals("JOKER")){

            int indexOf = line.indexOf(':');

            String name = line.substring(0 , indexOf);


            String [] cards = line.substring(indexOf + 2).split(", ");

            if(hands.containsKey(name)){
                Set<String>existing = hands.get(name);
                existing.addAll(Arrays.asList(cards));
                hands.put(name,existing);
            }else {
                Set<String> newSet = new LinkedHashSet<>();
                newSet.addAll(Arrays.asList(cards));
                hands.put(name, newSet );
            }





            line = scan.nextLine();
        }






        for(Map.Entry<String,Set<String>> entry : hands.entrySet()){
            int sum = 0;

            Set<String> cards = entry.getValue();

            for(String str : cards){
                if(str.startsWith("10")){
                    int type = getValue(str.charAt(2));
                    sum += 10 * type;
                }else {
                    int power = getValue(str.charAt(0));
                    int type = getValue(str.charAt(1));
                    sum += power * type;
                }
            }

            System.out.println(entry.getKey()+": "+sum);
        }



    }
    public static int getValue(char ch){
        int numericValue = 0;
        switch (ch){
            case '2':
                numericValue = 2;
                break;
            case '3':
                numericValue = 3;
                break;
            case '4':
                numericValue = 4;
                break;
            case '5':
                numericValue = 5;
                break;
            case '6':
                numericValue = 6;
                break;
            case '7':
                numericValue = 7;
                break;
            case '8':
                numericValue = 8;
                break;
            case '9':
                numericValue = 9;
                break;
            case 'S':
                numericValue = 4;
                break;
            case 'H':
                numericValue = 3;
                break;
            case 'D':
                numericValue = 2;
                break;
            case 'C':
                numericValue = 1;
                break;
            case 'A':
                numericValue = 14;
                break;
            case 'J':
                numericValue = 11;
                break;
            case 'K':
                numericValue = 13;
                break;
            case 'Q':
                numericValue = 12;
                break;

        }


        return  numericValue;
    }
}
