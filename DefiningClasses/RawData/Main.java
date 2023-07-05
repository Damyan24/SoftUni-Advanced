package DefiningClasses.RawData;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n =  Integer.parseInt(scan.nextLine());

       HashMap<String,Car> cars = new LinkedHashMap<>();

        for(int i = 0 ; i < n; i++){
            String [] line = scan.nextLine().split("\\s+");
            String model = line[0];
            int engineSpeed = Integer.parseInt(line[1]);
            int enginePower = Integer.parseInt(line[2]);
            int cargoWeight = Integer.parseInt(line[3]);
            String cargoType = line[4];
            Double tire1Pressure = Double.parseDouble(line[5]);
            int tire1Age = Integer.parseInt(line[6]);
            Double tire2Pressure = Double.parseDouble(line[7]);
            int tire2Age = Integer.parseInt(line[8]);
            Double tire3Pressure = Double.parseDouble(line[9]);
            int tire3Age = Integer.parseInt(line[10]);
            Double tire4Pressure = Double.parseDouble(line[11]);
            int tire4Age = Integer.parseInt(line[12]);

            Engine eng = new Engine(engineSpeed,enginePower);

            Cargo cargo = new Cargo(cargoWeight,cargoType);

            Tire tire1 = new Tire(tire1Age,tire1Pressure);
            Tire tire2 = new Tire(tire2Age,tire2Pressure);
            Tire tire3 = new Tire(tire3Age,tire3Pressure);
            Tire tire4 = new Tire(tire4Age,tire4Pressure);

            List<Tire> tires = new ArrayList<>();

            tires.add(tire1);
            tires.add(tire2);
            tires.add(tire3);
            tires.add(tire4);

            Car newCar = new Car(model,eng,cargo,tires);

            cars.put(model,newCar);


        }

        String type = scan.nextLine();


            for(Map.Entry<String,Car>entry:cars.entrySet()){
                   if(type.equals("fragile")){
                       entry.getValue().Fragile();
                   }else{
                       entry.getValue().Flamable();
                   }

            }



    }
}
