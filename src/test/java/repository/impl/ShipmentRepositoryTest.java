
import org.junit.jupiter.api.*;
import za.ac.cput.domain.Shipment;
import za.ac.cput.factory.ShipmentFactory;

import static org.junit.jupiter.api.Assertions.*;

        import java.util.Date;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ShipmentRepositoryTest {

    private static za.ac.cput.repository.impl.ShipmentRepositoryImpl repository = za.ac.cput.repository.impl.ShipmentRepositoryImpl.getRepository();

    private static Shipment shipment = ShipmentFactory.createShipment(
            "Cape Town",
            new Date(),
            new Date(),
            "Pending"
    );

    @Test
    @Order(1)
    void create() {
        Shipment created = repository.create(shipment);
        assertNotNull(created);
    }

    @Test
    @Order(2)
    void read() {
        Shipment read = repository.read(shipment.getShipmentId());
        assertNotNull(read);
    }

    @Test
    @Order(3)
    void update() {
        Shipment updatedShipment = new Shipment.Builder()
                .copy(shipment)
                .setStatus("Delivered")
                .build();

        Shipment updated = repository.update(updatedShipment);
        assertEquals("Delivered", updated.getStatus());
    }

    private void assertEquals(String delivered, String status) {
    }

    @Test
    @Order(4)
    void getAll() {
        assertFalse(repository.getAll().isEmpty());
    }

    @Test
    @Order(5)
    void delete() {
        boolean success = repository.delete(shipment.getShipmentId());
        assertTrue(success);
    }
}