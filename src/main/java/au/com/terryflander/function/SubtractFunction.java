package au.com.terryflander.function;

public class SubtractFunction implements CalculatorFunction {

  @Override
  public double calculateResult(double operand1, double operand2) {
    return operand1 - operand2;
  }

}
