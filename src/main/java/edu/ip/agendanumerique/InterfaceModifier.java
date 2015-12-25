package edu.ip.agendanumerique;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JFrame;

public class InterfaceModifier extends JFrame{
    
    public static PanneauEnteteModifier entete;
    public static PanneauBasModifier bas;
    public static PanneauCentreModifier centre;
    
    public InterfaceModifier(){
        this.setSize(400,300);
        Container panneau=this.getContentPane();
        panneau.setLayout(new BorderLayout());
        
        entete=new PanneauEnteteModifier();
        bas=new PanneauBasModifier();
        centre=new PanneauCentreModifier();
        
        
        this.add(entete,BorderLayout.NORTH);
        this.add(bas, BorderLayout.SOUTH);
        this.add(centre, BorderLayout.CENTER);
        
        this.setLocationRelativeTo(null);
        //this.setVisible(true);
       // this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
