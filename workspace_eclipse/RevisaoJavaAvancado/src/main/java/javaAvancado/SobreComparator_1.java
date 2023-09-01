package javaAvancado;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SobreComparator_1 {
    public static void main(String[] args) {
        List<Animal> listaDeAnimais = new ArrayList<>();
        listaDeAnimais.add(new Animal(5L, "Girafa"));
        listaDeAnimais.add(new Animal(1L, "Tartaruga"));
        listaDeAnimais.add(new Animal(6L, "Gato"));
        listaDeAnimais.add(new Animal(2L, "Coelho"));
        listaDeAnimais.add(new Animal(4L, "Gato"));
        listaDeAnimais.add(new Animal(3L, "Cachorro"));

        System.out.println("Sem ordenação:");
        System.out.println(listaDeAnimais);

        System.out.println("Ordenado por Nome:");
        Collections.sort(listaDeAnimais, new ComparadorPorNome());
        for (Animal animal: listaDeAnimais) {
            System.out.print(animal.getNome());
            System.out.println(animal.getId());
        }

        System.out.println("Ordenado por ID:");
        Collections.sort(listaDeAnimais, new ComparadorPorID());
        for (Animal animal: listaDeAnimais) {
            System.out.print(animal.getNome());
            System.out.println(animal.getId());
        }
    }
}
