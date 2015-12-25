package edu.ip.agendanumerique;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JFrame;

public class InterfaceAjout extends JFrame{
    
    public static PanneauEnteteAjout entete;
    public static PanneauBasAjout bas;
    public static PanneauCentreAjout centre;
    
    public InterfaceAjout(){
        this.setSize(400,300);
        Container panneau=this.getContentPane();
        panneau.setLayout(new BorderLayout());
        
        entete=new PanneauEnteteAjout();
        bas=new PanneauBasAjout();
        centre=new PanneauCentreAjout();
        
        
        this.add(entete,BorderLayout.NORTH);
        this.add(bas, BorderLayout.SOUTH);
        this.add(centre, BorderLayout.CENTER);
        
        this.setLocationRelativeTo(null);
        //this.setVisible(true);
       // this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
