package DefiningClasses.CarSalesman;

public class Engine {
    private String model;

    private int power;

    private String displacement;

    private String efficiency;

    public void setModel(String model) {
        this.model = model;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setDisplacement(String displacement) {
        this.displacement = displacement;
    }

    public void setEfficiency(String efficiency) {
        this.efficiency = efficiency;
    }

    public String getModel() {
        return model;
    }

    public int getPower() {
        return power;
    }

    public String getDisplacement() {
        return displacement;
    }

    public String getEfficiency() {
        return efficiency;
    }

    public Engine(String model , int power){
        this.model = model;
        this.power = power;
        displacement = "n/a";
        efficiency = "n/a";
    }

    public Engine(String model , int power,String displacement , String efficiency){
        this.model = model;
        this.power = power;
        this.displacement = displacement;
       this.efficiency = efficiency;
    }
}
