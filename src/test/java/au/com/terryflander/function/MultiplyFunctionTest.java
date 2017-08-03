package au.com.terryflander.function;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class MultiplyFunctionTest {

  @Test
  public void calculateResult() throws Exception {
    Assert.assertEquals(10, new MultiplyFunction().calculateResult(2,5), 0);
  }


}