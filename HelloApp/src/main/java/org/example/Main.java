package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how InteliJ IDEA suggests fixing it.
                String name;

                // Check if command-line arguments were provided
                if (args.length > 0) {
                    // Use StringBuilder to efficiently join multiple names
                    StringBuilder nameBuilder = new StringBuilder();
                    for (int i = 0; i < args.length; i++) {
                        nameBuilder.append(args[i]);
                        // Add a comma and space if it's not the last element
                        if (i < args.length - 1) {
                            nameBuilder.append(", ");
                        }
                    }
                    name = nameBuilder.toString();
                } else {
                    // Default value if no arguments are passed
                    name = "World";
                }

                // Display the final greeting
                System.out.println("Hello, " + name + "!");
            }
        }


