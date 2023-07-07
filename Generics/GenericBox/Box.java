package Generics.GenericBox;

public class Box <T>{
    T obj;

    public Box(T obj){
        this.obj = obj;
    }

    public String toString(T obj){


        return obj.getClass().getName() +": " +obj;
    }
}
