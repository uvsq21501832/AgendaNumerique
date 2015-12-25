package edu.ip.agendanumerique;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanneauBasAjout extends JPanel{
    public static JButton enregistrer;
    public static JButton annuler;
    public PanneauBasAjout(){
        this.setPreferredSize(new Dimension(400,40));
    
        enregistrer=new JButton("ENREGISTRER");
        annuler=new JButton("ANNULER");
        
        this.setLayout(new FlowLayout());
        this.add(enregistrer);
        this.add(annuler);
        
        
        enregistrer.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                String matricule=PanneauCentreAjout.champMatricule.getText();
                String nom=PanneauCentreAjout.champNom.getText();
                String prenom=PanneauCentreAjout.champPrenom.getText();
                String numeroTelephone=PanneauCentreAjout.champNumeroTelephone.getText();
                
                String newContact[]={matricule, nom, prenom,numeroTelephone};
                PanneauCentre.modelTable.addRow(newContact);
                Contact nouveauContact=new Contact(matricule, nom, prenom,numeroTelephone);
                AgendaNumerique.liste.add(nouveauContact);
                Fichier.ecrire(AgendaNumerique.liste);
                
                //fermeture de a fenetre
                AgendaNumerique.fenetreAjout.setVisible(false);
                
                //reinitialisation des champs
                InterfaceAjout.centre.champMatricule.setText("");
                InterfaceAjout.centre.champNom.setText("");
                InterfaceAjout.centre.champPrenom.setText("");
                InterfaceAjout.centre.champNumeroTelephone.setText("");
            }
        });
    
        
        annuler.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                AgendaNumerique.fenetreAjout.setVisible(false);
               // AgendaNumerique.fenetre.setEnabled(true);
            }
        });
    }
    
    @Override
  public void paintComponent(Graphics g){
        
        try{
            Image img=ImageIO.read(new File("ciel.jpg"));
            g.drawImage(img, 0,0, 400, 100, this);
        }catch(IOException e){
        }
    }
    
}
