package uravnenije;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class uravnenije extends JFrame {

	private JPanel contentPane;
	private JTextField txt_a;
	private JTextField txt_b;
	private JTextField txt_c;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					uravnenije frame = new uravnenije();
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
	public uravnenije() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txt_a = new JTextField();
		txt_a.setBounds(23, 73, 64, 20);
		contentPane.add(txt_a);
		txt_a.setColumns(10);
		
		txt_b = new JTextField();
		txt_b.setColumns(10);
		txt_b.setBounds(124, 73, 54, 20);
		contentPane.add(txt_b);
		
		txt_c = new JTextField();
		txt_c.setColumns(10);
		txt_c.setBounds(205, 73, 86, 20);
		contentPane.add(txt_c);
		
		JLabel lbl_a = new JLabel("x² +");
		lbl_a.setBounds(97, 76, 46, 14);
		contentPane.add(lbl_a);
		
		JLabel lbl_b = new JLabel("x +");
		lbl_b.setBounds(180, 76, 46, 14);
		contentPane.add(lbl_b);
		
		JLabel lbl_zero = new JLabel("=0");
		lbl_zero.setBounds(296, 76, 46, 14);
		contentPane.add(lbl_zero);
		
		JLabel lblTaskName = new JLabel("Квадратное уравнение");
		lblTaskName.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
		lblTaskName.setBounds(124, 11, 183, 14);
		contentPane.add(lblTaskName);
		
		JLabel lblReshenie = new JLabel("Решение");
		lblReshenie.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
		lblReshenie.setBounds(159, 132, 183, 14);
		contentPane.add(lblReshenie);
		
		JLabel lblOtvet = new JLabel("");
		lblOtvet.setBounds(97, 180, 209, 35);
		contentPane.add(lblOtvet);
		
		JButton btnResh = new JButton("Решить");
		btnResh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a,b,c;
				try {
					a = Double.parseDouble(txt_a.getText());
				}
				catch(NumberFormatException nfe) {
					a=0.0;
					txt_a.setText("0.0");
				}
				try {
					b = Double.parseDouble(txt_b.getText());
				}
				catch(NumberFormatException nfe) {
					b=0.0;
					txt_b.setText("0.0");
				}
				try {
					c = Double.parseDouble(txt_c.getText());
				}
				catch(NumberFormatException nfe) {
					c=0.0;
					txt_c.setText("0.0");
				}
				double D = b*b-4*a*c;
				double x1,x2;
				String Otvet ="";
				if(D<0.0) Otvet = "Действительных корней нет";
				else if(D>0. && a!=0.) {
					x1=(-b+Math.sqrt(D))/(2*a);
					x2=(-b-Math.sqrt(D))/(2*a);
					Otvet = "Корни: х1=" + x1 + " x2=" + x2;
				}
				else if(D==0.0 && a!=0.0) {
					x1=-b/(2*a);
					Otvet = "Корень: х1="+x1;
				}
				lblOtvet.setText(Otvet);
					
			}
		});
		btnResh.setBounds(148, 104, 89, 23);
		contentPane.add(btnResh);
	}
}
