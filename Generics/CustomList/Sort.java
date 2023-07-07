package Generics.CustomList;

import java.util.Collections;
import java.util.List;

public class Sort<T extends CustomList<T> & Comparable<T> > {


    public void sort(CustomList<T> list){

        Collections.sort(list.getList());

    }



}
