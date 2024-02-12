package Stacks_and_quess;

import java.util.*;

public class Basic_Queue_Operation_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] tokens = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        Deque<Integer> queue = new ArrayDeque<>();

        int n = tokens[0];
        int s = tokens[1];
        int x = tokens[2];

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(queue::offer);

        for (int i = 0; i < s; i++) {
            queue.poll();
        }

        if (queue.isEmpty()) {
            System.out.println(0);

        } else if (queue.contains(x)) {
            System.out.println(true);
        }else {
            System.out.println(Collections.min(queue));
        }
    }
}

