import java.util.*;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("Welcome to Train Consist Management System");

        // List of goods bogies
        List<GoodsBogie> goods = new ArrayList<>();

        goods.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goods.add(new GoodsBogie("Rectangular", "Coal"));
        goods.add(new GoodsBogie("Cylindrical", "Petroleum"));

        // Safety validation using stream
        boolean isSafe = goods.stream()
                .allMatch(b -> {
                    if (b.type.equals("Cylindrical")) {
                        return b.cargo.equals("Petroleum");
                    }
                    return true; // other bogies allowed
                });

        System.out.println("\n--- Safety Check ---");

        if (isSafe) {
            System.out.println("Train is SAFE for operation");
        } else {
            System.out.println("Train is NOT SAFE");
        }
    }
}

// Goods Bogie class
class GoodsBogie {
    String type;
    String cargo;

    GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }
}