package SetsAndMaps;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetsOfElements_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] tokens = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(tokens[0]);
        int m = Integer.parseInt(tokens[1]);

        Set<String> firstSet = new LinkedHashSet<>();
        for (int i = 0; i < n; i++) {
            firstSet.add(scanner.nextLine());
        }

        Set<String> secondSet = new LinkedHashSet<>();
        for (int i = 0; i < m; i++) {
            secondSet.add(scanner.nextLine());
        }
        if (firstSet.size() <= secondSet.size()) {

            for (String s : firstSet) {
                if (secondSet.contains(s)) {
                    System.out.print(s + " ");
                }
            }
        } else {
            for (String s : secondSet) {
                if (firstSet.contains(s)) {
                    System.out.print(s + " ");
                }
            }
        }
    }
}
