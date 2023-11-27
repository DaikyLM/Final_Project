package Laucher;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import java.awt.Toolkit;

public class DlgModificarCeramico extends JDialog implements ActionListener{

	private static final long serialVersionUID = 1L;

	private JLabel lblModelo;
	private JLabel lblPrecio;
	private JLabel lblAncho;
	private JLabel lblLargo;
	private JLabel lblEspesor;
	private JLabel lblContenido;
	private JTextField txtPrecio;
	private JTextField txtAncho;
	private JTextField txtLargo;
	private JTextField txtEspesor;
	private JTextField txtContenido;
	private JComboBox<String> cboModelo;
	private JButton btnCerrar;
	private JButton btnGrabar;
	private JPanel TOP;
	private JPanel BOTTOM;
	private JPanel Fondo;

	/**
	 * Launch the application.
	 */
public static void main(String[] args) {
		
		/*AQUI SE HACE REFERENCIA A flatlaf PARA EL UI DESIGN*/
		try {
			UIManager.setLookAndFeel(new com.formdev.flatlaf.intellijthemes.FlatLightFlatIJTheme());
			/*AQUI LA LISTA DE ESTILOS QUE PUEDES USAR*/
			/**
			 * UIManager.setLookAndFeel(new FlatLightLaf());
			 * UIManager.setLookAndFeel(new FlatDarkLaf());
			 * UIManager.setLookAndFeel(new FlatIntelliJLaf());
			 * UIManager.setLookAndFeel(new FlatDarculaLaf());
			 * UIManager.setLookAndFeel(new FlatMacLightLaf());
			 * UIManager.setLookAndFeel(new FlatMacDarkLaf());
			 */
			
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DlgModificarCeramico dialog = new DlgModificarCeramico();
					dialog.setLocationRelativeTo(null);
					dialog.setVisible(true);
					dialog.setResizable(false); 
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the dialog.
	 */
	public DlgModificarCeramico() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(DlgModificarCeramico.class.getResource("/imagenes/editar.png")));
		setTitle("Modificar Cerámicos");
		getContentPane().setFont(new Font("Tahoma", Font.BOLD, 12));
		getContentPane().setForeground(Color.BLACK);
		getContentPane().setBackground(Color.WHITE);
		setBounds(100, 100, 568, 384);
		setResizable(false);
		getContentPane().setLayout(null);
		
		TOP = new JPanel();
		TOP.setBackground(new Color(133, 88, 111));
		TOP.setBounds(0, 0, 552, 20);
		getContentPane().add(TOP);
		
		BOTTOM = new JPanel();
		BOTTOM.setBackground(new Color(133, 88, 111));
		BOTTOM.setBounds(0, 325, 552, 20);
		getContentPane().add(BOTTOM);
		
		Fondo = new JPanel();
		Fondo.setBackground(Color.decode("#F8EDE3"));
		Fondo.setBounds(0, 11, 552, 334);
		getContentPane().add(Fondo);
		Fondo.setLayout(null);
		
		lblPrecio = new JLabel("Precio (S/.)");
		lblPrecio.setBounds(36, 84, 82, 14);
		Fondo.add(lblPrecio);
		lblPrecio.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPrecio.setBackground(Color.WHITE);
		lblPrecio.setForeground(Color.BLACK);
		
		txtPrecio = new JTextField();
	    txtPrecio.setText(String.valueOf(Menu.precio0));
		txtPrecio.setBounds(144, 81, 231, 20);
		Fondo.add(txtPrecio);
		txtPrecio.setMinimumSize(new Dimension(9, 22));
		txtPrecio.setForeground(Color.BLACK);
		txtPrecio.setFont(new Font("Verdana", Font.BOLD, 11));
		txtPrecio.setColumns(10);
		
		txtAncho = new JTextField();
		txtAncho.setText(String.valueOf(Menu.ancho0));
		txtAncho.setBounds(144, 126, 231, 20);
		Fondo.add(txtAncho);
		txtAncho.setMinimumSize(new Dimension(9, 22));
		txtAncho.setForeground(Color.BLACK);
		txtAncho.setFont(new Font("Verdana", Font.BOLD, 11));
		txtAncho.setColumns(10);
		
		lblAncho = new JLabel("Ancho (cm)");
		lblAncho.setBounds(36, 130, 82, 14);
		Fondo.add(lblAncho);
		lblAncho.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAncho.setBackground(Color.WHITE);
		lblAncho.setForeground(Color.BLACK);
		
		lblLargo = new JLabel("Largo (cm)");
		lblLargo.setBounds(36, 174, 82, 14);
		Fondo.add(lblLargo);
		lblLargo.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblLargo.setBackground(Color.WHITE);
		lblLargo.setForeground(Color.BLACK);
		
		txtLargo = new JTextField();
		txtLargo.setText(String.valueOf(Menu.largo0));
		txtLargo.setBounds(144, 171, 231, 20);
		Fondo.add(txtLargo);
		txtLargo.setMinimumSize(new Dimension(9, 22));
		txtLargo.setForeground(Color.BLACK);
		txtLargo.setFont(new Font("Verdana", Font.BOLD, 11));
		txtLargo.setColumns(10);
		
		txtEspesor = new JTextField();
		txtEspesor.setText(String.valueOf(Menu.espesor0));
		txtEspesor.setBounds(144, 216, 231, 20);
		Fondo.add(txtEspesor);
		txtEspesor.setMinimumSize(new Dimension(9, 22));
		txtEspesor.setForeground(Color.BLACK);
		txtEspesor.setFont(new Font("Verdana", Font.BOLD, 11));
		txtEspesor.setColumns(10);
		
		lblContenido = new JLabel("Contenido");
		lblContenido.setBounds(36, 262, 82, 14);
		Fondo.add(lblContenido);
		lblContenido.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblContenido.setBackground(Color.WHITE);
		lblContenido.setForeground(Color.BLACK);
		
		txtContenido = new JTextField();
		txtContenido.setText(String.valueOf(Menu.contenido0));
		txtContenido.setBounds(144, 258, 231, 20);
		Fondo.add(txtContenido);
		txtContenido.setMinimumSize(new Dimension(9, 22));
		txtContenido.setForeground(Color.BLACK);
		txtContenido.setFont(new Font("Verdana", Font.BOLD, 11));
		txtContenido.setColumns(10);
		
		lblEspesor = new JLabel("Espesor (mm)");
		lblEspesor.setBounds(36, 220, 98, 14);
		Fondo.add(lblEspesor);
		lblEspesor.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEspesor.setBackground(Color.WHITE);
		lblEspesor.setForeground(Color.BLACK);
		
		btnGrabar = new JButton("Grabar");
		btnGrabar.setBounds(415, 84, 99, 43);
		Fondo.add(btnGrabar);
		btnGrabar.setFont(new Font("Verdana", Font.BOLD, 11));
		btnGrabar.setForeground(Color.WHITE);
		btnGrabar.setBackground(new Color(133, 88, 111));
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.setBounds(415, 160, 99, 43);
		Fondo.add(btnCerrar);
		btnCerrar.setFont(new Font("Verdana", Font.BOLD, 11));
		btnCerrar.setForeground(Color.WHITE);
		btnCerrar.setBackground(new Color(133, 88, 111));
		
		JPanel panel_Modelo = new JPanel();
		panel_Modelo.setBackground(new Color(223, 211, 195));
		panel_Modelo.setBounds(28, 32, 358, 34);
		Fondo.add(panel_Modelo);
		panel_Modelo.setLayout(null);
		
		cboModelo = new JComboBox<String>();
		cboModelo.setBounds(118, 6, 231, 22);
		panel_Modelo.add(cboModelo);
		cboModelo.setForeground(Color.BLACK);
		cboModelo.setBackground(Color.WHITE);
		cboModelo.setFont(new Font("Verdana", Font.BOLD, 12));
		cboModelo.addActionListener(this);
		cboModelo.setModel(new DefaultComboBoxModel <String>(new String[] {"Cinza Plus", "Luxury", "Austria", "Yungay Mix", "Thal\u00EDa"}));
		
		lblModelo = new JLabel("Modelo");
		lblModelo.setBounds(10, 10, 82, 14);
		panel_Modelo.add(lblModelo);
		lblModelo.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblModelo.setBackground(Color.WHITE);
		lblModelo.setForeground(Color.BLACK);
		
		JPanel panel_Precio = new JPanel();
		panel_Precio.setBackground(new Color(223, 211, 195));
		panel_Precio.setBounds(28, 74, 358, 34);
		Fondo.add(panel_Precio);
		panel_Precio.setLayout(null);
		
		JPanel panel_Ancho = new JPanel();
		panel_Ancho.setBackground(new Color(223, 211, 195));
		panel_Ancho.setBounds(28, 119, 358, 34);
		Fondo.add(panel_Ancho);
		panel_Ancho.setLayout(null);
		
		JPanel panel_Largo = new JPanel();
		panel_Largo.setBackground(new Color(223, 211, 195));
		panel_Largo.setBounds(28, 164, 358, 34);
		Fondo.add(panel_Largo);
		panel_Largo.setLayout(null);
		
		JPanel panel_Espesor = new JPanel();
		panel_Espesor.setBackground(new Color(223, 211, 195));
		panel_Espesor.setBounds(28, 209, 358, 34);
		Fondo.add(panel_Espesor);
		panel_Espesor.setLayout(null);
		
		JPanel panel_Contenido = new JPanel();
		panel_Contenido.setBackground(new Color(223, 211, 195));
		panel_Contenido.setBounds(28, 251, 358, 34);
		Fondo.add(panel_Contenido);
		panel_Contenido.setLayout(null);
		btnCerrar.addActionListener(this);
		btnGrabar.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
		if (e.getSource() == btnGrabar) {
			actionPerformedBtnGrabar(e);
		}
		if (e.getSource() == cboModelo) {
			actionPerformedCboModelo(e);
		}
	}

