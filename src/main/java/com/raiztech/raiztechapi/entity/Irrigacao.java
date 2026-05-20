package com.raiztech.raiztech_api.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "irrigacao")
public class Irrigacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Boolean automatica;

    private Integer duracaoSegundos;

    private LocalDateTime dataHora;

    @ManyToOne
    @JoinColumn(name = "planta_id")
    private Planta planta;

    public Irrigacao() {
        this.dataHora = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public Boolean getAutomatica() {
        return automatica;
    }

    public void setAutomatica(Boolean automatica) {
        this.automatica = automatica;
    }

    public Integer getDuracaoSegundos() {
        return duracaoSegundos;
    }

    public void setDuracaoSegundos(Integer duracaoSegundos) {
        this.duracaoSegundos = duracaoSegundos;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public Planta getPlanta() {
        return planta;
    }

    public void setPlanta(Planta planta) {
        this.planta = planta;
    }
}
