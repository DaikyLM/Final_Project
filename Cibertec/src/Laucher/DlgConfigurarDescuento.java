package Laucher;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;

import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.awt.Toolkit;

public class DlgConfigurarDescuento extends JDialog implements ActionListener{

	private static final long serialVersionUID = 1L;
    private JTextField txt1;
    private JTextField txt2;
    private JTextField txt3;
    private JTextField txt4;
    private JButton btnAplicar;
    private JPanel top;
    private JPanel bottom;
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
					DlgConfigurarDescuento dialog = new DlgConfigurarDescuento();
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
	public DlgConfigurarDescuento() {
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage(DlgConfigurarDescuento.class.getResource("/imagenes/etiqueta-de-precio.png")));
		setTitle("Configurar Descuento");
		setBounds(100, 100, 571, 338);
		getContentPane().setLayout(new BorderLayout());

		JPanel Fondo = new JPanel();
		Fondo.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(Fondo, BorderLayout.CENTER);
		Fondo.setBackground(new Color(253, 247, 228));
		Fondo.setLayout(null);
		setResizable(false);
		{
			JLabel lblCantidad1 = new JLabel("Cantidad 1 - 5   :");
			lblCantidad1.setForeground(new Color(117, 101, 70));
			lblCantidad1.setFont(new Font("Verdana", Font.BOLD, 13));
			lblCantidad1.setBounds(38, 63, 184, 14);
			Fondo.add(lblCantidad1);
		}
		{
			JLabel lblCantidad2 = new JLabel("Cantidad 6 - 10   :");
			lblCantidad2.setForeground(new Color(117, 101, 70));
			lblCantidad2.setFont(new Font("Verdana", Font.BOLD, 13));
			lblCantidad2.setBounds(38, 109, 184, 14);
			Fondo.add(lblCantidad2);
		}
		{
			JLabel lblCantidad3 = new JLabel("Cantidad 11 - 15   :");
			lblCantidad3.setForeground(new Color(117, 101, 70));
			lblCantidad3.setFont(new Font("Verdana", Font.BOLD, 13));
			lblCantidad3.setBounds(38, 159, 184, 14);
			Fondo.add(lblCantidad3);
		}
		{
			JLabel lblCantidadMayorA = new JLabel("Cantidad Mayor a 15   :");
			lblCantidadMayorA.setForeground(new Color(117, 101, 70));
			lblCantidadMayorA.setFont(new Font("Verdana", Font.BOLD, 13));
			lblCantidadMayorA.setBounds(38, 206, 184, 14);
			Fondo.add(lblCantidadMayorA);
		}
		{
			txt1 = new JTextField();
			txt1.setText(String.valueOf(Menu.porcentaje1));
			txt1.setForeground(Color.BLACK);
			txt1.setFont(new Font("Verdana", Font.BOLD, 11));
			txt1.setColumns(10);
			txt1.setBounds(215, 63, 167, 20);
			Fondo.add(txt1);
		}
		{
			txt2 = new JTextField();
			txt2.setText(String.valueOf(Menu.porcentaje2));
			txt2.setForeground(Color.BLACK);
			txt2.setFont(new Font("Verdana", Font.BOLD, 11));
			txt2.setColumns(10);
			txt2.setBounds(215, 109, 167, 20);
			Fondo.add(txt2);
		}
		{
			txt3 = new JTextField();
			txt3.setText(String.valueOf(Menu.porcentaje3));
			txt3.setForeground(Color.BLACK);
			txt3.setFont(new Font("Verdana", Font.BOLD, 11));
			txt3.setColumns(10);
			txt3.setBounds(215, 159, 167, 20);
			Fondo.add(txt3);
		}
		{
			txt4 = new JTextField();
			txt4.setText(String.valueOf(Menu.porcentaje4));
			txt4.setForeground(Color.BLACK);
			txt4.setFont(new Font("Verdana", Font.BOLD, 11));
			txt4.setColumns(10);
			txt4.setBounds(215, 206, 167, 20);
			Fondo.add(txt4);
		}
		{
			btnAplicar = new JButton("Aplicar");
			btnAplicar.setForeground(Color.WHITE);
			btnAplicar.setBackground(new Color(120, 103, 71));
			btnAplicar.setFont(new Font("Verdana", Font.BOLD, 11));
			btnAplicar.addActionListener(this);
			btnAplicar.setBounds(433, 83, 112, 46);
			Fondo.add(btnAplicar);
			{
				JButton btnCancelar = new JButton("Cancelar");
				btnCancelar.setForeground(Color.WHITE);
				btnCancelar.setBackground(new Color(120, 103, 71));
				btnCancelar.setFont(new Font("Verdana", Font.BOLD, 11));
				btnCancelar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				btnCancelar.setBounds(433, 154, 112, 49);
				Fondo.add(btnCancelar);
			}
			{
				top = new JPanel();
				top.setForeground(new Color(187, 171, 140));
				top.setBackground(new Color(187, 171, 140));
				top.setBounds(0, 0, 555, 33);
				Fondo.add(top);
			}
			{
				bottom = new JPanel();
				bottom.setForeground(new Color(187, 171, 140));
				bottom.setBackground(new Color(187, 171, 140));
				bottom.setBounds(0, 266, 555, 33);
				Fondo.add(bottom);
			}
			see_values();
		}
	}

	    //---------------------------------------

		private void see_values() {
		}

		private boolean update_values() {
			try {
				Menu.porcentaje1 = dbl(txt1.getText()) / 100;
				Menu.porcentaje2 = dbl(txt2.getText()) / 100;
				Menu.porcentaje3 = dbl(txt3.getText()) / 100;
				Menu.porcentaje4 = dbl(txt4.getText()) / 100;
				return true;
			} catch (Exception e) {
				return false;
			}
		}

		private double dbl(String s) {
			return Double.parseDouble(s);
		}

		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == btnAplicar) {
				actionPerformedBtnAplicar(e);
			}
		}

		protected void actionPerformedBtnAplicar(ActionEvent e) {
			if (update_values()) {
				JOptionPane.showMessageDialog(this, "Valores actualizados con éxito", "Éxito",
						JOptionPane.INFORMATION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(this, "Ingrese valores numéricos válidos", "Error",
						JOptionPane.ERROR_MESSAGE);
			}
		}
	}
