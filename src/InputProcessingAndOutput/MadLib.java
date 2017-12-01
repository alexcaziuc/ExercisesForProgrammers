package InputProcessingAndOutput;

/*Mad libs are a simple game where you create a story template
        with blanks for words. You, or another player, then
        construct a list of words and place them into the story, creating
        an often silly or funny story as a result.
        Create a simple mad-lib program that prompts for a noun,
        a verb, an adverb, and an adjective and injects those into a
        story that you create.

        Example Output
        Enter a noun: dog
        Enter a verb: walk
        Enter an adjective: blue
        Enter an adverb: quickly
        Do you walk your blue dog quickly? That's hilarious!

        Constraints
        • Use a single output statement for this program.
        • If your language supports string interpolation or string
        substitution, use it to build up the output.
*/

import java.util.Scanner;

public class MadLib {


    public static void main(String[] args) {

        String noun;
        String verb;
        String adjective;
        String adverb;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a noun: ");
        noun = input.nextLine();

        System.out.println("Enter a verb: ");
        verb = input.nextLine();

        System.out.println("Enter a adjective: ");
        adjective = input.nextLine();

        System.out.println("Enter a adverb ");
        adverb = input.nextLine();
        input.close();

        System.out.printf("Do you %s your %s %s %s? That's hilarious!", verb, adjective, noun, adverb);

    }
}
