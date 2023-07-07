package Generics.CustomList;

import java.util.*;

public class CustomList <T extends Comparable<T>>{

    private List<T> list = new ArrayList<>();



    public  void add(T element){
        list.add(element);
    }

    public void remove(int index){
        list.remove(index);
    }

    public boolean contains(T element){
        if(list.contains(element)){
            return true;
        }
        return false;
    }

    public void swap(int index1 , int index2){
        T temp = list.get(index1);
        list.set(index1,list.get(index2));
        list.set(index2,temp);

    }

    public  int countGreaterThan(T element){
        int counter = 0;
        for(T item:list){
            if(element.compareTo(item) < 0){
                counter++;
            }
        }
        return counter;
    }

    public T getMax(){
        return Collections.max(list);
    }

    public T getMin(){
        return Collections.min(list);
    }

    public void print(){

        Iterator<T> it = list.iterator();

        it.forEachRemaining(System.out::println);

    }



    public List<T> getList() {
        return list;
    }
}
