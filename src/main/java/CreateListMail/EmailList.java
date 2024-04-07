package CreateListMail;

import java.util.*;

public class EmailList {

    private Set<String> emailSet = new TreeSet<>(); // Используем TreeSet для хранения адресов в алфавитном порядке

    public void add(String email) {
        if (isValidEmail(email)) {
            if (emailSet.contains(email.toLowerCase())) {
                System.out.println("Email уже существует: " + email);
            } else {
                emailSet.add(email.toLowerCase()); // Хранение в нижнем регистре для корректной сортировки
                System.out.println("Email добавлен: " + email);
            }
        } else {
            System.out.println(Main.WRONG_EMAIL_ANSWER);
        }
    }

    public List<String> getSortedEmails() {
        return new ArrayList<>(emailSet);

    }

    private boolean isValidEmail(String email) {
        return email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
    }
}
