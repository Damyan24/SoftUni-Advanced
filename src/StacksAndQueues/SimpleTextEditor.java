package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfCommands = Integer.parseInt(scan.nextLine());
        ArrayDeque<Character> queue = new ArrayDeque<>();
        ArrayDeque<String> deleted = new ArrayDeque<>();
        for(int i = 0 ; i < numberOfCommands; i++){
            String [] comands = scan.nextLine().split(" ");
            int command = Integer.parseInt(comands[0]);

            switch (command){
                case 1:
                   String toAdd = comands[1];
                    deleted.push(queue.toString());
                   for(int j = 0 ; j < toAdd.length(); j++){
                       queue.offer(toAdd.charAt(j));
                   }


                   break;
                case 2:
                    int count = Integer.parseInt(comands[1]);
                    deleted.push(queue.toString());
                    for(int j = 0 ; j < count; j++) {
                        queue.pollLast();
                    }
                    break;
                case 3:
                    int charToPrint = Integer.parseInt(comands[1]);
                    int counter = 0 ;
                    for(Character ch : queue){
                        counter ++;
                        if(counter == charToPrint){
                            System.out.println(ch);
                        }
                    }
                    break;
                case 4:

                    queue.clear();
                   String  newQueue = deleted.pop();
                    for(int j = 0 ; j < newQueue.length(); j++){
                        if(newQueue.charAt(j) != ' ' && newQueue.charAt(j) != ',' && newQueue.charAt(j) != '[' && newQueue.charAt(j) != ']'){
                            queue.offer(newQueue.charAt(j));
                        }
                    }

                    break;

            }



            }
        }
    }

