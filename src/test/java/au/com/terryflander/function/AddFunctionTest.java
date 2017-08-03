package au.com.terryflander.function;

import static org.junit.Assert.*;

import au.com.terryflander.Calculator;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by terryflander on 3/08/2017.
 */
public class AddFunctionTest {

  @Test
  public void calculateResult() throws Exception {
    Assert.assertEquals(4, new AddFunction().calculateResult(2,2), 0);
  }

}