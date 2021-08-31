package com.zup.FaceZup.Mensagem;

import com.zup.FaceZup.Usuario.Usuario;
import com.zup.FaceZup.Usuario.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MensagemService {


    public MensagemRepository repositoryM;
    public UsuarioService usuarioService;

    @Autowired
    public MensagemService(MensagemRepository mensagemRepository, UsuarioService usuarioService){
            this.repositoryM = mensagemRepository;
            this.usuarioService = usuarioService;
    }

    public Mensagem cadastrarMensagem(Mensagem mensagem){
        return repositoryM.save(mensagem);
    }





}
