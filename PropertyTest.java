import org.junit.Test;
import static org.junit.Assert.*;

public class PropertyTest {
    @Test
    public void testConstructorAndGetters() {
        String expectedDescription = "T3 Monte Belo";
        double expectedPrice = 150000.0;
        Property property1 = new Property(expectedDescription, expectedPrice);
        assertEquals(expectedDescription, property1.getDescription());
        assertEquals(expectedPrice, property1.getPrice(), 0.01);
    }
}