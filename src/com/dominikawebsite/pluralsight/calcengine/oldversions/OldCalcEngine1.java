package com.dominikawebsite.pluralsight.calcengine.oldversions;

public class OldCalcEngine1 {

    void calculate(char opCode){
        double val1=100.0d, val2=50.0d, result;

        if (opCode =='a')
            result = val1+val2;
        else if(opCode =='s')
            result = val1-val2;
        else if (opCode =='d') {
            result = val2 != 0.0d ? (val1 / val2) : 0.0d;
/*        if (val2 !=0.0d) -> to jest nieporzebne, linijka poprzednia wszystko ogarnia
            result=val1/val2;
        else
            result =0.0d;
 */
        }
        else if (opCode=='m')
            result = val1*val2;
        else {
            System.out.println("Error - invalid opCode");
            result = 0.0d;
        }
        System.out.println(result);

    }
}
