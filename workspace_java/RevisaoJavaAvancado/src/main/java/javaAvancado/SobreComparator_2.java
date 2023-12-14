package javaAvancado;

import java.util.ArrayList;
import java.util.List;

/**
 * Class to practice Comparators
 *  * @author Isaquehg
 *  * @version 1.0
 *  * @since 21/08/2023
 */
public class SobreComparator_2 {
    /**
     * Comparing objects through Comparators classes
     * @param args
     */
    public static void main(String[] args) {
        List<Animal> listaDeAnimais = new ArrayList<>();
        listaDeAnimais.add(new Animal(5L, "Girafa"));
        listaDeAnimais.add(new Animal(1L, "Tartaruga"));
        listaDeAnimais.add(new Animal(6L, "Gato"));
        listaDeAnimais.add(new Animal(2L, "Coelho"));
        listaDeAnimais.add(new Animal(4L, "Gato"));
        listaDeAnimais.add(new Animal(3L, "Cachorro"));

        System.out.println("Antes de ordenar:");
        System.out.println(listaDeAnimais);

        // Alternative sorting methods
        listaDeAnimais.sort( (a1, a2) -> a1.getNome().compareTo(a2.getNome()) );
        //listaDeAnimais.sort( Comparator.comparing( a1 -> a1.getNome() ) );
        //listaDeAnimais.sort( Comparator.comparing( Animal::getNome ) );

        System.out.println("Após ordenação:");
        System.out.println(listaDeAnimais);
    }

}
