package javaAvancado;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Class to practice Collections
 *  * @author Isaquehg
 *  * @version 1.0
 *  * @since 28/08/2023
 */
public class SobreCollection_2 {
    /**
     * Collections methods practice
     * @param args
     */
    public static void main(String[] args) {
        Collection<String> engenhariasAtuais = new ArrayList<>();

        engenhariasAtuais.add("Biomédica");
        engenhariasAtuais.add("Software");
        engenhariasAtuais.add("Computação");
        engenhariasAtuais.add("Telecomunicações");
        engenhariasAtuais.add("Elétrica");

        System.out.println(engenhariasAtuais);

        Collection<String> engenhariasFuturas = new ArrayList<>();

        engenhariasFuturas.add("Mecânica");
        engenhariasFuturas.add("Mecatrônica");

        System.out.println(engenhariasFuturas);

        // Concatenating Lists/Collections
        Collection<String> todasEngenharias = new ArrayList<>();

        todasEngenharias.addAll(engenhariasAtuais);
        todasEngenharias.addAll(engenhariasFuturas);

        System.out.println(todasEngenharias);

        // isEmpty && size
        Collection<String> engenharias = new ArrayList<>(todasEngenharias);
        System.out.println(engenharias.isEmpty());
        System.out.println(engenharias.size());

        // Clear
        System.out.println("Engenharias antes:");
        System.out.println(engenharias);
        engenharias.clear();
        System.out.println("Após clear:");
        System.out.println(engenharias);
    }
}
