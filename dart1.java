import java.util.Scanner;


public class dart1 {
    public static void main(String[] args) {

        System.out.println("Initiliazing DART . . .\n");
        String longline = "-------------------------------------------------------\n";
        Scanner input = new Scanner(System.in);

        /* EXPLANATIONS AND MORE:
         * every time the user can type in an integer or character to select their next step is called a menu.
         They are named like "xMenu"; e.g. "mainMenu" and "customerMenu".
         * 'longline' is a string filled with a large line (----), used at the start of every new menu
         * Every function needs to include 'longline' and 'input' in order for them to make us of them.
         * For the switch cases we use the integer called 'menuSelect'
         * default for switch cases should always return the user to the same page.
         * After every input.nextInt() we have to add a input.nextLine() to avoid glitches
         * input.close(); -> will be put at the end.

                        */

        // Starts the main menu.
        mainMenu(longline, input);

    }

    public static void mainMenu(String longline, Scanner input) {

        System.out.println(longline + "Main Menu:\n" +
                "Welcome to DART, your good old game rental system. The competition has no steam to keep up!\n" +
                "\n" +
                "Please specify your role by entering one of the options given:\n" +
                "1. Enter “M” for Manager \n" + //Password = "admin1234"
                "2. Enter “E” for Employee \n" + //Password = "password123"
                "3. Enter “C” for Customer\n" +
                "4. Enter “X” to exit system \n");
        String mainMenuSelect = input.nextLine();

        switch (mainMenuSelect) {
            case "M" -> {
                System.out.println("Type in the password:");
                String passwordInput = input.nextLine();

                if (passwordInput.equals("admin1234")) {
                    System.out.println("Successfuly logged in.");
                    managerMenu(longline, input);
                } else {
                    System.out.println("Invalid Password");
                    mainMenu(longline, input);
                }
            }
            case "E" -> {
                System.out.println("Type in the password:");
                String passwordInput = input.nextLine();

                if (passwordInput.equals("password123")) {
                    System.out.println("Successfuly logged in.");
                    employeeMenu(longline, input);
                } else {
                    System.out.println("Invalid Password");
                    mainMenu(longline, input);
                }
            }
            case "C" -> {
                customerMenu(longline, input);
            }
            case "X" -> {
                System.out.println("Thank you for using DART, goodbye!");
            }
            default -> {
                System.out.println("Invalid selection, restarting...");
                mainMenu(longline, input);
            }
        }
    }

    public static void managerMenu(String longline, Scanner input) {
        System.out.println(longline + "Manager Screen - Type one of the options below:\n" +
                "1. Add an employee\n" +
                "2. View all employees\n" +
                "3. Return to Main Menu\n");
        int menuSelect = input.nextInt();
        input.nextLine(); // without this it triggers main menu twice.


        switch (menuSelect) {
            case 1 -> {
                System.out.println("Add an employee!");
                // Add an employee
            }
            case 2 -> {
                System.out.println("Employee!");
                // View all employees
            }
            case 3 -> {
                System.out.println("Returning to main menu.");
                mainMenu(longline, input);
                // Return to main menu
            }
            default -> {
                System.out.println("Invalid selection, restarting...");
                managerMenu(longline, input);
            }
        }
    }

    public static void employeeMenu(String longline, Scanner input) {
        System.out.println(longline + "Employee Screen - Type one of the options below:\n" +
                "1. Register a game\n" +
                "2. Remove a game\n" +
                "3. Register a customer\n" +
                "4. Remove a customer\n" +
                "5. Show total rent profit\n" +
                "6. View all games\n" +
                "7. Return to Main Menu\n");
        int menuSelect = input.nextInt();
        input.nextLine();


        switch (menuSelect) {
            case 1 -> {
                System.out.println(" ");
            }
            case 2 -> {
                System.out.println(" ");
            }
            case 3 -> {
                System.out.println(" ");
            }
            case 4 -> {
                System.out.println(" ");
            }
            case 5 -> {
                System.out.println(" ");
            }
            case 6 -> {
                System.out.println(" ");
            }
            case 7 -> {
                System.out.println("Returning to main menu.");
                mainMenu(longline, input);
                // Return to main menu
            }
            default -> {
                System.out.println("Invalid selection, restarting...");
                employeeMenu(longline, input);
            }

        }
    }
    public static void customerMenu(String longline, Scanner input) {
        System.out.println(longline + "Customer Screen - Type one of the options below:\n" +
                "1. Rent a game\n" +
                "2. Return a game\n" +
                "3. Return to Main Menu\n");
        int menuSelect = input.nextInt();
        input.nextLine();


        switch (menuSelect) {
            case 1 -> {
                System.out.println(" ");
            }
            case 2 -> {
                System.out.println(" ");
            }
            case 3 -> {
                System.out.println("Returning to main menu.");
                mainMenu(longline, input);
                // Return to main menu ?? twice main menu
            }
            default -> {
                System.out.println("Invalid selection, restarting...");
                customerMenu(longline, input);

            }
        }
    }
}
