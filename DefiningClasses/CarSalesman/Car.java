package DefiningClasses.CarSalesman;

public class Car {
   private String model;

   private Engine engine;

   public Car(String model, Engine engine, int weight, String color) {
      this.model = model;
      this.engine = engine;
      this.weight = weight;
      this.color = color;
   }

   public String getModel() {
      return model;
   }

   public void setModel(String model) {
      this.model = model;
   }

   public Engine getEngine() {
      return engine;
   }

   public void setEngine(Engine engine) {
      this.engine = engine;
   }

   public int getWeight() {
      return weight;
   }

   public void setWeight(int weight) {
      this.weight = weight;
   }

   public String getColor() {
      return color;
   }

   public void setColor(String color) {
      this.color = color;
   }

   public Car(String model, Engine engine) {
      this.model = model;
      this.engine = engine;
      weight = -1;
      color = "n/a";
   }

   private int weight;

   private  String color;

   public String toString(){
      System.out.println(model+":");
      System.out.println(getEngine().getModel()+":");
      System.out.println("Power: "+getEngine().getPower());
      if(getEngine().getDisplacement() == -1){
         System.out.println("Displacement: n/a");
      }else {
         System.out.println("Displacement: " + getEngine().getDisplacement());
      }
      System.out.println("Efficiency: " + getEngine().getEfficiency());
      if(weight != -1){
         System.out.println("Weight: " + weight);
      }else {
         System.out.println("Weight: n/a");
      }
      System.out.println("Color: " + color);








      return null;
   }


}

