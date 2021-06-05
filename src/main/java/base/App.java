package base;
import java.util.Scanner;

/*
Create a program that prompts for your name and prints a greeting using your name.

Example Output
What is your name? Brian
Hello, Brian, nice to meet you!
Constraint
Keep the input, string concatenation, and output separate.
Challenges
Write a new version of the program without using any variables.
Write a version of the program that displays different greetings for different people.
Write a version of the program that displays the greeting in a GUI window.
 */

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args)  {
        App myApp = new App();

        System.out.println("What is your name? ");
        String name = in.nextLine();

        String output = myApp.createOutput(name);
        myApp.printOutput(output);
    }

    public String createOutput(String name) {
        return String.format("Hello, %s nice to meet you!", name);
    }

    public void printOutput(String outputString) {
        System.out.println(outputString);
    }


}
