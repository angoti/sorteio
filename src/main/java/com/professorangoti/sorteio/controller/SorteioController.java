package com.professorangoti.sorteio.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class SorteioController {

    @GetMapping(value="/sorteio")
    public String sortear(Model model) {
        List<Integer> numerosSorteados = new ArrayList<Integer>();
        Random gerador = new Random();
        for (int i = 0; i < 6; i++) {
            Integer numero = gerador.nextInt(60)+1;
            numerosSorteados.add(numero);
        }
        model.addAttribute("dados", numerosSorteados);
        return "numeros";
    }
    
    
}
