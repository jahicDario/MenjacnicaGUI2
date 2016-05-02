package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class IzvrsiZamenuGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblKupovniKurs;
	private JTextField txtKupovniKurs;
	private JLabel lblProdajniKurs;
	private JTextField txtProdajniKurs;
	private JComboBox comboBox;
	private JLabel lblIznos;
	private JTextField txtIznos;
	private JLabel lblVrstaTransakcije;
	private JRadioButton rdbtnKupovina;
	private JRadioButton rdbtnProdaja;
	private JSlider slider;
	private JButton btnOdustani;
	private JButton btnIzvrsiZamenu;

	

	/**
	 * Create the frame.
	 */
	public IzvrsiZamenuGUI() {
		setResizable(false);
		setTitle("Izvrsi zamenu");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 428, 303);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblKupovniKurs());
		contentPane.add(getTxtKupovniKurs());
		contentPane.add(getLblProdajniKurs());
		contentPane.add(getTxtProdajniKurs());
		contentPane.add(getComboBox());
		contentPane.add(getLblIznos());
		contentPane.add(getTxtIznos());
		contentPane.add(getLblVrstaTransakcije());
		contentPane.add(getRdbtnKupovina());
		contentPane.add(getRdbtnProdaja());
		contentPane.add(getSlider());
		contentPane.add(getBtnOdustani());
		contentPane.add(getBtnIzvrsiZamenu());
	}
	private JLabel getLblKupovniKurs() {
		if (lblKupovniKurs == null) {
			lblKupovniKurs = new JLabel("Kupovni kurs");
			lblKupovniKurs.setBounds(42, 32, 77, 14);
		}
		return lblKupovniKurs;
	}
	private JTextField getTxtKupovniKurs() {
		if (txtKupovniKurs == null) {
			txtKupovniKurs = new JTextField();
			txtKupovniKurs.setEditable(false);
			txtKupovniKurs.setBounds(42, 57, 86, 20);
			txtKupovniKurs.setColumns(10);
		}
		return txtKupovniKurs;
	}
	private JLabel getLblProdajniKurs() {
		if (lblProdajniKurs == null) {
			lblProdajniKurs = new JLabel("Prodajni kurs");
			lblProdajniKurs.setBounds(301, 32, 86, 14);
		}
		return lblProdajniKurs;
	}
	private JTextField getTxtProdajniKurs() {
		if (txtProdajniKurs == null) {
			txtProdajniKurs = new JTextField();
			txtProdajniKurs.setEditable(false);
			txtProdajniKurs.setBounds(301, 57, 86, 20);
			txtProdajniKurs.setColumns(10);
		}
		return txtProdajniKurs;
	}
	private JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"EUR", "USD", "CHF"}));
			comboBox.setBounds(186, 57, 62, 20);
		}
		return comboBox;
	}
	private JLabel getLblIznos() {
		if (lblIznos == null) {
			lblIznos = new JLabel("Iznos");
			lblIznos.setBounds(42, 106, 46, 14);
		}
		return lblIznos;
	}
	private JTextField getTxtIznos() {
		if (txtIznos == null) {
			txtIznos = new JTextField();
			txtIznos.setBounds(42, 131, 154, 20);
			txtIznos.setColumns(10);
		}
		return txtIznos;
	}
	private JLabel getLblVrstaTransakcije() {
		if (lblVrstaTransakcije == null) {
			lblVrstaTransakcije = new JLabel("Vrsta transakcije");
			lblVrstaTransakcije.setBounds(275, 106, 112, 14);
		}
		return lblVrstaTransakcije;
	}
	private JRadioButton getRdbtnKupovina() {
		if (rdbtnKupovina == null) {
			rdbtnKupovina = new JRadioButton("Kupovina ");
			rdbtnKupovina.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(rdbtnProdaja.isSelected()){
						rdbtnProdaja.setSelected(false);
					}
				}
			});
			rdbtnKupovina.setBounds(275, 127, 109, 23);
			
		}
		return rdbtnKupovina;
	}
	private JRadioButton getRdbtnProdaja() {
		if (rdbtnProdaja == null) {
			rdbtnProdaja = new JRadioButton("Prodaja");
			rdbtnProdaja.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(rdbtnKupovina.isSelected()){
						rdbtnKupovina.setSelected(false);
					}
				}
			});
			rdbtnProdaja.setBounds(275, 157, 109, 23);
		}
		return rdbtnProdaja;
	}
	private JSlider getSlider() {
		if (slider == null) {
			slider = new JSlider();
			slider.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent arg0) {
					txtIznos.setText(slider.getValue() + "");
				}
			});
			slider.addAncestorListener(new AncestorListener() {
				public void ancestorAdded(AncestorEvent event) {
			
					txtIznos.setText(slider.getValue() + "");
				}
				public void ancestorMoved(AncestorEvent event) {
				}
				public void ancestorRemoved(AncestorEvent event) {
				}
			});
			
			slider.setMajorTickSpacing(10);
			slider.setMinorTickSpacing(5);
			slider.setSnapToTicks(true);
			slider.setPaintLabels(true);
			slider.setToolTipText("");
			slider.setPaintTicks(true);
			slider.setBounds(27, 180, 360, 45);
		}
		return slider;
	}
	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnOdustani.setBounds(234, 240, 136, 23);
		}
		return btnOdustani;
	}
	private JButton getBtnIzvrsiZamenu() {
		if (btnIzvrsiZamenu == null) {
			btnIzvrsiZamenu = new JButton("Izvrsi zamenu");
			btnIzvrsiZamenu.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String rdbtn = "";
					if(rdbtnKupovina.isSelected()){
						rdbtn = "Kupovina";
					}else{
						rdbtn = "Prodaja";
					}
					String s = "Naziv valute: " + comboBox.getSelectedItem().toString() + 
							" iznos: " + txtIznos.getText() + " vrsta transakcije: " + rdbtn + "\n";
					GUIKontroler.ispisiUTextArea(s);
				}
			});
			btnIzvrsiZamenu.setBounds(61, 240, 135, 23);
		}
		return btnIzvrsiZamenu;
	}
}
