package au.com.terryflander.function;

import java.util.HashMap;
import java.util.Map;

public class FunctionMapping {

  private static final Map<String, String> functionMap = createMap();
  private static Map<String, String> createMap()
  {
    Map<String,String> functionMap = new HashMap<String,String>();
    functionMap.put("+", "Add");
    functionMap.put("-", "Subtract");
    functionMap.put("*", "Multiply");
    functionMap.put("/", "Divide");
    return functionMap;
  }

  public static CalculatorFunction getFunction(String operator) throws Exception {
    CalculatorFunction result = null;
    try {
      String functionName = functionMap.get(operator);
      result = (CalculatorFunction)
          Class.forName("au.com.terryflander.function." + functionName + "Function").newInstance();
    } catch (Exception e) {
      throw e;
    }
    return result;

  }
}
