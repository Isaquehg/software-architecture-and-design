package javaAvancado;

/**
 * Class to practice Arrays
 *  * @author Isaquehg
 *  * @version 1.0
 *  * @since 28/08/2023
 */
public class SobreArrays {
    /**
     * Array's exercises
     * @param args
     */
    public static void main(String[] args) {
        Animal[] arrayAnimais = new Animal[4];

        arrayAnimais[0] = new Animal(1L, "Tartaruga");
        arrayAnimais[1] = new Animal(2L, "Coelho");
        arrayAnimais[2] = new Animal(3L, "Dog");
        arrayAnimais[3] = new Animal(4L, "Cat");

        System.out.println("Array de Animais: ");
        for (Animal animal:arrayAnimais) {
            System.out.println(animal.getNome());
        }
    }
}
