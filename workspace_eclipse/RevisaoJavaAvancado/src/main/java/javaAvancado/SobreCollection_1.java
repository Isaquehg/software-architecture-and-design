package javaAvancado;

import java.util.*;

/**
 * Class to practice Collections
 *  * @author Isaquehg
 *  * @version 1.0
 *  * @since 21/08/2023
 */
public class SobreCollection_1 {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Collection<String> collection = buildCollectionImplementation(5);
        collection.add("Cat");
        collection.add("Dog");
        collection.add("Lion");

        System.out.println(collection);
    }

    /**
     * Function for switch Collection implementations
     * @param a Option for implementation type
     * @return Collection in desired type
     */
    private static Collection<String> buildCollectionImplementation(int a){
        // List: Preserva ordem de inserção
        if(a == 1){
            return new ArrayList<>();
        }
        // HashSet: Sem ordem, inserção por código hash
        else if (a == 2) {
            return new HashSet<>();
        }
        // TreeSet: Árvore balanceada
        else if(a == 3) {
            return new TreeSet<>();
        }
        else{
            return new LinkedList<>();
        }
    }
}
