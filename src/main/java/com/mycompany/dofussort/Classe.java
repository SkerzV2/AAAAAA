/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dofussort;

import java.util.ArrayList;

/**
 *
 * @author erwan
 */
public class Classe {
    private String nom;
    private ArrayList<Sort> listeSort;
    private String bonus;

    public Classe(String nom, String bonus) {
        this.nom = nom;
        this.bonus = bonus;
        this.listeSort = new ArrayList<Sort>();
    }
    
    public void addSort(Sort sortAjout)
    {
        this.listeSort.add(sortAjout);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getBonus() {
        return bonus;
    }

    public void setBonus(String bonus) {
        this.bonus = bonus;
    }

    public ArrayList<Sort> getListeSort() {
        return listeSort;
    }
    
}
