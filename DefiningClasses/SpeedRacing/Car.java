package DefiningClasses.SpeedRacing;

public class Car {
    private String model;
    private double fuel;

    private double FuelPerKm;

    private int distance = 0;

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public String getModel() {
        return model;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public double getFuelPerKm() {
        return FuelPerKm;
    }

    public void setFuelPerKm(double fuelPerKm) {
        FuelPerKm = fuelPerKm;
    }

    public int getDistance() {
        return distance;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Car(String model, double fuel, double fuelPerKm) {
        this.model = model;
        this.fuel = fuel;
        FuelPerKm = fuelPerKm;
    }


    public String toString() {
        System.out.printf("%s %.2f %d\n",model,fuel,distance);
        return null;
    }
}
