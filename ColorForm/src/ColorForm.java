import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class ColorForm extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ColorForm frame = new ColorForm();
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
	public ColorForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNameColor = new JLabel("");
		lblNameColor.setBounds(137, 174, 137, 14);
		contentPane.add(lblNameColor);
		
		JButton btnChangeColor = new JButton("Смена цвета");
		btnChangeColor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (contentPane.getBackground() == Color.RED) {
					contentPane.setBackground(Color.GREEN);
					lblNameColor.setText("Зеленый");
				}
				else {
					contentPane.setBackground(Color.RED);
					lblNameColor.setText("Красный");
				}
			}
		});
		btnChangeColor.setBounds(137, 85, 137, 23);
		contentPane.add(btnChangeColor);
		

	}
}
