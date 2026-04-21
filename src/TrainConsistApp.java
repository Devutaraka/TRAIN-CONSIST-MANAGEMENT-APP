import java.util.*;
import java.util.stream.Collectors;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("Train Consist Management System - UC17");

        // Bogie type names
        String[] bogies = {"Sleeper", "AC Chair", "First Class", "General", "Luxury"};

        System.out.println("\nBefore Sorting:");
        System.out.println(Arrays.toString(bogies));

        // Built-in sorting
        Arrays.sort(bogies);

        System.out.println("\nAfter Sorting (Alphabetical):");
        System.out.println(Arrays.toString(bogies));
    }
}