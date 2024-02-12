package ExamPrep;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class MonsterExtermination_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deque<Integer> monstersQueue = new ArrayDeque<>();

        Deque<Integer>  strikesStack = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine()
                .split(","))
                .map(Integer::parseInt)
                .forEach(monstersQueue::offer);



        Arrays.stream(scanner.nextLine()
                .split(","))
                .map(Integer::parseInt)
                .forEach(strikesStack::push);

        int killedMonsters = 0;

        while (!monstersQueue.isEmpty() && !strikesStack.isEmpty()) {

            int strike = strikesStack.pop();
            int armour = monstersQueue.poll();

            if (strike >= armour) {
                killedMonsters++;
                strike -= armour;

                if (strikesStack.size() > 0) {
                    int nextStrike = strikesStack.pop();
                    strikesStack.push(nextStrike + strike);
                }else {
                    if (strike > 0) {
                        strikesStack.push(strike);
                    }
                }

            }else {
                armour -= strike;
                monstersQueue.offer(armour);

            }
        }

        if (monstersQueue.isEmpty()) {
            System.out.println("All monsters have been killed!");
        }

        if (strikesStack.isEmpty()) {
            System.out.println("All soldiers has been defeated.");
        }
        System.out.printf("Total monsters killed: %d", killedMonsters);
    }
}
