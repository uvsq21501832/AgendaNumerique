package edu.ip.agendanumerique;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class PanneauEntete extends JPanel{
    public PanneauEntete(){
        this.setPreferredSize(new Dimension(1200,100));
    }
    @Override
  public void paintComponent(Graphics g){
        
        try{
            Image img=ImageIO.read(new File("livrejaune.jpg"));
            g.drawImage(img, 0,0, 1200, 100, this);
        }catch(IOException e){
        }
        Font font=new Font("Arial Black",Font.BOLD,30);
        g.setFont(font);
        g.drawString("AGENDA ELECTRONIQUE", 400, 45);
        g.setFont( new  Font("Arial Black",Font.ITALIC,15));
        g.drawString("version 1.0", 550, 90);
        g.drawLine(0, 100, 800, 100);
    }
}
