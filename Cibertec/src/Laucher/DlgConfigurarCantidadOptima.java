package Laucher;


import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.awt.Toolkit;
import javax.swing.JPanel;

public class DlgConfigurarCantidadOptima extends JDialog implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JButton btnCancelar;
	private JButton btnAceptar;

	/**
	 * Launch the application.
	 */
public static void main(String[] args) {
		
		/*AQUI SE HACE REFERENCIA A flatlaf PARA EL UI DESIGN*/
		try {
			UIManager.setLookAndFeel(new FlatMacLightLaf());
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
					DlgConfigurarCantidadOptima dialog = new DlgConfigurarCantidadOptima();
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
public DlgConfigurarCantidadOptima() {
		setFont(new Font("Dialog", Font.BOLD, 13));
		setIconImage(Toolkit.getDefaultToolkit().getImage(DlgConfigurarCantidadOptima.class.getResource("/imagenes/dinero.png")));
		setTitle("Configurar Cantidad Optima");
	
	getContentPane().setBackground(new Color(238, 233, 218));
	setBounds(100, 100, 571, 189);
	setResizable(false);
	getContentPane().setLayout(null);
	
	btnAceptar = new JButton("Aceptar");

	btnAceptar.setForeground(Color.WHITE);
	btnAceptar.addActionListener(this);
	btnAceptar.setFont(new Font("Verdana", Font.BOLD, 12));
	btnAceptar.setBackground(new Color(96, 150, 180));
	btnAceptar.setBounds(126, 77, 135, 36);
	getContentPane().add(btnAceptar);
	
	btnCancelar = new JButton("Cancelar");
	
	btnCancelar.setForeground(Color.WHITE);
	btnCancelar.addActionListener(this);
	btnCancelar.setFont(new Font("Verdana", Font.BOLD, 12));
	btnCancelar.setBackground(new Color(96, 150, 180));
	btnCancelar.setBounds(293, 77, 135, 36);
	getContentPane().add(btnCancelar);
	
	JPanel top = new JPanel();
	top.setForeground(Color.WHITE);
	top.setBackground(new Color(96, 150, 180));
	top.setBounds(0, 0, 555, 17);
	getContentPane().add(top);
	
	textField = new JTextField();
	textField.setText(String.valueOf(Menu.cantidadOptima));
	textField.setFont(new Font("Verdana", Font.BOLD, 12));
	textField.setBounds(325, 28, 207, 29);
	getContentPane().add(textField);
	textField.setColumns(10);
	
	JLabel lblCant = new JLabel("Cantidad optima de unidades vendidas : ");
	lblCant.setBackground(new Color(96, 150, 180));
	
	lblCant.setForeground(Color.BLACK);
	lblCant.setFont(new Font("Verdana", Font.BOLD, 13));
	lblCant.setBounds(25, 33, 307, 17);
	getContentPane().add(lblCant);
	
	JPanel bottom = new JPanel();
	bottom.setForeground(Color.WHITE);
	bottom.setBackground(new Color(96, 150, 180));
	bottom.setBounds(0, 133, 555, 17);
	getContentPane().add(bottom);
	

}
//Direcciona eventos de tipo ActionEvent
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCancelar) {
			actionPerformedbtnCerrar(e);
		}
		if (e.getSource() == btnAceptar) {
			actionPerformedbtnAceptar(e);
		}
		
}

protected void actionPerformedbtnAceptar(ActionEvent e) {
	
	String valorIngresado = textField.getText();

	try {
		// Convierte el valor ingresado a un entero
		int cantidad = Integer.parseInt(valorIngresado);

		// Verifica si el valor ingresado es un número positivo
		if (cantidad > 0) {
			JOptionPane.showMessageDialog(DlgConfigurarCantidadOptima.this, "Cambios guardados con éxito", "Éxito",
					JOptionPane.INFORMATION_MESSAGE);
			// Actualiza la cantidad óptima
			Menu.cantidadOptima = cantidad;
		} else {
			JOptionPane.showMessageDialog(DlgConfigurarCantidadOptima.this, "Por favor, ingrese un número positivo",
					"Error", JOptionPane.ERROR_MESSAGE);
		}

	} catch (NumberFormatException ex) {
		JOptionPane.showMessageDialog(DlgConfigurarCantidadOptima.this, "Por favor, ingrese un número válido", "Error",
				JOptionPane.ERROR_MESSAGE);
	}
}
	protected void actionPerformedbtnCerrar(ActionEvent e) {
		dispose();
	
		}
}