import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class TrainconsistentmanagementappTest {

    // Helper method to create test data
    private List<Trainconsistentmanagementapp.Bogie> getBogies() {
        return Arrays.asList(
                new Trainconsistentmanagementapp.Bogie("B1", 50),
                new Trainconsistentmanagementapp.Bogie("B2", 60),
                new Trainconsistentmanagementapp.Bogie("B3", 70),
                new Trainconsistentmanagementapp.Bogie("B4", 80)
        );
    }

    @Test
    void testFilter_CapacityGreaterThanThreshold() {
        List<Trainconsistentmanagementapp.Bogie> result =
                Trainconsistentmanagementapp.filterBogiesByCapacity(getBogies(), 60);

        assertEquals(2, result.size()); // B3, B4
    }

    @Test
    void testFilter_CapacityEqualToThreshold() {
        List<Trainconsistentmanagementapp.Bogie> result =
                Trainconsistentmanagementapp.filterBogiesByCapacity(getBogies(), 60);

        // Should NOT include B2 (equal case)
        assertFalse(result.stream().anyMatch(b -> b.getCapacity() == 60));
    }

    @Test
    void testFilter_CapacityLessThanThreshold() {
        List<Trainconsistentmanagementapp.Bogie> result =
                Trainconsistentmanagementapp.filterBogiesByCapacity(getBogies(), 60);

        // Should NOT include B1
        assertFalse(result.stream().anyMatch(b -> b.getCapacity() < 60));
    }

    @Test
    void testFilter_MultipleBogiesMatching() {
        List<Trainconsistentmanagementapp.Bogie> result =
                Trainconsistentmanagementapp.filterBogiesByCapacity(getBogies(), 55);

        assertEquals(3, result.size()); // B2, B3, B4
    }

    @Test
    void testFilter_NoBogiesMatching() {
        List<Trainconsistentmanagementapp.Bogie> result =
                Trainconsistentmanagementapp.filterBogiesByCapacity(getBogies(), 100);

        assertTrue(result.isEmpty());
    }

    @Test
    void testFilter_AllBogiesMatching() {
        List<Trainconsistentmanagementapp.Bogie> result =
                Trainconsistentmanagementapp.filterBogiesByCapacity(getBogies(), 10);

        assertEquals(4, result.size());
    }

    @Test
    void testFilter_EmptyBogieList() {
        List<Trainconsistentmanagementapp.Bogie> result =
                Trainconsistentmanagementapp.filterBogiesByCapacity(new ArrayList<>(), 50);

        assertTrue(result.isEmpty());
    }

    @Test
    void testFilter_OriginalListUnchanged() {
        List<Trainconsistentmanagementapp.Bogie> bogies = getBogies();

        Trainconsistentmanagementapp.filterBogiesByCapacity(bogies, 60);

        // Original list should remain same size
        assertEquals(4, bogies.size());
    }
}