package tests;

import builder.pizzaria.Pizza;
import builder.pizzaria.PizzaBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PizzaBuilderTest {
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
