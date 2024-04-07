package SetLesson;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetLesson {
    public static void main(String[] args) {
      iterator();
    }

public static void setts () {
    Set<Integer> set1 = new HashSet<>();
    Set<Integer> set2 = new HashSet<>();

    // Добавляем элементы в первое множество
    set1.add(1);
    set1.add(2);
    set1.add(3);

    // Добавляем элементы во второе множество
    set2.add(2);
    set2.add(3);
    set2.add(4);

    // Вызываем метод для поиска пересечений и выводим результат
    Set<Integer> intersection = findIntersection(set1, set2);
    System.out.println("Пересечение множеств: " + intersection);
}

    // Метод для поиска пересечения множеств
    public static <T> Set<T> findIntersection(Set<T> set1, Set<T> set2) {
        Set<T> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        return intersection;
    }

    public static void unionSet() {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);

        set2.add(3);
        set2.add(4);
        set2.add(5);

        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);

        System.out.println("Объединение двух множеств: " + union);
    }

    public static void removeSet() {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        // Заполняем первое множество
        set1.add(1);
        set1.add(2);
        set1.add(3);

        // Заполняем второе множество
        set2.add(3);
        set2.add(4);
        set2.add(5);

        // Находим разность множеств (элементы, присутствующие только в первом множестве)
        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);

        System.out.println("Разность двух множеств: " + difference);
    }

    public static void subset() {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        // Заполняем первое множество
        set1.add(1);
        set1.add(2);
        set1.add(3);

        // Заполняем второе множество
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);

        // Проверяем, является ли set1 подмножеством set2
        boolean isSubset = set2.containsAll(set1);

        if (isSubset) {
            System.out.println("set1 является подмножеством set2");
        } else {
            System.out.println("set1 не является подмножеством set2");
        }
    }

    public static void iterator() {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);

        // Получаем итератор для множества
        Iterator<Integer> iterator = set.iterator();

        // Перебираем элементы множества с помощью итератора
        System.out.println("Элементы множества:");
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            System.out.println(element);
        }
    }

}
