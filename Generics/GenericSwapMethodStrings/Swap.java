package Generics.GenericSwapMethodStrings;

import java.util.List;

public class Swap<T> {

    private List<T> list;


    public Swap(List<T>list){
        this.list = list;
    }

    public void swap(int a, int b){
        T temp = list.get(a);
        list.set(a,list.get(b));
        list.set(b, temp);
    }

    public String toString(T obj){
        return obj.getClass().getName()+": " + obj;
    }

}
