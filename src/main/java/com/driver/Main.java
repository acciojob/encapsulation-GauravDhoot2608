package com.driver;

public class Main {

    public static void main(String[] args) {

        RWOnly rwOnly = new RWOnly();

        // rwOnly.name is not accesible in this class due to encapsulation

        rwOnly.setName("Gaurav");

        String name = rwOnly.getName();
    }
  
}