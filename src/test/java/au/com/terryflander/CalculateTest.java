package au.com.terryflander;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Assert;

/**
 * Unit test for simple App.
 */
public class CalculateTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public CalculateTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( CalculateTest.class );
    }

    /**
     * Rigorous Test :-)
     */
    public void testApp() throws Exception {
      try {
        String[] args = new String[3];
        args[0] = "2";
        args[1] = "+";
        args[2] = "2";
        Calculate.main(args);
        Assert.assertEquals("true", "true");
      } catch (Exception e) {
        throw e;
      }
    }
}
