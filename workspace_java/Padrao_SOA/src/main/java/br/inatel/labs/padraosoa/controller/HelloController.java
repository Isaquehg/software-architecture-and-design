package br.inatel.labs.padraosoa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Spring Controller to return JSON message
 * @author isaquehg
 * @version 1.0
 * @since 6/11/23
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    /**
     * Return Hello message when GET
     * @return string Hello
     */
    @GetMapping
    public MyMessage processarGetHello(){
        MyMessage msg = new MyMessage("Hello, World SOA!");
        return msg;
    }

}
