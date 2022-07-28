
import java.util.Scanner;

public class Calculator {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Calculator");
        System.out.println("Please enter First number into the console");
        checkNumberOrString(sc);
        Double number1 = sc.nextDouble();
        System.out.println("Please input one the operand as '+ ,- ,* ,/ , % '");
        char OperationSymbol = sc.next().charAt(0);
        System.out.println("Please enter Second number into the console");
        checkNumberOrString(sc);
        Double number2 = sc.nextDouble();
        final String SUM = "+";
        final String SUBTRACTION = "-";
        final String MULTIPLICATION = "*";
        final String DIVISION = "/";
        final String MODULO = "%";
        if (OperationSymbol == '+') {
            System.out.println(number1 + " " + SUM + " " + number2 + " = " + (number1 + number2));
        } else if (OperationSymbol == '-') {
            System.out.println(number1 + " " + SUBTRACTION + " " + number2 + " = " + (number1 - number2));
        } else if (OperationSymbol == '/') {
            System.out.println(number1 + " " + DIVISION + " " + number2 + " = " + (number1 / number2));
        } else if (OperationSymbol == '*') {
            System.out.println(number1 + " " + MULTIPLICATION + " " + number2 + " = " + (number1 * number2));
        } else if (OperationSymbol == '%') {
            System.out.println("Result: " + number1 + " " + MODULO + " " + number2 + " = " + (number1 % number2));
        } else
            System.out.println("User inputs unsupported integer. Repeat please inputting one the operand as '+ ,- ,* ,/ , % ");
    }

    private static void checkNumberOrString(Scanner sc) {
        if (sc.hasNextDouble()) {
            System.out.println();
        } else {
            System.out.println("WRONG!User inputs unsupported integer.");
        }
        System.out.println(sc.hasNextDouble() ? "" : "WRONG!User inputs unsupported integer.");
    }
}