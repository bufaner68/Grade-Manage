package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import impl.GradeDaoImpl;
import impl.StudentDaoImpl;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DelStudent extends JFrame {

	private JPanel contentPane;
	private JTextField tf_del;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DelGrade frame = new DelGrade();
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
	public DelStudent() {
		setTitle("\u7BA1\u7406\u5458\u5220\u9664\u5B66\u751F\u4FE1\u606F\u754C\u9762");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350, 250);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(5, 1, 0, 15));
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 3, 0, 0));
		
		JLabel label = new JLabel("\u5220\u9664\u7C7B\u578B\u9009\u62E9\uFF1A");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_2.add(label);
		
		JComboBox cb_type = new JComboBox();
		cb_type.setModel(new DefaultComboBoxModel(new String[] {"\u6309\u5B66\u53F7\u5220\u9664", "\u6309\u59D3\u540D\u5220\u9664"}));
		cb_type.setToolTipText("");
		panel_2.add(cb_type);
		
		JPanel panel_3 = new JPanel();
		contentPane.add(panel_3);
		panel_3.setLayout(new GridLayout(0, 3, 0, 0));
		
		JLabel lblNewLabel = new JLabel("\u8F93\u5165\u5220\u9664\u5185\u5BB9\uFF1A");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_3.add(lblNewLabel);
		
		tf_del = new JTextField();
		panel_3.add(tf_del);
		tf_del.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		contentPane.add(panel_4);
		
		JButton button = new JButton("\u786E\u8BA4\u5220\u9664");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int index = cb_type.getSelectedIndex();
				if(index ==0){
					int sno=Integer.parseInt(tf_del.getText().trim());
					StudentDaoImpl student = new StudentDaoImpl();
					boolean b = student.delStudent(sno);
					if(b==true){
						JOptionPane.showMessageDialog(DelStudent.this, "É¾³ý³É¹¦");
					}else {
						JOptionPane.showMessageDialog(DelStudent.this, "É¾³ýÊ§°Ü");
					}
				}
				if(index==1){
					String student_name = tf_del.getText().trim();
					StudentDaoImpl student = new StudentDaoImpl();
					boolean b = student.delStudent(student_name);
					if(b==true){
						JOptionPane.showMessageDialog(DelStudent.this, "É¾³ý³É¹¦");
					}else {
						JOptionPane.showMessageDialog(DelStudent.this, "É¾³ýÊ§°Ü");
					}
				}
			}
		});
		panel_4.add(button);
		
		JButton button_1 = new JButton("\u9000\u51FA");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		panel_4.add(button_1);
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		this.setVisible(true);
	}

}
