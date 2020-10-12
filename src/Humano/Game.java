package Humano;
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

import Main.Main;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Game extends JFrame {

	private JPanel contentPane;
	
	//static // = new Game();
	
	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
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
	}*/
	
	private String startGame = "X";
	private int xCount = 0;
	private int oCount = 0;

	JLabel lblX, lblO, lblTTT;
	JButton btnTTT1, btnTTT2, btnTTT3, btnTTT4, btnTTT5, btnTTT6, btnTTT7, btnTTT8, btnTTT9;
	
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
		
		/*JLabel*/ lblTTT = new JLabel("Le toca a X");
		lblTTT.setHorizontalAlignment(SwingConstants.CENTER);
		lblTTT.setFont(new Font("Calibri", Font.BOLD, 18));
		lblTTT.setForeground(Color.ORANGE);
		lblTTT.setBounds(104, 0, 221, 36);
		panel.add(lblTTT);
		
		/*JButton*/ btnTTT1 = new JButton(/*"O"*/);
		btnTTT1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btnTTT1.setText(startGame);
				
				if(startGame.equalsIgnoreCase("X")) {
					btnTTT1.setForeground(Color.RED);
					btnTTT1.setEnabled(false);
				}
				else {
					btnTTT1.setForeground(Color.MAGENTA);
					btnTTT1.setEnabled(false);
				}
				choosePlayer();
				WinningGame();
			}
		});
		btnTTT1.setFont(new Font("Calibri", Font.BOLD, 18));
		btnTTT1.setBounds(10, 56, 50, 50);
		contentPane.add(btnTTT1);
		
		/*JButton*/ btnTTT2 = new JButton(/*"O"*/);
		btnTTT2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btnTTT2.setText(startGame);
				
				if(startGame.equalsIgnoreCase("X")) {
					btnTTT2.setForeground(Color.RED);
					btnTTT2.setEnabled(false);
				}
				else {
					btnTTT2.setForeground(Color.MAGENTA);
					btnTTT2.setEnabled(false);
				}
				choosePlayer();
				WinningGame();
			}
		});
		btnTTT2.setFont(new Font("Calibri", Font.BOLD, 18));
		btnTTT2.setBounds(70, 56, 50, 50);
		contentPane.add(btnTTT2);
		
		/*JButton*/ btnTTT3 = new JButton(/*"O"*/);
		btnTTT3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnTTT3.setText(startGame);
				
				if(startGame.equalsIgnoreCase("X")) {
					btnTTT3.setForeground(Color.RED);
					btnTTT3.setEnabled(false);
				}
				else {
					btnTTT3.setForeground(Color.MAGENTA);
					btnTTT3.setEnabled(false);
				}
				choosePlayer();
				WinningGame();
			}
		});
		btnTTT3.setFont(new Font("Calibri", Font.BOLD, 18));
		btnTTT3.setBounds(130, 56, 50, 50);
		contentPane.add(btnTTT3);
		
		/*JButton*/ btnTTT4 = new JButton(/*"O"*/);
		btnTTT4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btnTTT4.setText(startGame);
				
				if(startGame.equalsIgnoreCase("X")) {
					btnTTT4.setForeground(Color.RED);
					btnTTT4.setEnabled(false);
				}
				else {
					btnTTT4.setForeground(Color.MAGENTA);
					btnTTT4.setEnabled(false);
				}
				choosePlayer();
				WinningGame();
			}
		});
		btnTTT4.setFont(new Font("Calibri", Font.BOLD, 18));
		btnTTT4.setBounds(10, 117, 50, 50);
		contentPane.add(btnTTT4);
		
		/*JButton*/ btnTTT5 = new JButton(/*"O"*/);
		btnTTT5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btnTTT5.setText(startGame);
				
				if(startGame.equalsIgnoreCase("X")) {
					btnTTT5.setForeground(Color.RED);
					btnTTT5.setEnabled(false);
				}
				else {
					btnTTT5.setForeground(Color.MAGENTA);
					btnTTT5.setEnabled(false);
				}
				choosePlayer();
				WinningGame();
			}
		});
		btnTTT5.setFont(new Font("Calibri", Font.BOLD, 18));
		btnTTT5.setBounds(70, 117, 50, 50);
		contentPane.add(btnTTT5);
		
		/*JButton*/ btnTTT6 = new JButton(/*"O"*/);
		btnTTT6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btnTTT6.setText(startGame);
				
				if(startGame.equalsIgnoreCase("X")) {
					btnTTT6.setForeground(Color.RED);
					btnTTT6.setEnabled(false);
				}
				else {
					btnTTT6.setForeground(Color.MAGENTA);
					btnTTT6.setEnabled(false);
				}
				choosePlayer();
				WinningGame();
			}
		});
		btnTTT6.setFont(new Font("Calibri", Font.BOLD, 18));
		btnTTT6.setBounds(130, 117, 50, 50);
		contentPane.add(btnTTT6);
		
		/*JButton*/ btnTTT7 = new JButton(/*"O"*/);
		btnTTT7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btnTTT7.setText(startGame);
				
				if(startGame.equalsIgnoreCase("X")) {
					btnTTT7.setForeground(Color.RED);
					btnTTT7.setEnabled(false);
				}
				else {
					btnTTT7.setForeground(Color.MAGENTA);
					btnTTT7.setEnabled(false);
				}
				choosePlayer();
				WinningGame();
				
			}
		});
		btnTTT7.setFont(new Font("Calibri", Font.BOLD, 18));
		btnTTT7.setBounds(10, 178, 50, 50);
		contentPane.add(btnTTT7);
		
		/*JButton*/ btnTTT8 = new JButton(/*"O"*/);
		btnTTT8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btnTTT8.setText(startGame);
				
				if(startGame.equalsIgnoreCase("X")) {
					btnTTT8.setForeground(Color.RED);
					btnTTT8.setEnabled(false);
				}
				else {
					btnTTT8.setForeground(Color.MAGENTA);
					btnTTT8.setEnabled(false);
				}
				choosePlayer();
				WinningGame();
				
			}
		});
		btnTTT8.setFont(new Font("Calibri", Font.BOLD, 18));
		btnTTT8.setBounds(70, 178, 50, 50);
		contentPane.add(btnTTT8);
		
		/*JButton*/ btnTTT9 = new JButton(/*"O"*/);
		btnTTT9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				btnTTT9.setText(startGame);
				
				if(startGame.equalsIgnoreCase("X")) {
					btnTTT9.setForeground(Color.RED);
					btnTTT9.setEnabled(false);
				}
				else {
					btnTTT9.setForeground(Color.MAGENTA);
					btnTTT9.setEnabled(false);
				}
				choosePlayer();
				WinningGame();
				
			}
		});
		btnTTT9.setFont(new Font("Calibri", Font.BOLD, 18));
		btnTTT9.setBounds(130, 178, 50, 50);
		contentPane.add(btnTTT9);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btnTTT1.setText(null);
				btnTTT2.setText(null);
				btnTTT3.setText(null);
				btnTTT4.setText(null);
				btnTTT5.setText(null);
				btnTTT6.setText(null);
				btnTTT7.setText(null);
				btnTTT8.setText(null);
				btnTTT9.setText(null);
				
				Enabled();
				
				btnTTT1.setBackground(Color.LIGHT_GRAY);
				btnTTT2.setBackground(Color.LIGHT_GRAY);
				btnTTT3.setBackground(Color.LIGHT_GRAY);
				btnTTT4.setBackground(Color.LIGHT_GRAY);
				btnTTT5.setBackground(Color.LIGHT_GRAY);
				btnTTT6.setBackground(Color.LIGHT_GRAY);
				btnTTT7.setBackground(Color.LIGHT_GRAY);
				btnTTT8.setBackground(Color.LIGHT_GRAY);
				btnTTT9.setBackground(Color.LIGHT_GRAY);
				
			}
		});
		btnReset.setFont(new Font("Calibri", Font.BOLD, 18));
		btnReset.setBounds(230, 247, 80, 30);
		contentPane.add(btnReset);
		
		JButton btnStop = new JButton("EXIT");
		btnStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*JFrame frame = new JFrame("Exit");
				if (JOptionPane.showConfirmDialog(frame, "Do you want exit?",
						"Tic Tac Toe", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}*/
				
				Main mn = new Main();
				mn.setVisible(true);
				dispose();
				
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
	
	private void Enabled() {
		
		btnTTT1.setEnabled(true);
		btnTTT2.setEnabled(true);
		btnTTT3.setEnabled(true);
		btnTTT4.setEnabled(true);
		btnTTT5.setEnabled(true);
		btnTTT6.setEnabled(true);
		btnTTT7.setEnabled(true);
		btnTTT8.setEnabled(true);
		btnTTT9.setEnabled(true);
		
	}
	
	private void Disabled() {
		
		btnTTT1.setEnabled(false);
		btnTTT2.setEnabled(false);
		btnTTT3.setEnabled(false);
		btnTTT4.setEnabled(false);
		btnTTT5.setEnabled(false);
		btnTTT6.setEnabled(false);
		btnTTT7.setEnabled(false);
		btnTTT8.setEnabled(false);
		btnTTT9.setEnabled(false);
		
	}
	
	private void choosePlayer() {
		if(startGame.equalsIgnoreCase("X")) {
			startGame = "O";
			lblTTT.setText("Es turno de O");
			
		}
		else {
			startGame = "X";
			lblTTT.setText("Es turno de X");
		}
	}
	
	private void WinningGame() {
		
		String b1 = btnTTT1.getText();
		String b2 = btnTTT2.getText();
		String b3 = btnTTT3.getText();
		
		String b4 = btnTTT4.getText();
		String b5 = btnTTT5.getText();
		String b6 = btnTTT6.getText();
		
		String b7 = btnTTT7.getText();
		String b8 = btnTTT8.getText();
		String b9 = btnTTT9.getText();
		
		if ((b1 == ("X")) && (b2 == ("X")) && (b3 == ("X"))) {
			
			JOptionPane.showMessageDialog(this, "Player X win", "Tic Tac Toe",
					JOptionPane.INFORMATION_MESSAGE);
			
			xCount++;
			gameScore();
			Disabled();
			
			btnTTT1.setBackground(Color.ORANGE);
			btnTTT2.setBackground(Color.ORANGE);
			btnTTT3.setBackground(Color.ORANGE);
			
		}
		
		if ((b4 == "X") && (b5 == "X") && (b6 == "X")) {
			
			JOptionPane.showMessageDialog(this, "Player X win", "Tic Tac Toe",
					JOptionPane.INFORMATION_MESSAGE);
			
			xCount++;
			gameScore();
			Disabled();
			
			btnTTT4.setBackground(Color.ORANGE);
			btnTTT5.setBackground(Color.ORANGE);
			btnTTT6.setBackground(Color.ORANGE);
			
		}
		
		if ((b7 == "X") && (b8 == "X") && (b9 == "X")) {
			
			JOptionPane.showMessageDialog(this, "Player X win", "Tic Tac Toe",
					JOptionPane.INFORMATION_MESSAGE);
			
			xCount++;
			gameScore();
			Disabled();
			
			btnTTT7.setBackground(Color.ORANGE);
			btnTTT8.setBackground(Color.ORANGE);
			btnTTT9.setBackground(Color.ORANGE);
			
		}
		
		if ((b1 == "X") && (b4 == "X") && (b7 == "X")) {
			
			JOptionPane.showMessageDialog(this, "Player X win", "Tic Tac Toe",
					JOptionPane.INFORMATION_MESSAGE);
			
			xCount++;
			gameScore();
			Disabled();
			
			btnTTT1.setBackground(Color.ORANGE);
			btnTTT4.setBackground(Color.ORANGE);
			btnTTT7.setBackground(Color.ORANGE);
			
		}
		
		if ((b2 == "X") && (b5 == "X") && (b8 == "X")) {
			
			JOptionPane.showMessageDialog(this, "Player X win", "Tic Tac Toe",
					JOptionPane.INFORMATION_MESSAGE);
			
			xCount++;
			gameScore();
			Disabled();
			
			btnTTT2.setBackground(Color.ORANGE);
			btnTTT5.setBackground(Color.ORANGE);
			btnTTT8.setBackground(Color.ORANGE);
			
		}
		
		if ((b3 == "X") && (b6 == "X") && (b9 == "X")) {
			
			JOptionPane.showMessageDialog(this, "Player X win", "Tic Tac Toe",
					JOptionPane.INFORMATION_MESSAGE);
			
			xCount++;
			gameScore();
			Disabled();
			
			btnTTT3.setBackground(Color.ORANGE);
			btnTTT6.setBackground(Color.ORANGE);
			btnTTT9.setBackground(Color.ORANGE);
			
		}
		
		if ((b1 == "X") && (b5 == "X") && (b9 == "X")) {
			
			JOptionPane.showMessageDialog(this, "Player X win", "Tic Tac Toe",
					JOptionPane.INFORMATION_MESSAGE);
			
			xCount++;
			gameScore();
			Disabled();
			
			btnTTT1.setBackground(Color.ORANGE);
			btnTTT5.setBackground(Color.ORANGE);
			btnTTT9.setBackground(Color.ORANGE);
			
		}
		
		if ((b3 == "X") && (b5 == "X") && (b7 == "X")) {
			
			JOptionPane.showMessageDialog(this, "Player X win", "Tic Tac Toe",
					JOptionPane.INFORMATION_MESSAGE);
			
			xCount++;
			gameScore();
			Disabled();
			
			btnTTT3.setBackground(Color.ORANGE);
			btnTTT5.setBackground(Color.ORANGE);
			btnTTT7.setBackground(Color.ORANGE);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		if ((b1 == ("O")) && (b2 == ("O")) && (b3 == ("O"))) {
			
			JOptionPane.showMessageDialog(this, "Player O win", "Tic Tac Toe",
					JOptionPane.INFORMATION_MESSAGE);
			
			oCount++;
			gameScore();
			Disabled();
			
			btnTTT1.setBackground(Color.ORANGE);
			btnTTT2.setBackground(Color.ORANGE);
			btnTTT3.setBackground(Color.ORANGE);
			
		}
		
		if ((b4 == "O") && (b5 == "O") && (b6 == "O")) {
			
			JOptionPane.showMessageDialog(this, "Player O win", "Tic Tac Toe",
					JOptionPane.INFORMATION_MESSAGE);
			
			oCount++;
			gameScore();
			Disabled();
			
			btnTTT4.setBackground(Color.ORANGE);
			btnTTT5.setBackground(Color.ORANGE);
			btnTTT6.setBackground(Color.ORANGE);
			
		}
		
		if ((b7 == "O") && (b8 == "O") && (b9 == "O")) {
			
			JOptionPane.showMessageDialog(this, "Player O win", "Tic Tac Toe",
					JOptionPane.INFORMATION_MESSAGE);
			
			oCount++;
			gameScore();
			Disabled();
			
			btnTTT7.setBackground(Color.ORANGE);
			btnTTT8.setBackground(Color.ORANGE);
			btnTTT9.setBackground(Color.ORANGE);
			
		}
		
		if ((b1 == "O") && (b4 == "O") && (b7 == "O")) {
			
			JOptionPane.showMessageDialog(this, "Player O win", "Tic Tac Toe",
					JOptionPane.INFORMATION_MESSAGE);
			
			oCount++;
			gameScore();
			Disabled();
			
			btnTTT1.setBackground(Color.ORANGE);
			btnTTT4.setBackground(Color.ORANGE);
			btnTTT7.setBackground(Color.ORANGE);
			
		}
		
		if ((b2 == "O") && (b5 == "O") && (b8 == "O")) {
			
			JOptionPane.showMessageDialog(this, "Player O win", "Tic Tac Toe",
					JOptionPane.INFORMATION_MESSAGE);
			
			oCount++;
			gameScore();
			Disabled();
			
			btnTTT2.setBackground(Color.ORANGE);
			btnTTT5.setBackground(Color.ORANGE);
			btnTTT8.setBackground(Color.ORANGE);
			
		}
		
		if ((b3 == "O") && (b6 == "O") && (b9 == "O")) {
			
			JOptionPane.showMessageDialog(this, "Player O win", "Tic Tac Toe",
					JOptionPane.INFORMATION_MESSAGE);
			
			oCount++;
			gameScore();
			Disabled();
			
			btnTTT3.setBackground(Color.ORANGE);
			btnTTT6.setBackground(Color.ORANGE);
			btnTTT9.setBackground(Color.ORANGE);
			
		}
		
		if ((b1 == "O") && (b5 == "O") && (b9 == "O")) {
			
			JOptionPane.showMessageDialog(this, "Player O win", "Tic Tac Toe",
					JOptionPane.INFORMATION_MESSAGE);
			
			oCount++;
			gameScore();
			Disabled();
			
			btnTTT1.setBackground(Color.ORANGE);
			btnTTT5.setBackground(Color.ORANGE);
			btnTTT9.setBackground(Color.ORANGE);
			
		}
		
		if ((b3 == "O") && (b5 == "O") && (b7 == "O")) {
			
			JOptionPane.showMessageDialog(this, "Player O win", "Tic Tac Toe",
					JOptionPane.INFORMATION_MESSAGE);
			
			oCount++;
			gameScore();
			Disabled();
			
			btnTTT3.setBackground(Color.ORANGE);
			btnTTT5.setBackground(Color.ORANGE);
			btnTTT7.setBackground(Color.ORANGE);
			
		}
		
		/*if ( ( ((b1 != "")) && ((b2 != "")) && ((b3 != "")) 
			&& ((b4 != "")) && ((b5 != "")) && ((b6 != ""))
			&& ((b7 != "")) && ((b8 != "")) && ((b9 != "")) ) 
				) {
			JOptionPane.showMessageDialog(this, "Empate", "Tic Tac Toe",
					JOptionPane.INFORMATION_MESSAGE);
			Disabled();
		}*/
		
		/*if (((!(b1 == null) && !(b2 == null) && !(b3 == null) && !(b4 == "") && !(b5 == "") && !(b6 == "") && !(b7 == "") && !(b8 == "") && !(b9 == ""))) 
				&& (!(btnTTT1.isEnabled()) && (btnTTT2.isEnabled()) && (btnTTT3.isEnabled()) 
				&& (btnTTT4.isEnabled()) && (btnTTT5.isEnabled()) && (btnTTT6.isEnabled()) 
				&& (btnTTT7.isEnabled()) && (btnTTT8.isEnabled()) && (btnTTT9.isEnabled()))) {
			
			JOptionPane.showMessageDialog(this, "Nobody win", "Tic Tac Toe",
					JOptionPane.INFORMATION_MESSAGE);
			
			oCount++;
			gameScore();
			Disabled();
			
			btnTTT3.setBackground(Color.ORANGE);
			btnTTT5.setBackground(Color.ORANGE);
			btnTTT7.setBackground(Color.ORANGE);
			
		}*/
		
		/*if ( ((!btnTTT1.getText().equals("")) && (!btnTTT2.getText().equals("")) && (!btnTTT3.getText().equals("")) 
			&& (!btnTTT4.getText().equals("")) && (!btnTTT5.getText().equals("")) && (!btnTTT6.getText().equals("")) 
			&& (!btnTTT7.getText().equals("")) && (!btnTTT8.getText().equals("")) && (!btnTTT9.getText().equals("")) )) {
			JOptionPane.showMessageDialog(this, "Empate", "Tic Tac Toe",
					JOptionPane.INFORMATION_MESSAGE);
		}*/
		
		
				
	}
		
}
