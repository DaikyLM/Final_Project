package Laucher;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.JLabel;

public class Menu extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel Fondo;
	private JButton btnArchivo;
	private JButton btnVentas;
	private JButton btnMantenimiento;
	private JButton btnConfiguracion;
	private JButton btnAyuda;
	private JButton btnSalir; 
	private JButton btnConsultarCeramico;
	private JButton btnModificarCeramico;
	private JButton btnListarCeramicos;
	private JButton btnVender;
	private JButton btnGenerarReportes;
	private JButton btnConfigurarDescuento;
	private JButton btnConfigurarCantidadptima;
	private JButton btnConfigurarObsequios;
	private JButton btnConfigurarCuotaDiaria;
	private JButton btnTienda;
	 
		// Datos m�nimos del primer producto
		public static String modelo0 = "Cinza Plus";
		public static double precio0 = 92.56;
		public static double ancho0 = 62.0;
		public static double largo0 = 62.0;
		public static double espesor0 = 8;
		public static int contenido0 = 6;
		public static int CantidadVenta0;
		public static int CantidadCajas0;
		public static double impTotalVendido0;
		// Datos m�nimos del segundo producto
		public static String modelo1 = "Luxury";
		public static double precio1 = 42.77;
		public static double ancho1 = 60;
		public static double largo1 = 60;
		public static double espesor1 = 8.5;
		public static int contenido1 = 4;
		public static int CantidadVenta1;
		public static int CantidadCajas1;
		public static double impTotalVendido1;
		// Datos m�nimos del tercer producto
		public static String modelo2 = "Austria";
		public static double precio2 = 52.45;
		public static double ancho2 = 45;
		public static double largo2 = 45;
		public static double espesor2 = 6.5;
		public static int contenido2 = 12;
		public static int CantidadVenta2;
		public static int CantidadCajas2;
		public static double impTotalVendido2;
		// Datos m�nimos del cuarto producto
		public static String modelo3 = "Yungay Mix";
		public static double precio3 = 55.89;
		public static double ancho3 = 80;
		public static double largo3 = 120;
		public static double espesor3 = 6.8;
		public static int contenido3 = 9;
		public static int CantidadVenta3;
		public static int CantidadCajas3;
		public static double impTotalVendido3;
		// Datos m�nimos del quinto producto
		public static String modelo4 = "Thalía";
		public static double precio4 = 45;
		public static double ancho4 = 45;
		public static double largo4 = 11.8;
		public static double espesor4 = 7.2;
		public static int contenido4 = 10;
		public static int CantidadVenta4;
		public static int CantidadCajas4;
		public static double impTotalVendido4;
		// Porcentajes de descuento
		public static double porcentaje1 = 7.5;
		public static double porcentaje2 = 10.0;
		public static double porcentaje3 = 12.5;
		public static double porcentaje4 = 15.0;
		// Obsequio
		public static String tipoObsequio = "Lapicero";
		public static int obsequioCantidad1 = 2;
		public static int obsequioCantidad2 = 3;
		public static int obsequioCantidad3 = 4;
		// Cantidad optima de unidades vendidas por d�a
		public static int cantidadOptima = 10;
		// Cuota diaria
		public static double cuotaDiaria = 30000;

		public static ImageIcon resizeIcon(ImageIcon icon, int width, int height) {
		Image image = icon.getImage();
		Image newImage = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
		return new ImageIcon(newImage);}

	/**
	 * Launch the application.
	 */
