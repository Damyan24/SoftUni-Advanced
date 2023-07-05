package DefiningClasses.SpeedRacing;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        HashMap<String,Car> cars = new LinkedHashMap<>();
        for(int i = 0 ; i<n; i++){
            String [] info = scan.nextLine().split("\\s+");

            String model = info[0];
            double fuelAmount = Double.parseDouble(info[1]);
            double fuelCostPerKm = Double.parseDouble(info[2]);

            Car car = new Car(model,fuelAmount,fuelCostPerKm);

            cars.put(model,car);

        }

        String line = scan.nextLine();

        while (!line.equals("End")){
            String [] info = line.split("\\s+");
            String command = info[0];
            String model = info[1];
            int distance = Integer.parseInt(info[2]);

            Car currentCar = cars.get(model);
            double fuelPerKm = currentCar.getFuelPerKm();
            double fuel = currentCar.getFuel();

            if(distance * fuelPerKm > fuel){
                System.out.println("Insufficient fuel for the drive");
            }else {
                double fuelToRemove = distance * fuelPerKm;
                double remaining = fuel - fuelToRemove;
                currentCar.setFuel(remaining);
                currentCar.setDistance(currentCar.getDistance() + distance);
            }

            cars.put(model,currentCar);

            line = scan.nextLine();
        }

       for(Map.Entry<String,Car> entry: cars.entrySet()){
           entry.toString();
       }
    }
}
