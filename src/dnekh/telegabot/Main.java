package dnekh.telegabot;

import dnekh.telegabot.model.Menu;
import dnekh.telegabot.model.Settings;
import dnekh.telegabot.model.TelegramId;
import dnekh.telegabot.model.User;
import dnekh.telegabot.repository.DataRepository;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        DataRepository dataRepository = new DataRepository(new HashMap<>());
        TelegramId telegramId = new TelegramId("@supermors");
        User user1 = new User(telegramId, "Mors", "meow@moore.com");
        User user2 = new User(telegramId, "Vasya", "meow@moore.com");
        Settings settings = new Settings(user1, 165000);
        Menu menu = new Menu(settings);
        System.out.println(dataRepository.getAllUsers());
        dataRepository.createUser(user1);
        System.out.println(dataRepository.getAllUsers());
        dataRepository.getUserByTelegramId(telegramId);
        System.out.println(dataRepository.getAllUsers());
        System.out.println(dataRepository.getUserData());
        dataRepository.updateUser(user2);
        System.out.println(dataRepository.getAllUsers());
    }
}