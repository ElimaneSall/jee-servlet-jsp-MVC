package com.example.demojsf2;

import jakarta.enterprise.context.SessionScoped;
//import jakarta.faces.bean.ManagedBean;
import jakarta.inject.Named;
import java.io.Serializable;

@SessionScoped
@Named
//@ManagedBean
public class EleveBean implements Serializable {
    private String nom;
    private String prenom;
    private int age;
    // Constructeur par défaut
    public EleveBean() {}
    // Getters et setters pour les propriétés "nom", "prenom" et "age"
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}

