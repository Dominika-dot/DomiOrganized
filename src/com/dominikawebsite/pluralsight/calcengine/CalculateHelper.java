package com.dominikawebsite.pluralsight.calcengine;

public class CalculateHelper {

    MathCommand command;
    double leftValue;
    double rightValue;
    double result;
    private static final char ADD_SYMBOL='+';
    private static final char SUBSTRACT_SYMBOL='-';
    private static final char MULTIPLY_SYMBOL ='*';
    private static final char DIVIDE_SYMBOL = '/';
    char symbol = ' ';

    public void process (String statement){
        //Add 1.0 2.0
        String[]parts = statement.split(" ");
        String commandString = parts[0]; // Add
        leftValue = Double.parseDouble(parts[1]); // 1.0
        rightValue = Double.parseDouble(parts[2]); // 2.0
        setCommandFromString(commandString);

        CalculateBase calculator = null;
        switch(command){
            case Add:
                calculator = new Adder(leftValue,rightValue);
                symbol = ADD_SYMBOL;
                break;
            case Substract:
                calculator = new Divider(leftValue,rightValue);
                symbol = DIVIDE_SYMBOL;
                break;
            case Multiply:
                calculator = new Multiplier(leftValue,rightValue);
                symbol = MULTIPLY_SYMBOL;
                break;
            case Divide:
                calculator=new Divider(leftValue,rightValue);
                symbol = DIVIDE_SYMBOL;
                break;
        }
        calculator.calculate();
        result = calculator.getResult();

    }
@Override
    public String toString(){
//using StringBuilder
        StringBuilder sb = new StringBuilder(20);
        sb.append(leftValue);
        sb.append(" ");
        sb.append(symbol);
        sb.append(" ");
        sb.append("=");
        sb.append(result);

        return sb.toString();
    }

    private void setCommandFromString(String commandString){
        // add -> MathCommand.Add
        if(commandString.equalsIgnoreCase(MathCommand.Add.toString())) //MathCommand.Add.toString() changes Add enum value to string Add
            command = MathCommand.Add;
        else if (commandString.equalsIgnoreCase(MathCommand.Substract.toString()))
            command = MathCommand.Substract;
        else if (commandString.equalsIgnoreCase(MathCommand.Multiply.toString()))
            command = MathCommand.Multiply;
        else if (commandString.equalsIgnoreCase(MathCommand.Divide.toString()))
            command = MathCommand.Divide; //translate into enumeration
    }


}
