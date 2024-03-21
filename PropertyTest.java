import org.junit.Test;
import static org.junit.Assert.*;

public class PropertyTest {
    @Test
    public void testToString() {
        String expectedDescription = "T3 Monte Belo";
        double expectedPrice = 150000.0;
        String expectedString = "Descricao   : T3 Monte Belo\n" +
                                "Preco       : 150000.0 Euros\n";

        Property property = new Property(expectedDescription, expectedPrice);
        String actualString = property.toString();

        assertEquals(expectedString, actualString);
    }
}