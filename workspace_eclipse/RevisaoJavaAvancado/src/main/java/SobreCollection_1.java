import java.util.*;

public class SobreCollection_1 {
    public static void main(String[] args) {
        Collection<String> collection = buildCollectionImplementation(5);
        collection.add("Cat");
        collection.add("Dog");
        collection.add("Lion");

        System.out.println(collection);
    }

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
