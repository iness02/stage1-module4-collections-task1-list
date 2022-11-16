package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        ArrayList<String> duplicateArrayList = new ArrayList<>();
        for (int i = 0; i < sourceList.size(); i++) {
            if ((i + 1) % 3 == 0) {
                duplicateArrayList.add(sourceList.get(i));
                duplicateArrayList.add(sourceList.get(i));
            }
        }
        return duplicateArrayList;
    }

    public static void main(String[] args) {
        ArrayListCreator a = new ArrayListCreator();
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("is");
        list.add("the");
        list.add("best");
        System.out.println(a.createArrayList(list));
    }
}
