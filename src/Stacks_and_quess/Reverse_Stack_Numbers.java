package Stacks_and_quess;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Reverse_Stack_Numbers {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        Deque<Integer> stack = new ArrayDeque<>();


        String[] input = scanner.nextLine().split("\\s+");

        for (String el: input) {
            int number = Integer.parseInt(el);
            stack.push(number);
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }

    }
}
