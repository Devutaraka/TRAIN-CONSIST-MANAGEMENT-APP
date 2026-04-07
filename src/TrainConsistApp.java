import java.util.LinkedList;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("Welcome to Train Consist Management System");

        // LinkedList for ordered train consist
        LinkedList<String> train = new LinkedList<>();

        // Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        System.out.println("\n--- Initial Train Consist ---");
        displayTrain(train);

        // Insert Pantry Car at position 2
        train.add(2, "Pantry");

        System.out.println("\n--- After Adding Pantry Car ---");
        displayTrain(train);

        // Remove first and last bogie
        train.removeFirst();
        train.removeLast();

        System.out.println("\n--- Final Train Consist ---");
        displayTrain(train);
    }

    // Helper method
    public static void displayTrain(LinkedList<String> train) {

        for (String bogie : train) {
            System.out.print(bogie + " -> ");
        }
        System.out.println("END");
    }
}