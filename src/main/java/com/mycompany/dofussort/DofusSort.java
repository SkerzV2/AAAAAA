/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dofussort;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author erwan
 */
public class DofusSort {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {                
        // Iop
        Classe iop = new Classe("Iop", "Dommages");
        
        // Création de ses sorts
        Sort epee_destructrice = new Sort("Épee Destructrice", 50, 30, 1, "Terre");
        Sort bond = new Sort("Bond", 20, 10, 1, "Air");
        Sort intimidation = new Sort("Intimidation", 40, 25, 1, "Terre");
        Sort colere_de_iop = new Sort("Colere de Iop", 70, 50, 3, "Eau");
        Sort pression = new Sort("Pression", 30, 20, 6, "Terre");
        
        
        iop.addSort(epee_destructrice);
        iop.addSort(bond);
        iop.addSort(intimidation);
        iop.addSort(colere_de_iop);
        iop.addSort(pression);
        

        // Crâ
        Classe cra = new Classe("Crâ", "Portee");
        
        // Création de ses sorts
        Sort fleche_explosive = new Sort("Fleche Explosive", 35, 20, 1, "Feu");
        Sort tir_critique = new Sort("Tir Critique", 25, 15, 1, "Air");
        Sort fleche_percante = new Sort("Fleche Percante", 45, 30, 1, "Air");
        Sort fleche_glacee = new Sort("Fleche Glacee", 30, 25, 3, "Terre");
        Sort tir_puissant = new Sort("Tir Puissant", 60, 50, 6, "Air");
        
        
        cra.addSort(fleche_explosive);
        cra.addSort(tir_critique);
        cra.addSort(fleche_percante);
        cra.addSort(fleche_glacee);
        cra.addSort(tir_puissant);
        

        // Eniripsa
        Classe eniripsa = new Classe("Eniripsa", "soins");
        
        // Création de ses sorts
        Sort mot_flambant = new Sort("Mot Soignant", 25, 20, 1, "Feu");
        Sort mot_assommant = new Sort("Mot Revitalisant", 0, 50, 1, "Eau");
        Sort mot_interdit = new Sort("Mot Interdit", 40, 30, 1, "Terre");
        Sort mot_de_precipitation = new Sort("Mot de Precipitation", 0, 0, 3, "Eau");
        Sort mot_de_sacrifice = new Sort("Mot de Sacrifice", 0, 0, 6, "Eau");
        
        
        eniripsa.addSort(mot_flambant);
        eniripsa.addSort(mot_assommant);
        eniripsa.addSort(mot_interdit);
        eniripsa.addSort(mot_de_precipitation);
        eniripsa.addSort(mot_de_sacrifice);
        
        // Feca
        Classe feca = new Classe("Feca", "Armure");
        
        // Création de ses sorts
        Sort glyphe_enflamme = new Sort("Glyphe Enflamme", 25, 20, 1, "Feu");
        Sort bouclier_feca = new Sort("Bouclier Feca", 0, 0, 1, "Terre");
        Sort bulle = new Sort("Bulle", 40, 30, 1, "Eau");
        Sort glyphe_aveuglant = new Sort("Glyphe Aveuglant", 0, 0, 3, "Feu");
        Sort glyphe_d_armure = new Sort("Glyphe d'Armure", 0, 0, 6, "Feu");
        
        
        feca.addSort(glyphe_enflamme);
        feca.addSort(bouclier_feca);
        feca.addSort(bulle);
        feca.addSort(glyphe_aveuglant);
        feca.addSort(glyphe_d_armure);
        
        System.out.println("Bienvenue jeune âme ! Bienvenue dans le monde des Douze.");
        System.out.println("Un  monde paisible sous la protection des douze Dieux, une terre de légende où règne la magie des Dofus, six oeufs de dragon, symboles de puissance et porteurs d'espoir.");
        System.out.println("Jusqu'à ce jour terrible, où ils furent dérobés !");
        System.out.println("Depuis, l'harmonie est perturbée, éléments et monstres se déchaînent.");
        System.out.println("Le temps est venue ! Ta destinée te mène à Incarnam.");
        System.out.println("Découvre le monde, trouve de précieux alliés, retrouve les Dofus, deviens un héros et entre dans la légende !");

        String aff = "A quelle classe appartenez-vous ? (1-4)\n"
                + "1 - Féca\n"
                + "2 - Iop\n"
                + "3 - Cra\n"
                + "4 - Eniripsa\n";
        int choix = repet(4, aff);
        Classe choixClasse;
        switch(choix)
        {
            case 1:
                choixClasse = feca;
                break;
            case 2:
                choixClasse = iop;
                break;
            case 3:
                choixClasse = cra;
                break;
            case 4:
                choixClasse = eniripsa;
                break;
            default:
                choixClasse = new Classe("BUG", "BUG");
                break;
        }
        
