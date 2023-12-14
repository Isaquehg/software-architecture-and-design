package javaAvancado;

import java.util.ArrayList;
import java.util.List;

/**
 * Class to practice Collections
 *  * @author Isaquehg
 *  * @version 1.0
 *  * @since 28/08/2023
 */
public class SobreList_1 {
    /**
     * ArrayList implementation from Collections
     * @param args
     */
    public static void main(String[] args) {
        List<String> listaDeAlimentos = new ArrayList<>();
        listaDeAlimentos.add("Damasco");
        listaDeAlimentos.add("Batata");
        listaDeAlimentos.add("Arroz");
        listaDeAlimentos.add("Cenoura");

        System.out.println(listaDeAlimentos);
    }
}
