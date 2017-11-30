package SimpleMath;

/*You’ll often write programs that deal with numbers. And
        depending on the programming language you use, you’ll
        have to convert the inputs you get to numerical data types.
        Write a program that prompts for two numbers. Print the
        sum, difference, product, and quotient of those numbers as
        shown in the example output:

        Example Output
        What is the first number? 10
        What is the second number? 5
        10 + 5 = 15
        10 - 5 = 5
        10 * 5 = 50
        10 / 5 = 2

        Constraints
        • Values coming from users will be strings. Ensure that
        you convert these values to numbers before doing the
        math.
        • Keep the inputs and outputs separate from the numerical
        conversions and other processing.
        • Generate a single output statement with line breaks in
        the appropriate spots.

        Challenges
        • Revise the program to ensure that inputs are entered as
        numeric values. Don’t allow the user to proceed if the
        value entered is not numeric.
        • Don’t allow the user to enter a negative number.
        • Break the program into functions that do the computations.
*/

import java.util.Scanner;

public class SimpleMath {

    public static void main(String[] args) {

        double firstNumber, secondNumber;
        double sum, difference, product, quotient;
        Scanner input = new Scanner(System.in);

        firstNumber = enterNumber("Enter first number: ", input);
        secondNumber = enterNumber("Enter second number ", input);

        sum = add(firstNumber, secondNumber);
        difference = subtract(firstNumber, secondNumber);
        product = multiply(firstNumber, secondNumber);
        quotient = divide(firstNumber, secondNumber);

        System.out.printf("%1.0f + %1.0f = %1.0f\n%1.0f - %1.0f = %1.0f\n%1.0f * %1.0f = %1.0f\n%1.0f / %1.0f = %1.0f\n",
                firstNumber, secondNumber, sum,
                firstNumber, secondNumber, difference,
                firstNumber, secondNumber, product,
                firstNumber, secondNumber, quotient);
    }

    private static double enterNumber(String messageToPrint, Scanner input) {
        boolean isNumericalPositiveNumber = true;
        String numberText;
        double number = 0;

        do {
            try {
                System.out.print(messageToPrint);
                numberText = input.nextLine();
                number = Double.parseDouble(numberText);

                if (number <= 0) {
                    isNumericalPositiveNumber = false;
                    System.out.println("Enter a positive number! ");
                }

            } catch (NumberFormatException ex) {
                isNumericalPositiveNumber = false;
                System.out.println("Enter a numeric value to proceed! ");
            }

        } while (number <= 0 && isNumericalPositiveNumber == false);

        return number;
    }

    private static double add(double a, double b) {
        double sum;
        sum = a + b;

        return sum;
    }

    private static double subtract(double a, double b) {
        double difference;
        difference = a - b;

        return difference;
    }

    private static double multiply(double a, double b) {
        double product;
        product = a * b;

        return product;
    }

    private static double divide(double a, double b) {
        double quotient;
        quotient = a / b;

        return quotient;
    }
}