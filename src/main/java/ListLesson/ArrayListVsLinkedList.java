package ListLesson;

import java.util.*;

public class ArrayListVsLinkedList {
    public static void main(String[] args) {
        removeFirstAndLast();
        getElementByIndex();
        putInTheStart();
        putInTheMiddle();
        removeInTheMiddle();
        iteration();
        sort();
        createNewList();
        removeList();
    }

    public static List<Integer> getElementByIndex () {
        List<Integer> nums = new ArrayList<>();

        long start = System.nanoTime();
        for (int i = 0; i < 10000000; i++) {
            nums.add(1);
        }

        System.out.println(nums.get(500000));

        long end = System.nanoTime();

        System.out.println("getElementByIndex" + (end-start)/1_000_000);
        System.out.println("getElementByIndex" + (end-start)/1_000_000_000);
        return nums;
    }

    public static List<Integer> putInTheStart () {
        List<Integer> nums = new ArrayList<>();

        long start = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            nums.add(0,1);
        }

        long end = System.nanoTime();

        System.out.println("putInTheStart" + (end-start)/1_000_000);
        System.out.println("putInTheStart" + (end-start)/1_000_000_000);
        return nums;
    }

        public static List<Integer> putInTheMiddle () {
            List<Integer> nums = new ArrayList<>();

            long start = System.nanoTime();
            for (int i = 0; i < 100000; i++) {
                nums.add(1);
            }
            int middle= nums.size()/2;

            for (int i = 0; i < 100000; i++) {
                nums.add(middle,0);
            }
            long end = System.nanoTime();

            System.out.println("putInTheMiddle" + (end-start)/1_000_000);
            System.out.println("putInTheMiddle" + (end-start)/1_000_000_000);
            return nums;
        }


    public static List<Integer> removeInTheMiddle () {
        List<Integer> nums = new ArrayList<>();

        long start = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            nums.add(0,1);
        }
        int middle= nums.size()/2;

        for (int i = 0; i < 40000; i++) {
            nums.remove(middle);
        }

        long end = System.nanoTime();

        System.out.println(nums.size());

        System.out.println("removeInTheMiddle" + (end-start)/1_000_000);
        System.out.println("removeInTheMiddle" + (end-start)/1_000_000_000);
        return nums;
    }

    public static List<Integer> iteration () {
        List<Integer> nums = new ArrayList<>();

        long start = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            nums.add(1);
        }

        for (Integer num : nums) {
            System.out.println(num);
        }

        long end = System.nanoTime();

        System.out.println("iteration" + (end-start)/1_000_000);
        System.out.println("iteration" + (end-start)/1_000_000_000);
        return nums;
    }

    public static List<Integer> sort () {
        List<Integer> nums = new ArrayList<>();

        long start = System.nanoTime();

        Random random = new Random();

        for (int i = 0; i < 100000; i++) {
            int randomNumber = random.nextInt(10000);
            nums.add(randomNumber);
        }

        Collections.sort(nums);

        for (Integer num : nums) {
            System.out.println(num);
        }

        long end = System.nanoTime();

        System.out.println("sort" + (end-start)/1_000_000);
        System.out.println("sort" + (end-start)/1_000_000_000);
        return nums;
    }

    public static void createNewList () {
        List<Integer> nums = new ArrayList<>();

        long start = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            nums.add(1);
        }

        List<Integer> numero = new ArrayList<>();
        numero.addAll(nums);

        long end = System.nanoTime();

        System.out.println("createNewList" + (end-start)/1_000_000);
        System.out.println("createNewList" + (end-start)/1_000_000_000);
    }

    public static void removeList () {
        List<Integer> nums = new ArrayList<>();

        long start = System.nanoTime();
        for (int i = 0; i < 10000000; i++) {
            nums.add(1);
        }

        nums.clear();

        System.out.println(nums);

        long end = System.nanoTime();

        System.out.println("removeList" + (end-start)/1_000_000);
        System.out.println("removeList" + (end-start)/1_000_000_000);
    }

    public static List<Integer> removeFirstAndLast () {
        List<Integer> nums = new ArrayList<>();

        long start = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            nums.add(1);
        }

        nums.remove(0);

        nums.remove(nums.size() - 1);

        long end = System.nanoTime();

        System.out.println("removeFirstAndLast" + (end-start)/1_000_000);
        System.out.println("removeFirstAndLast" + (end-start)/1_000_000_000);
        return nums;
    }



}
