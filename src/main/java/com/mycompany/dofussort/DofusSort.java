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
public class DofusSort {  // 18.5/22 + [0.5 (BONUS) -0.5 (Le premier personnage créé n'est pas dans la liste des personnages.) - 0.5 (pour l'indentation)]
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {  
        ArrayList<Classe> classes = new ArrayList<Classe>();
        ArrayList<Personnage> personnages = new ArrayList<Personnage>();
        ArrayList<String> personnageActuels = new ArrayList<>();
        ArrayList<Sort> sorts = new ArrayList<Sort>();
        // Iop
        Classe iop = new Classe("Iop", "Dommages");
        classes.add(iop);
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
        Personnage caca = new Personnage("sandwich",iop);
        personnages.add(caca);
        Classe cra = new Classe("Crâ", "Portee");
        classes.add(cra);   
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
        classes.add(eniripsa);
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
        classes.add(feca);
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
        while(i != 11)
        {
            i = repet(11, 
                      "1- Créer un personnage\n"
                    + "2- Changer de personnage actuel\n"
                    + "3- Afficher la liste des sorts d'un personnage\n"
                    + "4- Augmenter le niveau du personnage actuel\n"
                    + "5- Augmenter les caractéristiques d'un personnage actuel\n"
                    + "6- Afficher la fiche personnage actuel\n"
                    + "7- Créer un sort et l'ajouter à une classe\n"
                    + "8- Créer une classe et lui ajouter 3 sorts que l'utilisateur va devoir créer\n"
                    + "9- Afficher la liste des sorts avec les dégâts en combat\n"
                    + "10- Afficher les sorts disponibles selon le niveau du personnage\n"
                    + "11- Quitter\n");
            if(i == 1) // 2.5/3 car plante si on met un nombre supérieur au nombre de classe.
            {
                int b =0;
                ArrayList<String> listBonus = new ArrayList<String>();
                System.out.println("entrer un Nom");
                    Scanner input1 = new Scanner(System.in);
                    String nom = input1.next();
                    for (Classe c : classes) {
                        b++;
                        System.out.println(b+" -Nom: " + c.getNom()+" | Bonus: "+c.getBonus());
                        }
                    System.out.println("choisissez une classe");
                    Scanner input2 = new Scanner(System.in);
                    int choixBonus = Integer.parseInt(input2.next());
                    Classe choixClass = classes.get(choixBonus - 1);
                    Personnage personnage = new Personnage(nom,choixClass);
                    personnages.add(personnage);
                    
                   for (Personnage p : personnages) {
                        System.out.println(" -Nom: " + p.getNom()+" | Classe: "+p.getClasse().getNom());

                        }
                   System.out.println("votre personnage a bien ete cree!");
                /* 1- Créer un personnage (Facile, Moyen si optimisé) /2-3
                Dans cette case, vous allez devoir créer un personnage. Cela consiste donc à demander à l'utilisateur
                un nom. Il faudra aussi lui montrer la liste des classes disponibles pour qu'il puisse choisir la sienne.
                */    
            }
            if(i == 2)  // 2/3 Problème d'affichage. + personnageActuels.clear() ?? -0.5 pour ça. Tu as essayé de trouver des nouvelles fonctions mais le problème du .clear et que ça efface les infos de l'ancien perso dans ton cas.
            {
                int per =0;
                for (Personnage p : personnages) {
                    per++;
                        System.out.println(per++ +"-" +p.toString());
                        }
                System.out.println("Choisissez un personnage:");
                Scanner input3 = new Scanner(System.in);
                int choixPersoActu = Integer.parseInt(input3.next());
                Personnage choixPersoActu1 = personnages.get(choixPersoActu - 1);
                personnageActuel = new Personnage(choixPersoActu1.getNom(), choixPersoActu1.getClasse());
                personnageActuels.clear();
                personnageActuels.add(choixPersoActu1.getNom());
                System.out.println("le personnage princiaple est maintenant :"+personnageActuels);
                
                
                /* 2- Changer de personnage actuel (Facile, Moyen si optimisé) /2-3
                Dans cette case, vous allez devoir afficher la liste des personnages à l'utilisateur.
                Celui-ci va pouvoir en sélectionner un pour qu'il soit le personnage actuel.
                */
            }
            if(i == 3) // 3/3
            {
                int per =0;
                for (Personnage p : personnages) {
                    per++;
                        System.out.println(per+" -Nom: " + p.getNom()+" | Classe: "+p.getClasse().getNom());
                        }
                System.out.println("Choisissez un personnage:");
                Scanner input4 = new Scanner(System.in);
                int choixPersoActu3 = Integer.parseInt(input4.next());
                Personnage choixPerso = personnages.get(choixPersoActu3 - 1);
                System.out.println(choixPerso.getClasse().getListeSort());
                
                
                
                /* 3- Afficher la liste des sorts du personnage actuel (Facile, Moyen si optimisé) /2-3
                Dans cette case, vous allez demander à l'utilisateur de quel personnage veut-il voir les sorts.
                Vous afficherez la liste des personnages disponibles pour l'aider dans son choix.
                */
            }
            if(i == 4) // 2/2
            {
                int niveau = 0;
                do {
                    System.out.println("à quel niveau voulez vous mettre votre personnage (nombre compris entre 1 et 200)");
                Scanner input5 = new Scanner(System.in);
                niveau = Integer.parseInt(input5.next());
                
                }while (niveau<=0 | niveau >= 200);
                    personnageActuel.setNiveau(niveau);
                    System.out.println("Nom: "+personnageActuel.getNom()+" | Niveau: "+personnageActuel.getNiveau());
                }
                
                
                
                
                /* 4- Augmenter le niveau du personnage actuel (Facile) /2
                Dans cette case, il faudra demander à l'utilisateur à quel niveau il veut mettre son personnage (nombre compris entre 1 et 200)
                */
            
            if(i == 5) // 2/2 Bien !
            {
                int choixComp =0;
                System.out.println("1 -Aire: "+personnageActuel.getAirStatistique()+
                        "\n 2 -Feu: "+personnageActuel.getFeuStatistique()+
                        "\n 3 -Eau: "+personnageActuel.getEauStatistique()+
                        "\n 4 -Terre: "+personnageActuel.getTerreStatistique());
                Scanner input7 = new Scanner(System.in);
                choixComp = Integer.parseInt(input7.next());

                if(choixComp == 1){
                    System.out.println("de combien voulez vous la changer");

                    Scanner input6 = new Scanner(System.in);
                    int augmenCara = Integer.parseInt(input6.next());
                    personnageActuel.setAirStatistique(augmenCara);
                    System.out.println("Aire: "+personnageActuel.getAirStatistique());
                }
                if(choixComp == 2){
                    System.out.println("de combien voulez vous la changer");

                    Scanner input6 = new Scanner(System.in);
                    int augmenCara = Integer.parseInt(input6.next());
                    personnageActuel.setFeuStatistique(augmenCara);
                    System.out.println("Feu: "+personnageActuel.getFeuStatistique());

                }
                if(choixComp == 3){
                    System.out.println("de combien voulez vous la changer");

                    Scanner input6 = new Scanner(System.in);
                    int augmenCara = Integer.parseInt(input6.next());
                    personnageActuel.setEauStatistique(augmenCara);
                    System.out.println("Eau: "+personnageActuel.getEauStatistique());

                }
                if(choixComp == 4){
                    System.out.println("de combien voulez vous la changer");

                    Scanner input6 = new Scanner(System.in);
                    int augmenCara = Integer.parseInt(input6.next());
                    personnageActuel.setTerreStatistique(augmenCara);
                    System.out.println("Terre: "+personnageActuel.getTerreStatistique());

                }
                /* 5- Augmenter les caractéristiques d'un personnage actuel (Facile) /2
                Dans cette case, il faudra demander à l'utilisateur quelle caractéristique il veut changer (eau, terre, feu, air) puis de combien il veut la changer.
                */ 
            
            }
            if(i == 6) // 3/3
            {
                System.out.println(personnageActuel.toString());
                /* 6- Afficher la fiche personnage (Moyen) /3
                Dans cette case, on voudra afficher toute les informations relatives au personnage actuel (Nom, Classe, Caractéristique, Niveau, Liste Sorts).
                */
            }
            if(i == 7) // 2.5/3 /!\ L'utilisateur peut entrer n'importe quel élément et cela peut casser le code au moment d'afficher les dégâts par statistique.
            {
                int b =0;
                for (Classe c : classes) {
                        b++;
                        System.out.println(b+" -Nom: " + c.getNom()+" | Bonus: "+c.getBonus());
                        }
                System.out.println("choisissez une classe");
                Scanner input8 = new Scanner(System.in);
                int choixClass = Integer.parseInt(input8.next());
                Classe choixClass1 = classes.get(choixClass - 1);
                System.out.println("entrer un Nom");
                Scanner input1 = new Scanner(System.in);
                String nom = input1.next();
                System.out.println("rentrer les degat-minimum");
                Scanner input2 = new Scanner(System.in);
                int degatMin = Integer.parseInt(input2.next());
                System.out.println("rentrer les degat-max");
                Scanner input3 = new Scanner(System.in);
                int degatMax = Integer.parseInt(input3.next());
                System.out.println("entrer un Element");
                Scanner input4 = new Scanner(System.in);
                String element = input4.next();
                Sort sort = new Sort(nom, degatMax, degatMin, degatMax, element);
                choixClass1.addSort(sort);
                System.out.println(sort);
                    
                    
                /* 7- Créer un sort et l'ajouter à une classe (Facile, Moyen si optimisé) /2-3
                Dans cette case, on voudra créer un sort et l'ajouter à la liste des sorts d'un personnage.
                */
            }
            if(i == 8) // 2/3 dommage tu ne l'ajoutes pas à la liste des classes disponibles.
            {
                int b=0;
                System.out.println("entrer un Nom");
                    Scanner input1 = new Scanner(System.in);
                    String nom1 = input1.next();
                    System.out.println("entrer un bonus");
                    Scanner input4 = new Scanner(System.in);
                    String element = input4.next();
                    Classe classe = new Classe(nom1,element);
                    
                while(b<=2){
                    System.out.println("-------------------------------------");
                    b++;
                System.out.println("entrer le Nom du sort");
                Scanner input2 = new Scanner(System.in);
                String nom = input1.next();
                System.out.println("rentrer les degat-minimum");
                Scanner input3 = new Scanner(System.in);
                int degatMin = Integer.parseInt(input2.next());
                System.out.println("rentrer les degat-max");
                Scanner input9 = new Scanner(System.in);
                int degatMax = Integer.parseInt(input9.next());
                System.out.println("entrer un Element");
                Scanner input10 = new Scanner(System.in);
                String element1 = input10.next();
                Sort sort = new Sort(nom, degatMax, degatMin, degatMax, element1);
                classe.addSort(sort);
                System.out.println(sort);
                }
                
                    
                
                /* 8- Créer une classe et lui ajouter à sa liste de sorts 3 sorts que l'utilisateur va devoir créer (Moyen) /3
                Créer une classe (nom, bonus) et lui ajouter à sa liste de sorts 3 sorts que l'utilisateur va devoir créer dans le même temps (nom, degatMax, degatMin, niveau, element entre terre, eau, feu, air)
                */
            }
            if(i == 9)  // +0.5 y'a de l'idée.
            {
                System.out.println(personnageActuel.getClasse().getListeSort());
                //for(Sort s:sorts){
                    //if(personnageActuel.getClasse().getBonus()=='feu'){
                  //  s.gagneDegatMax(personnageActuel.getFeuStatistique());
               // }
                //j'ai essayer de faire une boucle for dans la quelle je veux recuperer tous les sort ensuite je dois comparer l'element du sort et le comparer avec les caracteristique du personnage
                //et utiliser la fonction gagne DegatMax et MIn et le tour est jouer
                }
            
                    
                /* 9- Afficher la liste des sorts avec les dégâts en combat. Les dégâts en combat = dégât + caractéristique lié à l'élément du sort (Moyen, Difficile si optimisé) /3-5
                Par exemple, on a un personnage ayant 250 en eau, il va pouvoir taper 280-290 avec son sort eau qui tape de base 30-40.
                */
            }
            if(i == 10)
            {
               System.out.println(personnageActuel.getClasse().getListeSort());
                
                /* 10- Afficher les sorts disponibles selon le niveau du personnage (Moyen, Difficile si optimisé) /3-5
                Par exemple, on a un personnage ayant 250 en eau, il va pouvoir taper 280-290 avec son sort eau qui tape de base 30-40.
                */
            }
            if(i == 11)
            {
                System.out.println("Bye bye");
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
  public static ArrayList<String> remplirListeGenre(ArrayList<Classe> p)
    {
        ArrayList<String> listBonus = new ArrayList<String>();
        for(Classe bonus : p)
        {
            if(listBonus.contains(bonus.getBonus()) == false)
            {
                listBonus.add(bonus.getBonus());
            }
            if(listBonus.contains(bonus.getBonus()) == false)
            {
                listBonus.add(bonus.getBonus());
            }
        }
        return listBonus;
    }
   public static ArrayList<String> remplirListecompetence(ArrayList<Classe> p)
    {
        ArrayList<String> listBonus = new ArrayList<String>();
        for(Classe bonus : p)
        {
            if(listBonus.contains(bonus.getBonus()) == false)
            {
                listBonus.add(bonus.getBonus());
            }
            if(listBonus.contains(bonus.getBonus()) == false)
            {
                listBonus.add(bonus.getBonus());
            }
        }
        return listBonus;
    }
    
}
