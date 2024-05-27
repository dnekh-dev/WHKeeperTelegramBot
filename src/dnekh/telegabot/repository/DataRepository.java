package dnekh.telegabot.repository;

import dnekh.telegabot.model.TelegramId;
import dnekh.telegabot.model.User;

import java.util.HashMap;
import java.util.Map;

/**
 * The DataRepository class provides CRUD operations for managing User data.
 */
public class DataRepository {

    private HashMap<TelegramId, User> userData;

    /**
     * Constructs a new DataRepository with the specified initial user data.
     *
     * @param userData the initial user data
     */
    public DataRepository(HashMap<TelegramId, User> userData) {
        this.userData = userData;
    }

    /**
     * Returns the user data stored in the repository.
     *
     * @return the user data
     */
    public HashMap<TelegramId, User> getUserData() {
        return userData;
    }

    /**
     * Adds a new user to the repository.
     *
     * @param user the user to add
     * @throws IllegalArgumentException if a user with the same Telegram ID already exists
     */
    public void createUser(User user) {
        if (!userData.containsKey(user.getTelegramId())) {
            userData.put(user.getTelegramId(), user);
        } else {
            throw new IllegalArgumentException("User with this Telegram ID already exists.");
        }
    }

    /**
     * Retrieves a user from the repository by their Telegram ID.
     *
     * @param telegramId the Telegram ID of the user to retrieve
     * @return the user with the specified Telegram ID
     * @throws IllegalArgumentException if the user with the specified Telegram ID does not exist
     */
    public User getUserByTelegramId(TelegramId telegramId) {
        if (userData.containsKey(telegramId)) {
            return userData.get(telegramId);
        } else {
            throw new IllegalArgumentException("User with this Telegram ID does not exist.");
        }
    }

    /**
     * Updates an existing user in the repository.
     *
     * @param user the user to update
     * @throws IllegalArgumentException if the user with the specified Telegram ID does not exist
     */
    public void updateUser(User user) {
        if (userData.containsKey(user.getTelegramId())) {
            userData.put(user.getTelegramId(), user);
        } else {
            throw new IllegalArgumentException("User with this Telegram ID does not exist.");
        }
    }

    /**
     * Deletes a user from the repository by their Telegram ID.
     *
     * @param telegramId the Telegram ID of the user to delete
     * @throws IllegalArgumentException if the user with the specified Telegram ID does not exist
     */
    public void deleteUser(TelegramId telegramId) {
        if (userData.containsKey(telegramId)) {
            userData.remove(telegramId);
        } else {
            throw new IllegalArgumentException("User with this Telegram ID does not exist.");
        }
    }

    /**
     * Retrieves all users from the repository.
     *
     * @return a map containing all users
     */
    public Map<TelegramId, User> getAllUsers() {
        return new HashMap<>(userData);
    }
}
