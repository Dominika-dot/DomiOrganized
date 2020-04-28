package com.dominikawebsite.pluralsight;

import org.w3c.dom.ls.LSOutput;

public class ConditionalLogicLoopingAndArrays<myVals> {

    public void conditionalLogic() {
/*
greater than >
greater than or equal to >=
less than <
less than or equal to <=
equal to ==
not equal to !=
 */
// if statement
        int v1 = 10;
        int v2 = 40;
        if (v1 > v2)
            System.out.println("v1 is bigger");
        else if (v1 < v2)
            System.out.println("v2 is bigger");
        else
            System.out.println("v1 and v2 are equal");
//block statement - groups statements into a compound statement
        int a1 = 10, a2 = 4, diff; // initializing a2 int initialized variable and diff int variable (not initialized)
        if (a1 > a2) {
            diff = a1 - a2;
            System.out.println("a1 is bigger");
            System.out.println("diff");
        } else if (a2 > a1) {
            diff = a2 - a1;
            System.out.println("a2 is bigger");
            System.out.println(diff);
        } else
            System.out.println("a1 and a2 are equal");

//BLOCK STATEMENTS
        //variable declared within a block is not visible outside of the block
        float students = 0.0f;
        float rooms = 4.0f;
        if (students > 0.0f) {
            if (rooms > 0.0f)
                System.out.println(students / rooms);
            float avg = students / rooms; //variable not visible outside of the block
        } else
            System.out.println("No students");
        System.out.println();
//LOGICAL OPERATORS
        //and & -> true&true
        //or | -> false|true true|false true|true
        //exclusive or (XOR) ^ false^true true^false
        //negation ! false
        boolean done = false;
        if (!done) // done is false
            System.out.println("keep going");
//conditional and &&  true&&true
//conditional or || false||true true||--
//execute right-side if needed to determine the result

        int students2 = 150;
        int rooms2 = 0;
        if (rooms > 0 && students / rooms > 30) // if You use & then You get an error - You cannot divide by zero
            System.out.println("Crowded!!");

        System.out.println();
        System.out.println("** end program **");

        //WHILE LOOP
        int kVal = 5;
        int factorial = 1;
        while (kVal > 1) {
       /* factorial *= kVal;
        kVal-=1;*/
            factorial *= kVal--; // to jest w jednej linni w przeciwienstwie do tego na gorze
        }
        System.out.println("While loop: " + factorial);
        //DO WHILE LOOP
        int iVal = 1;
        do {
            System.out.print(iVal);
            System.out.print(" *2= ");
            iVal *= 2;
            System.out.println(iVal);
        } while (iVal < 100);
//FOR LOOP - more convenient than while loop
        for (int fVal = 1; fVal < 100; fVal *= 2)
            System.out.println(fVal);

    //ARRAYS - provides an ordered collection of elements;
//each element accessed via an index
//indexes range from 0 to number-of-elements minus 1
    float[] theVals = new float[3];
    theVals[0]=10.0f;
    theVals[1]=20.0f;
    theVals[2]=15.0f;
    float sum = 0.0f;
    for(
    int i = 0;
    i<theVals.length;i++)
    sum+=theVals[i];
        System.out.println("Array sum: "+sum);
//FOR-EACH LOOP - useful for arrays
     float[]anotherVals={10.0f,20.0f,15.0f};
     float newSum = 0.0f;
        System.out.println(theVals.hashCode());
        System.out.println(anotherVals.length);
     for(float currentVal:anotherVals) {
     newSum+=currentVal;
         System.out.println(currentVal);
     }
        System.out.println(newSum);
//SWITCH STATEMENT
        int switchVal=10;
        switch(switchVal%2){
            case 0:
                System.out.println(switchVal+" is even");
                break; // use break to avoid "falling through"
            case 1:
                System.out.println(switchVal+" is odd");
                break;
            default:
                System.out.println("oops it broke");
                break;
        }


}
}
