package edu.ip.agendanumerique;

import java.awt.Color;
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

public class PanneauBas extends JPanel{
    public static JButton ajout;
    public static JButton fermer;
    
    public PanneauBas(){
        ajout=new JButton("AJOUTER");
        fermer=new JButton("FERMER");
        
        this.setLayout(new FlowLayout());
        this.add(ajout);
        this.add(fermer);
        
        
        ajout.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                AgendaNumerique.fenetreAjout.setVisible(true);
                //AgendaNumerique.fenetre.setEnabled(false);
            }
        });
    
        
        fermer.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                //Fichier.ecrire(null);
                System.exit(0);
            }
        });
    }
    
    @Override
  public void paintComponent(Graphics g){
        
        try{
            Image img=ImageIO.read(new File("ciel.jpg"));
            g.drawImage(img, 0,0, 1200, 100, this);
        }catch(IOException e){
        }
        g.setColor(Color.black);
    }
}
