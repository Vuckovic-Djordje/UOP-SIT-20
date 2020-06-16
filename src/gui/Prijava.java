package gui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;


public class Prijava extends JFrame {
	JLabel lblKorisnickoIme = new JLabel("Korisnicko ime");
	JTextField txtKorisnickoIme = new JTextField(20);
	JLabel lblSifra = new JLabel("Šifra");
	JPasswordField pfSifra = new JPasswordField(20);
	JButton btnPrijava = new JButton("Prijava");
	JButton btnIzlaz = new JButton("Izlaz");
	public Prijava() {
		setTitle("Prijava");
		setSize(400,400);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		gui();
		akcije();
		}
	public void gui() {
		MigLayout mig=new MigLayout("wrap 2","[][]","[][]10[]");
		setLayout(mig);
		add(lblKorisnickoIme);
		add(txtKorisnickoIme);
		add(lblSifra);
		add(pfSifra);
		add(btnPrijava);
		add(btnIzlaz);
	}
	public void akcije() {
	}
	
}
