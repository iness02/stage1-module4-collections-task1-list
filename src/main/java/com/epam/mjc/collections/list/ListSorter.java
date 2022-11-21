package com.epam.mjc.collections.list;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
        for (int i = 0; i < sourceList.size()-1; i++) {
            int i1 = Integer.parseInt(sourceList.get(i));
            int i2 = Integer.parseInt(sourceList.get(i+1));
            if(Math.abs(i1)==Math.abs(i2) && i1>i2){
                int temp=i1;
                i1=i2;
                i2=temp;
                sourceList.set(i, String.valueOf(i1));
                sourceList.set(i+1, String.valueOf(i2));
            }
        }
        System.out.println(sourceList);

    }

}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {

            int i1 = Integer.parseInt(a);
            int i2 = Integer.parseInt(b);
            int a1=5*i1*i1+3;
            int b1=5*i2*i2+3;
            return a1-b1;

    }
}
