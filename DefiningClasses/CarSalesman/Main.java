package DefiningClasses.CarSalesman;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        for(int i = 0 ; i < n ; i++){
            String [] engineInfo = scan.nextLine().split("\\s+");
            String model = engineInfo[0];
            int power = Integer.parseInt(engineInfo[1]);

            if(engineInfo.length == 4){
                String displacement = engineInfo[2];
                String efficiency = engineInfo[3];
                Engine eng = new Engine(model,power,displacement,efficiency);
            }else if(engineInfo.length == 2){
                Engine eng = new Engine(model,power);
            }else {

            }

        }


    }
}
