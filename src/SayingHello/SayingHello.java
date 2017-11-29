package SayingHello;

/*The “Hello, World” program is the first program you learn
to write in many languages, but it doesn’t involve any input.

So create a program that prompts for your name and prints
a greeting using your name.

        Example Output
        What is your name? Brian
        Hello, Brian, nice to meet you!

        Constraint
        • Keep the input, string concatenation, and output separate.*/

import java.util.Scanner;

public class SayingHello {

    public static void main(String[] args) {

        String name;

        Scanner inputName = new Scanner(System.in);

        System.out.println("What is your name?");
        name = inputName.nextLine();

        System.out.print("Hello, ");
        System.out.print(name);
        System.out.println(", nice to meet you!");

    }
}
