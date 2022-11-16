package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> integers = new LinkedList<>();

        int j = 0;
        for (int i = sourceList.size() - 1; i >= 0; i--) {
            if (sourceList.get(i) % 2 != 0) {
                integers.add(j++, sourceList.get(i));
            /*}else{
              //  integers.addLast(sourceList.get(i));
                integers2.add(sourceList.get(i));
                k++;
            }*/
            }

            }
            for (int k = 0; k < sourceList.size(); k++) {
                if (sourceList.get(k) % 2 == 0) {
                    integers.add(sourceList.get(k));
            /*}else{
              //  integers.addLast(sourceList.get(i));
                integers2.add(sourceList.get(i));
                k++;
            }*/
                }

        }
                return integers;
    }
            public static void main (String[]args){
                LinkedListCreator l = new LinkedListCreator();
                List<Integer> list = new LinkedList<>();//47, 3, 12, 25, 44, 80, 13, 2, 7, 52
                //[47, 3, 25, 13, 7]
        /*list.add(7);
        list.add(13);
        list.add(25);
        list.add(3);
        list.add(47);*/
                list.add(12);
                list.add(44);
                list.add(80);
                list.add(2);
                list.add(52);
                System.out.println(l.createLinkedList(list));
            }
}
