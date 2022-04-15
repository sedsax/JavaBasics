package com.sedsax.javalearning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Arrays {
    public static void main(String[] args){
        //Arrays

        String[] myStringArray = new String[3];
        myStringArray[0]="Ece";
        myStringArray[1]="Efe";
        myStringArray[2]="Ege";
        System.out.println(myStringArray[1]);

        int[] myIntArray = new int[3];
        myIntArray[0]=5;
        myIntArray[1]=6;
        myIntArray[2]=7;
        System.out.println(myIntArray[2]);

        int[] myNumberArray = {8,3,5,1,4};
        System.out.println(myNumberArray[0]);
        System.out.println(myNumberArray[1]);
        System.out.println(myNumberArray[2]);
        System.out.println(myNumberArray[3]);
        System.out.println(myNumberArray[4]);

        //----------------------------------------------
        //List

        ArrayList<String> myColors = new ArrayList<>(); // Arraylist<String> şeklinde de yazabiliriz.
        myColors.add("black");
        myColors.add("white");
        myColors.add(0,"red"); // bu diğer 'add' metodu, girdiğimizin verinin indexini de belirtebiliyoruz.
        myColors.add("blue");

        System.out.println(myColors.get(0));
        System.out.println(myColors.get(1));
        System.out.println(myColors.get(2));
        System.out.println(myColors.get(3));
        System.out.println(myColors.size());

        //----------------------------------------------------
        //Set

        HashSet<String> mySet = new HashSet<>();
        mySet.add("Ahmet");
        mySet.add("Ahmet");
        mySet.add("Ahmet");
        System.out.println(mySet.size()); // boyutunu 1 olarak gösterdi çünkü aynı verilerden sadece birini gösteriyor

        //--------------------------------------------------------
        //HashMap

        HashMap<String, String> myHashMap = new HashMap<>();
        myHashMap.put("ad", "Ali");
        myHashMap.put("soyad", "Aslan");
        System.out.println(myHashMap.get("ad"));
        System.out.println(myHashMap.get("soyad"));

        HashMap<Integer, String> mySecondHashMap = new HashMap<>();
        mySecondHashMap.put(1, "Adana");
        mySecondHashMap.put(6, "Ankara");
        mySecondHashMap.put(61, "Trabzon");
        System.out.println(mySecondHashMap.get(1));
        System.out.println(mySecondHashMap.get(6));
        System.out.println(mySecondHashMap.get(61));


    }
}
