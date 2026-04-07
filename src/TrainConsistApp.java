import java.util.LinkedHashSet;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("Welcome to Train Consist Management System");

        // LinkedHashSet for ordered + unique bogies
        LinkedHashSet<String> train = new LinkedHashSet<>();

        // Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("Cargo");
        train.add("Guard");

        // Attempt duplicate
        train.add("Sleeper"); // duplicate (ignored)

        System.out.println("\n--- Train Formation ---");

        // Display formation
        for (String bogie : train) {
            System.out.print(bogie + " -> ");
        }
        System.out.println("END");

        System.out.println("\nTotal Bogies: " + train.size());
    }
}