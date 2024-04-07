package CreateTodoList;

import java.util.List;
import java.util.Scanner;

public class Main {
    private static TodoList todoList = new TodoList();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean exit = false;
        while (!exit) {
            System.out.println("Выберите действие:");
            System.out.println("1. Добавить дело");
            System.out.println("2. Добавить дело на указанный индекс");
            System.out.println("3. Заменить дело по индексу");
            System.out.println("4. Удалить дело по индексу");
            System.out.println("5. Добавить дело в конец списка");
            System.out.println("6. Вывести список дел");
            System.out.println("0. Выйти из программы");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Чтение символа новой строки после выбора действия

            switch (choice) {
                case 1:
                    System.out.println("Введите дело:");
                    String todo = scanner.nextLine();
                    todoList.add(todo);
                    System.out.println("Дело успешно добавлено");
                    break;
                case 2:
                    System.out.println("Введите индекс для добавления дела:");
                    int index2 = scanner.nextInt();
                    scanner.nextLine(); // Чтение символа новой строки после ввода индекса
                    System.out.println("Введите дело для добавления:");
                    String todo2 = scanner.nextLine();
                    todoList.add(index2, todo2);
                    System.out.println("Дело успешно добавлено");
                    break;

                case 3:
                    System.out.println("Введите индекс для замены дела:");
                    int index3 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Введите новое дело:");
                    String todo3 = scanner.nextLine();
                    todoList.edit(index3, todo3);
                    System.out.println("Дело успешно заменено");
                    break;
                case 4:
                    System.out.println("Введите индекс для удаления дела:");
                    int index4 = scanner.nextInt();
                    scanner.nextLine();
                    todoList.delete(index4);
                    System.out.println("Дело успешно удалено");
                    break;
                case 5:
                    System.out.println("Введите дело для добавления:");
                    String todo5 = scanner.nextLine();
                    todoList.add(todo5);
                    System.out.println("Дело успешно добавлено");
                    break;
                case 6:
                    System.out.println("Список дел:");
                    List<String> todos = todoList.getTodos();
                    for (int i = 0; i < todos.size(); i++) {
                        System.out.println((i + 1) + ". " + todos.get(i));
                    }
                    break;
                case 0:
                    exit = true;
                    break;
                default:
                    System.out.println("Некорректный ввод");
            }
        }
    }
}

