package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how InteliJ IDEA suggests fixing it.
        String greeting;

        // Check if arguments are provided
        if (args.length == 0) {
            greeting = "Hello, World!";
        } else {
            // Join all arguments with a comma and space
            // String.join handles the logic so no trailing comma is added
            String names = String.join(", ", args);
            greeting = "Hello, " + names + "!";
        }

        // Print the final greeting
        System.out.println(greeting);
    }
}