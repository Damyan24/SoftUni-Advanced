package IteratorsAndComparators.ListyIterator;

import java.util.*;
import java.util.stream.Collectors;

public class ListyIterator implements Iterable<String> {

   private List<String> list;
   private  int index;

   public ListyIterator(){
       this.list = new ArrayList<>();
       this.index = 0;
   }



   public void Create(String...da){
       this.list = Arrays.stream(da).collect(Collectors.toList());
   }

    public boolean hasNext() {
       return index + 1 < list.size();


    }


    public boolean next() {
        if(index + 1 < list.size()){
            index++;
            return true;
        }
        return false;
    }





    public void Print(){
       if(list.size() > 0) {
           System.out.println(list.get(index));
       }else {
           System.out.println("Invalid Operation!");
       }
    }

    public void PrintAll() {


       Iterator<String> iter = iterator();

       StringBuilder stb = new StringBuilder();

       while (iter.hasNext()){
           stb.append(iter.next() + " ");
       }

        System.out.println(stb);



        }


    @Override
    public Iterator<String> iterator() {
        return new ListyIteratorIterator();
    }

    private class ListyIteratorIterator implements Iterator<String>{
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < list.size();
        }

        @Override
        public String next() {
            return list.get(currentIndex++);
        }
    }


}

















