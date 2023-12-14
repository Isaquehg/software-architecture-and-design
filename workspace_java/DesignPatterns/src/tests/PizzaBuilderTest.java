package tests;

import builder.pizzaria.Pizza;
import builder.pizzaria.PizzaBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for PizzaBuilder
 * @author isaquehg
 * @version 1.0
 * @since 10/10/23
 */
public class PizzaBuilderTest {

    /**
     * Test case to ensure that a Pizza is correctly built using the PizzaBuilder
     * with valid components (Cheese, Peperoni, and a valid size).
     *
     * - Valid components are added to the pizza using the builder.
     * - The pizza's size is set.
     * - The PizzaBuilder is used to construct a Pizza instance.
     * - Assertions are made to ensure that the Pizza is constructed correctly.
     */
    @Test
    public void dadosPartesValidas_quandoGetPizza_entaoPizzaEhConstruida(){
        Pizza pizzaPronta = new PizzaBuilder()
                .addCheese()
                .addPeperoni()
                .setSize(1)
                .getPizza();

        assertNotNull(pizzaPronta);
        assertEquals(1, (int) pizzaPronta.getSize());
        assertTrue(pizzaPronta.getFlagPeperoni());
        assertTrue(pizzaPronta.getFlagCheese());
    }

    /**
     * Test case to ensure that an exception is thrown when attempting to build a Pizza
     * with an invalid size using the PizzaBuilder.
     *
     * - An attempt is made to build a Pizza with an invalid size, and an exception is expected.
     */
    @Test
    public void dadoPizzaComTamanhoErrado_quandoGetPizza_entaoLancaException(){
        Integer tamanhoErrado = 4;

        assertThrows(IllegalStateException.class, () -> {
            Pizza pizzaPronta = new PizzaBuilder()
                    .addCheese()
                    .addPeperoni()
                    .setSize(tamanhoErrado)
                    .getPizza();
        });

        /*try{
            Pizza pizzaPronta = new PizzaBuilder()
                    .addCheese()
                    .addPeperoni()
                    .setSize(5)
                    .getPizza();
            fail("Deveria ter lançado exception");
        }
        catch (IllegalStateException e){
            System.out.println("OK, Exception esperado");
        }*/
    }

    /**
     * Test case to ensure that an exception is thrown when attempting to build a Pizza
     * without any ingredients using the PizzaBuilder.
     *
     * - An attempt is made to build a Pizza without adding any ingredients, and an exception is expected.
     */
    @Test
    public void dadoPizzaSemIngrediente_quandoGetPizza_entaoLancaException(){
        assertThrows(IllegalStateException.class, () -> {
            new PizzaBuilder()
                    // Sem ingredientes...
                    .setSize(3)
                    .getPizza();
        });
    }
}
