import java.util.*;
import java.util.stream.Collectors;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("Train Consist Management System - UC18");

        // Bogie IDs (unsorted)
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        String searchKey = "BG309"; // Change this to test

        boolean found = false;

        // Linear Search
        for (int i = 0; i < bogieIds.length; i++) {

            if (bogieIds[i].equals(searchKey)) {
                found = true;
                System.out.println("\nBogie found at position: " + i);
                break; // stop immediately when found
            }
        }

        if (!found) {
            System.out.println("\nBogie NOT found");
        }
    }
}