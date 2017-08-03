package au.com.terryflander;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

  @Test(expected=Exception.class)
  public final void wrongNumberOfArguments() throws Exception {
    try {
      String[] args = new String[3];
      args[0] = "";
      args[1] = "";
      args[2] = "";
      Calculator.calculateResult(args);
    } catch (Exception e) {
      throw e;
    }
  }

  @Test
  public final void correctNumberOfArguments() throws Exception {
    try {
      String[] args = new String[3];
      args[0] = "2";
      args[1] = "+";
      args[2] = "2";
      Calculator.calculateResult(args);
      Assert.assertEquals("true", "true");
    } catch (Exception e) {
      throw e;
    }
  }

  @Test(expected=NumberFormatException.class)
  public final void invalidOperand1() throws Exception {
    try {
      String[] args = new String[3];
      args[0] = "abc";
      args[1] = "+";
      args[2] = "2";
      Calculator.calculateResult(args);
    } catch (Exception e) {
      throw e;
    }
  }

  @Test(expected=NumberFormatException.class)
  public final void invalidOperand2() throws Exception {
    try {
      String[] args = new String[3];
      args[0] = "1";
      args[1] = "+";
      args[2] = "xyz";
      Calculator.calculateResult(args);
    } catch (Exception e) {
      throw e;
    }
  }

  @Test(expected=Exception.class)
  public final void testForNegativeOperand() throws Exception {
    try {
      String[] args = new String[3];
      args[0] = "-1";
      args[1] = "+";
      args[2] = "2";
      Calculator.calculateResult(args);
    } catch (Exception e) {
      throw e;
    }
  }

  @Test
  public void checkOperands() throws Exception {
    try {
      String[] args = new String[3];
      args[0] = "2";
      args[1] = "+";
      args[2] = "2";
      Calculator.calculateResult(args);
      Assert.assertEquals("true", "true");
    } catch (Exception e) {
      throw e;
    }
  }

  @Test
  public void testAddFunction() throws Exception {
    String[] args = new String[3];
    args[0] = "2.0";
    args[1] = "+";
    args[2] = "2.0";

    Assert.assertEquals("4.0", Calculator.calculateResult(args));
  }

  @Test
  public void testSubtractFunction() throws Exception {
    String[] args = new String[3];
    args[0] = "2.0";
    args[1] = "-";
    args[2] = "2.0";

    Assert.assertEquals("0.0", Calculator.calculateResult(args));
  }

  @Test
  public void testMultiplyFunction() throws Exception {
    String[] args = new String[3];
    args[0] = "2.0";
    args[1] = "*";
    args[2] = "2.0";

    Assert.assertEquals("4.0", Calculator.calculateResult(args));
  }

  @Test
  public void testDivideFunction() throws Exception {
    String[] args = new String[3];
    args[0] = "2.0";
    args[1] = "/";
    args[2] = "2.0";

    Assert.assertEquals("1.0", Calculator.calculateResult(args));
  }

  @Test(expected=Exception.class)
  public void testInvalidFunction() throws Exception {
    try {
      String[] args = new String[3];
      args[0] = "2";
      args[1] = "Fred";
      args[2] = "2";
      Calculator.calculateResult(args);
    } catch (Exception e) {
      throw e;
    }
  }

}