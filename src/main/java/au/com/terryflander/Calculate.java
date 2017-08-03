package au.com.terryflander;

/**
 * Applet to Run Calculator from Command Line
 *
 */
class Calculate {

  public static void main(String[] args) {
    try {
      if (args.length != 3) {
        System.err.println("Calculate: operand operator operand");
        System.exit(1);
      } else {
        Calculator calc = new Calculator();
        System.out.println(calc.calculateResult(args));
      }
    } catch (Exception e) {
      // e.printStackTrace();
    }
  }
}
