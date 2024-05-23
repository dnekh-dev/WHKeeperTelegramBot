package dnekh.telegabot;

import dnekh.telegabot.handlers.HoursConverter;
import dnekh.telegabot.model.Note;
import dnekh.telegabot.model.Settings;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int baseDailyWage = 0;
        String name = "";
        String email = "";
        int hoursWorked = 0;

        System.out.println("Hello! I'm your own helper for saving daily working hours. " +
                "Before start entre your daile base wage:");

        int userInputOfDailyWage = Integer.parseInt(scanner.nextLine());
        if (userInputOfDailyWage > 0 && userInputOfDailyWage < 250_000) {
            baseDailyWage = userInputOfDailyWage;
        }

        String userInputOfName = scanner.nextLine();
        if (!userInputOfName.isEmpty() && userInputOfName.length() < 15) {
            name = userInputOfName;
        }

        String userInputEmail = scanner.nextLine();
        if (!userInputEmail.isEmpty() && userInputEmail.length() < 20) {
            email = userInputEmail;
        }

        System.out.println("Enter hours worked:");
        int userInputOfHoursWorked = Integer.parseInt(scanner.nextLine());
        if (userInputOfHoursWorked > 0 && userInputOfHoursWorked < 10) {
            hoursWorked = userInputOfHoursWorked;
        }

        Settings settings = new Settings("@super", name, email, baseDailyWage);
        System.out.println(settings.getUsername());
        System.out.println(settings.getName());
        System.out.println(settings.getEmail());
        System.out.println(settings.getBaseDailyWage());

        Note note = new Note(hoursWorked);

        System.out.println(HoursConverter.calculateTotalForThisDay(settings, note));

    }
}