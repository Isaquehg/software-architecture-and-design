package br.inatel.labs.padraomvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Controller intro concepts
 * @author Isaque
 * @version 1.0
 * @since 30/10/23
 */
@Controller
public class HelloMvcController {

    @GetMapping("/hello")
    public String getHello(Model model){
       model.addAttribute("usuario", "Isaquehg");
       return "hello-mvc";
    }

}
