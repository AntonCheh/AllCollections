package HashMap;

import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер, имя или команду:");

        while (scanner.hasNextLine()) {
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("список")) {
                Set<String> contacts = phoneBook.getAllContacts();
                for (String contact : contacts) {
                    System.out.println(contact);
                }
            } else if (phoneBook.isValidNumber(input)) {
                System.out.println("Введите имя абонента для номера \"" + input + "\":");
                String name = scanner.nextLine().trim();
                phoneBook.addContact(input, name);
                System.out.println("Контакт сохранен!");
            } else if (phoneBook.isValidName(input)) {
                System.out.println("Введите номер телефона для абонента \"" + input + "\":");
                String phone = scanner.nextLine().trim();
                phoneBook.addContact(phone, input);
                System.out.println("Контакт сохранен!");
            } else {
                System.out.println("Неверный формат ввода");
            }
            System.out.println("\nВведите номер, имя или команду:");
        }
    }
}






