package com.zup.FaceZup.Usuario;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    public Repository repository;

    public Usuario salvarUsuario(Usuario usuario){

        return repository.save(usuario);
    }

    public List<Usuario> exibirUsuarios(){
        return (List<Usuario>) repository.findAll();
    }

    public Usuario pesquisarUsuario(String email){

        return repository.findById(email).get();
    }


}
