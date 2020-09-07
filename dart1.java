public class dart1 {
    public static void main(String[] args) {

        System.out.println("Initiliazing DART . . .\n");
        String longline = "-------------------------------------------------------\n";

        // calls for the mainMenu function
        mainMenu(longline);


    }

    public static void mainMenu(String longline) {
        Scanner input = new Scanner(System.in);
        // input.close(); -> will be put at the end.

        System.out.println(longline + "Main Menu:\n" +
                "Welcome to DART, your good old game rental system. The competition has no steam to keep up!\n" +
                "\n" +
                "Please specify your role by entering one of the options given:\n" +
                "1. Enter “M” for Manager \n" +
                "2. Enter “E” for Employee \n" +
                "3. Enter “C” for Customer\n" +
                "4. Enter “X” to exit system \n");


        String mainMenuSelect = input.nextLine();

        switch (mainMenuSelect) {
            case "M" -> {System.out.println("Manager!");}
            case "E" -> {System.out.println("Employee!");}
            case "C" -> {System.out.println("Customer!");}
            case "X" -> {System.out.println("Goodbye!");}
            default -> {System.out.println("Invalid selection, restarting..."); mainMenu(longline);}
        }
    }
}
