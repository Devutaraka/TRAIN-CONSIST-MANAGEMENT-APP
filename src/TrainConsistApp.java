import java.util.*;
import java.util.stream.Collectors;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("Welcome to Train Consist Management System");

        try {
            // Valid bogie
            PassengerBogie b1 = new PassengerBogie("Sleeper", 72);
            System.out.println("Created: " + b1.name + " | Capacity: " + b1.capacity);

            // Invalid bogie (will throw exception)
            PassengerBogie b2 = new PassengerBogie("AC Chair", -10);
            System.out.println("Created: " + b2.name + " | Capacity: " + b2.capacity);

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

// Passenger Bogie class
class PassengerBogie {

    String name;
    int capacity;

    PassengerBogie(String name, int capacity) throws InvalidCapacityException {

        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }

        this.name = name;
        this.capacity = capacity;
    }
}

// Custom Exception
class InvalidCapacityException extends Exception {

    InvalidCapacityException(String message) {
        super(message);
    }
}