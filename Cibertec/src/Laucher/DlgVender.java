package Laucher;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.Toolkit;


public class DlgVender extends JDialog implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JLabel lblModelo;
	private JLabel lblPrecio;
	private JLabel lblCantidad;
	private JComboBox <String> cboMaletas;
	private JTextField txtPre;
	private JTextField textCant;
	private JButton btnVender;
	private JButton btnCerrar;
	private JTextArea txtS;
	public static int ventasEfectuadas = 0;
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
					DlgVender dialog = new DlgVender();
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
	public DlgVender() {
		setForeground(Color.BLACK);
		setBackground(new Color(63, 144, 175));
		setFont(new Font("Dialog", Font.BOLD, 18));
		setTitle("Vender Productos");
		setIconImage(Toolkit.getDefaultToolkit().getImage(DlgVender.class.getResource("/imagenes/vender.png")));
		getContentPane().setBackground(new Color(153, 204, 204));
		getContentPane().setForeground(new Color(153, 204, 204));
		setBounds(100, 100, 546, 450);
		setResizable(false);
		getContentPane().setLayout(null);
		{
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 154, 510, 246);
			getContentPane().add(scrollPane);
			
			txtS = new JTextArea();
			txtS.setFont(new Font("Segoe UI Symbol", Font.BOLD, 13));
			txtS.setBackground(new Color(219, 226, 239));
			txtS.setForeground(new Color(17, 45, 78));
			txtS.setEditable(false);
			scrollPane.setViewportView(txtS);
		}
		
		txtPre = new JTextField();
		txtPre.setText(String.valueOf(Menu.precio0));
		txtPre.setBounds(105, 62, 180, 22);
		txtPre.setFont(new Font("Verdana", Font.BOLD, 11));
		txtPre.setForeground(Color.BLACK);
		txtPre.setEditable(false);
		getContentPane().add(txtPre);
		txtPre.setColumns(10);
		
		textCant = new JTextField();
		textCant.setBounds(105, 103, 180, 22);
		textCant.setFont(new Font("Verdana", Font.BOLD, 11));
		textCant.setForeground(Color.BLACK);
		getContentPane().add(textCant);
		textCant.setColumns(10);
		
		btnVender = new JButton("Vender");
		btnVender.setBounds(365, 24, 127, 36);
		btnVender.setFont(new Font("Verdana", Font.BOLD, 11));
		btnVender.setBackground(new Color(63, 144, 175));
		btnVender.setForeground(new Color(249, 247, 247));
		btnVender.addActionListener(this);
		getContentPane().add(btnVender);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.setBounds(365, 89, 127, 36);
		btnCerrar.setFont(new Font("Verdana", Font.BOLD, 11));
		btnCerrar.setBackground(new Color(63, 144, 175));
		btnCerrar.setForeground(new Color(249, 247, 247));
		btnCerrar.addActionListener(this);
		getContentPane().add(btnCerrar);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(219, 226, 239));
		panel.setBounds(10, 11, 292, 132);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		lblCantidad = new JLabel("Cantidad     :");
		lblCantidad.setBounds(10, 92, 85, 20);
		panel.add(lblCantidad);
		lblCantidad.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCantidad.setBackground(Color.WHITE);
		lblCantidad.setForeground(new Color(17, 45, 78));
		
		lblPrecio = new JLabel("Precio (S/.) :");
		lblPrecio.setBounds(10, 52, 85, 20);
		panel.add(lblPrecio);
		lblPrecio.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPrecio.setBackground(Color.WHITE);
		lblPrecio.setForeground(new Color(17, 45, 78));
		
		
		lblModelo = new JLabel("Modelo       :");
		lblModelo.setBounds(10, 11, 85, 22);
		panel.add(lblModelo);
		lblModelo.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblModelo.setBackground(Color.WHITE);
		lblModelo.setForeground(new Color(17, 45, 78));
		lblModelo.setToolTipText("");
		
		cboMaletas = new JComboBox <String> ();
		cboMaletas.setBounds(95, 11, 180, 22);
		panel.add(cboMaletas);
		cboMaletas.setBackground(Color.WHITE);
		cboMaletas.setFont(new Font("Verdana", Font.BOLD, 12));
		cboMaletas.setForeground(Color.BLACK);
		cboMaletas.addActionListener(this);
		cboMaletas.setModel(new DefaultComboBoxModel <String>(new String[] {"Cinza Plus", "Luxury", "Austria", "Yungay Mix", "Thal\u00EDa"}));
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cboMaletas) {
			actionPerformedComboBox(e);
		}
		if (e.getSource() == btnVender) {
			actionPerformedBtnVender(e);
		}
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
	}
	protected void actionPerformedBtnCerrar(ActionEvent e) {
	dispose();

	}
	protected void actionPerformedBtnVender(ActionEvent e) {
	    // Obtener la cantidad ingresada
	    String ErrorCantidad = textCant.getText().trim();
	    
	    if (ErrorCantidad.isEmpty()) {
	        // Mostrar un mensaje de advertencia si no se ingresó cantidad
	        JOptionPane.showMessageDialog(this, "Por favor, ingrese la cantidad", "Error", JOptionPane.WARNING_MESSAGE);
	    } else {
	        try {
	        	int cantidad, obsequio;
	            double precio, impC, impD, impP;
	            String modelo;

	            // Obtener el modelo seleccionado y la cantidad ingresada
	            modelo = cboMaletas.getSelectedItem().toString();
	            cantidad = Integer.parseInt(textCant.getText());
	            /* Verificar que la cantidad sea mayor que cero*/
	            if (cantidad <= 0) {
	            JOptionPane.showMessageDialog(this, "La cantidad debe ser mayor que cero", "Error", JOptionPane.WARNING_MESSAGE);
	            return; // Salir del método si la cantidad es menor o igual a cero
	            }

	            // Determinar el precio según el modelo seleccionado
	            if (modelo=="Cinza Plus") {precio = Menu.precio0;}
	            else if (modelo=="Luxury") {precio = Menu.precio1;}
	            else if (modelo=="Austria") {precio = Menu.precio2;} 
	            else if (modelo=="Yungay Mix") {precio = Menu.precio3;} 
	            else {precio = Menu.precio4;}

	            // Calcular el importe de compra
	            impC = precio * cantidad;

	            // Calcular el descuento según la cantidad comprada
	            if (cantidad >= 1 && cantidad <= 5) {impD = Menu.porcentaje1 / 100 * impC;} 
	            else if (cantidad >= 6 && cantidad <= 10) {impD = Menu.porcentaje2 / 100 * impC;} 
	            else if (cantidad >= 11 && cantidad <= 15) {impD = Menu.porcentaje3 / 100 * impC;} 
	            else {impD = Menu.porcentaje4 / 100 * impC;}

	            // Calcular el importe a pagar
	            impP = impC - impD;

	            // Determinar el obsequio según la cantidad comprada
	            if (cantidad >= 1 && cantidad <= 5) {
	                obsequio = Menu.obsequioCantidad1;
	            } else if (cantidad >= 6 && cantidad <= 10) {
	                obsequio = Menu.obsequioCantidad2;
	            } else {
	                obsequio = Menu.obsequioCantidad3;
	            }
	            // Contador de ventas realizadas
	            ventasEfectuadas++;

	            // Mostrar la boleta de venta en el área de texto
	            txtS.setText("BOLETA DE VENTA \n");
	            imprimir("Ventas efectuadas : " + ventasEfectuadas);
	            imprimir("");
	            imprimir("Modelo : " + modelo);
	            imprimir("Precio : S/." + precio);
	            imprimir("Cantidad adquirida : " + cantidad);
	            imprimir("Importe de compra : S/." + decimalFormat(impC));
	            imprimir("Importe de descuento: S/." + decimalFormat(impD));
	            imprimir("Importe a pagar: S/." + decimalFormat(impP));
	            imprimir("Tipo de obsequio: " + Menu.tipoObsequio);
	            imprimir("Unidades obsequiadas: " + obsequio);

	            int selec = cboMaletas.getSelectedIndex();

	            // Actualizar estadísticas según el modelo seleccionado
	            if (selec == 0) {
	                Menu.CantidadVenta0++;
	                Menu.CantidadCajas0 += cantidad;
	                Menu.impTotalVendido0 += impP;
	            } else if (selec == 1) {
	                Menu.CantidadVenta1++;
	                Menu.CantidadCajas1 += cantidad;
	                Menu.impTotalVendido1 += impP;
	            } else if (selec == 2) {
	                Menu.CantidadVenta2++;
	                Menu.CantidadCajas2 += cantidad;
	                Menu.impTotalVendido2 += impP;
	            } else if (selec == 3) {
	                Menu.CantidadVenta3++;
	                Menu.CantidadCajas3 += cantidad;
	                Menu.impTotalVendido3 += impP;
	            } else {
	                Menu.CantidadVenta4++;
	                Menu.CantidadCajas4 += cantidad;
	                Menu.impTotalVendido4 += impP;
	            }

	        } catch (NumberFormatException ex) {
	            // Manejar la excepción si no se ingresa una cantidad válida (solo números)
	            JOptionPane.showMessageDialog(this, "Por favor, ingrese una cantidad válida (solo números)", "Error", JOptionPane.WARNING_MESSAGE);
	        }
	    }
	}
	
	protected void actionPerformedComboBox(ActionEvent e) {
		
		int a = cboMaletas.getSelectedIndex();
		// Variable para almacenar el precio en formato de texto
		String precioText;
		// Selecciona el precio correspondiente según el índice seleccionado
		if(a==0) {precioText = String.valueOf(Menu.precio0);}
		else if(a==1) {precioText =String.valueOf(Menu.precio1);}
		else if(a==2) {precioText = String.valueOf(Menu.precio2);}
		else if(a==3) {precioText = String.valueOf(Menu.precio3);}
		else{precioText = String.valueOf(Menu.precio4);}
	// Muestra el precio en el campo de texto txtPre
	txtPre.setText(precioText);
	}
	// Método para formatear un número decimal a una cadena con dos decimales
	String decimalFormat(double p){
	return String.format("%.2f",p).replace(",", ".");
	}
	// Método para imprimir una cadena en el componente txtS
	void imprimir(String s) {
	txtS.append(s + "\n");
	}
}
