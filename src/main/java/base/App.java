/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Nicolas Milescu-Brahmbhatt
 */

package base;
import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args)  {
        App myApp = new App();

        String name = myApp.readname();

        String output = myApp.createOutput(name);
        myApp.printOutput(output);
    }

    public String readname() {
        System.out.println("What is your name? ");
        String name = in.nextLine();
        return name;
    }

    public String createOutput(String name) {
        return String.format("Hello, %s nice to meet you!", name);
    }

    public void printOutput(String outputString) {
        System.out.println(outputString);
    }
}
