package menjacnica.models;

import java.util.LinkedList;
import java.util.List;

import javax.swing.table.AbstractTableModel;


public class MenjacnicaTableModel extends AbstractTableModel {

	private final String[] kolone = new String[] { "Sifra", "Skraceni naziv", "Prodajni", "Srednji", "Kupovni", "Naziv" };
	


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
		return 0;
	}

	@Override
	public String getColumnName(int column) {
		return kolone[column];
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return null;
	}
}