
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Shipment;
import za.ac.cput.factory.ShipmentFactory;

import static org.junit.jupiter.api.Assertions.*;

        import java.util.Date;

public class ShipmentFactoryTest {

    @Test
    void createShipment() {
        Shipment shipment = ShipmentFactory.createShipment(
                "Cape Town",
                new Date(),
                new Date(),
                "Shipped"
        );

        assertNotNull(shipment);
        assertNotNull(shipment.getShipmentId());
    }
}