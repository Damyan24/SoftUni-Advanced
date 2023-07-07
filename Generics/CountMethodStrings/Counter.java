package Generics.CountMethodStrings;

import java.util.List;

public class Counter <T extends  Comparable<T>> {

    private List<T> text ;

    public Counter(List<T>text){
        this.text = text;
    }


    public Integer count(T info){
        int counter = 0;

        for(T obj : text){
            if(obj.compareTo(info) == 1){
                counter++;
            }
        }

        return  counter;
    }
}
