import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ListSelectionModel;

import java.awt.BorderLayout;
import java.awt.Image;

import javax.swing.JTabbedPane;
import javax.swing.JButton;
import javax.swing.JList;


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
		
		JButton btnChat = new JButton("Chat");
		btnChat.setBounds(10, 41, 89, 23);
		frame.getContentPane().add(btnChat);
		
		JList list = new JList();
		list.setBounds(55, 241, 378, 84);
		frame.getContentPane().add(list);
		list.setLayoutOrientation(JList.VERTICAL_WRAP);
		list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		list.setVisibleRowCount(-1);
		
		
	}
}
