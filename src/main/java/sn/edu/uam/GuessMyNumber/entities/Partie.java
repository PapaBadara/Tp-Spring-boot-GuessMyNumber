package sn.edu.uam.GuessMyNumber.entities;

import java.time.LocalDateTime;

public class Partie {

    private Long id;              // identifiant unique de la partie
    private String joueur;        // nom du joueur
    private LocalDateTime date;   // date de la partie
    private int tentatives;       // nombre de tentatives

    // Constructeur par défaut
    public Partie() {
        this.date = LocalDateTime.now();  // initialise la date à maintenant
        this.tentatives = 0;              // initialise les tentatives à 0
    }

    // Constructeur avec nom du joueur
    public Partie(String joueur) {
        this();
        this.joueur = joueur;
    }

    // ===== Getters et Setters =====

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getJoueur() {
        return joueur;
    }

    public void setJoueur(String joueur) {
        this.joueur = joueur;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public int getTentatives() {
        return tentatives;
    }

    public void setTentatives(int tentatives) {
        this.tentatives = tentatives;
    }

}
