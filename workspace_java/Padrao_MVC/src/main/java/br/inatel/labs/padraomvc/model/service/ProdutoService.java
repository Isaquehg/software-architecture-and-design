package br.inatel.labs.padraomvc.model.service;

import br.inatel.labs.padraomvc.model.entity.Produto;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Service for Products
 * @author Isaque
 * @version 1.0
 * @since 30/10/23
 */
@Service
public class ProdutoService {

    private List<Produto> listaProdutos = new ArrayList<>();

    @PostConstruct
    private void setup(){
        Produto produto1 = new Produto(1L, "Furadeira", 300.0);
        Produto produto2 = new Produto(2L, "Serra", 200.0);
        Produto produto3 = new Produto(3L, "Lixadeira", 150.0);
        listaProdutos.add(produto1);
        listaProdutos.add(produto2);
        listaProdutos.add(produto3);
    }

    public List<Produto> findAll(){
        return this.listaProdutos;
    }
}
