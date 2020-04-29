package com.dominikawebsite.pluralsight.calcEngine;

public abstract class CalculateBase {

    /* ---WHY WE ARE DOING THIS INSTEAD OF SWITCH STATEMENT?--
    *The key difference is the idea of manageability and maintainability - localization of responsibility.
    * execute() method using switch is reasonably complex given the simple things that we're doing.
    * And it's this kind of code that easily breaks when you're enhancing or changing a program.
    * */

    private double leftVal;
    private double rightVal;
    private double result;
    //getters and setters
    public double getLeftVal(){return leftVal;};
    public double getRightVal(){return rightVal;}
    public double getResult(){return result;}
    public void setLeftVal(double leftVal){this.leftVal=leftVal;}
    public void setRightVal(double rightVal){this.rightVal=rightVal;}
    public void setResult(double result){this.result=result;}
    //constructors
    public CalculateBase(){}
    public CalculateBase(double leftVal,double rightVal){
        this.leftVal=leftVal;
        this.rightVal=rightVal;
    }
    public abstract void calculate();
}
