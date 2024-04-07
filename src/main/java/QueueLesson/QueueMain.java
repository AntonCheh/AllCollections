package QueueLesson;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueMain {
    public static void main(String[] args) {
        Queue<String> names = new PriorityQueue<>();
        names.add("Tom");
        names.add("Diana");
        names.add("Alex");

        System.out.println(names);
        System.out.println(names.poll());
        System.out.println(names.element());


    }
}
