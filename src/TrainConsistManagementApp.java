import java.util.LinkedHashSet;

public class trainconsistentmanagementapp {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Create LinkedHashSet for train formation
        LinkedHashSet<String> train = new LinkedHashSet<>();

        // 🔹 Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("Cargo");
        train.add("Guard");

        // 🔹 Add duplicate (will be ignored)
        train.add("Sleeper");

        // Display final formation
        System.out.println("\nFinal Train Formation:");
        System.out.println(train);
    }
}