/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dofussort;

/**
 *
 * @author erwan
 */
public class Personnage {
    private String nom;
    private Classe classe;
    private int niveau;
    private int feuStatistique;
    private int eauStatistique;
    private int airStatistique;
    private int terreStatistique;

    public Personnage(String nom, Classe classe) {
        this.nom = nom;
        this.classe = classe;
        this.niveau = 1;
        this.airStatistique = 0;
        this.eauStatistique = 0;
        this.feuStatistique = 0;
        this.terreStatistique = 0;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public int getFeuStatistique() {
        return feuStatistique;
    }

    public void setFeuStatistique(int feuStatistique) {
        this.feuStatistique = feuStatistique;
    }

    public int getEauStatistique() {
        return eauStatistique;
    }

    public void setEauStatistique(int eauStatistique) {
        this.eauStatistique = eauStatistique;
    }

    public int getAirStatistique() {
        return airStatistique;
    }

    public void setAirStatistique(int airStatistique) {
        this.airStatistique = airStatistique;
    }

    public int getTerreStatistique() {
        return terreStatistique;
    }

    public void setTerreStatistique(int terreStatistique) {
        this.terreStatistique = terreStatistique;
    }   

    @Override
    public String toString() {
        return "Personnage{" + "nom=" + nom + ", classe=" + classe + ", niveau=" + niveau + ", feuStatistique=" + feuStatistique + ", eauStatistique=" + eauStatistique + ", airStatistique=" + airStatistique + ", terreStatistique=" + terreStatistique + '}';
    }
    
}
