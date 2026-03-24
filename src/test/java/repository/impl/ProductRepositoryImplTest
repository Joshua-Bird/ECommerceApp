/*
 * ProductRepositoryTest.java
 * Test Class for Product Repository
 * Author: Plamedie Dinanga 230082629
 * Date: 21 March 2026
 */
package repository;

import domain.Product;
import factory.ProductFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import repository.impl.ProductRepositoryImpl;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ProductRepositoryTest {

    private ProductRepository repository;
    private ProductFactory factory;
    private Product testProduct;

    // This runs before every test to ensure a clean state
    @BeforeEach
    public void setup() {
        repository = new ProductRepositoryImpl();
        factory = new ProductFactory();
        
        // Create a dummy product for testing
        testProduct = factory.buildProduct(
            "P001", 
            "Gaming Laptop", 
            15000.00, 
            "High performance laptop", 
            10, 
            null
        );
    }

    @Test
    public void testSaveProduct_Success() {
        Product saved = repository.save(testProduct);
        assertNotNull(saved);
        assertEquals("P001", saved.getProductId());
        assertEquals("Gaming Laptop", saved.getName());
    }

    @Test
    public void testSaveProduct_NullProduct() {
        Product saved = repository.save(null);
        assertNull(saved);
    }

    @Test
    public void testFindById_Success() {
        repository.save(testProduct);
        Product found = repository.findById("P001");
        assertNotNull(found);
        assertEquals("Gaming Laptop", found.getName());
    }

    @Test
    public void testFindById_NotFound() {
        Product found = repository.findById("INVALID_ID");
        assertNull(found);
    }

    @Test
    public void testFindAll_Success() {
        repository.save(testProduct);
        List<Product> products = repository.findAll();
        assertFalse(products.isEmpty());
        assertEquals(1, products.size());
    }

    @Test
    public void testDeleteProduct_Success() {
        repository.save(testProduct);
        repository.delete("P001");
        Product found = repository.findById("P001");
        assertNull(found);
    }

    @Test
    public void testUpdateProduct_Success() {
        repository.save(testProduct);
        Product updatedProduct = factory.buildProduct(
            "P001", 
            "Updated Laptop", 
            16000.00, 
            "Updated desc", 
            15, 
            null
        );
        Product result = repository.update(updatedProduct);
        assertNotNull(result);
        assertEquals("Updated Laptop", result.getName());
        assertEquals(16000.00, result.getPrice());
    }
}
