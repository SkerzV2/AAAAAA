/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dofussort;

/**
 *
 * @author erwan
 */
public class Sort {
    private String nom;
    private int degatMax;
    private int degatMin;
    private int niveau;
    private String element;

    public Sort(String nom, int degatMax, int degatMin, int niveau, String element) {
        this.nom = nom;
        this.degatMax = degatMax;
        this.degatMin = degatMin;
        this.niveau = niveau;
        this.element = element;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getDegatMax() {
        return degatMax;
    }

    public void setDegatMax(int degatMax) {
        this.degatMax = degatMax;
    }
    public void gagneDegatMax(int degatMax) {
        this.degatMax += degatMax;
    }
    public void gagneDegatMin(int degatMin) {
        this.degatMin += degatMin;
    }

    public void setDegatMin(int degatMin) {
        this.degatMin = degatMin;
    }

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    @Override
    public String toString() {
        return "Sort{" + "nom=" + nom + ", degatMax=" + degatMax + ", degatMin=" + degatMin + ", niveau=" + niveau + ", element=" + element + '}';
    }
    
    
}
