package src.julia.dart.views;

import src.julia.dart.Utilities;

public class DartEmployeeMenuView {
    public void render() {
        System.out.println(Utilities.line() + "Employee Screen - Type one of the options below:\n" +
                "1. Register a game\n" +
                "2. Remove a game\n" +
                "3. Register a customer\n" +
                "4. Remove a customer\n" +
                "5. Show total rent profit\n" +
                "6. View all games\n" +
                "7. Return to Main Menu\n");
    }

    public void renderExit() {
        System.out.println("Returning to main menu.");
    }

    public void renderError() {
        System.out.println("Invalid selection, restarting...");
    }

    public Integer read() {
        Integer input = Utilities.intInput();

        return input;
    }
}