	protected void actionPerformedCboModelo(ActionEvent e) {
		// Obtener el modelo seleccionado del JComboBox
		String mod = cboModelo.getSelectedItem().toString();
		 // Variables para almacenar información relacionada con el modelo seleccionado
	    double pre, anc, lar, esp;
	    int con;
	    // Seleccionar los valores correspondientes según el modelo
	    switch (mod) {
	        case "Cinza Plus":
	            pre = Menu.precio0;
	            anc = Menu.ancho0;
	            lar = Menu.largo0;
	            esp = Menu.espesor0;
	            con = Menu.contenido0;
	            break;
	        case "Luxury":
	            pre = Menu.precio1;
	            anc = Menu.ancho1;
	            lar = Menu.largo1;
	            esp = Menu.espesor1;
	            con = Menu.contenido1;
	            break;
	        case "Austria":
	            pre = Menu.precio2;
	            anc = Menu.ancho2;
	            lar = Menu.largo2;
	            esp = Menu.espesor2;
	            con = Menu.contenido2;
	            break;
	        case "Yungay Mix":
	            pre = Menu.precio3;
	            anc = Menu.ancho3;
	            lar = Menu.largo3;
	            esp = Menu.espesor3;
	            con = Menu.contenido3;
	            break;
	        default:
	            pre = Menu.precio4;
	            anc = Menu.ancho4;
	            lar = Menu.largo4;
	            esp = Menu.espesor4;
	            con = Menu.contenido4;
	            break;
	    }
	 // Mostrar la información en los campos de texto correspondientes
	    txtPrecio.setText(String.valueOf(pre));
	    txtAncho.setText(String.valueOf(anc));
	    txtLargo.setText(String.valueOf(lar));
	    txtEspesor.setText(String.valueOf(esp));
	    txtContenido.setText(String.valueOf(con));
	}
	protected void actionPerformedBtnGrabar(ActionEvent e) {
		// Variables locales
		double precio, ancho, largo, espesor;
		int contenido;
		try {
			// Obtienes valores desde los campos de texto
			precio = Double.parseDouble(txtPrecio.getText());
			ancho = Double.parseDouble(txtAncho.getText());
			largo = Double.parseDouble(txtLargo.getText());
			espesor = Double.parseDouble(txtEspesor.getText());
			contenido = Integer.parseInt(txtContenido.getText());
			// Obtienes el modelo seleccionado del JComboBox
			String mod = cboModelo.getSelectedItem().toString();
			// Actualiza los valores correspondientes en la clase Menu según el modelo seleccionado
			switch (mod) {
			case "Cinza Plus":
				Menu.precio0 = precio;
				Menu.ancho0 = ancho;
				Menu.largo0 = largo;
				Menu.espesor0 = espesor;
				Menu.contenido0 = contenido;
				break;
			case "Luxury":
				Menu.precio1 = precio;
				Menu.ancho1 = ancho;
				Menu.largo1 = largo;
				Menu.espesor1 = espesor;
				Menu.contenido1 = contenido;
				break;
			case "Austria":
				Menu.precio2 = precio;
				Menu.ancho2 = ancho;
				Menu.largo2 = largo;
				Menu.espesor2 = espesor;
				Menu.contenido2 = contenido;
				break;
			case "Yungay Mix":
				Menu.precio3 = precio;
				Menu.ancho3 = ancho;
				Menu.largo3 = largo;
				Menu.espesor3 = espesor;
				Menu.contenido3 = contenido;
				break;
			default:
				Menu.precio4 = precio;
				Menu.ancho4 = ancho;
				Menu.largo4 = largo;
				Menu.espesor4 = espesor;
				Menu.contenido4 = contenido;
				break;
			}
			// Muestra un mensaje de éxito
			JOptionPane.showMessageDialog(this, "Cambios guardados exitosamente.", "Éxito",
					JOptionPane.INFORMATION_MESSAGE);
		} catch (NumberFormatException ex) {
			// Manejar excepción si se ingresan valores no numéricos
			JOptionPane.showMessageDialog(this, "Error: Ingresa valores numéricos válidos.", "Error",
					JOptionPane.ERROR_MESSAGE);
		}
	}

	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}
}
