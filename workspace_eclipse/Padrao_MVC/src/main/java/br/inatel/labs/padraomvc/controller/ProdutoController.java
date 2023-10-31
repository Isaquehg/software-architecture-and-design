package br.inatel.labs.padraomvc.controller;

import br.inatel.labs.padraomvc.model.entity.Produto;
import br.inatel.labs.padraomvc.model.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Controller for Products
 * @author Isaque
 * @version 1.0
 * @since 30/10/23
 */
@Controller
public class ProdutoController {

    @Autowired
    private ProdutoService service;

    @GetMapping("/produtos")
    public String getProdutos(Model model){
        List<Produto> listaProdutos = service.findAll();
        model.addAttribute("listaProdutos", listaProdutos);
        return "tabela-de-produtos";
    }
}
