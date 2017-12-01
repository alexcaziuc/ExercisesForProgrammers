package RetirementCalculator;

/*Your computer knows what the current year is, which means
        you can incorporate that into your programs.You just have
        to figure out how your programming language can provide
        you with that information.

        Create a program that determines how many years you have
        left until retirement and the year you can retire. It should
        prompt for your current age and the age you want to retire
        and display the output as shown in the example that follows.

        Example Output
        What is your current age? 25
        At what age would you like to retire? 65
        You have 40 years left until you can retire.
        It's 2015, so you can retire in 2055.

        Constraints
        • Don’t hard-code the current year into your program.
        Get it from the system time via your programming language.

        Challenge
        • Handle situations where the program returns a negative
        number by stating that the user can already retire.
*/


import java.time.Year;
import java.util.Scanner;

public class RetirementCalculator {

    public static void main(String[] args) {

        retireCalculator();
    }

    private static void retireCalculator() {
        int retirementAge;
        int currentAge;
        int currentYear = Year.now().getValue();
        int whatAgeToRetire;
        int yearsLeft;

        Scanner input = new Scanner(System.in);

        System.out.print("What is your current age? ");
        currentAge = input.nextInt();

        System.out.print("At what age would you like to retire? ");
        whatAgeToRetire = input.nextInt();

        yearsLeft = whatAgeToRetire - currentAge;

        if (yearsLeft <= 0) {
            System.out.println("You can already retire ");
        } else {
            System.out.printf("You have %d years left until you can retire. ", yearsLeft);
            retirementAge = currentYear + yearsLeft;
            System.out.printf("\nIt's %d, so you can retire in %d, ", currentYear, retirementAge);
        }
    }
}
