package CreateListMail;

import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
public class Main {
    public static final String WRONG_EMAIL_ANSWER = "Неверный формат email";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmailList emailList = new EmailList();


        while (true) {
            System.out.println("введите команду: ");
            System.out.println("1. ADD - добавить mail");
            System.out.println("2. LIST - вывести список");
            String input = scanner.nextLine().trim();
            switch (input) {
                case "0":
                    return; // Выход из программы
                case "2":
                    List<String> sortedEmails = emailList.getSortedEmails();
                    int index = 1;
                    for (String email : sortedEmails) {
                        System.out.println(index + ". " + email);
                        index++;
                    }
                    break;

                default:
                    if (input.startsWith("1 ")) {
                        String email = input.substring(1).trim();
                        emailList.add(email);

                    } else {
                        System.out.println("Неверная команда.");
                    }
                    break;
            }
        }
    }
}


