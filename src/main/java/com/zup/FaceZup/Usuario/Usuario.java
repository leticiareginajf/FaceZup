package com.zup.FaceZup.Usuario;

import javax.persistence.*;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String sobrenome;
    private String email;
    private String cargo;

    public Usuario(){

    }

    public Usuario(int id, String nome, String sobrenome, String email, String cargo) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.cargo = cargo;
    }

    
}
