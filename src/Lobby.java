import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JComboBox;

public class Lobby {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lobby window = new Lobby();
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
	public Lobby() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.MAGENTA);
		panel.setBounds(10, 11, 414, 27);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblHost = new JLabel("Host");
		lblHost.setBounds(10, 0, 46, 25);
		panel.add(lblHost);
		
		textField = new JTextField();
		textField.setBounds(66, 2, 248, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnConnect = new JButton("connect");
		btnConnect.setBounds(324, 1, 89, 23);
		panel.add(btnConnect);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		
		tabbedPane.setBackground(Color.CYAN);
		tabbedPane.setBounds(10, 70, 414, 180);
		frame.getContentPane().add(tabbedPane);

		JComponent panel1 = mainPanel(); // main tab
		tabbedPane.addTab("Main",panel1);
		
		JComponent panel2 = makeCreatePanel(); // Create tab
		tabbedPane.addTab("Create",panel2);
		
		JComponent panel3 = makeJoinPanel(); // Join tab
		tabbedPane.addTab("Join",panel3);
		JPanel panel_1 = new JPanel(false);
		
		panel_1.setLayout(null);
		
		JList list = new JList();
		list.setBounds(23, 84, 69, -58);
		panel_1.add(list);
	}
	protected JComponent mainPanel(){
		JPanel panel = new JPanel(false);
		panel.setLayout(null);
		JLabel name = new JLabel("UserId");
		name.setBounds(10, 10, 36, 15);
		panel.add(name);
		
		textField_4 = new JTextField();
		textField_4.setBounds(56, 7, 134, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
		JLabel symbol = new JLabel("");
		symbol.setBounds(249, 10, 150, 131);
		panel.add(symbol);
		Image Images = new ImageIcon(this.getClass().getResource("a2a-red.gif")).getImage();
		symbol.setIcon(new ImageIcon(Images));
		return panel;
	}
	protected JComponent makeCreatePanel(){
		JPanel panel = new JPanel(false);
		panel.setLayout(null);
		JLabel Name = new JLabel("Name");
		Name.setBounds(10, 10, 36, 14);
		//filler.setHorizontalAlignment(JLabel.CENTER);
		panel.add(Name);
		
		textField_1 = new JTextField();
		textField_1.setBounds(76, 7, 200, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Password");
		lblNewLabel.setBounds(10, 35, 46, 14);
		panel.add(lblNewLabel);
		
		textField_2 = new JTextField();
		textField_2.setBounds(76, 32, 200, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblScoreLimit = new JLabel("Score limit");
		lblScoreLimit.setBounds(10, 60, 61, 14);
		panel.add(lblScoreLimit);
		
		textField_3 = new JTextField();
		textField_3.setBounds(76, 57, 96, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblSelectDeck = new JLabel("Select deck");
		lblSelectDeck.setBounds(10, 85, 61, 14);
		panel.add(lblSelectDeck);
		JComboBox c = new JComboBox();
		c.setBounds(76, 82, 200, 20);
		
		c.addItem("item1");
		c.addItem("item2");
		c.addItem("item3");
		
		panel.add(c);
		
		JButton btnSelect = new JButton("Select");
		btnSelect.setBounds(286, 81, 89, 23);
		//btnSelect.addActionListener(new java.awt.event);
		panel.add(btnSelect);
		return panel;
	
	}
	protected JComponent makeJoinPanel(){
		JPanel panel = new JPanel(false);
		panel.setLayout(null);
		
		//JList list = new JList();
		//list.setBounds(10, 35, 161, 106);
		//panel.add(list);
		
		return panel;
	}
}
