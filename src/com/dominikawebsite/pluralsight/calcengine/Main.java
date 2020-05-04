package com.dominikawebsite.pluralsight.calcengine;

public class Main {
    public static void main(String[] args) {
        System.out.println("******* CZESC TOSIEK");


        System.out.println("*** Using inheritance ***");

        CalculateBase[]calculators = {
                new Divider(100.0d, 50.0d),
                new Adder(25.0d,92.0d),
                new Substracter(225.0d,17.0d),
                new Multiplier(11.0d,3.0d)
        };
        for(CalculateBase calculator:calculators){
            calculator.calculate();
            System.out.println("result="+calculator.getResult());
        }
        System.out.println("*** USING STRINGS ***");
        String [] statements = {
                "divide 100.0 50.0",
                "add 25.0 92.0",
                "substract 225.0 17.0",
                "multiply 11.0 3.0"
        };


        CalculateHelper helper = new CalculateHelper();
        for(String statement:statements){
            helper.process(statement);
            System.out.println(helper.toString());
        }


    }
}
