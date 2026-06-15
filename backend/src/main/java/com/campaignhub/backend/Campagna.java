package com.campaignhub.backend;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "campagne")
public class Campagna {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String stato;
    private int inviati;
    private double apertura;
    private LocalDateTime dataCreazione;

    // Costruttore vuoto (obbligatorio per JPA)
    public Campagna() {}

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getStato() { return stato; }
    public void setStato(String stato) { this.stato = stato; }

    public int getInviati() { return inviati; }
    public void setInviati(int inviati) { this.inviati = inviati; }

    public double getApertura() { return apertura; }
    public void setApertura(double apertura) { this.apertura = apertura; }

    public LocalDateTime getDataCreazione() { return dataCreazione; }
    public void setDataCreazione(LocalDateTime dataCreazione) { this.dataCreazione = dataCreazione; }
}
