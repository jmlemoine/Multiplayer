package Main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

import Computador.demo;
import Humano.Game;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.GridLayout;

public class Main extends JFrame {

	private JPanel contentPane;
	private final JButton btnNewButton = new JButton("Humano Vs. Humano");
	static Main frame;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new Main();
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
	
	
	
	public Main() {
		
		

		setTitle("Tic Tac Toe");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		btnNewButton.setFont(new Font("Calibri", Font.BOLD, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				Game gm = new Game();
				gm.setVisible(true);
				dispose();				
				
			}
		});
		btnNewButton.setBounds(36, 63, 228, 31);
		contentPane.add(btnNewButton);
		
		JButton btnHumanoVsComputador = new JButton("Humano Vs. Computador");
		btnHumanoVsComputador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
				demo dm = new demo();
				dm.setVisible(true);
				dispose();
				
				
			}
		});
		btnHumanoVsComputador.setFont(new Font("Calibri", Font.BOLD, 18));
		btnHumanoVsComputador.setBounds(36, 128, 228, 31);
		contentPane.add(btnHumanoVsComputador);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				if (JOptionPane.showConfirmDialog(frame, "Do you want exit?",
						"Tic Tac Toe", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			
			}
		});
		btnSalir.setFont(new Font("Calibri", Font.BOLD, 18));
		btnSalir.setBounds(320, 195, 89, 40);
		contentPane.add(btnSalir);
	}
	
}
