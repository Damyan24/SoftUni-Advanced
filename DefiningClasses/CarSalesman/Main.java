package DefiningClasses.CarSalesman;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        HashMap<String,Engine> engines = new HashMap<>();
        for(int i = 0 ; i < n ; i++){
            String [] engineInfo = scan.nextLine().split("\\s+");
            String model = engineInfo[0];
            int power = Integer.parseInt(engineInfo[1]);

            if(engineInfo.length == 4){
                int displacement = Integer.parseInt(engineInfo[2]);
                String efficiency = engineInfo[3];
                Engine eng = new Engine(model,power,displacement,efficiency);
                engines.put(model,eng);
            }else if(engineInfo.length == 2){
                Engine eng = new Engine(model,power);
                engines.put(model,eng);
            }else {
                if(engineInfo[2].contains("0")||engineInfo[2].contains("1")||engineInfo[2].contains("2")||engineInfo[2].contains("3")||engineInfo[2].contains("4")||engineInfo[2].contains("5")||engineInfo[2].contains("6")||engineInfo[2].contains("7")||engineInfo[2].contains("8")||engineInfo[2].contains("9")){
                    Engine eng = new Engine(model,power);
                    eng.setDisplacement(Integer.parseInt(engineInfo[2]));
                    engines.put(model,eng);
                }else {
                    Engine eng = new Engine(model,power);
                    eng.setEfficiency(engineInfo[2]);
                    engines.put(model,eng);
                }
            }

        }


        List<Car> cars = new ArrayList<>();
        int m = Integer.parseInt(scan.nextLine());

        for(int i = 0 ; i < m; i++){
            String [] line = scan.nextLine().split("\\s+");

            String model = line[0];
            String engine = line[1];
            Car car = new Car(model,engines.get(engine));
            if(line.length == 4){
                car = new Car(model,engines.get(engine),Integer.parseInt(line[2]),line[3]);
            }if(line.length ==3){
                if(line[2].contains("0")||line[2].contains("1")||line[2].contains("2")||line[2].contains("3")||line[2].contains("4")||line[2].contains("5")||line[2].contains("6")||line[2].contains("7")||line[2].contains("8")||line[2].contains("9")){
                    car.setWeight(Integer.parseInt(line[2]));
                }else {
                    car.setColor(line[2]);
                }
            }
            cars.add(car);
        }

        for(Car car : cars){
            car.toString();
        }

    }
}
