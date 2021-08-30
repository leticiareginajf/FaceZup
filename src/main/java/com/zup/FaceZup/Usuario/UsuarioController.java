package com.zup.FaceZup.Usuario;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Usuario cadastrarUsuario(@RequestBody @Valid Usuario usuario){
        return usuarioService.salvarUsuario(usuario);
    }


    @GetMapping
    public List<Usuario> exibirUsuario(){
        return usuarioService.exibirUsuarios();
    }



}
