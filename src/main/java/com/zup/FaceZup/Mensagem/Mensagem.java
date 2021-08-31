package com.zup.FaceZup.Mensagem;

import com.zup.FaceZup.Usuario.Usuario;

import javax.persistence.*;

@Entity
@Table(name = "mensagem")
public class Mensagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String mensagem;
    @ManyToOne
    @JoinColumn(name = "origem", nullable = false)
    private Usuario usuario;
    @ManyToOne
    @JoinColumn(name = "destino", nullable = false)
    private Usuario usuarioDestino;

    public Mensagem(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Usuario getUsuarioDestino() {
        return usuarioDestino;
    }

    public void setUsuarioDestino(Usuario usuarioDestino) {
        this.usuarioDestino = usuarioDestino;
    }
}
