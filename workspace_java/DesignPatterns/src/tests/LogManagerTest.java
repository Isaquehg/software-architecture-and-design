package tests;

import singleton.LogManager;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Test class for LogManager
 * @author isaquehg
 * @version 1.0
 * @since 31/10/23
 */
public class LogManagerTest {

    /**
     * Test case to ensure that when creating two instances of LogManager using getInstance(),
     * they are the same reference, verifying the Singleton pattern.
     *
     * - Two instances of LogManager are created.
     * - Assertions are made to verify that both instances are not null.
     * - The two instances are compared to ensure they are the same reference.
     */
    @Test
    public void dada2Instancias_quandoGetInstance_entaoSeraAMesmaReferencia(){
        LogManager instance1 = LogManager.getInstance();
        assertNotNull(instance1);

        LogManager instance2 = LogManager.getInstance();
        assertNotNull(instance2);

        assertEquals(instance1, instance2);
    }
}
