package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;
import javax.swing.border.TitledBorder;

import menjacnica.models.MenjacnicaTableModel;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import javax.swing.ImageIcon;

public class MenjacnicaGUI extends JFrame {

	private JPanel contentPane;
	private JPanel eastPanel;
	private JPanel southPanel;
	private JButton btnDodajKurs;
	private JButton btnIzbrisiKurs;
	private JButton btnIzvrsiIzmenu;
	private JScrollPane scrollPane;
	private JTable table;
	private JTextArea textArea;
	private JMenuBar menuBar;
	private JMenu mnFile;
	private JMenu mnHelp;
	private JMenuItem mntmSave;
	private JMenuItem mntmOpen;
	private JMenuItem mntmExit;
	private JMenuItem mntmAbout;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenjacnicaGUI frame = new MenjacnicaGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MenjacnicaGUI() {
		setTitle("Menjacnica");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setJMenuBar(getMenuBar_1());
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.add(getEastPanel(), BorderLayout.EAST);
		contentPane.add(getSouthPanel(), BorderLayout.SOUTH);
		contentPane.add(getScrollPane(), BorderLayout.CENTER);
	}

	private JPanel getEastPanel() {
		if (eastPanel == null) {
			eastPanel = new JPanel();
			eastPanel.setPreferredSize(new Dimension(100, 10));
			eastPanel.add(getBtnDodajKurs());
			eastPanel.add(getBtnIzbrisiKurs());
			eastPanel.add(getBtnIzvrsiIzmenu());
		}
		return eastPanel;
	}
	private JPanel getSouthPanel() {
		if (southPanel == null) {
			southPanel = new JPanel();
			southPanel.setBorder(new TitledBorder(null, "Status", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			southPanel.setPreferredSize(new Dimension(10, 40));
			southPanel.add(getTextArea());
		}
		return southPanel;
	}
	private JButton getBtnDodajKurs() {
		if (btnDodajKurs == null) {
			btnDodajKurs = new JButton("Dodaj kurs");
		}
		return btnDodajKurs;
	}
	private JButton getBtnIzbrisiKurs() {
		if (btnIzbrisiKurs == null) {
			btnIzbrisiKurs = new JButton("Izbrisi kurs");
		}
		return btnIzbrisiKurs;
	}
	private JButton getBtnIzvrsiIzmenu() {
		if (btnIzvrsiIzmenu == null) {
			btnIzvrsiIzmenu = new JButton("Izvrsi izmenu");
		}
		return btnIzvrsiIzmenu;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setViewportView(getTable());
		}
		return scrollPane;
	}
	private JTable getTable() {
		if (table == null) {
			table = new JTable();
			MenjacnicaTableModel mtm = new MenjacnicaTableModel();
			table.setModel(mtm);
		}
		return table;
	}
	private JTextArea getTextArea() {
		if (textArea == null) {
			textArea = new JTextArea();
			textArea.setPreferredSize(new Dimension(399, 20));
		}
		return textArea;
	}
	private JMenuBar getMenuBar_1() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.add(getMnFile());
			menuBar.add(getMnHelp());
		}
		return menuBar;
	}
	private JMenu getMnFile() {
		if (mnFile == null) {
			mnFile = new JMenu("FIle");
			mnFile.add(getMntmOpen());
			mnFile.add(getMntmSave());
			mnFile.add(getMntmExit());
		}
		return mnFile;
	}
	private JMenu getMnHelp() {
		if (mnHelp == null) {
			mnHelp = new JMenu("Help");
			mnHelp.add(getMntmAbout());
		}
		return mnHelp;
	}
	private JMenuItem getMntmSave() {
		if (mntmSave == null) {
			mntmSave = new JMenuItem("Save");
			mntmSave.setIcon(new ImageIcon(MenjacnicaGUI.class.getResource("/com/sun/java/swing/plaf/windows/icons/FloppyDrive.gif")));
			mntmSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
		}
		return mntmSave;
	}
	private JMenuItem getMntmOpen() {
		if (mntmOpen == null) {
			mntmOpen = new JMenuItem("Open");
			mntmOpen.setIcon(new ImageIcon(MenjacnicaGUI.class.getResource("/com/sun/java/swing/plaf/windows/icons/Directory.gif")));
			mntmOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_MASK));
		}
		return mntmOpen;
	}
	private JMenuItem getMntmExit() {
		if (mntmExit == null) {
			mntmExit = new JMenuItem("Exit");
			mntmExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.ALT_MASK));
		}
		return mntmExit;
	}
	private JMenuItem getMntmAbout() {
		if (mntmAbout == null) {
			mntmAbout = new JMenuItem("About");
		}
		return mntmAbout;
	}
}
