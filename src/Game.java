import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.border.EtchedBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Game extends JFrame {

	private JPanel contentPane;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Game frame = new Game();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private String startGame = "X";
	private int xCount = 0;
	private int oCount = 0;

	JLabel lblX, lblO;
	//JButton btnTTT1;
	
	/**
	 * Create the frame.
	 */
	public Game() {
		
		setResizable(false);
		setTitle("Tic Tac Toe");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 438, 331);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(0, 0, 434, 45);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblAc = new JLabel("AC");
		lblAc.setHorizontalAlignment(SwingConstants.CENTER);
		lblAc.setFont(new Font("Calibri", Font.BOLD, 18));
		lblAc.setForeground(Color.ORANGE);
		lblAc.setBounds(104, 0, 221, 36);
		panel.add(lblAc);
		
		JButton btnTTT1 = new JButton("O");
		btnTTT1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btnTTT1.setText(startGame);
				
				if(startGame.equalsIgnoreCase("X")) {
					btnTTT1.setForeground(Color.RED);
				}
				else {
					btnTTT1.setForeground(Color.MAGENTA);
				}
				choosePlayer();
			}
		});
		btnTTT1.setFont(new Font("Calibri", Font.BOLD, 18));
		btnTTT1.setBounds(10, 56, 50, 50);
		contentPane.add(btnTTT1);
		
		JButton btnTTT2 = new JButton("O");
		btnTTT2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btnTTT2.setText(startGame);
				
				if(startGame.equalsIgnoreCase("X")) {
					btnTTT2.setForeground(Color.RED);
				}
				else {
					btnTTT2.setForeground(Color.MAGENTA);
				}
				choosePlayer();
			}
		});
		btnTTT2.setFont(new Font("Calibri", Font.BOLD, 18));
		btnTTT2.setBounds(70, 56, 50, 50);
		contentPane.add(btnTTT2);
		
		JButton btnTTT3 = new JButton("O");
		btnTTT3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnTTT3.setText(startGame);
				
				if(startGame.equalsIgnoreCase("X")) {
					btnTTT3.setForeground(Color.RED);
				}
				else {
					btnTTT3.setForeground(Color.MAGENTA);
				}
				choosePlayer();
			}
		});
		btnTTT3.setFont(new Font("Calibri", Font.BOLD, 18));
		btnTTT3.setBounds(130, 56, 50, 50);
		contentPane.add(btnTTT3);
		
		JButton btnTTT4 = new JButton("O");
		btnTTT4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btnTTT4.setText(startGame);
				
				if(startGame.equalsIgnoreCase("X")) {
					btnTTT4.setForeground(Color.RED);
				}
				else {
					btnTTT4.setForeground(Color.MAGENTA);
				}
				choosePlayer();
			}
		});
		btnTTT4.setFont(new Font("Calibri", Font.BOLD, 18));
		btnTTT4.setBounds(10, 117, 50, 50);
		contentPane.add(btnTTT4);
		
		JButton btnTTT5 = new JButton("O");
		btnTTT5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btnTTT5.setText(startGame);
				
				if(startGame.equalsIgnoreCase("X")) {
					btnTTT5.setForeground(Color.RED);
				}
				else {
					btnTTT5.setForeground(Color.MAGENTA);
				}
				choosePlayer();
			}
		});
		btnTTT5.setFont(new Font("Calibri", Font.BOLD, 18));
		btnTTT5.setBounds(70, 117, 50, 50);
		contentPane.add(btnTTT5);
		
		JButton btnTTT6 = new JButton("O");
		btnTTT6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btnTTT6.setText(startGame);
				
				if(startGame.equalsIgnoreCase("X")) {
					btnTTT6.setForeground(Color.RED);
				}
				else {
					btnTTT6.setForeground(Color.MAGENTA);
				}
				choosePlayer();
			}
		});
		btnTTT6.setFont(new Font("Calibri", Font.BOLD, 18));
		btnTTT6.setBounds(130, 117, 50, 50);
		contentPane.add(btnTTT6);
		
		JButton btnTTT7 = new JButton("O");
		btnTTT7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btnTTT7.setText(startGame);
				
				if(startGame.equalsIgnoreCase("X")) {
					btnTTT7.setForeground(Color.RED);
				}
				else {
					btnTTT7.setForeground(Color.MAGENTA);
				}
				choosePlayer();
				
			}
		});
		btnTTT7.setFont(new Font("Calibri", Font.BOLD, 18));
		btnTTT7.setBounds(10, 178, 50, 50);
		contentPane.add(btnTTT7);
		
		JButton btnTTT8 = new JButton("O");
		btnTTT8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btnTTT8.setText(startGame);
				
				if(startGame.equalsIgnoreCase("X")) {
					btnTTT8.setForeground(Color.RED);
				}
				else {
					btnTTT8.setForeground(Color.MAGENTA);
				}
				choosePlayer();
				
			}
		});
		btnTTT8.setFont(new Font("Calibri", Font.BOLD, 18));
		btnTTT8.setBounds(70, 178, 50, 50);
		contentPane.add(btnTTT8);
		
		JButton btnTTT9 = new JButton("O");
		btnTTT9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				btnTTT9.setText(startGame);
				
				if(startGame.equalsIgnoreCase("X")) {
					btnTTT9.setForeground(Color.RED);
				}
				else {
					btnTTT9.setForeground(Color.MAGENTA);
				}
				choosePlayer();
				
			}
		});
		btnTTT9.setFont(new Font("Calibri", Font.BOLD, 18));
		btnTTT9.setBounds(130, 178, 50, 50);
		contentPane.add(btnTTT9);
		
		JButton btnReset = new JButton("RESET");
		btnReset.setFont(new Font("Calibri", Font.BOLD, 18));
		btnReset.setBounds(230, 247, 80, 30);
		contentPane.add(btnReset);
		
		JButton btnStop = new JButton("EXIT");
		btnStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new JFrame("Exit");
				if (JOptionPane.showConfirmDialog(frame, "Do you want exit?",
						"Tic Tac Toe", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnStop.setFont(new Font("Calibri", Font.BOLD, 18));
		btnStop.setBounds(332, 247, 80, 30);
		contentPane.add(btnStop);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EtchedBorder(EtchedBorder.RAISED, Color.LIGHT_GRAY, Color.DARK_GRAY));
		panel_1.setBounds(212, 56, 200, 172);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblPlayerX = new JLabel("Player X: ");
		lblPlayerX.setFont(new Font("Calibri", Font.BOLD, 18));
		lblPlayerX.setBounds(10, 11, 79, 14);
		panel_1.add(lblPlayerX);
		
		JLabel lblPlayerO = new JLabel("Player O: ");
		lblPlayerO.setFont(new Font("Calibri", Font.BOLD, 18));
		lblPlayerO.setBounds(10, 57, 79, 14);
		panel_1.add(lblPlayerO);
		
		/*JLabel*/ lblX = new JLabel(/*"XXXXXX"*/);
		lblX.setFont(new Font("Calibri", Font.BOLD, 18));
		lblX.setBounds(123, 11, 67, 14);
		panel_1.add(lblX);
		
		/*JLabel*/ lblO = new JLabel(/*"OOOOO"*/);
		lblO.setFont(new Font("Calibri", Font.BOLD, 18));
		lblO.setBounds(123, 57, 67, 14);
		panel_1.add(lblO);
		gameScore();
	}
	
	//private JLable = lblX;
	
	private void gameScore() {
		lblX.setText(String.valueOf(xCount));
		lblO.setText(String.valueOf(oCount));
	}
	
	private void choosePlayer() {
		if(startGame.equalsIgnoreCase("X")) {
			startGame = "O";
		}
		else {
			startGame = "X";
		}
	}
		
}
