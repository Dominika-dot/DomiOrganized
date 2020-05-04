package com.dominikawebsite.pluralsight;

public class SimpleErrorHandling {
    public static void main(String[] args) {
        int i = 12;
        int j = 2;

        try{
            int result = i/(j-2);
            System.out.println(result);
        } catch (Exception e){
            System.out.println("Error: "+e.getMessage()); //Error: / by zero
            e.printStackTrace(); //java.lang.ArithmeticException: / by zero
            // at com.dominikawebsite.pluralsight.SimpleErrorHandling.main(SimpleErrorHandling.java:9)
        }
        System.out.println("Here program ends"); //program runs after catching an exception
    }
}
