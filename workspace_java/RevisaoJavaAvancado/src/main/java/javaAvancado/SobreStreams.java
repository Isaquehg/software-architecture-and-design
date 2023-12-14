package javaAvancado;

import java.util.ArrayList;
import java.util.List;

/**
 * Class for Streams and functional programming practice
 *  * @author Isaquehg
 *  * @version 1.0
 *  * @since 29/08/2023
 */
public class SobreStreams {
    /**
     * Implementation of multiple streams' methods and utilities using a products list.
     * @param args
     */
    public static void main(String[] args) {
        List<Produto> produtoList = new ArrayList<>();
        produtoList.add(new Produto(1L, "Cadeira", 100.0));
        produtoList.add(new Produto(2L, "Cama", 400.0));
        produtoList.add(new Produto(3L, "Mesa", 200.0));
        produtoList.add(new Produto(4L, "Sofá", 500.0));
        produtoList.add(new Produto(5L, "Cadeira", 150.0));

        // Streams Filtering
        List<Produto> produtosFiltrados = produtoList.stream()
                .filter( p -> p.getPreco() > 300.0 ).toList();
        System.out.println(produtosFiltrados);

        // Streams Mapping
        List<String> descricoes = produtoList.stream().map( p -> p.getDescricao() ).toList();
        System.out.println(descricoes);

        // Sum using Streams
        Double precoTotal = produtoList.stream().map( p -> p.getPreco() ).reduce( 0.0, Double::sum);
        System.out.println(precoTotal);

        // Total price for products under 300.0
        Double precoAbaixo = produtoList.stream().filter(p -> p.getPreco() < 300)
                .map( p -> p.getPreco()).reduce(0.0, Double::sum);
        System.out.println(precoAbaixo);
    }
}
