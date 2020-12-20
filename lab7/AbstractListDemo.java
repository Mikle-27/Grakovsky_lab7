package ru.mirea.gib04.lab7;

import java.util.*;

public class AbstractListDemo {
    public static void main(String args[])
    {

        AbstractList<String>
                list = new LinkedList<String>();

        list.add("Misha");
        list.add("Grisha");
        list.add("15");
        list.add("45");

        System.out.println("AbstractList: " + list);
    }
}