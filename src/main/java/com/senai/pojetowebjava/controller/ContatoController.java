package com.senai.pojetowebjava.controller;

import com.senai.pojetowebjava.Model.ContatoModel;
import com.senai.pojetowebjava.Service.ContatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/curriculo")
public class ContatoController {

    @Autowired
    private ContatoService contatoService;



    @GetMapping
    public String curriculo(){
        return "home/index";
    }

    @PostMapping
    public String sendMessage(ContatoModel contatoModel){
        contatoService.saveMessage(contatoModel);
        return "home/index";
    }
}
