package edu.ip.agendanumerique;

import java.util.ArrayList;

public class AgendaNumerique {

    public static ArrayList<Contact> liste;
    public static Fichier fichier;
    public static InterfaceAjout fenetreAjout;
    public static InterfaceModifier fenetreModifier;
    public static InterfaceAide fenetreAide;
    public static Interface fenetre;

    public static void main(String[] args) {
        liste = new ArrayList<Contact>();

        fichier = new Fichier();
        liste = Fichier.lire();

        fenetreAide = new InterfaceAide();
        fenetreAjout = new InterfaceAjout();
        fenetreModifier = new InterfaceModifier();
        //affiche();
        fenetre = new Interface();
        PanneauCentre.afficheur();



    }

}
