package com.dominikawebsite.pluralsight.calcEngine;

public class CalcEngineMain {

    public static void main(String[] args) {

        MathEquation[] equations = new MathEquation[4];
        /*equations[0] = create(100.0d, 50.0d, 'd');
        equations[1] = create(25.0d,92.0d,'a');
        equations[2] = create(225.0d,17.0d,'s');
        equations[3] = create(11.0d,3.0d,'m');*/
        equations[0] = new MathEquation('d', 100.d, 50.0d);
        equations[1] = new MathEquation('a', 25.0d, 92.0d);
        equations[2] = new MathEquation('s', 225.0d, 17.0d);
        equations[3] = new MathEquation('m', 11.0d, 3.0d);

        for (MathEquation equation : equations) {
            equation.execute();
            System.out.println("result = " + equation.getResult());
        }
        System.out.println("\nUsing Overloads\n");
        double leftDouble = 9.0d;
        double rightDouble = 4.0d;
        int leftInt = 9;
        int rightInt = 4;
        MathEquation equationOverload = new MathEquation('d');
        equationOverload.execute(leftDouble, rightDouble);
        System.out.println("result=" + equationOverload.getResult());

        equationOverload.execute(leftInt, rightInt);//system can convert int to double (widening conversion)
        System.out.println("result=" + equationOverload.getResult());

        equationOverload.execute((double)leftInt, rightInt);//it will get double, double parameters function
        System.out.println("result=" + equationOverload.getResult());

    }
        /*zmiana w wersji 5 po dodaniu konstruktorow
        public static MathEquation create(double leftVal, double rightVal, char opCode){
            MathEquation equation = new MathEquation();
            wersja 3 to byly pola
            equation.leftVal = leftVal;
            equation.rightVal = rightVal;
            equation.opCode = opCode;
            equation.setLeftVal(leftVal);
            equation.setRightVal(rightVal);
            equation.setOpCode(opCode);
            return equation;
        }*/
}
