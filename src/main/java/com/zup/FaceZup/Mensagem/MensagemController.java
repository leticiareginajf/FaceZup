package com.zup.FaceZup.Mensagem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/chat")
public class MensagemController {

    @Autowired
    private MensagemService service;


    /*
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Mensagem cadastrarMensagem(@RequestBody MensagemDTO mensagemDTO){
        return service.equals(mensagemDTO);
    }
*/

}
