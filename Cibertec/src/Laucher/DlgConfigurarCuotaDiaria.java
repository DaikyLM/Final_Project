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

public class DlgConfigurarCuotaDiaria extends JDialog implements ActionListener{

	private static final long serialVersionUID = 1L;
	
	private JTextField txtS;
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
					DlgConfigurarCuotaDiaria dialog = new DlgConfigurarCuotaDiaria();
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
	public DlgConfigurarCuotaDiaria() {
		setFont(new Font("Dialog", Font.BOLD, 13));
		setIconImage(Toolkit.getDefaultToolkit().getImage(DlgConfigurarCuotaDiaria.class.getResource("/imagenes/bolsa-de-dinero.png")));
		setTitle("Configurar Cantidad Optima");
	
	getContentPane().setBackground(new Color(245, 247, 248));
	setBounds(100, 100, 571, 189);
	setResizable(false);
	getContentPane().setLayout(null);
	
	btnAceptar = new JButton("Aceptar");

	btnAceptar.setForeground(Color.WHITE);
	btnAceptar.addActionListener(this);
	btnAceptar.setFont(new Font("Verdana", Font.BOLD, 12));
	btnAceptar.setBackground(new Color(73, 94, 87));
	btnAceptar.setBounds(126, 77, 135, 36);
	getContentPane().add(btnAceptar);
	
	btnCancelar = new JButton("Cancelar");
	
	btnCancelar.setForeground(Color.WHITE);
	btnCancelar.addActionListener(this);
	btnCancelar.setFont(new Font("Verdana", Font.BOLD, 12));
	btnCancelar.setBackground(new Color(73, 94, 87));
	btnCancelar.setBounds(293, 77, 135, 36);
	getContentPane().add(btnCancelar);
	
	JPanel top = new JPanel();
	top.setForeground(Color.WHITE);
	top.setBackground(new Color(73, 94, 87));
	top.setBounds(0, 0, 555, 17);
	getContentPane().add(top);
	
	txtS = new JTextField();
	txtS.setText(String.valueOf(Menu.cuotaDiaria));
	txtS.setFont(new Font("Verdana", Font.BOLD, 12));
	txtS.setBounds(325, 28, 207, 29);
	getContentPane().add(txtS);
	txtS.setColumns(10);
	
	JLabel lblCant = new JLabel("Cantidad optima de unidades vendidas : ");
	lblCant.setBackground(new Color(245, 247, 248));
	lblCant.setForeground(Color.BLACK);
	lblCant.setFont(new Font("Verdana", Font.BOLD, 13));
	lblCant.setBounds(25, 33, 307, 17);
	getContentPane().add(lblCant);
	
	JPanel bottom = new JPanel();
	bottom.setForeground(Color.WHITE);
	bottom.setBackground(new Color(73, 94, 87));
	bottom.setBounds(0, 133, 555, 17);
	getContentPane().add(bottom);
}

	//Direcciona eventos de tipo ActionEvent
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCancelar) {
			actionPerformedbtnCancelar(e);
		}
		if (e.getSource() == btnAceptar) {
			actionPerformedbtnAceptar(e);
		}
			
	}
	protected void actionPerformedbtnAceptar(ActionEvent e) {
	    try {
	    	//Convertir el texto del campo de texto a un entero
	        int cuota = Integer.parseInt(txtS.getText());
	        //Valida si la cuota es un número positivo
	        if (cuota > 0) {
	        	//Actualiza la cuota diaria
	        	Menu.cuotaDiaria = cuota;
	        	
	            JOptionPane.showMessageDialog(DlgConfigurarCuotaDiaria.this, "Cambios guardados con éxito", "Éxito", JOptionPane.INFORMATION_MESSAGE);
	        } else {
	            JOptionPane.showMessageDialog(DlgConfigurarCuotaDiaria.this, "Por favor, ingrese un número positivo", "Error", JOptionPane.ERROR_MESSAGE);
	        }
	     // Muestra un mensaje de error si no se pudo convertir a entero
	    } catch (NumberFormatException ex) {
	        JOptionPane.showMessageDialog(DlgConfigurarCuotaDiaria.this, "Por favor, ingrese un número válido", "Error", JOptionPane.ERROR_MESSAGE);
	    }
	    
	}

	protected void actionPerformedbtnCancelar(ActionEvent e) {
		dispose();
	}
}