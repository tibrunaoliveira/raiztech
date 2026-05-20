package com.raiztech.raiztech_api.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "planta")
public class Planta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String especie;

    private String localizacao;

    private Double umidadeMinima;

    private Boolean irrigacaoAutomatica;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    public Planta() {
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public Double getUmidadeMinima() {
        return umidadeMinima;
    }

    public void setUmidadeMinima(Double umidadeMinima) {
        this.umidadeMinima = umidadeMinima;
    }

    public Boolean getIrrigacaoAutomatica() {
        return irrigacaoAutomatica;
    }

    public void setIrrigacaoAutomatica(Boolean irrigacaoAutomatica) {
        this.irrigacaoAutomatica = irrigacaoAutomatica;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
