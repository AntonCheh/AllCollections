package QueueLesson;

import java.util.*;

public class DequeMain {
    public static void main(String[] args) {
        Deque<String> names = new LinkedList<>();
        names.add("Tom");
        names.add("Diana");
        names.add("Alex");
        names.addFirst("Dima");
        names.addLast("Dima");


        System.out.println(names);
        System.out.println(names.poll());
        System.out.println(names.poll());
        System.out.println(names.poll());
        System.out.println(names.poll());
        System.out.println(names);


        names.remove("Diana");
        for (String name : names) {

        }
    }
}
