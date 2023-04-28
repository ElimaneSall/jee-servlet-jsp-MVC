package com.example.demojpa.entities;



import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Produit {
    @Id
    private int id;
    private double prix;
    private int quantite;
    private String designation;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Produit(int id, double prix, int quantite, String designation) {
        this.id = id;
        this.prix = prix;
        this.quantite = quantite;
        this.designation = designation;
    }

    public Produit() {
        super();
    }

    @Override
    public String toString() {
        return "Produit{" +
                "id=" + id +
                ", prix=" + prix +
                ", quantite=" + quantite +
                ", designation='" + designation + '\'' +
                '}';
    }
}
