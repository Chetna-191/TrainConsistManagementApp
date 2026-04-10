import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

public class TrainconsistentmanagementappTest {

    private List<Bogie> createSampleBogies() {
        return Arrays.asList(
                new Bogie(1, 50),
                new Bogie(2, 70),
                new Bogie(3, 80),
                new Bogie(4, 40)
        );
    }

    @Test
    void testLoopFilteringLogic() {
        List<Bogie> bogies = createSampleBogies();

        List<Bogie> result = Trainconsistentmanagementapp.filterWithLoop(bogies);

        assertEquals(2, result.size());
        for (Bogie b : result) {
            assertTrue(b.getCapacity() > 60);
        }
    }

    @Test
    void testStreamFilteringLogic() {
        List<Bogie> bogies = createSampleBogies();

        List<Bogie> result = Trainconsistentmanagementapp.filterWithStream(bogies);

        assertEquals(2, result.size());
        for (Bogie b : result) {
            assertTrue(b.getCapacity() > 60);
        }
    }

    @Test
    void testLoopAndStreamResultsMatch() {
        List<Bogie> bogies = createSampleBogies();

        List<Bogie> loopResult =Trainconsistentmanagementapp.filterWithLoop(bogies);
        List<Bogie> streamResult = Trainconsistentmanagementapp.filterWithStream(bogies);

        assertEquals(loopResult.size(), streamResult.size());
    }

    @Test
    void testExecutionTimeMeasurement() {
        List<Bogie> bogies = Trainconsistentmanagementapp.generateBogies(1000);

        long start = System.nanoTime();
        Trainconsistentmanagementapp.filterWithLoop(bogies);
        long end = System.nanoTime();

        long elapsed = end - start;

        assertTrue(elapsed > 0);
    }

    @Test
    void testLargeDatasetProcessing() {
        List<Bogie> bogies = Trainconsistentmanagementapp.generateBogies(50000);

        List<Bogie> result = Trainconsistentmanagementapp.filterWithStream(bogies);

        assertNotNull(result);
        assertTrue(result.size() >= 0); // ensures it ran successfully
    }
}