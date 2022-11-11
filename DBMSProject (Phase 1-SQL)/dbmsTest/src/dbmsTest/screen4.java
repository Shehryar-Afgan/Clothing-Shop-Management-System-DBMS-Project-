package dbmsTest;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class screen4 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					screen4 frame = new screen4();
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
	public screen4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 712, 326);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Email:");
		lblNewLabel.setFont(new Font("UD Digi Kyokasho NP-B", Font.PLAIN, 11));
		lblNewLabel.setBounds(40, 82, 99, 34);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password:");
		lblNewLabel_1.setFont(new Font("UD Digi Kyokasho NP-B", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(42, 141, 125, 34);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("LoginID:");
		lblNewLabel_2.setFont(new Font("UD Digi Kyokasho NP-B", Font.BOLD, 11));
		lblNewLabel_2.setBounds(42, 194, 142, 28);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Sign-up");
		lblNewLabel_3.setForeground(Color.RED);
		lblNewLabel_3.setFont(new Font("UD Digi Kyokasho NP-B", Font.BOLD, 18));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(102, 11, 503, 39);
		contentPane.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(272, 82, 159, 34);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
		textField_1 = new JTextField();
		textField_1.setBounds(272, 141, 160, 34);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(272, 191, 159, 34);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("Create");
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String email= textField.getText();
				String pass= textField_1.getText();
				int a = Integer.parseInt(textField_2.getText());
				Test1 t= new Test1();
				boolean state= t.insertLOGIN(email,pass,a);
				if(state==true) {
					JOptionPane.showMessageDialog(contentPane,"Account Created!");
				}else {
					JOptionPane.showMessageDialog(contentPane,"Invalid Entry!");
				}
			}
		});
		btnNewButton.setBounds(568, 242, 118, 34);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				LoginAndSignup scr = new LoginAndSignup();
				scr.setVisible(true);
				
				
			}
		});
		btnNewButton_1.setBounds(27, 248, 112, 28);
		contentPane.add(btnNewButton_1);
	}
}
