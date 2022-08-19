package vistas;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import funciones.Utilidades;
import net.miginfocom.swing.MigLayout;

public class VentanaCalculaMedia extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtUF2404;
	private JTextField txtUF2405;
	private JTextField txtUF2406;
	private JLabel lblNota;
	private JLabel lblResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaCalculaMedia frame = new VentanaCalculaMedia();
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
	public VentanaCalculaMedia() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][grow][][grow][][grow]", "[][][][][][][][][]"));
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblNewLabel, "cell 1 1,alignx trailing");
		
		txtNombre = new JTextField();
		contentPane.add(txtNombre, "cell 2 1 5 1,growx");
		txtNombre.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("UF2404");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_1, "cell 1 3");
		
		txtUF2404 = new JTextField();
		contentPane.add(txtUF2404, "cell 2 3,growx");
		txtUF2404.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("UF2405:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_2, "cell 3 3,alignx trailing");
		
		txtUF2405 = new JTextField();
		contentPane.add(txtUF2405, "cell 4 3,growx");
		txtUF2405.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("UF2406:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_3, "cell 5 3,alignx trailing");
		
		txtUF2406 = new JTextField();
		contentPane.add(txtUF2406, "cell 6 3,growx");
		txtUF2406.setColumns(10);
		
		JButton btnNewButton = new JButton("Calcular Nota");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculaNota();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(btnNewButton, "cell 1 5 6 1,alignx center");
		
		JLabel lblNewLabel_4 = new JLabel("Nota media:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_4, "cell 1 7");
		
		lblNota = new JLabel("0.0");
		lblNota.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblNota, "cell 2 7 5 1");
		
		JLabel lblNewLabel_6 = new JLabel("Resultado:");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_6, "cell 1 8");
		
		lblResultado = new JLabel("No calculado aún");
		lblResultado.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblResultado, "cell 2 8 5 1");
	}

	protected void calculaNota() {
		String nombre = txtNombre.getText();
		double nota1 = Double.parseDouble(
				txtUF2404.getText());
		double nota2 = Double.parseDouble(
				txtUF2405.getText());
		double nota3 = Double.parseDouble(
				txtUF2406.getText());
		
		double media= (nota1+nota2+nota3)/3;
		lblNota.setText(""+media);
		
		Utilidades u = new Utilidades();
		lblResultado.setText(nombre+ " ha sacado un "
		      +u.devuelveNota(media));
	}

}
