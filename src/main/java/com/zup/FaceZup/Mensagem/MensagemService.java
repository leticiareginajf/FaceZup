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

    public Mensagem cadastrarMensagem(String mensagem, String origem, String destino){

        Usuario usuarioOrigem = new Usuario();
        Usuario usuarioDestino = new Usuario();


        usuarioOrigem = usuarioService.pesquisarUsuario(origem);
        usuarioDestino = usuarioService.pesquisarUsuario(destino);


        Mensagem mensagem1 = new Mensagem();

        mensagem1.setMensagem(mensagem);
        mensagem1.setUsuario(usuarioOrigem);
        mensagem1.setUsuarioDestino(usuarioDestino);

        return repositoryM.save(mensagem1);
    }





}
