import java.util.ArrayList;
import java.util.List;

public class trainconsistentmanagementapp {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Create ArrayList for passenger bogies
        List<String> passengerBogies = new ArrayList<>();

        // 🔹 Add bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Display after adding
        System.out.println("\nAfter adding bogies:");
        System.out.println(passengerBogies);

        // 🔹 Remove one bogie (AC Chair)
        passengerBogies.remove("AC Chair");

        // Display after removal
        System.out.println("\nAfter removing AC Chair:");
        System.out.println(passengerBogies);

        // 🔹 Check existence
        if (passengerBogies.contains("Sleeper")) {
            System.out.println("\nSleeper bogie exists in the train.");
        } else {
            System.out.println("\nSleeper bogie does not exist.");
        }

        // Final state
        System.out.println("\nFinal bogie list:");
        System.out.println(passengerBogies);

        // Program continues...
    }
}