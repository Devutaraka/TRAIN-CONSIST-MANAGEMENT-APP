import java.util.ArrayList;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("Welcome to Train Consist Management System");

        // Train consist using ArrayList
        ArrayList<String> passengerBogies = new ArrayList<>();

        // Add bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("\n--- After Adding Bogies ---");
        displayBogies(passengerBogies);

        // Remove a bogie
        passengerBogies.remove("AC Chair");

        System.out.println("\n--- After Removing AC Chair ---");
        displayBogies(passengerBogies);

        // Check if bogie exists
        String checkBogie = "Sleeper";
        if (passengerBogies.contains(checkBogie)) {
            System.out.println("\n" + checkBogie + " bogie is present in the train.");
        } else {
            System.out.println("\n" + checkBogie + " bogie is NOT present.");
        }

    }

    // Helper method
    public static void displayBogies(ArrayList<String> bogies) {

        System.out.println("Total Passenger Bogies: " + bogies.size());

        for (String bogie : bogies) {
            System.out.println("Bogie Type: " + bogie);
        }
    }
}