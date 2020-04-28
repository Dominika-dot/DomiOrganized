package com.dominikawebsite.pluralsight;

public class MathOperators {

    public void calculate() {
        int myVar;
        myVar = 50;
        System.out.println(myVar); //50

        int anotherVar = 100;
        System.out.println(anotherVar); //100

        myVar = anotherVar;
        System.out.println(myVar); //100

        anotherVar = 200;
        System.out.println(anotherVar); //200
        System.out.println(myVar); //100
        //Basic operators
        int a = 13;
        long b = 5l;
        float c = 13.0f;
        double d = 5.0d;
        System.out.println("INT 13 AND LONG 5");
        System.out.println("a+b: " + (a + b) + ";\n a-b: " + (a - b) + ";\n a*b: " + (a * b) + ";\n a/b: " + (a / b) + ";\n a%b: " + (a % b) + ";");
        System.out.println("FLOAT 13.0 AND DOUBLE 5.0");
        System.out.println("c+d: " + (c + d) + ";\n c-d: " + (c - d) + ";\n c*d: " + (c * d) + ";\n c/d: " + (c / d) + ";\n c%d: " + (c % d) + ";");
//modulus - reszta z dzielenia

        int myVal = 5;
        System.out.println(++myVal);
        System.out.println(myVal);
        int anotherVal = 5;
        System.out.println(anotherVal++);
        System.out.println(anotherVal);

// compound assignment operators
        int compVal = 50;
        compVal -=5;
        System.out.println(compVal);
        int result = 100;
        int val1=5;
        int val2=10;
        result/=val1*val2;
        System.out.println(result);

        int valA=21;
        int valB=6;
        int valC=3;
        int valD=1;
        int result1 = valA-valB/valC;
        int result2=(valA-valB)/valC;
        System.out.println("21-6/3: "+result1);
        System.out.println("(21-6)/3: "+result2);
        int result3 = valA/valC*valD+valB;
        int result4=valA/(valC*(valD+valB));
        System.out.println("21/3*1+6: "+result3);
        System.out.println("21/(3*(1+6)): "+result4);
//Type conversion
        float floatVal = 1.0f;
        double doubleVal =4.0d;
        byte byteVal = 7;
        short shortVal = 7;
        long longVal = 5;
        short resultConv=byteVal; // widening explicitly
        short resultConv2=(short)longVal; //narrowing non explicitly
        short resultConv3 = (short) (byteVal - longVal); // another non explicit narrowing
        float resultConv4=longVal-floatVal; //widening explicitly
        long resultConv5=(long) (shortVal - longVal + floatVal + doubleVal);
        System.out.println("Success");
    }
}
