package javaAvancado;

import java.util.ArrayList;
import java.util.List;

/**
 * Class to practice Collections
 *  * @author Isaquehg
 *  * @version 1.0
 *  * @since 28/08/2023
 */
public class SobreList_2 {
    /**
     * ArrayList implementations
     * @param args
     */
    public static void main(String[] args) {
        List<Animal> listaDeAnimais = new ArrayList<>();
        listaDeAnimais.add(new Animal(1L, "Tartaruga"));
        listaDeAnimais.add(new Animal(2L, "Coelho"));
        listaDeAnimais.add(new Animal(3L, "Cachorro"));
        listaDeAnimais.add(new Animal(4L, "Gato"));
        listaDeAnimais.add(new Animal(5L, "Girafa"));
        listaDeAnimais.add(new Animal(6L, "Gato"));

        System.out.println(listaDeAnimais);
    }
}
