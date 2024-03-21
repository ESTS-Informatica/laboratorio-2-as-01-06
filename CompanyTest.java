import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.List;
import java.util.ArrayList;

/**
 * A company test.
 *
 * @author POO
 * @version 03/2024
 */

public class CompanyTest {
    private Company company;
    private User client1;
    private User client2;
    private User seller1;
    private User seller2;

    @Before
    public void setUp() {
        company = new Company();
        
        client1 = new User("José Manuel", "911111111", "zemanel@yahoo.com");
        client2 = new User("António Francisco", "922222222", "tochico@hotmail.com");
        seller1 = new User("Fernando Fernandes", "966777101", "fefe@remax.pt");
        seller2 = new User("Rodrigo Rodrigues", "966777152", "roro@remax.pt");
    }

    @Test
    public void testRegisterClient() {
        assertTrue(company.registerClient(client1));
        assertEquals(1, company.getClients().size());
        assertTrue(company.registerClient(client2));
    }
    
    @Test
    public void testRegisterClients() {
        assertTrue(company.registerClient(client1));
        assertTrue(company.registerClient(client2));
        assertEquals(2, company.getClients().size());
        assertTrue(company.registerClient(client1));
        assertTrue(company.registerClient(client2));
    }

    @Test
    public void testRegisterSeller() {
        assertTrue(company.registerSeller(seller1));
        assertTrue(company.registerSeller(seller2));
    }
    
    @Test
    public void testConstructor() {
        assertNotNull(company.getClients());
        assertNotNull(company.getSellers());
        assertNotNull(company.getProperties());
        assertNotNull(company.getSells());
    }
    
    @Test
    public void testRegisterClientDuplicate(){
        assertTrue(company.registerClient(client1));
        assertFalse(company.registerClient(client1));
        assertEquals(1, company.getClients().size());
    }
    
    @Test
    public void testRegisterClientNull(){
        assertFalse(company.registerClient(null));
        assertEquals(0, company.getClients().size());
    }
}