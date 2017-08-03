package au.com.terryflander.function;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by terryflander on 3/08/2017.
 */
public class SubtractFunctionTest {

  @Test
  public void calculateResult() throws Exception {
    Assert.assertEquals(0, new SubtractFunction().calculateResult(2,2), 0);
  }

}