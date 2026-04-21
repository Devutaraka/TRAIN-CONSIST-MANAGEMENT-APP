import java.util.*;
import java.util.stream.Collectors;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("Train Consist Management System - UC15");

        // Create bogies
        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        GoodsBogie b2 = new GoodsBogie("Rectangular");

        // SAFE case
        assignCargo(b1, "Petroleum");

        // UNSAFE case
        assignCargo(b2, "Petroleum");

        System.out.println("\nProgram continues safely...");
    }

    // Assignment method with try-catch-finally
    public static void assignCargo(GoodsBogie bogie, String cargo) {

        try {
            System.out.println("\nAssigning " + cargo + " to " + bogie.type);

            // Validation rule
            if (bogie.type.equals("Rectangular") && cargo.equals("Petroleum")) {
                throw new CargoSafetyException("Unsafe: Petroleum cannot be assigned to Rectangular bogie");
            }

            // Assign cargo if safe
            bogie.cargo = cargo;
            System.out.println("Cargo assigned successfully");

        } catch (CargoSafetyException e) {

            System.out.println("Error: " + e.getMessage());

        } finally {

            System.out.println("Assignment attempt completed for " + bogie.type);
        }
    }
}

// Goods Bogie class
class GoodsBogie {
    String type;
    String cargo;

    GoodsBogie(String type) {
        this.type = type;
    }
}

// Custom Runtime Exception
class CargoSafetyException extends RuntimeException {
    CargoSafetyException(String message) {
        super(message);
    }
}