package tests;

import singleton.LogManager;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class LogManagerTest {
    @Test
    public void dada2Instancias_quandoGetInstance_entaoSeraAMesmaReferencia(){
        LogManager instance1 = LogManager.getInstance();
        assertNotNull(instance1);

        LogManager instance2 = LogManager.getInstance();
        assertNotNull(instance2);

        assertEquals(instance1, instance2);
    }
}
