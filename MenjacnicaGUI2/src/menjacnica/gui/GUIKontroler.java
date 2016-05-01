package menjacnica.gui;

import java.awt.EventQueue;
import java.io.File;
import java.util.LinkedList;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


import domen.Kurs;
import menjacnica.models.MenjacnicaTableModel;


public class GUIKontroler {

	private static MenjacnicaGUI menjacnicaGui;
	private static String textUTextArea;
	private static MenjacnicaTableModel mtm;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menjacnicaGui = new MenjacnicaGUI();
					menjacnicaGui.setVisible(true);
					menjacnicaGui.setLocationRelativeTo(null);
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public static void sacuvajUFajl() {
		try {
			JFileChooser fc = new JFileChooser();
			int returnVal = fc.showSaveDialog(menjacnicaGui.getContentPane());

			if (returnVal == JFileChooser.APPROVE_OPTION) {
				File file = fc.getSelectedFile();
				ispisiUTextArea("Sacuvan fajl: " + file.getAbsolutePath() + "\n");
				
			}
		} catch (Exception e1) {
			JOptionPane.showMessageDialog(menjacnicaGui.getContentPane(), e1.getMessage(), "Greska",
					JOptionPane.ERROR_MESSAGE);
		}
	}
	public static void otvoriFajl(){
		JFileChooser fc = new JFileChooser();
		int returnVal = fc.showOpenDialog(menjacnicaGui.getContentPane());
		if(returnVal == JFileChooser.APPROVE_OPTION){
			File file = fc.getSelectedFile();
			ispisiUTextArea("Ucitan fajl: " + file.getAbsolutePath() + "\n");
		}
		
		
	}
	public static void ugasiAplikaciju() {
		int opcija = JOptionPane.showConfirmDialog(menjacnicaGui.getContentPane(), "Da li zelite da zatvorite program?",
				"Gasenje programa", JOptionPane.YES_NO_OPTION);

		if (opcija == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
	}

	

	public static void ispisiUTextArea(String s) {
		textUTextArea += s;
		menjacnicaGui.getTextArea().setText(textUTextArea.toString());
		
	}
	public static void dodajKurs(String sifra, String skraceniNaziv, String prodajni, String srednji, String kupovni,
			String naziv) {
		try {
			Kurs k = new Kurs();

			k.setSifra(Integer.parseInt(sifra));
			k.setSkraceniNaziv(skraceniNaziv);
			k.setProdajniKurs(Integer.parseInt(prodajni));
			k.setSrednjiKurs(Integer.parseInt(srednji));
			k.setKupovniKurs(Integer.parseInt(kupovni));
			k.setNaziv(naziv);
			
			mtm.dodajKursIOsvezi(k);
			
			
		} catch (Exception e1) {
			JOptionPane.showMessageDialog(menjacnicaGui.getContentPane(), "Proveri formu: " + e1.getMessage(), "Greska",
					JOptionPane.ERROR_MESSAGE);
		}
	}

	public static void prikaziPodatkeOAutoru() {

		JOptionPane.showMessageDialog(menjacnicaGui, "Aplikaciju je napravio Dario Jahic, student Fakulteta organizacionih nauka.");
		
	}


	
	

	
	
}
