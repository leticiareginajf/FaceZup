package com.zup.FaceZup.Mensagem;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MensagemRepository extends CrudRepository<Mensagem, Integer> {


        List<Mensagem> findByDestinUser(String email);


}
