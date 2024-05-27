package dnekh.telegabot.repository;

import dnekh.telegabot.model.TelegramId;
import dnekh.telegabot.model.User;

import java.util.HashMap;
import java.util.Map;

public class DataRepository {

    private HashMap<TelegramId, User> userData;

    public DataRepository(HashMap<TelegramId, User> userData) {
        this.userData = userData;
    }

    public HashMap<TelegramId, User> getUserData() {
        return userData;
    }

    // Create a new User
    public void createUser(User user) {
        if (!userData.containsKey(user.getTelegramId())) {
            userData.put(user.getTelegramId(), user);
        } else {
            throw new IllegalArgumentException("User with this Telegram ID already exists.");
        }
    }

    // Read (Get) a User by TelegramId
    public User getUserByTelegramId(TelegramId telegramId) {
        if (userData.containsKey(telegramId)) {
            return userData.get(telegramId);
        } else {
            throw new IllegalArgumentException("User with this Telegram ID does not exist.");
        }
    }

    // Update an existing User
    public void updateUser(User user) {
        if (userData.containsKey(user.getTelegramId())) {
            userData.put(user.getTelegramId(), user);
        } else {
            throw new IllegalArgumentException("User with this Telegram ID does not exist.");
        }
    }

    // Delete a User by TelegramId
    public void deleteUser(TelegramId telegramId) {
        if (userData.containsKey(telegramId)) {
            userData.remove(telegramId);
        } else {
            throw new IllegalArgumentException("User with this Telegram ID does not exist.");
        }
    }

    // Get all Users
    public Map<TelegramId, User> getAllUsers() {
        return new HashMap<>(userData);
    }
}
