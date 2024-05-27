package dnekh.telegabot.handlers;

import java.util.regex.Pattern;

/**
 * The UserHandler class provides methods for validating user data such as name and email.
 */
public class UserHandler {
    // Regular expression pattern for validating name
    private static final Pattern NAME_PATTERN = Pattern.compile("^[a-zA-Z]+$");
    // Regular expression pattern for validating email
    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");

    /**
     * Validates the user's name.
     *
     * @param name the name to validate
     * @return true if the name is valid, false otherwise
     */
    public static boolean validateName(String name) {
        if (name == null) {
            return false;
        }
        return NAME_PATTERN.matcher(name).matches();
    }

    /**
     * Validates the user's email.
     *
     * @param email the email to validate
     * @return true if the email is valid, false otherwise
     */
    public static boolean validateEmail(String email) {
        if (email == null) {
            return false;
        }
        return EMAIL_PATTERN.matcher(email).matches();
    }
}
