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
            StringBuilder nameBuilder = new StringBuilder();

            // Use an enhanced for loop to iterate through names
            for (String name : args) {
                // Append name followed by the delimiter
                nameBuilder.append(name).append(", ");
            }

            // Remove the trailing delimiter (", ") using substring
            // We check length > 0 to be safe, though args.length > 0 ensures this here
            String finalNames = nameBuilder.substring(0, nameBuilder.length() - 2);

            // Print the final formatted greeting
            System.out.println("Hello, " + finalNames + "!");
        }
    }
}


