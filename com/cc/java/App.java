package com.cc.java;

import java.util.ArrayList;

public class App {
    
    public static void main(String[] args) {

       
        // Cat cat = new Cat("Grizabella");
        // Cat cat = new Cat("Grizabella");
        // Cat cat = new Cat("Grizabella");
        // Cat cat = new Cat("Grizabella");

        String [] nameArr = {"Grizabella","Rum Tum Tugger","Alonzo","Suzanne"};
        ArrayList <Cat> ObjList = new ArrayList<>();

    
        for (int i = 0; i < nameArr.length; i++) {
            // new Cat(nameArr[i]);
            ObjList.add(new Cat(nameArr[i]));

            
        }
        output("Cats: " + ObjList);
        output(ObjList.get(0).getAttributes());
     
    }

    public static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

