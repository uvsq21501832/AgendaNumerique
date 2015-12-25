package edu.ip.agendanumerique;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanneauCentreModifier extends JPanel{
    
    public static JTextField champMatricule;
    public static JTextField champNom;
    public static JTextField champPrenom;
    public static JTextField champNumeroTelephone;
    
    
    public PanneauCentreModifier(){
        
        this.setLayout(new FlowLayout());
        
        JLabel matricule=new JLabel("MATRICULE    ");
        champMatricule=new JTextField(25);
        champMatricule.setPreferredSize(new Dimension(150,30));
        JLabel nom=new JLabel("NOM                 ");
        champNom=new JTextField(25);
        champNom.setPreferredSize(new Dimension(150,30));
        JLabel prenom=new JLabel("PRENOM          ");
        champPrenom=new JTextField(25);
        champPrenom.setPreferredSize(new Dimension(150,30));
        JLabel numeroTelephone=new JLabel("N°TELEPHONE");
        champNumeroTelephone=new JTextField(25);
        champNumeroTelephone.setPreferredSize(new Dimension(150,30));
        
        this.add(matricule);
        this.add(champMatricule);
        this.add(nom);
        this.add(champNom);
        this.add(prenom);
        this.add(champPrenom);
        this.add(numeroTelephone);
        this.add(champNumeroTelephone);
    }
    
}
