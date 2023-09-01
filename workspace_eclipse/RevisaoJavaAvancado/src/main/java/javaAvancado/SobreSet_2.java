package javaAvancado;

import java.util.Set;
import java.util.TreeSet;

/**
 * Class to practice Sets
 *  * @author Isaquehg
 *  * @version 1.0
 *  * @since 29/08/2023
 */
public class SobreSet_2 {
    /**
     * Implementations of TreeSets using a fruit set
     * @param args
     */
    public static void main(String[] args) {
        Set<String> setDeFrutas = new TreeSet<>();
        setDeFrutas.add("Laranja");
        setDeFrutas.add("Pera");
        setDeFrutas.add("Manga");
        setDeFrutas.add("Limão");

        System.out.println(setDeFrutas);
    }
}
