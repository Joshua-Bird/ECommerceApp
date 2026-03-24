/*
 * ProductFactoryTest.java
 * Test Class for Product Factory
 * Author: Plamedie Dinanga 230082629
 * Date: 21 March 2026
 */
package factory;

import domain.Product;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductFactoryTest {

    ProductFactory factory = new ProductFactory();

    @Test
    public void testSuccessfulProductCreation() {
        Product product = factory.buildProduct("P001", "Laptop", 15000.00, "Gaming Laptop", 10, null);
        assertNotNull(product);
        assertEquals("P001", product.getProductId());
        assertEquals("Laptop", product.getName());
        assertEquals(15000.00, product.getPrice());
    }

    @Test
    public void testNullProductId() {
        assertThrows(IllegalArgumentException.class, () -> {
            factory.buildProduct(null, "Laptop", 15000.00, "Desc", 10, null);
        });
    }

    @Test
    public void testEmptyProductId() {
        assertThrows(IllegalArgumentException.class, () -> {
            factory.buildProduct("", "Laptop", 15000.00, "Desc", 10, null);
        });
    }

    @Test
    public void testNullProductName() {
        assertThrows(IllegalArgumentException.class, () -> {
            factory.buildProduct("P001", null, 15000.00, "Desc", 10, null);
        });
    }

    @Test
    public void testNegativePrice() {
        assertThrows(IllegalArgumentException.class, () -> {
            factory.buildProduct("P001", "Laptop", -500.00, "Desc", 10, null);
        });
    }

    @Test
    public void testNegativeQuantity() {
        assertThrows(IllegalArgumentException.class, () -> {
            factory.buildProduct("P001", "Laptop", 15000.00, "Desc", -5, null);
        });
    }
}
