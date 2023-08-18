package com.senai.pojetowebjava.Repository;

import com.senai.pojetowebjava.Model.ContatoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContatoRepository extends JpaRepository<ContatoModel,Integer> {
}
