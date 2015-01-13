import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.Image;
import javax.swing.JTabbedPane;
import javax.swing.JButton;


public class User {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					User window = new User();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public User() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 375);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblGame = new JLabel("Title");
		lblGame.setBounds(191, 0, 36, 14);
		frame.getContentPane().add(lblGame);
		
		JLabel label = new JLabel("");
		label.setBounds(219, 41, 46, 46);
		frame.getContentPane().add(label);
		Image Images = new ImageIcon(this.getClass().getResource("u45.png")).getImage();
		label.setIcon(new ImageIcon(Images));
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(275, 41, 46, 46);
		frame.getContentPane().add(label_1);
		label_1.setIcon(new ImageIcon(Images));
		
		JLabel label_2 = new JLabel("");
		label_2.setBounds(387, 85, 46, 46);
		frame.getContentPane().add(label_2);
		label_2.setIcon(new ImageIcon(Images));
		
		JLabel label_3 = new JLabel("");
		label_3.setBounds(331, 41, 46, 46);
		frame.getContentPane().add(label_3);
		label_3.setIcon(new ImageIcon(Images));
		
		JLabel label_4 = new JLabel("");
		label_4.setBounds(331, 142, 46, 46);
		frame.getContentPane().add(label_4);
		label_4.setIcon(new ImageIcon(Images));
		
		JLabel label_5 = new JLabel("");
		label_5.setBounds(275, 142, 46, 46);
		frame.getContentPane().add(label_5);
		label_5.setIcon(new ImageIcon(Images));
		
		JLabel label_6 = new JLabel("");
		label_6.setBounds(219, 142, 46, 46);
		frame.getContentPane().add(label_6);
		label_6.setIcon(new ImageIcon(Images));
		
		JLabel label_7 = new JLabel("");
		label_7.setBounds(163, 85, 46, 46);
		frame.getContentPane().add(label_7);
		label_7.setIcon(new ImageIcon(Images));
		
		JLabel lblCard = new JLabel("Card 1");
		lblCard.setBounds(74, 225, 46, 100);
		frame.getContentPane().add(lblCard);
		
		JLabel lblCard_1 = new JLabel("Card 2");
		lblCard_1.setBounds(130, 225, 46, 100);
		frame.getContentPane().add(lblCard_1);
		
		JLabel lblCard_2 = new JLabel("Card 3");
		lblCard_2.setBounds(191, 225, 46, 100);
		frame.getContentPane().add(lblCard_2);
		
		JLabel lblCard_3 = new JLabel("Card 4");
		lblCard_3.setBounds(247, 225, 46, 100);
		frame.getContentPane().add(lblCard_3);
		
		JLabel lblCard_4 = new JLabel("Card 5");
		lblCard_4.setBounds(303, 225, 46, 100);
		frame.getContentPane().add(lblCard_4);
		
		JLabel lblCard_5 = new JLabel("Card 6");
		lblCard_5.setBounds(359, 225, 46, 100);
		frame.getContentPane().add(lblCard_5);
		
		JLabel lblCard_6 = new JLabel("Card 7");
		lblCard_6.setBounds(415, 225, 46, 100);
		frame.getContentPane().add(lblCard_6);
		
		JButton btnChat = new JButton("Chat");
		btnChat.setBounds(10, 41, 89, 23);
		frame.getContentPane().add(btnChat);
		
		
	}
}
