package javaAvancado;

import java.util.HashSet;
import java.util.Set;

/**
 * Class to practice Sets
 *  * @author Isaquehg
 *  * @version 1.0
 *  * @since 29/08/2023
 */
public class SobreSet_1 {
    /**
     * Implementations of HashSets using a fruit set
     * @param args
     */
    public static void main(String[] args) {
        Set<String> setDeFrutas = new HashSet<>();
        setDeFrutas.add("Laranja");
        setDeFrutas.add("Pera");
        setDeFrutas.add("Manga");
        setDeFrutas.add("Limão");

        System.out.println(setDeFrutas);
    }
}
