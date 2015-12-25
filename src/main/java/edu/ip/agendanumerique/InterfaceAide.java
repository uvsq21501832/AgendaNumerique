package edu.ip.agendanumerique;

//import static agendanumerique.PanneauBasAjout.annuler;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class InterfaceAide extends JFrame{
    public InterfaceAide(){
        this.setSize(300, 400);
        this.setLayout(new FlowLayout());
        this.setResizable(false);
        this.setLocationRelativeTo(null);
               String texteAcceuil="\tBIENVENU\n\t   DANS\n          AGENDA ELECTRONIQUE\n\n"
                + "AJOUTER: permet d'enregistrer un nouveau\ncontact"
              + "\n\nMODIFIER: permet de changer les informa-\ntions d'un contact"
               + "\n\nSUPPRIMER: permet de d'effacer un contact"
              + "\n\nFERMER: permet de quitter l'agenda"
                       + "\n\n\t   MERCI\nPOUR AVOIR CHOISI CETTE APPLICATION";

        JTextArea feuille=new JTextArea(18,24);
        Font font=new Font("",Font.BOLD, 13);
        feuille.setFont(font);
        feuille.setText(texteAcceuil);
        feuille.setBackground(Color.orange);
        feuille.setEditable(false);
        this.add(feuille);
        JButton ok=new JButton("OK");
        this.add(ok);
        
        ok.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                AgendaNumerique.fenetreAide.setVisible(false);
                AgendaNumerique.fenetre.setEnabled(true);
            }
        });
    }
    
}
