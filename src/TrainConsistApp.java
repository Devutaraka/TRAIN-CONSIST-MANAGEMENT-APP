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

        System.out.println("\n--- Bogie List ---");
        for (Bogie b : bogies) {
            System.out.println("Bogie: " + b.name + " | Capacity: " + b.capacity);
        }

        // Calculate total capacity using stream
        int totalCapacity = bogies.stream()
                .map(b -> b.capacity)      // extract capacity
                .reduce(0, Integer::sum); // sum all values

        System.out.println("\nTotal Seating Capacity: " + totalCapacity);
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