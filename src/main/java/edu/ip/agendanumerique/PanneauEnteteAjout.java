package edu.ip.agendanumerique;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class PanneauEnteteAjout extends JPanel{
    public PanneauEnteteAjout(){
         this.setPreferredSize(new Dimension(400,50));
    }
    
     @Override
  public void paintComponent(Graphics g){
        
        try{
            Image img=ImageIO.read(new File("livrejaune.jpg"));
            g.drawImage(img, 0,0, 400, 100, this);
        }catch(IOException e){
        }
        Font font=new Font("Arial Black",Font.BOLD,20);
        g.setFont(font);
        g.drawString("AJOUTER UN CONTACT", 50, 45);
        g.setFont( new  Font("Arial Black",Font.ITALIC,15));
       // g.drawString("version 1.0", 350, 90);
       // g.drawLine(0, 100, 800, 100);
    }
}
