package DefiningClasses.RawData;

import java.util.List;

public class Car {

    private String model;

    private Engine engine;

    private Cargo cargo;

    private List<Tire> Tires;

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public List<Tire> getTires() {
        return Tires;
    }

    public Car(String model, Engine engine, Cargo cargo, List<Tire> tires) {
        this.model = model;
        this.engine = engine;
        this.cargo = cargo;
        Tires = tires;
    }

    public void Fragile(){


            boolean isFragile = getCargo().getType().equals("fragile");
            boolean tirePresure = false;

            for (Tire tire:Tires) {
                if (tire.getPressure() < 1) {
                    tirePresure = true;
                    break;
                }
            }

            if(isFragile && tirePresure){
                System.out.println(model);
            }



    }


    public void Flamable(){
        boolean isFlamable = getCargo().getType().equals("flamable");
        boolean isOver250Power = engine.getPower() > 250;

        if(isFlamable && isOver250Power){
            System.out.println(model);
        }
    }

}
