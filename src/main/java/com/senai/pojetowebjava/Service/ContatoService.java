package com.senai.pojetowebjava.Service;

import com.senai.pojetowebjava.Model.ContatoModel;
import com.senai.pojetowebjava.Repository.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContatoService {

    @Autowired
    private ContatoRepository contatoRepository;

    public ContatoModel saveMessage(ContatoModel contatoModel){
        return contatoRepository.save(contatoModel);
    }
}
