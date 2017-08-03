# eci-java-assignment
The application Calculator is designed to provide an extendable 'back-end' calculator to support a browser-based front end.
 
This design implements a self-mapping function package. Classes in this package implement the required calculation logic by implementing the CalculatorFunction interface. The mapping between the Operand value and the Function is managed in the FunctionMapping class. To implement new functions, add the required new Interface implementation and upate the map.
 
All the included functions are binary and require two operands to work properly. Unary functions such as SIN and COSINE would simply ignore the second operand.  

### Install

1. Clone or Download from GitHub
2. Unpack in `<work-directory>`
3. `cd to <work-directory>/eci-java-assignment
4. `mvn clean package`

This will compile the source and run the test programs.

### Run

The main method in the Calculate class requires three arguments separated by spaces: Operand Operator Operand. If there are not exactly three arguments, the correct usage message will display.

Various output messages will indicate if the request does not meet the required specifications, otherwise the result will be displayed in the Console.

The build will create a Jar in:
 
 `<work-directory>/eci-java-assignmane/target`

Run with:

```
java -jar target/calculate-1.0.jar 25 / 5
java -jar target/calculate-1.0.jar 2 + 2
java -jar target/calculate-1.0.jar 333 - 111
java -jar target/calculate-1.0.jar 2 \* 100
```

Note that the multiply symbol above must be escaped from the command line.