        System.out.println("Quel est votre nom disciple " + choixClasse.getNom()
                + " ?");
        String nomDuJoueur = s.next();
        System.out.println("Très bien " + nomDuJoueur + ", disciple " 
                + choixClasse.getNom() + ", l'aventure peut commencer !");
        
        Personnage personnageActuel = new Personnage(nomDuJoueur, choixClasse);
        
        int i = 0;
        while(i != 10)
        {
            i = repet(10, 
                      "1- Créer un personnage\n"
                    + "2- Changer de personnage actuel\n"
                    + "3- Afficher la liste des sorts d'un personnage\n"
                    + "4- Augmenter le niveau du personnage actuel\n"
                    + "5- Augmenter les caractéristiques d'un personnage actuel\n"
                    + "6- Afficher la fiche personnage actuel\n"
                    + "7- Créer un sort et l'ajouter à une classe\n"
                    + "8- Créer une classe et lui ajouter 3 sorts que l'utilisateur va devoir créer\n"
                    + "9- Afficher la liste des sorts avec les dégâts en combat\n"
                    + "10- Quitter\n");
            if(i == 1)
            {
                /* 1- Créer un personnage (Facile, Moyen si optimisé) /2-3
                Dans cette case, vous allez devoir créer un personnage. Cela consiste donc à demander à l'utilisateur
                un nom. Il faudra aussi lui montrer la liste des classes disponibles pour qu'il puisse choisir la sienne.
                */    
            }
            if(i == 2)
            {
                /* 2- Changer de personnage actuel (Facile, Moyen si optimisé) /2-3
                Dans cette case, vous allez devoir afficher la liste des personnages à l'utilisateur.
                Celui-ci va pouvoir en sélectionner un pour qu'il soit le personnage actuel.
                */
            }
            if(i == 3)
            {
                /* 3- Afficher la liste des sorts du personnage actuel (Facile, Moyen si optimisé) /2-3
                Dans cette case, vous allez demander à l'utilisateur de quel personnage veut-il voir les sorts.
                Vous afficherez la liste des personnages disponibles pour l'aider dans son choix.
                */
            }
            if(i == 4)
            {
                /* 4- Augmenter le niveau du personnage actuel (Facile) /2
                Dans cette case, il faudra demander à l'utilisateur à quel niveau il veut mettre son personnage (nombre compris entre 1 et 200)
                */
            }
            if(i == 5)
            {
                /* 5- Augmenter les caractéristiques d'un personnage actuel (Facile) /2
                Dans cette case, il faudra demander à l'utilisateur quelle caractéristique il veut changer (eau, terre, feu, air) puis de combien il veut la changer.
                */ 
            }
            if(i == 6)
            {
                /* 6- Afficher la fiche personnage (Moyen) /3
                Dans cette case, on voudra afficher toute les informations relatives au personnage actuel (Nom, Classe, Caractéristique, Niveau, Liste Sorts).
                */
            }
            if(i == 7)
            {
                /* 7- Créer un sort et l'ajouter à une classe (Facile, Moyen si optimisé) /2-3
                Dans cette case, on voudra créer un sort et l'ajouter à la liste des sorts d'un personnage.
                */
            }
            if(i == 8)
            {
                /* 8- Créer une classe et lui ajouter à sa liste de sorts 3 sorts que l'utilisateur va devoir créer (Moyen) /3
                Créer une classe (nom, bonus) et lui ajouter à sa liste de sorts 3 sorts que l'utilisateur va devoir créer dans le même temps (nom, degatMax, degatMin, niveau, element entre terre, eau, feu, air)
                */
            }
            if(i == 9)
            {
                /* 9- Afficher la liste des sorts avec les dégâts en combat. Les dégâts en combat = dégât + caractéristique lié à l'élément du sort (Difficile) /5
                Par exemple, on a un personnage ayant 250 en eau, il va pouvoir taper 280-290 avec son sort eau qui tape de base 30-40.
                */
            }
            if(i == 10)
            {
                System.out.println("Bye bye");
            }
        }
    }
    
    public static int repet(int max, String repet)
    {
        int r = 0;
        while(r < 1 | r > max)
        {
            try
            {
                System.out.println(repet);              
                r = Integer.parseInt(s.next()); 
                
            }
            catch(Exception e)
            {
            
            }
        }
        return r;
    }
   
}
