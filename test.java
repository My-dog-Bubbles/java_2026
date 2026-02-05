// Write your imports here if needed

import java.util.*;

public class test {

    // Write your code here
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Integer[] intArray = {};

        System.out.println("Enter 10 integers separated by spaces: ");
        String fullStrNum = keyboard.nextLine();

        String[] nums = fullStrNum.trim().split(" ");

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(nums[i]));
        }
        sort(list);
        System.out.println(list);
    }

    public static <E extends Comparable<E>> void sort(ArrayList<E> list) {
        for (int i = 0; i < 10 - 1; i++) {
            for (int j = 0; j < 10 - 1 - i; j++) {
                if (list.get(j).compareTo(list.get(j + 1)) > 0) {
                    E num = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, num);
                }
            }
        }
    }
}