public static void main(String[] args) {
		
		/*AQUI SE HACE REFERENCIA A flatlaf PARA EL UI DESIGN*/
		try {
			UIManager.setLookAndFeel(new com.formdev.flatlaf.intellijthemes.FlatArcIJTheme());
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
					Menu frame = new Menu();
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
					frame.setResizable(false); 
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the frame.
	 */
	public Menu() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Menu.class.getResource("/imagenes/java.png")));
		setTitle("Laucher");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 930, 563);
		Fondo = new JPanel();
		Fondo.setBackground(Color.WHITE);
		Fondo.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(Fondo);
		
		JPanel Deco = new JPanel();
		Deco.setForeground(new Color(0, 0, 0));
		Deco.setBounds(0, 0, 918, 101);
		Deco.setBackground(new Color(204, 204, 255));
		Fondo.setLayout(null);
		
		JPanel Tapa = new JPanel();
		Tapa.setBackground(Color.WHITE);
		Tapa.setBounds(22, 101, 882, 368);
		Fondo.add(Tapa);
		Tapa.setLayout(null);
		
		JPanel Deco_1 = new JPanel();
		Deco_1.setForeground(new Color(204, 204, 250));
		Deco_1.setBackground(new Color(204, 204, 255));
		Deco_1.setBounds(0, 470, 918, 54);
		Fondo.add(Deco_1);
		
		JPanel SepDeco = new JPanel();
		SepDeco.setBackground(Color.WHITE);
		SepDeco.setBounds(0, 16, 918, 10);
		Fondo.add(SepDeco);
		Fondo.add(Deco);
		Deco.setLayout(null);

		btnArchivo = new JButton("Archivo");
		
		btnArchivo.setIcon(
				resizeIcon(new ImageIcon(Menu.class.getResource("/imagenes/carpeta.png")), 40, 30));
		btnArchivo.setBorder(null);
		btnArchivo.addActionListener(this);
		BotonesEfecto(btnArchivo);
		btnArchivo.setForeground(new Color(0, 0, 0));
		btnArchivo.setFont(new Font("Verdana", Font.BOLD, 13));
		btnArchivo.setBorderPainted(false);
		btnArchivo.setBackground(new Color(204, 204, 255));
		btnArchivo.setBounds(20, 26, 167, 75);
		Deco.add(btnArchivo);

		btnMantenimiento = new JButton("Mantenimiento");
		
		btnMantenimiento.setIcon(
				resizeIcon(new ImageIcon(Menu.class.getResource("/imagenes/llave-inglesa.png")), 40, 30));
		btnMantenimiento.setBorder(null);
		btnMantenimiento.addActionListener(this);
		BotonesEfecto(btnMantenimiento);
		btnMantenimiento.setForeground(new Color(0, 0, 0));
		btnMantenimiento.setFont(new Font("Verdana", Font.BOLD, 13));
		btnMantenimiento.setBackground(new Color(204, 204, 255));
		btnMantenimiento.setBounds(197, 26, 167, 75);
		Deco.add(btnMantenimiento);
		
		btnVentas = new JButton("Ventas");
		
		btnVentas.setIcon(
				resizeIcon(new ImageIcon(Menu.class.getResource("/imagenes/etiqueta-de-precio.png")), 40, 30));
		btnVentas.setBorder(null);
		btnVentas.addActionListener(this);
		BotonesEfecto(btnVentas);
		btnVentas.setForeground(new Color(0, 0, 0));
		btnVentas.setFont(new Font("Verdana", Font.BOLD, 13));
		btnVentas.setBackground(new Color(204, 204, 255));
		btnVentas.setBounds(374, 26, 167, 75);
		Deco.add(btnVentas);
		
		btnConfiguracion = new JButton("Configuración");

		btnConfiguracion.setIcon(
				resizeIcon(new ImageIcon(Menu.class.getResource("/imagenes/configuraciones.png")), 40, 30));
		btnConfiguracion.setBorder(null);
		btnConfiguracion.addActionListener(this);
		BotonesEfecto(btnConfiguracion);
		btnConfiguracion.setForeground(new Color(0, 0, 0));
		btnConfiguracion.setFont(new Font("Verdana", Font.BOLD, 13));
		btnConfiguracion.setBackground(new Color(204, 204, 255));
		btnConfiguracion.setBounds(551, 26, 167, 75);
		Deco.add(btnConfiguracion);
		
		btnAyuda = new JButton("Ayuda");
		
		btnAyuda.setIcon(
				resizeIcon(new ImageIcon(Menu.class.getResource("/imagenes/ayudar.png")), 40, 30));
		btnAyuda.setBorder(null);
		btnAyuda.addActionListener(this);
		BotonesEfecto(btnAyuda);
		btnAyuda.setForeground(new Color(0, 0, 0));
		btnAyuda.setFont(new Font("Verdana", Font.BOLD, 13));
		btnAyuda.setBackground(new Color(204, 204, 255));
		btnAyuda.setBounds(728, 26, 167, 75);
		Deco.add(btnAyuda);
		
		JPanel Botones = new JPanel();
		Botones.setBackground(Color.WHITE);
		Botones.setBounds(53, 101, 808, 368);
		Fondo.add(Botones);
		Botones.setLayout(null);
		
		btnConfigurarDescuento = new JButton("Configurar descuentos");
		
		btnConfigurarDescuento.setBackground(new Color(204, 204, 250));
		btnConfigurarDescuento.setBorder(null);
		btnConfigurarDescuento.addActionListener(this);
		btnConfigurarDescuento.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnConfigurarDescuento.setHorizontalTextPosition(SwingConstants.CENTER);
		btnConfigurarDescuento.setIcon(
				resizeIcon(new ImageIcon(Menu.class.getResource("/imagenes/etiqueta.png")),80,70));
		btnConfigurarDescuento.setFont(new Font("Verdana", Font.BOLD, 13));
		btnConfigurarDescuento.setBounds(162, 29, 224, 137);
		Botones.add(btnConfigurarDescuento);
		btnConfigurarDescuento.setVisible(false);
		
		btnConfigurarCantidadptima = new JButton("Configurar cantidad óptima");
		
		btnConfigurarCantidadptima.setBackground(new Color(204, 204, 250));
		btnConfigurarCantidadptima.setBorder(null);
		btnConfigurarCantidadptima.addActionListener(this);
		btnConfigurarCantidadptima.setHorizontalTextPosition(SwingConstants.CENTER);
		btnConfigurarCantidadptima.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnConfigurarCantidadptima.setIcon(
				resizeIcon(new ImageIcon(Menu.class.getResource("/imagenes/dinero.png")),80,70));
		btnConfigurarCantidadptima.setFont(new Font("Verdana", Font.BOLD, 13));
		btnConfigurarCantidadptima.setBounds(429, 29, 224, 137);
		Botones.add(btnConfigurarCantidadptima);
		btnConfigurarCantidadptima.setVisible(false);
		
		btnConfigurarObsequios = new JButton("Configurar obsequios");

		btnConfigurarObsequios.setBackground(new Color(204, 204, 250));
		btnConfigurarObsequios.setBorder(null);
		btnConfigurarObsequios.addActionListener(this);
		btnConfigurarObsequios.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnConfigurarObsequios.setHorizontalTextPosition(SwingConstants.CENTER);
		btnConfigurarObsequios.setIcon(
				resizeIcon(new ImageIcon(Menu.class.getResource("/imagenes/obsequio.png")),80,70));
		btnConfigurarObsequios.setFont(new Font("Verdana", Font.BOLD, 13));
		btnConfigurarObsequios.setBounds(162, 195, 224, 137);
		Botones.add(btnConfigurarObsequios);
		btnConfigurarObsequios.setVisible(false);
		
		btnConfigurarCuotaDiaria = new JButton("Configurar cuota diaria");

		btnConfigurarCuotaDiaria.setBackground(new Color(204, 204, 250));
		btnConfigurarCuotaDiaria.setBorder(null);
		btnConfigurarCuotaDiaria.addActionListener(this);
		btnConfigurarCuotaDiaria.setHorizontalTextPosition(SwingConstants.CENTER);
		btnConfigurarCuotaDiaria.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnConfigurarCuotaDiaria.setIcon(
				resizeIcon(new ImageIcon(Menu.class.getResource("/imagenes/bolsa-de-dinero.png")),80,70));
		btnConfigurarCuotaDiaria.setFont(new Font("Verdana", Font.BOLD, 13));
		btnConfigurarCuotaDiaria.setBounds(429, 195, 224, 137);
		Botones.add(btnConfigurarCuotaDiaria);
		btnConfigurarCuotaDiaria.setVisible(false);
		
		btnVender = new JButton("Vender");
				
		btnVender.setIcon(
				resizeIcon(new ImageIcon(Menu.class.getResource("/imagenes/vender.png")),80,70));
		btnVender.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnVender.setHorizontalTextPosition(SwingConstants.CENTER);
		btnVender.setFont(new Font("Verdana", Font.BOLD, 13));
		btnVender.setBorder(null);
		btnVender.addActionListener(this);
		btnVender.setBackground(new Color(204, 204, 250));
		btnVender.setBounds(162, 99, 224, 137);
		Botones.add(btnVender);
		btnVender.setVisible(false);
		
		btnGenerarReportes = new JButton("Generar reportes");
	
		btnGenerarReportes.setIcon(
				resizeIcon(new ImageIcon(Menu.class.getResource("/imagenes/Reporte.png")),80,70));
		btnGenerarReportes.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnGenerarReportes.setHorizontalTextPosition(SwingConstants.CENTER);
		btnGenerarReportes.setFont(new Font("Verdana", Font.BOLD, 13));
		btnGenerarReportes.setBorder(null);
		btnGenerarReportes.addActionListener(this);
		btnGenerarReportes.setBackground(new Color(204, 204, 250));
		btnGenerarReportes.setBounds(429, 99, 224, 137);
		Botones.add(btnGenerarReportes);
		btnGenerarReportes.setVisible(false);
		
		btnConsultarCeramico = new JButton("Consultar cerámico");

		btnConsultarCeramico.setIcon(
				resizeIcon(new ImageIcon(Menu.class.getResource("/imagenes/Consultar.png")),80,70));
		btnConsultarCeramico.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnConsultarCeramico.setHorizontalTextPosition(SwingConstants.CENTER);
		btnConsultarCeramico.setFont(new Font("Verdana", Font.BOLD, 13));
		btnConsultarCeramico.setBorder(null);
		btnConsultarCeramico.addActionListener(this);
		btnConsultarCeramico.setBackground(new Color(204, 204, 250));
		btnConsultarCeramico.setBounds(294, 29, 224, 137);
		Botones.add(btnConsultarCeramico);
		btnConsultarCeramico.setVisible(false);
		
		btnModificarCeramico = new JButton("Modificar cerámico");	

		btnModificarCeramico.setIcon(
				resizeIcon(new ImageIcon(Menu.class.getResource("/imagenes/editar.png")),80,70));
		btnModificarCeramico.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnModificarCeramico.setHorizontalTextPosition(SwingConstants.CENTER);
		btnModificarCeramico.setFont(new Font("Verdana", Font.BOLD, 13));
		btnModificarCeramico.setBorder(null);
		btnModificarCeramico.addActionListener(this);
		btnModificarCeramico.setBackground(new Color(204, 204, 250));
		btnModificarCeramico.setBounds(162, 195, 224, 137);
		Botones.add(btnModificarCeramico);
		btnModificarCeramico.setVisible(false);
		
		btnListarCeramicos = new JButton("Listar cerámicos");

		btnListarCeramicos.setIcon(
				resizeIcon(new ImageIcon(Menu.class.getResource("/imagenes/Listar.png")),80,70));
		btnListarCeramicos.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnListarCeramicos.setHorizontalTextPosition(SwingConstants.CENTER);
		btnListarCeramicos.setFont(new Font("Verdana", Font.BOLD, 13));
		btnListarCeramicos.setBorder(null);
		btnListarCeramicos.addActionListener(this);
		btnListarCeramicos.setBackground(new Color(204, 204, 250));
		btnListarCeramicos.setBounds(429, 195, 224, 137);
		Botones.add(btnListarCeramicos);
		btnListarCeramicos.setVisible(false);
		
		btnSalir = new JButton("Salir");
		
		btnSalir.setIcon(
				resizeIcon(new ImageIcon(Menu.class.getResource("/imagenes/Salir.png")),80,70));
		btnSalir.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnSalir.setHorizontalTextPosition(SwingConstants.CENTER);
		btnSalir.setFont(new Font("Verdana", Font.BOLD, 13));
		btnSalir.setBorder(null);
		btnSalir.addActionListener(this);
		btnSalir.setBackground(new Color(204, 204, 250));
		btnSalir.setBounds(294, 112, 224, 137);
		Botones.add(btnSalir);
		btnSalir.setVisible(false);
		
		btnTienda = new JButton("Acerca de Tienda");
		
		btnTienda.setIcon(
				resizeIcon(new ImageIcon(Menu.class.getResource("/imagenes/tienda.png")),80,70));
		btnTienda.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnTienda.setHorizontalTextPosition(SwingConstants.CENTER);
		btnTienda.setFont(new Font("Verdana", Font.BOLD, 13));
		btnTienda.setBorder(null);
		btnTienda.addActionListener(this);
		btnTienda.setBackground(new Color(204, 204, 250));
		btnTienda.setBounds(294, 112, 224, 137);
		Botones.add(btnTienda);
		btnTienda.setVisible(false);
	}
	
	// Direcciona eventos de tipo ActionEvent

	public void actionPerformed(ActionEvent e) {
	    if (e.getSource() == btnArchivo) {
	        actionPerformedbtnArchivo(e);
	    }
	    if (e.getSource() == btnMantenimiento) {
	        actionPerformedbtnMantenimiento(e);
	    }
	    if (e.getSource() == btnConfiguracion) {
	        actionPerformedbtnConfiguracion(e);
	    }
	    if (e.getSource() == btnVentas) {
	        actionPerformedbtnVentas(e);
	    }
	    if (e.getSource() == btnConfigurarCuotaDiaria) {
	        actionPerformedbtnConfigurarCuotaDiaria(e);
	    }
	    if (e.getSource() == btnConfigurarDescuento) {
	        actionPerformedbtnConfigurarDescuento(e);
	    }
	    if (e.getSource() == btnConfigurarCantidadptima) {
	        actionPerformedbtnConfigurarCantidadptima(e);
	    }
	    if (e.getSource() == btnVender) {
	        actionPerformedbtnVender(e);
	    }
	    if (e.getSource() == btnConfigurarObsequios) {
	        actionPerformedbtnConfigurarObsequios(e);
	    }
	    if (e.getSource() == btnGenerarReportes) {
	        actionPerformedbtnGenerarReportes(e);
	    }
	    if (e.getSource() == btnConsultarCeramico) {
	        actionPerformedbtnConsultarCeramico(e);
	    }
	    if (e.getSource() == btnModificarCeramico) {
	        actionPerformedbtnModificarCeramico(e);
	    }
	    if (e.getSource() == btnListarCeramicos) {
	        actionPerformedbtnListarCeramicos(e);
	    }
	    if (e.getSource() == btnSalir) {
	        actionPerformedbtnSalir(e);
	    }
	    if (e.getSource() == btnTienda) {
	        actionPerformedbtnTienda(e);
	    }
	    if (e.getSource() == btnAyuda) {
	        actionPerformedbtnAyuda(e);
	    }
	}

	private void actionPerformedbtnTienda(ActionEvent e) {
		DlgAcercaDeTienda ADT= new DlgAcercaDeTienda();
		ADT.setLocationRelativeTo(null);
		ADT.setModal(true);
		ADT.setVisible(true);
	}

	private void actionPerformedbtnConfigurarDescuento(ActionEvent e) {
		DlgConfigurarDescuento CD= new DlgConfigurarDescuento();
		CD.setLocationRelativeTo(null);
		CD.setModal(true);
		CD.setVisible(true);
	}

	private void actionPerformedbtnSalir(ActionEvent e) {
		int confirmacion = JOptionPane.showConfirmDialog(this, "¿Estás seguro de que deseas salir?, se borrarán todos los cambios realizados.",
				"Saliendo de la aplicación", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
		if (confirmacion == JOptionPane.OK_OPTION) {
			System.exit(0);
		}
	}

	private void actionPerformedbtnListarCeramicos(ActionEvent e) {
		DlgListarCeramico CD= new DlgListarCeramico();
		CD.setLocationRelativeTo(null);
		CD.setModal(true);
		CD.setVisible(true);
	}

	private void actionPerformedbtnModificarCeramico(ActionEvent e) {
		DlgModificarCeramico MC= new DlgModificarCeramico();
		MC.setLocationRelativeTo(null);
		MC.setModal(true);
		MC.setVisible(true);
	}

	private void actionPerformedbtnConsultarCeramico(ActionEvent e) {
		DlgConsultarCeramico CC= new DlgConsultarCeramico();
		CC.setLocationRelativeTo(null);
		CC.setModal(true);
		CC.setVisible(true);
	}

	private void actionPerformedbtnGenerarReportes(ActionEvent e) {
		DlgGenerarReportes GR= new DlgGenerarReportes();
		GR.setLocationRelativeTo(null);
		GR.setModal(true);
		GR.setVisible(true);
	}

	private void actionPerformedbtnConfigurarObsequios(ActionEvent e) {
		DlgConfigurarObsequio CO= new DlgConfigurarObsequio();
		CO.setLocationRelativeTo(null);
		CO.setModal(true);
		CO.setVisible(true);
	}

	private void actionPerformedbtnVender(ActionEvent e) {
		DlgVender V= new DlgVender();
		V.setLocationRelativeTo(null);
		V.setModal(true);
		V.setVisible(true);
	}

	private void actionPerformedbtnConfigurarCantidadptima(ActionEvent e) {
		DlgConfigurarCantidadOptima CCO= new DlgConfigurarCantidadOptima();
		CCO.setLocationRelativeTo(null);
		CCO.setModal(true);
		CCO.setVisible(true);
	}

	private void actionPerformedbtnConfigurarCuotaDiaria(ActionEvent e) {
		DlgConfigurarCuotaDiaria CCD= new DlgConfigurarCuotaDiaria();
		CCD.setLocationRelativeTo(null);
		CCD.setModal(true);
		CCD.setVisible(true);
	}

	// Acción para revelar los botones que estaban ocultos
	
	protected void actionPerformedbtnArchivo(ActionEvent e) {
		btnSalir.setVisible(true);
	        
	    btnConsultarCeramico.setVisible(false);
	    btnModificarCeramico.setVisible(false);
	    btnListarCeramicos.setVisible(false);
	    btnVender.setVisible(false);
	    btnGenerarReportes.setVisible(false);
	    btnConfigurarDescuento.setVisible(false);
	    btnConfigurarCantidadptima.setVisible(false);
	    btnConfigurarObsequios.setVisible(false);
	    btnConfigurarCuotaDiaria.setVisible(false);
	    btnTienda.setVisible(false);
	}

	protected void actionPerformedbtnMantenimiento(ActionEvent e) {
		btnConsultarCeramico.setVisible(true);
        btnModificarCeramico.setVisible(true);
        btnListarCeramicos.setVisible(true);
        
        btnSalir.setVisible(false);
        btnVender.setVisible(false);
        btnGenerarReportes.setVisible(false);
        btnConfigurarDescuento.setVisible(false);
        btnConfigurarCantidadptima.setVisible(false);
        btnConfigurarObsequios.setVisible(false);
        btnConfigurarCuotaDiaria.setVisible(false);
        btnTienda.setVisible(false);
	}

	protected void actionPerformedbtnConfiguracion(ActionEvent e) {
		btnConfigurarDescuento.setVisible(true);
        btnConfigurarCantidadptima.setVisible(true);
        btnConfigurarObsequios.setVisible(true);
        btnConfigurarCuotaDiaria.setVisible(true);
        
        btnConsultarCeramico.setVisible(false);
        btnModificarCeramico.setVisible(false);
        btnListarCeramicos.setVisible(false);
        btnVender.setVisible(false);
        btnGenerarReportes.setVisible(false);
        btnTienda.setVisible(false);
        btnSalir.setVisible(false);
	}

	protected void actionPerformedbtnVentas(ActionEvent e) {
        btnVender.setVisible(true);
        btnGenerarReportes.setVisible(true);
        
        btnConsultarCeramico.setVisible(false);
        btnModificarCeramico.setVisible(false);
        btnListarCeramicos.setVisible(false);
        btnConfigurarDescuento.setVisible(false);
        btnConfigurarCantidadptima.setVisible(false);
        btnConfigurarObsequios.setVisible(false);
        btnConfigurarCuotaDiaria.setVisible(false);
        btnTienda.setVisible(false);
        btnSalir.setVisible(false);
	}

	protected void actionPerformedbtnAyuda(ActionEvent e) {
		btnTienda.setVisible(true);
        
        btnConsultarCeramico.setVisible(false);
        btnModificarCeramico.setVisible(false);
        btnListarCeramicos.setVisible(false);
        btnVender.setVisible(false);
        btnGenerarReportes.setVisible(false);
        btnConfigurarDescuento.setVisible(false);
        btnConfigurarCantidadptima.setVisible(false);
        btnConfigurarObsequios.setVisible(false);
        btnConfigurarCuotaDiaria.setVisible(false);
        btnSalir.setVisible(false);
	}

	
	private void BotonesEfecto(JButton botones) {
		botones.addMouseListener(new MouseAdapter() {	
        	// Cambia el color al pasar el mouse
            public void mouseEntered(MouseEvent evt) {
            	botones.setBackground(Color.decode("#a191fa")); 
            }
            // Restaura el color original al salir del mouse
            public void mouseExited(MouseEvent evt) {
            	botones.setBackground(new Color(204, 204, 255));
            }
            // Cambia de color al apretar el botón
            public void mousePressed(MouseEvent evt) {
            	botones.setBackground(new Color(204, 204, 255));
            }
            //Cambia el color de fondo del botón al soltar el mouse
            public void mouseReleased(MouseEvent evt) {
            	botones.setBackground(Color.decode("#a191fa")); 
            }
        });
    }
}

