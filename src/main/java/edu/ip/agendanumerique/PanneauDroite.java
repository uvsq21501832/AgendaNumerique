package edu.ip.agendanumerique;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class PanneauDroite extends JPanel{
    public static JButton modifier;
    public static JButton supprimer;
    public static JButton aide;
    public PanneauDroite(){
        this.setPreferredSize(new Dimension(160,550));
        this.setLayout(new FlowLayout());
        
        String texte="             BIENVENU\n          SUR VOTRE \nAGENDA ELECTRONIQUE\n"
                + "        CET ASSISTANT\n        VOUS PERMET \n  DE GERER AISEMENT\n   VOS CONTACT SANS \nRISQUE DE "
                + "CONFUSION";
        JTextArea acceuil=new JTextArea(texte, 10, 12);
        //acceuil.setEnabled(false);
        Font font=new Font("",Font.BOLD, 13);
        acceuil.setFont(font);
        acceuil.setEditable(false);
        
        this.add(acceuil);
        acceuil.setBackground(Color.ORANGE);
        //acceuil.setEnabled(false);
        
        modifier=new JButton("MODIFIER");
        supprimer=new JButton("SUPPRIMER");
        aide=new JButton("AIDE");
        
        supprimer.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                int ligne=PanneauCentre.table.getSelectedRow();//System.out.print("ligne: "+ligne);
                AgendaNumerique.liste.remove(ligne);
                Fichier.ecrire(AgendaNumerique.liste);
                PanneauCentre.afficheur();
            }
        });
        
        
        modifier.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                AgendaNumerique.fenetreModifier.setVisible(true);
                
                int ligne=PanneauCentre.table.getSelectedRow();
                
                //affichage des donnees acteulles
                PanneauCentreModifier.champMatricule.setText(AgendaNumerique.liste.get(ligne).getMatricule());
                PanneauCentreModifier.champNom.setText(AgendaNumerique.liste.get(ligne).getNom());
                PanneauCentreModifier.champPrenom.setText(AgendaNumerique.liste.get(ligne).getPrenom());
                PanneauCentreModifier.champNumeroTelephone.setText(AgendaNumerique.liste.get(ligne).getNumeroTelephone());

                //AgendaNumerique.fenetre.setEnabled(false);
            }
        });
        
        aide.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                AgendaNumerique.fenetreAide.setVisible(true);
                //AgendaNumerique.fenetre.disable();//.setEnabled(false);
            }
        });
        
        JLabel gestionnaire=new JLabel("GESTIONNAIRE");
        this.add(gestionnaire);
        this.add(modifier);
        this.add(supprimer);
        this.add(aide);
        
        JTextArea auteurs=new JTextArea("                    AUTEURS\n\n"
                                      + "          ILLY Poulmanogo\n"
                                      + "                         &\n"
                                      + "          OUEDRAOGO Aïda", 5, 15);
         font=new Font("",Font.BOLD, 12);
        auteurs.setFont(font);
        this.add(auteurs);
        auteurs.setBackground(Color.GREEN);
        auteurs.setEditable(false);
        //this.add(new JButton("nfdjbvk"));
    }
         @Override
  public void paintComponent(Graphics g){
        
        try{
            Image img=ImageIO.read(new File("etudiants.jpg"));
            g.drawImage(img, 0,385, 160, 200, this);
            
             Font font=new Font("Arial Black",Font.BOLD, 13);
            g.setFont(font);
         // g.drawString("GESTIONNAIRE", 10, 200);
//            img=ImageIO.read(new File("livrecouleur.jpg"));
//            g.drawImage(img, 0,300, 150, 300, this);
        }catch(IOException e){
        }
        
    }
}
