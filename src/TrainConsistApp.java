import java.util.*;
import java.util.stream.Collectors;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("Welcome to Train Consist Management System");

        // List of bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 50));
        bogies.add(new Bogie("First Class", 30));

        System.out.println("\n--- All Bogies ---");
        display(bogies);

        // Filter bogies with capacity > 60
        List<Bogie> filtered = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        System.out.println("\n--- High Capacity Bogies (>60) ---");
        display(filtered);
    }

    // Display method
    public static void display(List<Bogie> bogies) {
        for (Bogie b : bogies) {
            System.out.println("Bogie: " + b.name + " | Capacity: " + b.capacity);
        }
    }
}

// Bogie class
class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
}