package CountingNrOfChars;

/*Create a program that prompts for an input string and displays
        output that shows the input string and the number of
        characters the string contains.

        Example Output
        What is the input string? Homer
        Homer has 5 characters.

        Constraints
        • Be sure the output contains the original string.
        • Use a single output statement to construct the output.
        • Use a built-in function of the programming language to
        determine the length of the string.

        Challenges
        • If the user enters nothing, state that the user must enter
        something into the program.
*/

import java.util.Scanner;

public class CountingNrOfChars {

    public static void main(String[] args) {

        String originalString;

        Scanner input = new Scanner(System.in);

        System.out.println("What is the input string?");
        originalString = input.nextLine();

        int length = originalString.length();

        if (originalString.isEmpty())
        {

            System.out.println("You must enter something into the program");
        } else
            {

            System.out.println(originalString + " has " + length + " characters.");
            }
    }
}
