/*
Name: Angel Carmichael
Date: February 1, 2025
Description: GenericStack is implemented using composition. A new stack class is added that extends ArrayList. 
  A test program is written that prompts the user to enter five strings and displays them in reverse order. 
 */
import java.util.*;

public class Generic_Stack {

    /**
     * GenericStack Implementation
     *
     * @author Angel Carmichael TODO: test program that prompts the user to
     * enter five strings and displays them in reverse order
     */
    public static void main(String[] args) {
        // create scanner
        Scanner keyboard = new Scanner(System.in);

        // make the GenericStack object 
        GenericStack<Integer> list = new GenericStack<>();

        // loops to get five integers from the user
        for (int i = 0; i < 5; i++) {

            // gets the integer from the user
            System.out.println("Enter a number " + (i + 1) + ": ");
            int num = keyboard.nextInt();

            // adds the number to the stack
            list.push(num);
        }

        // pulls the last element and displays it until the list is empty
        System.out.println("The numbers in reverse order are: ");
        while (!list.isEmpty()) {
            System.out.print(list.pop() + " ");
        }
    }

    /**
     * GenericStack Extended ArrayList
     *
     * TODO: Implement this class using composition that extends ArrayList.
     *
     * @param <E> the type of elements in this stack
     * @author Angel Carmichael
     */
    public static class GenericStack<E> extends ArrayList<E> {

        // The size of the stack
        public int getSize() {
            return super.size();
        }

        // returns the last integer from the list
        public E peek() {
            return super.get(getSize() - 1);
        }

        // adds to the top integer to the list
        public void push(E o) {
            super.add(o);
        }

        // removes the last integer from the list and returns it
        public E pop() {
            E o = super.get(getSize() - 1);
            super.remove(getSize() - 1);
            return o;
        }

        // checks if the list is empty
        public boolean isEmpty() {
            return super.isEmpty();
        }

        // shows the stack as a string
        @Override
        public String toString() {
            return "stack: " + super.toString();
        }
    }
}
