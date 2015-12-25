package edu.ip.agendanumerique;

//import static agendanumerique.PanneauBas.ajout;
//import static agendanumerique.PanneauBas.fermer;
//import static agendanumerique.PanneauBasAjout.annuler;
//import static agendanumerique.PanneauBasAjout.enregistrer;
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

public class PanneauBasModifier extends JPanel{
    public static JButton enregistrer;
    public static JButton annuler;
    public PanneauBasModifier(){
        this.setPreferredSize(new Dimension(400,40));
    
        enregistrer=new JButton("ENREGISTRER");
        annuler=new JButton("ANNULER");
        
        this.setLayout(new FlowLayout());
        this.add(enregistrer);
        this.add(annuler);
        
        
        enregistrer.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                
                int ligne=PanneauCentre.table.getSelectedRow();                
                
                String matricule=PanneauCentreModifier.champMatricule.getText();
                String nom=PanneauCentreModifier.champNom.getText();
                String prenom=PanneauCentreModifier.champPrenom.getText();
                String numeroTelephone=PanneauCentreModifier.champNumeroTelephone.getText();
                
               // String newContact[]={matricule, nom, prenom,numeroTelephone};
               // PanneauCentre.modelTable.addRow(newContact);
                Contact nouveauContact=new Contact(matricule, nom, prenom,numeroTelephone);
                AgendaNumerique.liste.set(ligne, nouveauContact);
                Fichier.ecrire(AgendaNumerique.liste);
                PanneauCentre.afficheur();
                
                //fermeture de a fenetre
                AgendaNumerique.fenetreModifier.setVisible(false);
                
                //reinitialisation des champs
                PanneauCentreModifier.champMatricule.setText("");
                PanneauCentreModifier.champNom.setText("");
                PanneauCentreModifier.champPrenom.setText("");
                PanneauCentreModifier.champNumeroTelephone.setText("");
            }
        });
    
        
        annuler.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                AgendaNumerique.fenetreModifier.setVisible(false);
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
