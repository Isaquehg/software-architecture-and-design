package javaAvancado;

import java.util.*;

public class SobreMap1 {
    public static void main(String[] args) {
        Animal a1 = new Animal(1L, "Cachorro");
        Animal a2 = new Animal(2L, "Gato");
        Animal a3 = new Animal(3L, "Guaxinim");
        Animal a4 = new Animal(4L, "Papagaio");
        Animal a5 = new Animal(5L, "Tartaruga");

        // HashMap
        Map<String, Animal> mapDeAnimais = new HashMap<>();
        mapDeAnimais.put("CAR", a1);
        mapDeAnimais.put("GAT", a2);
        mapDeAnimais.put("GUA", a3);
        mapDeAnimais.put("PAP", a4);
        mapDeAnimais.put("TAR", a5);

        System.out.println(mapDeAnimais);

        // Keys
        Set<String> setKeys = mapDeAnimais.keySet();
        System.out.println(setKeys);

        // Values
        Collection<Animal> animalCollections = mapDeAnimais.values();
        System.out.println(animalCollections);

        // EntrySet
        Set<Map.Entry<String, Animal>> entrySet = mapDeAnimais.entrySet();
        for (Map.Entry<String, Animal> entry: entrySet) {
            System.out.println("Key: " + entry.getKey());
            System.out.println("Value: " + entry.getValue());
        }
    }
}
