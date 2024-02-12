package Stacks_and_quess;

import java.util.*;

public class Basic_Stack_Operation_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deque<Integer> stack = new ArrayDeque<>();


        int[] tokens =  Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();


        int n = tokens[0];
        int s = tokens[1];
        int x = tokens[2];

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(stack::push);

        for (int i = 0; i < s; i++) {
            stack.pop();

        }

        if (stack.isEmpty()) {
            System.out.println(0);
        } else if (stack.contains(x)) {
            System.out.println(true);

        }else {
        Integer smallestElement = Collections.min(stack);
            System.out.println(smallestElement);
        }
    }
}
