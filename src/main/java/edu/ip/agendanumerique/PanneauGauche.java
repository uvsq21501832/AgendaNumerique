package edu.ip.agendanumerique;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class PanneauGauche extends JPanel{
    public PanneauGauche(){
        this.setPreferredSize(new Dimension(150,550));
        this.setLayout(new FlowLayout());
    }
    @Override
  public void paintComponent(Graphics g){
        
        try{
            Image img=ImageIO.read(new File("esi2.JPG"));
            g.drawImage(img, 0,0, 150, 300, this);
            img=ImageIO.read(new File("livrecouleur.jpg"));
            g.drawImage(img, 0,300, 150, 300, this);
        }catch(IOException e){
        }
//        Font font=new Font("Arial Black",Font.BOLD,30);
//        g.setFont(font);
//        g.drawString("AGENDA ELECTRONIQUE", 150, 45);
//        g.setFont( new  Font("Arial Black",Font.ITALIC,15));
//        g.drawString("version 1.0", 350, 90);
//        g.drawLine(0, 100, 800, 100);
    }
    
}
