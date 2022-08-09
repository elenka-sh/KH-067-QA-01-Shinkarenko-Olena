import java.util.Scanner;
public class CalculatorSwitch {

    public static void main(String[] args) {
        double a, b, result; // Declaring a variables
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first number value:");
        a = s.nextDouble(); // getting values from user...
        System.out.print("Enter any operator (+, -, *, /, %)  ");
        char operation = s.next().charAt(0); // taking operator
        System.out.println("Enter second number value:");
        b = s.nextDouble();
        switch (operation) // using switch case to create Caluclator
        {
            case '+':
                result = a + b;
                break;    // condition for addition

            case '-':
                result = a - b;
                break; // condition for subtraction

            case '*':
                result = a * b;
                break; // condition for Multiplicatin

            case '/':
                result = a / b;
                break; // condition for Divison

            case '%':
                result = a % b;
                break; // condition for Module

            default:
                System.out.printf("You have entered wrong operator or value");
                return;
        }

        System.out.println(a + " " + operation + " " + b + " = " + result);

    }
}