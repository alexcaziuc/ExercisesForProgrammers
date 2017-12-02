package Calculations;

import java.util.Scanner;

/*When working in a global environment, you’ll have to
        present information in both metric and Imperial units. And
        you’ll need to know when to do the conversion to ensure
        the most accurate results.

        Create a program that calculates the area of a room. Prompt
        the user for the length and width of the room in feet. Then
        display the area in both square feet and square meters.

        Example Output

        What is the length of the room in feet? 15
        What is the width of the room in feet? 20
        You entered dimensions of 15 feet by 20 feet.
        The area is
        300 square feet
        27.871 square meters

        The formula for this conversion is
        m2 = f2 × 0.09290304

        Constraints
        • Keep the calculations separate from the output.
        • Use a constant to hold the conversion factor.

        Challenges
        • Revise the program to ensure that inputs are entered as
        numeric values. Don’t allow the user to proceed if the
        value entered is not numeric.
*/
public class AreaOfARectangularRoom {

    private final static double constantConversionFactor = 0.09290304;

    public static void main(String[] args) {

        double lengthFeetInput, widthFeetInput;
        double resultAreaInSquareFeet;
        double resultAreaInSquareMeters;

        lengthFeetInput = enterDimensions("What is the length of the room in feet? ");

        widthFeetInput = enterDimensions("What is the width of the room in feet? ");

        System.out.printf("You entered dimensions of %1.0f feet by %1.0f feet.", lengthFeetInput, widthFeetInput);

        resultAreaInSquareFeet = squareFeet(lengthFeetInput, widthFeetInput);
        resultAreaInSquareMeters = squareMeter(lengthFeetInput, widthFeetInput);

        System.out.printf("\nThe area is\n%1.0f square feet\n%1.3f square meters ", resultAreaInSquareFeet, resultAreaInSquareMeters);

    }

    private static double enterDimensions(String messageToPrint) {
        boolean isNumericalPositiveNumber = true;
        double lengthOrWidth = 0;

        Scanner input = new Scanner(System.in);

        do {
            try {
                System.out.print(messageToPrint);
                lengthOrWidth = Double.parseDouble(input.nextLine());

                if (lengthOrWidth <= 0) {
                    isNumericalPositiveNumber = false;
                    System.out.println("Enter a positive number! ");
                }

            } catch (IllegalArgumentException ex) {
                isNumericalPositiveNumber = false;
                System.out.println("Enter a numeric value to proceed! ");

            }

        } while (lengthOrWidth <= 0 && !isNumericalPositiveNumber);

        return lengthOrWidth;
    }

    private static double squareFeet(double lengthFeet, double widthFeet) {
        double AreaInSquareFeet;

        AreaInSquareFeet = lengthFeet * widthFeet;

        return AreaInSquareFeet;
    }

    private static double squareMeter(double lengthFeet, double widthFeet) {
        double AreaInSquareFeet;
        double AreaInSquareMeters;

        AreaInSquareFeet = squareFeet(lengthFeet, widthFeet);

        AreaInSquareMeters = AreaInSquareFeet * constantConversionFactor;

        return AreaInSquareMeters;
    }
}
