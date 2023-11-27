package Laucher;

import java.awt.Color;
import java.awt.EventQueue;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import java.awt.Toolkit;

public class DlgGenerarReportes extends JDialog implements ActionListener{

	private static final long serialVersionUID = 1L;

	private JLabel lblTipoReporte;
	private JComboBox <String> cboOpciones;
	private JButton btnCerrar;
	private JScrollPane scrollPane_1;
	private JTextArea txtA;
	private JPanel panel;


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
					DlgGenerarReportes dialog = new DlgGenerarReportes();
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
	public DlgGenerarReportes() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(DlgGenerarReportes.class.getResource("/imagenes/Reporte.png")));
		getContentPane().setBackground(new Color(153, 204, 204));
		setTitle("Generar reporte");
		setBounds(100, 100, 703, 506);
		setResizable(false);
		getContentPane().setLayout(null);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.setBackground(new Color(63, 144, 175));
		btnCerrar.setForeground(Color.WHITE);
		btnCerrar.setFont(new Font("Verdana", Font.BOLD, 11));
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(294, 419, 112, 37);
		getContentPane().add(btnCerrar);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 94, 667, 305);
		getContentPane().add(scrollPane_1);
		
		txtA = new JTextArea();
		txtA.setBackground(new Color(219,226,239));
		txtA.setForeground(new Color(17, 45, 78));
		txtA.setFont(new Font("Tahoma", Font.BOLD, 13));
		scrollPane_1.setViewportView(txtA);				
		
		panel = new JPanel();
		panel.setBackground(new Color(219,226,239));
		panel.setBounds(10, 11, 667, 66);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		cboOpciones = new JComboBox <String> ();
		cboOpciones.setBounds(197, 22, 422, 22);
		panel.add(cboOpciones);
		cboOpciones.setBackground(Color.WHITE);
		cboOpciones.setForeground(Color.BLACK);
		cboOpciones.setFont(new Font("Verdana", Font.BOLD, 12));
		cboOpciones.addActionListener(this);
		cboOpciones.setModel(new DefaultComboBoxModel <String>(new String[] {"Ventas por modelo", "Comparaci\u00F3n de precios con el precio promedio", "Comparaci\u00F3n de cajas vendidas con la cantidad \u00F3ptima", "Estad\u00EDstica sobre el precio"}));
		
		lblTipoReporte = new JLabel("Tipo de reporte :");
		lblTipoReporte.setBounds(39, 26, 112, 14);
		panel.add(lblTipoReporte);
		lblTipoReporte.setForeground(new Color(17, 45, 78));
		lblTipoReporte.setFont(new Font("Tahoma", Font.BOLD, 12));
		
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cboOpciones) {
			actionPerformedCboOpciones(e);
		}
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
	}
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}
	protected void actionPerformedCboOpciones(ActionEvent e) {
		
		int select = cboOpciones.getSelectedIndex();
		
		/* Variables locales:
		prom = promedio
		dif = diferencia
		c = comparación*/
		
		double prom,dif,dif1,dif2,dif3,dif4;
		String c,c1,c2,c3,c4;
		
		// Calcula el promedio de los precios de los modelos
		prom = (Menu.precio0+Menu.precio1+Menu.precio2+Menu.precio3+Menu.precio4)/5;
		
		// Calcula la diferencia entre cada precio y el promedio
		dif = Menu.precio0 - prom;
		dif1= Menu.precio1 - prom;
		dif2= Menu.precio2 - prom;
		dif3= Menu.precio3 - prom;
		dif4= Menu.precio4 - prom;
		
        if (dif > 0) {c = decimalFormat(dif)+"  " + "más que el promedio";} 
        else if (dif < 0) { c = dif+"  " +"menos que el promedio";} 
        else {c = "igual al promedio";}
        
        if (dif1 > 0) {c1 = decimalFormat(dif1)+"  " + "más que el promedio";} 
        else if (dif1 < 0) { c1 = decimalFormat(dif1)+"  " +"menos que el promedio";} 
        else {c1 = "igual al promedio";}
        
        if (dif2 > 0) {c2 = decimalFormat(dif2) +"  " +"más que el promedio";} 
        else if (dif2 < 0) { c2 = decimalFormat(dif2)+"  " +"menos que el promedio";} 
        else {c2 = "igual al promedio";}
        
        if (dif3 > 0) {c3 = decimalFormat(dif3)+"  " + "más que el promedio";} 
        else if (dif3 < 0) { c3 = decimalFormat(dif3)+"  " +"menos que el promedio";} 
        else {c3 = "igual al promedio";}
        
        if (dif4 > 0) {c4 = decimalFormat(dif4)+"  " + "más que el promedio";} 
        else if (dif4 < 0) { c4 = decimalFormat(dif4)+"  " +"menos que el promedio";} 
        else {c4 = "igual al promedio";}
       
        //Declaración de variables para el aporte de la cuota diaria
       
        double AporteCD1,AporteCD2,AporteCD3,AporteCD4,AporteCD5;
        
        AporteCD1= (Menu.impTotalVendido0 * 100)/Menu.cuotaDiaria;
        AporteCD2= (Menu.impTotalVendido1 * 100)/Menu.cuotaDiaria;
        AporteCD3= (Menu.impTotalVendido2 * 100)/Menu.cuotaDiaria;
        AporteCD4= (Menu.impTotalVendido3 * 100)/Menu.cuotaDiaria;
        AporteCD5= (Menu.impTotalVendido4 * 100)/Menu.cuotaDiaria;
        
        //Muestra los resultado de "Ventas Por Modelo"
		
        if(select==0) {
			txtA.setText("VENTAS POR MODELO \n");
			imprimir("Modelo 		: " + Menu.modelo0);
			imprimir("Cantidad de ventas 	: " + Menu.CantidadVenta0);
			imprimir("Cantidad de cajas vendidas: " + Menu.CantidadCajas0);
			imprimir("Importe total vendido 	: " + decimalFormat(Menu.impTotalVendido0));
			imprimir("Aporte a la cuota diaria 	: "+ decimalFormat(AporteCD1) + "%");
			imprimir("----------------------------------------------------------------------");
			imprimir("Modelo 		: " + Menu.modelo1);
			imprimir("Cantidad de ventas 	: " + Menu.CantidadVenta1);
			imprimir("Cantidad de cajas vendidas: " + Menu.CantidadCajas1);
			imprimir("Importe total vendido 	: " + decimalFormat(Menu.impTotalVendido1));
			imprimir("Aporte a la cuota diaria 	: "+ decimalFormat(AporteCD2) + "%");
			imprimir("----------------------------------------------------------------------");
			imprimir("Modelo 		: " + Menu.modelo2);
			imprimir("Cantidad de ventas 	: " + Menu.CantidadVenta2);
			imprimir("Cantidad de cajas vendidas: " + Menu.CantidadCajas2);
			imprimir("Importe total vendido 	: " + decimalFormat(Menu.impTotalVendido2));
			imprimir("Aporte a la cuota diaria 	: "+ decimalFormat(AporteCD3) + "%");
			imprimir("----------------------------------------------------------------------");
			imprimir("Modelo 		: " + Menu.modelo3);
			imprimir("Cantidad de ventas 	: " + Menu.CantidadVenta3);
			imprimir("Cantidad de cajas vendidas: " + Menu.CantidadCajas3);
			imprimir("Importe total vendido 	: " + decimalFormat(Menu.impTotalVendido3));
			imprimir("Aporte a la cuota diaria 	: "+ decimalFormat(AporteCD4) + "%");
			imprimir("----------------------------------------------------------------------");
			imprimir("Modelo 		: " + Menu.modelo4);
			imprimir("Cantidad de ventas 	: " + Menu.CantidadVenta4);
			imprimir("Cantidad de cajas vendidas: " + Menu.CantidadCajas4);
			imprimir("Importe total vendido 	: " + decimalFormat(Menu.impTotalVendido4));
			imprimir("Aporte a la cuota diaria 	: " + decimalFormat(AporteCD5) + "%");
			imprimir("----------------------------------------------------------------------");
			}
      //Muestra los resultado de "COMPARACIÓN DE PRECIOS CON EL PRECIO PROMEDIO"
		else if(select==1) {
			txtA.setText("COMPARACIÓN DE PRECIOS CON EL PRECIO PROMEDIO \n");
			imprimir("Modelo		: " + Menu.modelo0);
			imprimir("Precio		: " + Menu.precio0);
			imprimir("Precio promedio	: " + decimalFormat(prom));
	        imprimir("Comparación		: "+ c);
	        imprimir("----------------------------------------------------------------------");
	        imprimir("Modelo		: " + Menu.modelo1);
			imprimir("Precio		: " + Menu.precio1);
			imprimir("Precio promedio	: "+ decimalFormat(prom));
	        imprimir("Comparación		: " + c1);
	        imprimir("----------------------------------------------------------------------");
	        imprimir("Modelo		: " + Menu.modelo2);
			imprimir("Precio		: " + Menu.precio2);
			imprimir("Precio promedio	: "+ decimalFormat(prom));
	        imprimir("Comparación		: " + c2);
	        imprimir("----------------------------------------------------------------------");
	        imprimir("Modelo		: " + Menu.modelo3);
			imprimir("Precio		: " + Menu.precio3);
			imprimir("Precio promedio	: "+ decimalFormat(prom));
	        imprimir("Comparación		: " + c3);
	        imprimir("----------------------------------------------------------------------");
	        imprimir("Modelo		: " + Menu.modelo4);
			imprimir("Precio		: " + Menu.precio4);
			imprimir("Precio promedio	: "+ decimalFormat(prom));
	        imprimir("Comparación		: " + c4);
	        }
        
		else if (select==2) {
			 // Variables locales
			double cajas0,cajas1,cajas2,cajas3,cajas4;
			String comparacion0,comparacion1,comparacion2,comparacion3,comparacion4;
			// Calcula la diferencia entre la cantidad de ventas y la cantidad óptima
			cajas0 = Menu.CantidadVenta0 -Menu.cantidadOptima;
			cajas1 = Menu.CantidadVenta1 -Menu.cantidadOptima;
			cajas2 = Menu.CantidadVenta2 -Menu.cantidadOptima;
			cajas3 = Menu.CantidadVenta3 -Menu.cantidadOptima;
			cajas4 = Menu.CantidadVenta4 -Menu.cantidadOptima;
			
			if (cajas0 > 0) {comparacion0 = decimalFormat(cajas0)+ " más que el promedio";} 
	        else if (cajas0 < 0) { comparacion0 = decimalFormat(cajas0)+" menos que el promedio";} 
	        else {comparacion0 = "igual al promedio";}
	        
			if (cajas1 > 0) {comparacion1 = decimalFormat(cajas1)+" más que el promedio";} 
	        else if (cajas1 < 0) { comparacion1 = decimalFormat(cajas1)+" menos que el promedio";} 
	        else {comparacion1 = "igual al promedio";}
	        
			if (cajas2 > 0) {comparacion2 = decimalFormat(cajas2)+ " más que el promedio";} 
	        else if (cajas2 < 0) { comparacion2 = decimalFormat(cajas2)+" menos que el promedio";} 
	        else {comparacion2 = "igual al promedio";}
	        
			if (cajas3 > 0) {comparacion3 = decimalFormat(cajas3)+ " más que el promedio";} 
	        else if (cajas3 < 0) { comparacion3 = decimalFormat(cajas3)+" menos que el promedio";} 
	        else {comparacion3 = "igual al promedio";}
	        
			if (cajas4 > 0) {comparacion4 = decimalFormat(cajas4)+" más que el promedio";} 
	        else if (cajas4 < 0) { comparacion4 = decimalFormat(cajas4) +" menos que el promedio";} 
	        else {comparacion4 = "igual al promedio";}
			//Muestra los resultado de "COMPARACIÓN DE CAJAS VENDIDAS CON LA CANTIDAD ÓPTIMA"
			txtA.setText("COMPARACIÓN DE CAJAS VENDIDAS CON LA CANTIDAD ÓPTIMA \n");
			imprimir("Modelo		: " + Menu.modelo0);
			imprimir("Cantidad de cajas vendidas: " + Menu.CantidadVenta0);
			imprimir("Cantidad óptima	: " + Menu.cantidadOptima);
	        imprimir("Comparación		: " + comparacion0);
	        imprimir("----------------------------------------------------------------------");
	        imprimir("Modelo		: " + Menu.modelo1);
			imprimir("Cantidad de cajas vendidas: " + Menu.CantidadVenta1);
			imprimir("Cantidad óptima	: " + Menu.cantidadOptima);
	        imprimir("Comparación		: " + comparacion1);
	        imprimir("----------------------------------------------------------------------");
	        imprimir("Modelo		: " + Menu.modelo2);
			imprimir("Cantidad de cajas vendidas: " + Menu.CantidadVenta2);
			imprimir("Cantidad óptima	: " + Menu.cantidadOptima);
	        imprimir("Comparación		: " + comparacion2);
	        imprimir("----------------------------------------------------------------------");
	        imprimir("Modelo		: " + Menu.modelo3);
			imprimir("Cantidad de cajas vendidas: " + Menu.CantidadVenta3);
			imprimir("Cantidad óptima	: " + Menu.cantidadOptima);
	        imprimir("Comparación		: " + comparacion3);
	        imprimir("----------------------------------------------------------------------");
	        imprimir("Modelo		: " + Menu.modelo4);
			imprimir("Cantidad de cajas vendidas: " + Menu.CantidadVenta4);
			imprimir("Cantidad óptima	: " + Menu.cantidadOptima);
	        imprimir("Comparación		: " + comparacion4);
	        imprimir("----------------------------------------------------------------------");
		}
		else {
			
			// Suponemos que el precio del primer es el mayor inicialmente
			double mayor = Menu.precio0; 

	        if (Menu.precio1 > mayor) {mayor = Menu.precio1;}
	        if (Menu.precio2 > mayor) {mayor = Menu.precio2;}
	        if (Menu.precio3 > mayor) {mayor = Menu.precio3;}
	        if (Menu.precio4 > mayor) {mayor = Menu.precio4;}
	     
	        // Suponemos que el precio del primer es el menor inicialmente
	        double menor = Menu.precio0; 

	        if (Menu.precio1 < menor) {menor = Menu.precio1;}
	        if (Menu.precio2 < menor) {menor = Menu.precio2;}
	        if (Menu.precio3 < menor) {menor = Menu.precio3;}
	        if (Menu.precio4 < menor) {menor = Menu.precio4;}

	        double promedio = (Menu.precio0 + Menu.precio1 + Menu.precio2 + Menu.precio3 + Menu.precio4) / 5;
			
	      //Muestra los resultado de "ESTADÍSTICA SOBRE EL PRECIO"
			txtA.setText("ESTADÍSTICA SOBRE EL PRECIO \n\n");
			imprimir("Precio promedio   :" + decimalFormat(promedio));
			imprimir("Precio mayor        :" + decimalFormat(mayor));
			imprimir("Precio menor        :"+ decimalFormat(menor));
		}
	}
	// Método para formatear un número decimal con dos dígitos decimales
	String decimalFormat(double p) { double absP = Math.abs(p); // Obtiene el valor absoluto del número p
	    return String.format("%.2f", absP); //Formatea el valor absoluto con dos decimales y lo convierte a una cadena
	}
	void imprimir(String s) {
		txtA.append(s + "\n");
	}
}
