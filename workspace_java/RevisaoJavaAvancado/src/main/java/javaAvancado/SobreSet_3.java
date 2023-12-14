package javaAvancado;

import java.util.HashSet;
import java.util.Set;

/**
 * Class to practice Sets
 *  * @author Isaquehg
 *  * @version 1.0
 *  * @since 29/08/2023
 */
public class SobreSet_3 {
    /**
     * Implementations of HashSets using a animal set
     * @param args
     */
    public static void main(String[] args) {
        Set<Animal> setDeAnimais = new HashSet<>();
        setDeAnimais.add(new Animal(1L, "Tartaruga"));
        setDeAnimais.add(new Animal(2L, "Coelho"));
        setDeAnimais.add(new Animal(3L, "Cachorro"));
        setDeAnimais.add(new Animal(4L, "Gato"));
        setDeAnimais.add(new Animal(2L, "Coelho"));

        setDeAnimais.forEach(System.out::println);
    }
}
