package javaAvancado;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Class to practice Comparables
 *  * @author Isaquehg
 *  * @version 1.0
 *  * @since 21/08/2023
 */
public class SobreComparable_1 {
    /**
     * Using Collections.sort implementation
     * @param args
     */
    public static void main(String[] args) {
        List<String> listaDeAlimentos = new ArrayList<>();
        listaDeAlimentos.add("Damasco");
        listaDeAlimentos.add("Batata");
        listaDeAlimentos.add("Arroz");
        listaDeAlimentos.add("Cenoura");

        System.out.println("Sem ordenação: ");
        System.out.println(listaDeAlimentos);

        Collections.sort(listaDeAlimentos);
        System.out.println("Ordenado: ");
        System.out.println(listaDeAlimentos);
    }
}
