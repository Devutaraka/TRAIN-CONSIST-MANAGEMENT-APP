import java.util.*;
import java.util.stream.Collectors;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("Welcome to Train Consist Management System");

        // List of bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72, "Passenger"));
        bogies.add(new Bogie("AC Chair", 50, "Passenger"));
        bogies.add(new Bogie("First Class", 30, "Passenger"));
        bogies.add(new Bogie("Rectangular", 100, "Goods"));
        bogies.add(new Bogie("Cylindrical", 120, "Goods"));

        // Group bogies by type
        Map<String, List<Bogie>> grouped = bogies.stream()
                .collect(Collectors.groupingBy(b -> b.type));

        System.out.println("\n--- Grouped Bogies ---");

        // Display grouped result
        for (String type : grouped.keySet()) {

            System.out.println("\nType: " + type);

            for (Bogie b : grouped.get(type)) {
                System.out.println("Bogie: " + b.name + " | Capacity: " + b.capacity);
            }
        }
    }
}

// Bogie class
class Bogie {
    String name;
    int capacity;
    String type;

    Bogie(String name, int capacity, String type) {
        this.name = name;
        this.capacity = capacity;
        this.type = type;
    }
}