package com.zup.FaceZup.Usuario;

import com.zup.FaceZup.Mensagem.Mensagem;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.util.List;

@Entity
@Table(name = "usuarios")
public class Usuario {


    private String nome;
    private String sobrenome;
    @Id
    private String email;
    private String cargo;
    private List<Mensagem> mensagens;

    public Usuario(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}