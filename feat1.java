public class feat1 {

    public static void main(String[] args) {

        System.out.println("Initiliazing DART . . .\n");

        /* EXPLANATIONS AND MORE:
         * every time the user can type in an integer or character to select their next step is called a menu.
         They are named like "xMenu"; e.g. "mainMenu" and "customerMenu".
         * default for switch cases should always return the user to the same page.
         * the class called "extra" has various methods we can use, such as 'stringInput' to replace
           the usual input.nextLine
                        */

        // Starts the main menu.
        mainMenu();


    }

    public static void mainMenu() {

        System.out.println(extra.line() + "Main Menu:\n" +
                "Welcome to DART, your good old game rental system. The competition has no steam to keep up!\n" +
                "\n" +
                "Please specify your role by entering one of the options given:\n" +
                "1. Enter “M” for Manager \n" + //Password = "admin1234"
                "2. Enter “E” for Employee \n" + //Password = "password123"
                "3. Enter “C” for Customer\n" +
                "4. Enter “X” to exit system \n");



        String mainMenuSelect = extra.stringInput();



        switch (mainMenuSelect) {
            case "M" -> {
                System.out.println("Type in the password:");
                String passwordInput = extra.stringInput();

                if (passwordInput.equals("admin1234")) {
                    System.out.println("Successfuly logged in.");
                    managerMenu();
                } else {
                    System.out.println("Invalid Password");
                    mainMenu();
                }
            }
            case "E" -> {
                System.out.println("Type in the password:");
                String passwordInput = extra.stringInput();

                if (passwordInput.equals("password123")) {
                    System.out.println("Successfuly logged in.");
                    employeeMenu();
                } else {
                    System.out.println("Invalid Password");
                    mainMenu();
                }
            }
            case "C" -> {
                customerMenu();
            }
            case "X" -> {
                System.out.println("Thank you for using DART, goodbye!");
                extra.closeScanner();
            }
            default -> {
                System.out.println("Invalid selection, restarting...");
                mainMenu();
            }
        }
    }

    public static void managerMenu() {
        System.out.println(extra.line() + "Manager Screen - Type one of the options below:\n" +
                "1. Add an employee\n" +
                "2. View all employees\n" +
                "3. Return to Main Menu\n");
        int menuSelect = extra.intInput();


        switch (menuSelect) {
            case 1 -> {
                // Add an employee
                // feat2.option1
            }
            case 2 -> {
                // View all employees
                // feat2.option2
            }
            case 3 -> {
                System.out.println("Returning to main menu.");
                mainMenu();
                // Return to main menu
            }
            default -> {
                System.out.println("Invalid selection, restarting...");
                managerMenu();
            }
        }
    }

    public static void employeeMenu() {
        System.out.println(extra.line() + "Employee Screen - Type one of the options below:\n" +
                "1. Register a game\n" +
                "2. Remove a game\n" +
                "3. Register a customer\n" +
                "4. Remove a customer\n" +
                "5. Show total rent profit\n" +
                "6. View all games\n" +
                "7. Return to Main Menu\n");
        int menuSelect = extra.intInput();


        switch (menuSelect) {
            case 1 -> {
                // Register a game
                // feat3.option1();
            }
            case 2 -> {
                // Remove a game
                // feat3.option2();
            }
            case 3 -> {

            }
            case 4 -> {

            }
            case 5 -> {

            }
            case 6 -> {

            }
            case 7 -> {
                System.out.println("Returning to main menu.");
                mainMenu();
                // Return to main menu
            }
            default -> {
                System.out.println("Invalid selection, restarting...");
                employeeMenu();
            }

        }
    }
    public static void customerMenu() {
        System.out.println(extra.line() + "Customer Screen - Type one of the options below:\n" +
                "1. Rent a game\n" +
                "2. Return a game\n" +
                "3. Return to Main Menu\n");
        int menuSelect = extra.intInput();


        switch (menuSelect) {
            case 1 -> {

            }
            case 2 -> {

            }
            case 3 -> {
                System.out.println("Returning to main menu.");
                mainMenu();
                // Return to main menu ?? twice main menu
            }
            default -> {
                System.out.println("Invalid selection, restarting...");
                customerMenu();

            }
        }
    }
}
