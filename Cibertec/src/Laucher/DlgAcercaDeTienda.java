package Laucher;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import com.formdev.flatlaf.themes.FlatMacLightLaf;

import java.awt.Toolkit;

public class DlgAcercaDeTienda extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel FondoPrincipal = new JPanel();

	
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
					DlgAcercaDeTienda dialog = new DlgAcercaDeTienda();
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
	public static ImageIcon resizeIcon(ImageIcon icon, int width, int height) {
		Image image = icon.getImage();
		Image newImage = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
		return new ImageIcon(newImage);}
	/**
	 * Create the dialog.
	 */
	public DlgAcercaDeTienda() {
		setTitle("Tienda");
		setIconImage(Toolkit.getDefaultToolkit().getImage(DlgAcercaDeTienda.class.getResource("/imagenes/tienda.png")));
		setBounds(100, 100, 615, 586);
		getContentPane().setLayout(new BorderLayout());
		FondoPrincipal.setBackground(new Color(129, 143, 180));
		FondoPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setResizable(false);
		getContentPane().add(FondoPrincipal, BorderLayout.CENTER);
		FondoPrincipal.setLayout(null);
		
		JLabel lblFoto = new JLabel("");
		lblFoto.setIcon(
				resizeIcon(new ImageIcon(DlgAcercaDeTienda.class.getResource("/imagenes/Diego.png")),120,100));
		lblFoto.setBounds(29, 375, 129, 102);
		FondoPrincipal.add(lblFoto);
		
		JLabel lblFoto_1 = new JLabel("");
		lblFoto_1.setIcon(
				resizeIcon(new ImageIcon(DlgAcercaDeTienda.class.getResource("/imagenes/Gabriel.png")),120,100));
		lblFoto_1.setBounds(29, 64, 129, 114);
		FondoPrincipal.add(lblFoto_1);
		
		JLabel lblFoto_2 = new JLabel("");
		lblFoto_2.setIcon(
				resizeIcon(new ImageIcon(DlgAcercaDeTienda.class.getResource("/imagenes/Valentìn.png")),120,100));
		lblFoto_2.setBounds(29, 215, 129, 114);
		FondoPrincipal.add(lblFoto_2);
		
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			dispose();
			}
		});
		btnCerrar.setForeground(Color.WHITE);
		btnCerrar.setFont(new Font("Verdana", Font.BOLD, 11));
		btnCerrar.setBackground(new Color(67, 85, 133));
		btnCerrar.setBounds(247, 499, 120, 37);
		FondoPrincipal.add(btnCerrar);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(67, 85, 133));
		panel.setBounds(0, 0, 606, 41);
		FondoPrincipal.add(panel);
		panel.setLayout(null);
		
		JLabel lblTitle = new JLabel("Informacion de los creadores");
		lblTitle.setBounds(0, 11, 596, 21);
		panel.add(lblTitle);
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setForeground(Color.WHITE);
		lblTitle.setFont(new Font("Verdana", Font.BOLD, 16));
		
		JPanel Fondo_1 = new JPanel();
		Fondo_1.setBorder(new EmptyBorder(11, 11, 12, 14));
		Fondo_1.setBackground(new Color(54, 48, 98));
		Fondo_1.setBounds(113, 81, 451, 79);
		FondoPrincipal.add(Fondo_1);
		Fondo_1.setLayout(null);
		
		JLabel lblNombre_1 = new JLabel("\r\nGabriel Antonio Lopez Moreno");
		lblNombre_1.setForeground(Color.WHITE);
		lblNombre_1.setFont(new Font("Verdana", Font.BOLD, 13));
		lblNombre_1.setBounds(58, 11, 239, 25);
		Fondo_1.add(lblNombre_1);
		
		JLabel lblNumero_1 = new JLabel("+51 987 546 578");
		lblNumero_1.setForeground(Color.WHITE);
		lblNumero_1.setFont(new Font("Verdana", Font.BOLD, 13));
		lblNumero_1.setBounds(299, 11, 142, 25);
		Fondo_1.add(lblNumero_1);
		
		JLabel lblCorreo_1 = new JLabel("I202332157@Cibertec.edu.pe");
		lblCorreo_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblCorreo_1.setForeground(Color.WHITE);
		lblCorreo_1.setFont(new Font("Verdana", Font.BOLD, 13));
		lblCorreo_1.setBounds(58, 39, 366, 25);
		Fondo_1.add(lblCorreo_1);
		
		JPanel Fondo_2 = new JPanel();
		Fondo_2.setBorder(new EmptyBorder(11, 11, 12, 14));
		Fondo_2.setBackground(new Color(54, 48, 98));
		Fondo_2.setBounds(113, 231, 451, 79);
		FondoPrincipal.add(Fondo_2);
		Fondo_2.setLayout(null);
		
		JLabel lblFoto_3 = new JLabel("Valentin Cruz Zegarra");
		lblFoto_3.setForeground(Color.WHITE);
		lblFoto_3.setFont(new Font("Verdana", Font.BOLD, 13));
		lblFoto_3.setBounds(58, 11, 239, 25);
		Fondo_2.add(lblFoto_3);
		
		JLabel lblCorreo_2 = new JLabel("I202334568@Cibertec.edu.pe");
		lblCorreo_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblCorreo_2.setForeground(Color.WHITE);
		lblCorreo_2.setFont(new Font("Verdana", Font.BOLD, 13));
		lblCorreo_2.setBounds(58, 39, 366, 25);
		Fondo_2.add(lblCorreo_2);
		
		JLabel lblNumero_2 = new JLabel("+51 987 546 578");
		lblNumero_2.setForeground(Color.WHITE);
		lblNumero_2.setFont(new Font("Verdana", Font.BOLD, 13));
		lblNumero_2.setBounds(299, 11, 142, 25);
		Fondo_2.add(lblNumero_2);
		
		JPanel Fondo_3 = new JPanel();
		Fondo_3.setBorder(new EmptyBorder(11, 11, 12, 14));
		Fondo_3.setBackground(new Color(54, 48, 98));
		Fondo_3.setBounds(113, 386, 451, 79);
		FondoPrincipal.add(Fondo_3);
		Fondo_3.setLayout(null);
		
		JLabel lblNombre_3 = new JLabel("Diego Jesús Lazo Perea");
		lblNombre_3.setForeground(Color.WHITE);
		lblNombre_3.setFont(new Font("Verdana", Font.BOLD, 13));
		lblNombre_3.setBounds(58, 11, 239, 25);
		Fondo_3.add(lblNombre_3);
		
		JLabel lblCorreo_3 = new JLabel("I201723307@Cibertec.edu.pe");
		lblCorreo_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblCorreo_3.setForeground(Color.WHITE);
		lblCorreo_3.setFont(new Font("Verdana", Font.BOLD, 13));
		lblCorreo_3.setBounds(58, 39, 366, 25);
		Fondo_3.add(lblCorreo_3);
		
		JLabel lblNumero_3 = new JLabel("+51 987 546 578");
		lblNumero_3.setForeground(Color.WHITE);
		lblNumero_3.setFont(new Font("Verdana", Font.BOLD, 13));
		lblNumero_3.setBounds(299, 11, 142, 25);
		Fondo_3.add(lblNumero_3);
	}
}
