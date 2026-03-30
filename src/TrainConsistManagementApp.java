import java.util.HashSet;
import java.util.Set;

public class trainconsistentmanagementapp {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Create HashSet for bogie IDs
        Set<String> bogieIDs = new HashSet<>();

        // 🔹 Add bogie IDs (with duplicates intentionally)
        bogieIDs.add("BG101");
        bogieIDs.add("BG102");
        bogieIDs.add("BG103");
        bogieIDs.add("BG101"); // duplicate
        bogieIDs.add("BG102"); // duplicate

        // Display unique bogie IDs
        System.out.println("\nUnique Bogie IDs:");
        System.out.println(bogieIDs);

        // Program continues...
    }
}