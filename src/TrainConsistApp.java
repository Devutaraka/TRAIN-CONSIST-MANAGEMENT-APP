import java.util.HashMap;
import java.util.Map;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("Welcome to Train Consist Management System");

        // HashMap for bogie → capacity
        HashMap<String, Integer> bogieCapacity = new HashMap<>();

        // Add bogie capacities
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 50);
        bogieCapacity.put("First Class", 30);
        bogieCapacity.put("Cargo Rectangular", 100);
        bogieCapacity.put("Cargo Cylindrical", 120);

        System.out.println("\n--- Bogie Capacity Details ---");

        // Iterate using entrySet
        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {

            String bogie = entry.getKey();
            int capacity = entry.getValue();

            System.out.println("Bogie: " + bogie + " | Capacity: " + capacity);
        }

    }
}