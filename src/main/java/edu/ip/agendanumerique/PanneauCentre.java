package edu.ip.agendanumerique;

//import agendanumerique.AgendaNumerique;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PanneauCentre extends JPanel{
    
    public static JTable table;
    public static DefaultTableModel modelTable;
    
    public PanneauCentre(){
        setLayout(new GridLayout(1,1));
       // setPreferredSize(new Dimension(this.getWidth(),this.getHeight()));
        
        String[][] donnee={};
        String [] titre={};
        table=new JTable(donnee, titre);
        modelTable=new DefaultTableModel();
        
        modelTable.addColumn("MATRICULE");
        modelTable.addColumn("NOM");
        modelTable.addColumn("PRENOM");
        modelTable.addColumn("N°TELEPHONE");
        
        table.setModel(modelTable);
        table.setFont(new Font("Cambria ",Font.BOLD,16));
        table.setRowHeight(30);
        table.setForeground(Color.BLACK);
        table.setGridColor(Color.yellow);
        table.setRowHeight(30);
        //table.setEnabled(false);
        JScrollPane scroll=new JScrollPane(table);
        scroll.setSize(600, 550);
        
        this.add(scroll);
        
        
    }
    @Override
        public  void paintComponent(Graphics g){
        
    }
    
    public static void afficheur(){
//        String test[]={"7436","ILLY","POULMANOGO","+22674128956"};
//        modelTable.addRow(test);
        
        String matricule;
        String nom;
        String prenom;
        String numeroTelephone;

        //String [] newContact={matricule,nom,prenom,numeroTelephone};
        modelTable.setRowCount(0);

        for (int i = 0; i < AgendaNumerique.liste.size(); i++) {
            matricule = AgendaNumerique.liste.get(i).getMatricule();
            nom = AgendaNumerique.liste.get(i).getNom();
            prenom = AgendaNumerique.liste.get(i).getPrenom();
            numeroTelephone = AgendaNumerique.liste.get(i).getNumeroTelephone();

            String[] newContact = {matricule, nom, prenom, numeroTelephone};
            PanneauCentre.modelTable.addRow(newContact);

        }
    }
}
