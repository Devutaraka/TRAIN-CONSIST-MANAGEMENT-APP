import java.util.*;
import java.util.stream.Collectors;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("Train Consist Management System - UC19");

        // Sorted Bogie IDs (IMPORTANT)
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        String searchKey = "BG309"; // Change to test

        int low = 0;
        int high = bogieIds.length - 1;

        boolean found = false;

        // Binary Search
        while (low <= high) {

            int mid = (low + high) / 2;

            int result = searchKey.compareTo(bogieIds[mid]);

            if (result == 0) {
                System.out.println("\nBogie found at position: " + mid);
                found = true;
                break;
            }
            else if (result < 0) {
                high = mid - 1; // search left
            }
            else {
                low = mid + 1; // search right
            }
        }

        if (!found) {
            System.out.println("\nBogie NOT found");
        }
    }
}