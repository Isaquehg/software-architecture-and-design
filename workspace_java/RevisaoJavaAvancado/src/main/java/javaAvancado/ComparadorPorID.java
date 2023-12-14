package javaAvancado;

import java.util.Comparator;

/**
 * Class to implement Comparator
 *  * @author Isaquehg
 *  * @version 1.0
 *  * @since 28/08/2023
 */
public class ComparadorPorID implements Comparator<Animal> {
    /**
     * Comparator strategy implementation through ID
     * @param a1 the first object to be compared.
     * @param a2 the second object to be compared.
     * @return result from comparison
     */
    @Override
    public int compare(Animal a1, Animal a2) {
        return a1.getId().compareTo(a2.getId());
    }
}
