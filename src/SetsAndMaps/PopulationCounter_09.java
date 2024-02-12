package SetsAndMaps;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicLong;

public class PopulationCounter_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Map<String, Long>> countries = new LinkedHashMap<>();

        Map<String , Long> countriesTotalPopulation = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while(!"report".equals(input)) {
            String [] tokens = input.split("\\|");
            String city = tokens[0];
            String country = tokens[1];
            long  population = Long.parseLong(tokens[2]);

            countries.putIfAbsent(country, new LinkedHashMap<>());
            countriesTotalPopulation.putIfAbsent(country, 0L);
            Long currentPopulation = countriesTotalPopulation.get(country);
            countriesTotalPopulation.put(country, currentPopulation + population);

            countries.get(country).put(city, population);

            input = scanner.nextLine();
        }

        countriesTotalPopulation.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(entry -> {
                    System.out.printf("%s (total population: %d)\n", entry.getKey(), entry.getKey());

                    countries.get(entry.getKey())
                            .entrySet()
                            .stream()
                            .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                            .forEach(pair -> {
                                System.out.printf("=>%s: %d\n", pair.getKey(), pair.getValue());
                            });
                });


    }
}
