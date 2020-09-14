import java.util.Scanner;

public class extra {
    private static Scanner scan = new Scanner(System.in);
    public static int intInput () {
        int value;
        value = scan.nextInt();
        scan.nextLine();
        return value;
    }
    public static String stringInput () {
        return scan.nextLine();
    }
    public static void closeScanner() {
        scan.close();
    }
    public static String line() {
        return "--------------------------------------------------------------------------------------------------------\n";
    }
}
