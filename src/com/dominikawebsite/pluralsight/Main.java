package com.dominikawebsite.pluralsight;

import com.dominikawebsite.pluralsight.calcEngine.oldVersions.OldCalcEngine1;
import com.dominikawebsite.pluralsight.calcEngine.oldVersions.OldCalcEngineWithArraysLopsAndSwitchv2;
import com.dominikawebsite.pluralsight.flight.Flight;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello Get Organized");
        System.out.println();
        System.out.println("*** MATH OPERATORS ***");
        MathOperators operator = new MathOperators();
   //     operator.calculate();
   //     System.out.println("*** CALC ENGINE ***");
        OldCalcEngine1 engine = new OldCalcEngine1();
  //      engine.calculate('a');
  //      System.out.println("*** CONDITIONAL LOGIC LOOPING AND ARRAYS ***");
        ConditionalLogicLoopingAndArrays loopingAndArrays = new ConditionalLogicLoopingAndArrays();
  //      loopingAndArrays.conditionalLogic();
        System.out.println("*** CALC ENGINE WITH ARRAYS LOOPING AND SWITCH ***");
        OldCalcEngineWithArraysLopsAndSwitchv2 andSwitch = new OldCalcEngineWithArraysLopsAndSwitchv2();
        andSwitch.calculate();
        System.out.println("^^^ FLIGHT ^^^");
        Flight myFlight = new Flight();
        myFlight.creatingNewFlight();

    }
}
