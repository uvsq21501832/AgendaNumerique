package edu.ip.agendanumerique;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
public class Fichier {

	//fonction d'ecriture dans le fichier
	/*public void ecrire(Contact c){
		
		ObjectOutputStream wr;
		try{
			wr=new ObjectOutputStream(
					new BufferedOutputStream(
							new FileOutputStream(
									new File("Agenda.txt"))));
			
                        wr.writeObject(c);
                    
                        
			wr.close();
		}
		catch(FileNotFoundException e){
		}
		catch(IOException e){
		}
	}*/
	//fonction d'ecriture das le fichier a base de la liste
	public static void ecrire(ArrayList<Contact> liste){
		ObjectOutputStream wr;
		try{
			wr=new ObjectOutputStream(
					new BufferedOutputStream(
							new FileOutputStream(
									new File("Agenda.txt"))));
			for(int i=0;i<liste.size();i++){
				wr.writeObject(liste.get(i));
			}
			
			wr.close();
		}
		catch(FileNotFoundException e){
		}
		catch(IOException e){
		}
	}
	
		//fonction de lecture dans le fichier	
		public static ArrayList<Contact> lire(){
			ArrayList<Contact> liste=new ArrayList<Contact>();
			ObjectInputStream rd;
			    try{
				rd=new ObjectInputStream(
						new BufferedInputStream(
								new FileInputStream(
										new File("Agenda.txt"))));
				while(true){
                                   try{ liste.add((Contact)rd.readObject());
                                           
                                }catch(EOFException e){
                                    break;
                                }
                                }
				/*liste.add(((Contact)rd.readObject()));
				liste.add(((Contact)rd.readObject()));
				liste.add(((Contact)rd.readObject()));*/


				
                            } catch (ClassNotFoundException e){}catch(IOException  e){}

			           
			return liste;
			}
    }

