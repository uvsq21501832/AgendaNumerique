package edu.ip.agendanumerique;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JFrame;

public class Interface extends JFrame{
    public static PanneauEntete entete;
    public static PanneauCentre centre;
    public static PanneauGauche gauche;
    public static PanneauDroite droite;
    public static PanneauBas bas;
    
    public Interface(){
        this.setSize(1200, 750);
        
        Container panneau=this.getContentPane();
        panneau.setSize(1200, 750);
        
        panneau.setLayout(new BorderLayout());
        
        entete=new PanneauEntete();
        centre=new PanneauCentre();
        gauche=new PanneauGauche();
        droite=new PanneauDroite();
        bas=new PanneauBas();
        
        panneau.add(entete, BorderLayout.NORTH);
        panneau.add(centre, BorderLayout.CENTER);
        panneau.add(gauche, BorderLayout.EAST);
        panneau.add(droite, BorderLayout.WEST);
        panneau.add(bas, BorderLayout.SOUTH);
        
        
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
