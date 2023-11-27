package Laucher;

import java.awt.Color;
import java.awt.EventQueue;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import java.awt.Toolkit;

public class DlgListarCeramico extends JDialog implements ActionListener{

	private static final long serialVersionUID = 1L;

	private JScrollPane scrollPane;
	private JTextArea txtS;
	private JButton btnCerrar;
	private JButton btnListar;

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
					DlgListarCeramico dialog = new DlgListarCeramico();
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
	public DlgListarCeramico() {
		setTitle("Listar Cerámicos");
		setIconImage(Toolkit.getDefaultToolkit().getImage(DlgListarCeramico.class.getResource("/imagenes/Listar.png")));
		getContentPane().setBackground(Color.decode("#F8EDE3"));
		getContentPane().setLayout(null);
		setResizable(false);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 509, 387);
		getContentPane().add(scrollPane);
		
		txtS = new JTextArea();
		txtS.setFont(new Font("Verdana", Font.BOLD, 13));
		txtS.setTabSize(12);
		txtS.setForeground(Color.BLACK);
		txtS.setBackground(new Color(223, 211, 195));;
		scrollPane.setViewportView(txtS);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.setBackground(new Color(133, 88, 111));
		btnCerrar.setForeground(Color.WHITE);
		btnCerrar.setFont(new Font("Verdana", Font.BOLD, 11));
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(154, 409, 104, 32);
		getContentPane().add(btnCerrar);
		
		btnListar = new JButton("Listar");
		btnListar.setBackground(new Color(133, 88, 111));
		btnListar.setForeground(Color.WHITE);
		btnListar.setFont(new Font("Verdana", Font.BOLD, 11));
		btnListar.addActionListener(this);
		btnListar.setBounds(286, 409, 104, 32);
		getContentPane().add(btnListar);
		setBounds(100, 100, 545, 491);
		
	
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
		if (e.getSource() == btnListar) {
			actionPerformedBtnListar(e);
		}
	}
	protected void actionPerformedBtnListar(ActionEvent e) {
		// Limpia el área de texto antes de listar
		txtS.setText("LISTADO DE CERÁMICOS  \n\n");
		// Lista la información de cada modelo de cerámico
		txtS.append("Modelo : " + Menu.modelo0 + "\n");
		txtS.append("Precio : " + Menu.precio0 + "\n");
		txtS.append("Ancho (cm) : " + Menu.ancho0 + "\n");
		txtS.append("Largo (cm) : " + Menu.largo0 + "\n");
		txtS.append("Espesor (mm) : " + Menu.espesor0 + "\n");
		txtS.append("Contenido : " + Menu.contenido0 + "\n");
		txtS.append("---------------------------------------" + "\n");
		txtS.append("Modelo : " + Menu.modelo1 + "\n");
		txtS.append("Precio : " + Menu.precio1 + "\n");
		txtS.append("Ancho (cm) : " + Menu.ancho1 + "\n");
		txtS.append("Largo (cm) : " + Menu.largo1 + "\n");
		txtS.append("Espesor (mm) : " + Menu.espesor1 + "\n");
		txtS.append("Contenido : " + Menu.contenido1 + "\n");
		txtS.append("---------------------------------------" + "\n");
		txtS.append("Modelo : " + Menu.modelo2 + "\n");
		txtS.append("Precio : " + Menu.precio2 + "\n");
		txtS.append("Ancho (cm) : " + Menu.ancho2 + "\n");
		txtS.append("Largo (cm) : " + Menu.largo2 + "\n");
		txtS.append("Espesor (mm) : " + Menu.espesor2 + "\n");
		txtS.append("Contenido : " + Menu.contenido2 + "\n");
		txtS.append("---------------------------------------" + "\n");
		txtS.append("Modelo : " + Menu.modelo3 + "\n");
		txtS.append("Precio : " + Menu.precio3 + "\n");
		txtS.append("Ancho (cm) : " + Menu.ancho3 + "\n");
		txtS.append("Largo (cm) : " + Menu.largo3 + "\n");
		txtS.append("Espesor (mm) : " + Menu.espesor3 + "\n");
		txtS.append("Contenido : " + Menu.contenido3 + "\n");
		txtS.append("---------------------------------------" + "\n");
		txtS.append("Modelo : " + Menu.modelo4 + "\n");
		txtS.append("Precio : " + Menu.precio4 + "\n");
		txtS.append("Ancho (cm) : " + Menu.ancho4 + "\n");
		txtS.append("Largo (cm) : " + Menu.largo4 + "\n");
		txtS.append("Espesor (mm) : " + Menu.espesor4 + "\n");
		txtS.append("Contenido : " + Menu.contenido4 + "\n");
	}
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();// Cerrar la ventana
	}
}
