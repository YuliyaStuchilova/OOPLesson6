package org.example.tast2;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ImmutableList<Integer> list1 = new ImmutableList<>(Arrays.asList(1,2,3));

        list1.getSize();
        list1.get(1);
        System.out.println(list1);
        MutableList<Integer> list2 = new MutableList<>(new ArrayList<>());


        list2.add(1);
        list2.add(3);
        list2.add(5);
        System.out.println(list2);
        list2.set(2,6);
        System.out.println(list2);
        list2.remove(3);
        System.out.println(list2);



    }


}
