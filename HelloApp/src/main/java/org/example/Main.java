package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how InteliJ IDEA suggests fixing it.
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            // Use StringBuilder for efficient string construction
            StringBuilder nameBuilder = new StringBuilder();
            boolean first = true;

            // Enhanced for loop (for-each) to iterate through arguments
            for (String name : args) {
                if (!first) {
                    nameBuilder.append(", ");
                }
                nameBuilder.append(name);
                first = false;
            }

            // Print the final greeting with the comma-separated list
            System.out.println("Hello, " + nameBuilder.toString() + "!");
        }
    }
}


