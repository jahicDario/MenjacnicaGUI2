package menjacnica.models;

import java.util.LinkedList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

import domen.Kurs;
import menjacnica.gui.MenjacnicaGUI;

public class MenjacnicaTableModel extends AbstractTableModel {

	private final String[] kolone = new String[] { "Sifra", "Skraceni naziv", "Prodajni", "Srednji", "Kupovni",
			"Naziv" };
	private static List<Kurs> kursevi;
	
	public MenjacnicaTableModel(List<Kurs> kursevi) {
		if (kursevi == null) {
			this.kursevi = new LinkedList<>();
		} else {
			this.kursevi = kursevi;
		}
	}

	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return false;
	}

	@Override
	public int getColumnCount() {
		return kolone.length;
	}

	@Override
	public int getRowCount() {
		return kursevi.size();
	}

	@Override
	public String getColumnName(int column) {
		return kolone[column];
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Kurs k = kursevi.get(rowIndex);
		switch (columnIndex) {
		case 0:
			return k.getSifra();
		case 1:
			return k.getSkraceniNaziv();
		case 2:
			return k.getProdajniKurs();
		case 3:
			return k.getSrednjiKurs();
		case 4:
			return k.getKupovniKurs();
		case 5:
			return k.getNaziv();
		default:
			return "NN";
		}
	}
	public void dodajKursIOsvezi(Kurs k){
		kursevi.add(k);
		fireTableDataChanged();
	}

	public Kurs getKursByIndex(int index) {
		return kursevi.get(index);
	}

	public void obrisiKursIOsvezi(Kurs k) {
		if(kursevi.contains(k)){
			kursevi.remove(k);
		}else{
			System.out.println("greska prilikom brisanja");
		}
		fireTableDataChanged();
	}
}