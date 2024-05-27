package dnekh.telegabot.model;

import dnekh.telegabot.enums.MenuOptions;

import java.util.List;
import java.util.Scanner;

/**
 * The Menu class provides a command-line interface for interacting with user settings.
 * It allows the user to view options, set the daily wage, name, email, and get a summary of their settings.
 */
public class Menu {

    private final List<MenuOptions> options = List.of(
            MenuOptions.HELP,
            MenuOptions.SETWAGE,
            MenuOptions.SETNAME,
            MenuOptions.SETEMAIL,
            MenuOptions.GETSUMMARY);

    private final Settings settings;

    /**
     * Constructs a Menu with the specified settings.
     *
     * @param settings the settings to be managed by this menu
     */
    public Menu(Settings settings) {
        this.settings = settings;
    }

    /**
     * Prints the list of available options to the console.
     */
    public void printMenu() {
        System.out.println("""
                Here is a list of options you can use:
                
                    1. /help - print description of available options.
                    2. /setwage - here you can set your daily wage.
                    3. /setname - here you can set your name.
                    4. /setemail - here you can set your email.
                    5. /getsummary - here you can get summary.
                    \n
                """);
    }

    /**
     * Handles user input from the console, executing the corresponding action for each command.
     * Continuously prompts the user for input until the application is terminated.
     */
    public void handleUserInput() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter an option: ");
            String input = scanner.nextLine().trim();

            switch (input) {
                case "/help" -> printMenu();
                case "/setwage" -> setWage(scanner);
                case "/setname" -> setName(scanner);
                case "/setemail" -> setEmail(scanner);
                case "/getsummary" -> System.out.println(getSummary());
                default -> System.out.println("Invalid option. Please try again.");
            }
        }
    }

    /**
     * Prompts the user to enter a new daily wage, updates the settings, and prints a confirmation message.
     *
     * @param scanner the scanner to read user input from the console
     */
    private void setWage(Scanner scanner) {
        System.out.print("Enter new daily wage: ");
        int wage = scanner.nextInt();
        scanner.nextLine(); // consume the remaining newline
        settings.setBaseDailyWage(wage);
        System.out.println("Daily wage updated.");
    }

    /**
     * Prompts the user to enter a new name, updates the settings, and prints a confirmation message.
     *
     * @param scanner the scanner to read user input from the console
     */
    private void setName(Scanner scanner) {
        System.out.print("Enter new name: ");
        String name = scanner.nextLine();
        settings.setUserName(name);
        System.out.println("Name updated.");
    }

    /**
     * Prompts the user to enter a new email, updates the settings, and prints a confirmation message.
     *
     * @param scanner the scanner to read user input from the console
     */
    private void setEmail(Scanner scanner) {
        System.out.print("Enter new email: ");
        String email = scanner.nextLine();
        settings.setUserEmail(email);
        System.out.println("Email updated.");
    }

    /**
     * Returns a formatted summary of the user settings.
     *
     * @return a string containing the user's name, email, and daily wage
     */
    public String getSummary() {
        return String.format(
                "User Summary:\nName: %s\nEmail: %s\nDaily Wage: %d",
                settings.getUserName(),
                settings.getUserEmail(),
                settings.getBaseDailyWage()
        );
    }
}
