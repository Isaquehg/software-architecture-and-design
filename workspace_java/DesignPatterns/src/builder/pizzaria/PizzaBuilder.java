package builder.pizzaria;

/**
 * Builder desing for Pizza class
 * @author Isaque
 * @version 1.0
 * @since 10/10/23
 */
public class PizzaBuilder {

    private Pizza pizza = new Pizza();

    public PizzaBuilder addCheese() {
        pizza.setFlagCheese(true);
        return this;
    }

    public PizzaBuilder addPeperoni() {
        pizza.setFlagPeperoni(true);
        return this;
    }

    public PizzaBuilder setSize(Integer s) {
        pizza.setSize(s);
        return this;
    }

    private void validateIngredients() {
        if(!(pizza.getFlagCheese() && pizza.getFlagPeperoni())){
            throw new IllegalStateException("Sem ingredientes!");
        }
    }

    private void validateSize() {
        if(pizza.getSize() < 1 || pizza.getSize() > 3){
            throw new IllegalStateException("Tamanho inválido!");
        }
    }

    public Pizza getPizza() {
        validateSize();
        validateIngredients();

        return pizza;
    }

}
