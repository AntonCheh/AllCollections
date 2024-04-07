package HashMap;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import java.util.*;

public class PhoneBook {

    private TreeMap<String, Set<String>> phoneContacts;

    public PhoneBook() {
        this.phoneContacts = new TreeMap<>();
    }

    public void addContact(String phone, String name) {
        if (isValidNumber(phone) && isValidName(name)) {
            // Проверяем, есть ли уже такой номер в записях
            boolean numberExists = false;
            String existingOwner = null;
            for (Map.Entry<String, Set<String>> entry : phoneContacts.entrySet()) {
                if (entry.getValue().contains(phone)) {
                    numberExists = true;
                    existingOwner = entry.getKey();
                    break;
                }
            }
            // Если номер существует, удаляем его у текущего владельца
            if (numberExists) {
                Set<String> existingOwnerPhones = phoneContacts.get(existingOwner);
                existingOwnerPhones.remove(phone);
                // Если у текущего владельца больше нет номеров, удаляем его запись
                if (existingOwnerPhones.isEmpty()) {
                    phoneContacts.remove(existingOwner);
                }
            }
            // Добавляем новый номер к имени
            Set<String> phones = phoneContacts.get(name);
            if (phones == null) {
                phones = new TreeSet<>();
                phoneContacts.put(name, phones);
            }
            phones.add(phone);
        } else if (!isValidName(name)) {
            System.out.println("Неверный формат имени.");
        } else if (!isValidNumber(phone)) {
            System.out.println("Неверный формат номера.");
        }
    }
    public String getContactByPhone(String phone) {
        for (Map.Entry<String, Set<String>> entry : phoneContacts.entrySet()) {
            if (entry.getValue().contains(phone)) {
                return entry.getKey() + " - " + phone;
            }
        }
        return "Контакт не найден";
    }
    public Set<String> getContactByName(String name) {
        Set<String> result = new TreeSet<>();
        if (phoneContacts.containsKey(name)) {
            Set<String> phones = phoneContacts.get(name);
            for (String phone : phones) {
                result.add(name + " - " + phone);
            }
        }
        return result;
    }
    public Set<String> getAllContacts() {
        Set<String> result = new TreeSet<>();
        for (Map.Entry<String, Set<String>> entry : phoneContacts.entrySet()) {
            String name = entry.getKey();
            Set<String> phones = entry.getValue();
            StringBuilder phoneStr = new StringBuilder();
            for (String phone : phones) {
                if (phoneStr.length() > 0) {
                    phoneStr.append(", ");
                }
                phoneStr.append(phone);
            }
            result.add(name + " - " + phoneStr.toString());
        }
        return result;
    }
    boolean isValidNumber(String phoneNumber) {
       return phoneNumber.matches("^[0-9]{11}$");
    }
    boolean isValidName(String name) {
        return name.matches("^[a-zA-Zа-яА-Я\\s-]+$");
    }
}