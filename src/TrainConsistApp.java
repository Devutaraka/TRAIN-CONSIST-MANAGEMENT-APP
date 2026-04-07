import java.util.HashSet;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("Welcome to Train Consist Management System");

        // HashSet for unique bogie IDs
        HashSet<String> bogieIds = new HashSet<>();

        // Add bogie IDs (with duplicates)
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // duplicate
        bogieIds.add("BG102"); // duplicate

        System.out.println("\n--- Bogie IDs in Train ---");

        // Display unique bogie IDs
        for (String id : bogieIds) {
            System.out.println("Bogie ID: " + id);
        }

        System.out.println("\nTotal Unique Bogies: " + bogieIds.size());
    }
}