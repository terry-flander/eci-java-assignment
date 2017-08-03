package au.com.terryflander.function;

public class DivideFunction implements CalculatorFunction {

  @Override
  public double calculateResult(double operand1, double operand2) {
    return operand1 / operand2;
  }

}
