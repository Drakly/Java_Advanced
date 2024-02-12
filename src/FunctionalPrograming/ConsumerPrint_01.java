package FunctionalPrograming;

import java.util.Scanner;
import java.util.function.Consumer;

public class ConsumerPrint_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Consumer<String> print  = s -> System.out.println(s);
        
        
        String[] input = scanner.nextLine().split("\\s+");

        for (String string: input) {
            print.accept(string);
        }
    }
}
