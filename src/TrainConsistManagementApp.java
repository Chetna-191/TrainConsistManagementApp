import java.util.LinkedList;

public class trainconsistentmanagementapp {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Create LinkedList for train consist
        LinkedList<String> train = new LinkedList<>();

        // 🔹 Add bogies (initial sequence)
        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        System.out.println("\nInitial Train Consist:");
        System.out.println(train);

        // 🔹 Insert Pantry Car at position 2 (index 2)
        train.add(2, "Pantry");

        System.out.println("\nAfter adding Pantry Car at position 2:");
        System.out.println(train);

        // 🔹 Remove first and last bogie
        train.removeFirst();
        train.removeLast();

        System.out.println("\nAfter removing first and last bogie:");
        System.out.println(train);

        // Final Output
        System.out.println("\nFinal Train Consist:");
        System.out.println(train);
    }
}