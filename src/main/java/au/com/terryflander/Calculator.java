package au.com.terryflander;

import au.com.terryflander.function.*;

public class Calculator {

  private static double operand1;
  private static double operand2;
  private static String operator;
  private static double result = 0;

  public static String calculateResult(String[] args) throws Exception {

    if (!validParameterCount(args)) {
      System.out.println("Calculator requires three arguments: Operand Operation Operand");
      throw new Exception("Invalid input parameters");
    }

    try {
      operand1 = getOperandFromArg(args[0]);
    } catch (Exception e) {
      System.out.println("Operand 1 Invalid: " + args[0]);
      throw e;
    }

    try {
      operand2 = getOperandFromArg(args[2]);
    } catch (Exception e) {
      System.out.println("Operand 2 Invalid: " + args[2]);
      throw e;
    }

    try {
      operator = args[1];
      CalculatorFunction o = FunctionMapping.getFunction(operator);
      result = o.calculateResult(operand1, operand2);
    } catch (Exception e) {
      System.out.println("Unrecognized Operator: " + operator);
      throw e;
    }

    return String.valueOf(result);
  }


  public static boolean validParameterCount(String[] args) {
    return args.length == 3 && args[0].length() > 0 && args[1].length() > 0 && args[2].length() > 0;
  }

  public static double getOperandFromArg(String arg) throws Exception {
    double result = 0;
    try {
      result = Double.valueOf(arg);
    } catch (Exception e) {
      throw e;
    }
    if (result < 0) {
      System.out.println("Negative Operands not allowed");
      throw new Exception("Negative Operands not allowed");
    }
    return result;
  }

}
