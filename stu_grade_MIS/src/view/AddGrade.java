package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import biz.impl.GradeBizImpl;
import entity.Grade;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class AddGrade extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tf_sno;
	private JTextField tf_cno;
	private JTextField tf_cno_name;
	private JTextField tf_grade;
	private JTextField tf_bu_grade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddGrade frame = new AddGrade();
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
	public AddGrade() {
		setTitle("\u7BA1\u7406\u5458\u6DFB\u52A0\u5B66\u751F\u6210\u7EE9\u754C\u9762");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(7, 1, 0, 10));

		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);

		JLabel label = new JLabel("\u6210\u7EE9\u4FE1\u606F\uFF1A");
		panel_1.add(label);

		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 3, 0, 0));

		JLabel lb_sno = new JLabel("\u5B66\u53F7\uFF1A");
		lb_sno.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_2.add(lb_sno);

		tf_sno = new JTextField();
		panel_2.add(tf_sno);
		tf_sno.setColumns(10);

		JLabel label_1 = new JLabel("");
		panel_2.add(label_1);

		JPanel panel_3 = new JPanel();
		contentPane.add(panel_3);
		panel_3.setLayout(new GridLayout(0, 3, 0, 0));

		JLabel lb_cno = new JLabel("\u8BFE\u7A0B\u53F7\uFF1A");
		lb_cno.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_3.add(lb_cno);

		tf_cno = new JTextField();
		panel_3.add(tf_cno);
		tf_cno.setColumns(10);

		JLabel label_3 = new JLabel("");
		panel_3.add(label_3);

		JPanel panel_4 = new JPanel();
		contentPane.add(panel_4);
		panel_4.setLayout(new GridLayout(0, 3, 0, 0));

		JLabel lb_cno_name = new JLabel("\u8BFE\u7A0B\u540D\u79F0\uFF1A");
		lb_cno_name.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_4.add(lb_cno_name);

		tf_cno_name = new JTextField();
		panel_4.add(tf_cno_name);
		tf_cno_name.setColumns(10);

		JLabel label_4 = new JLabel("");
		panel_4.add(label_4);

		JPanel panel_5 = new JPanel();
		contentPane.add(panel_5);
		panel_5.setLayout(new GridLayout(0, 3, 0, 0));

		JLabel lb_grade = new JLabel("\u6210\u7EE9\uFF1A");
		lb_grade.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_5.add(lb_grade);

		tf_grade = new JTextField();
		panel_5.add(tf_grade);
		tf_grade.setColumns(10);

		JLabel label_5 = new JLabel("");
		panel_5.add(label_5);

		JPanel panel_6 = new JPanel();
		contentPane.add(panel_6);
		panel_6.setLayout(new GridLayout(0, 3, 0, 0));

		JLabel lb_bu_grade = new JLabel("\u8865\u8003\u6210\u7EE9\uFF1A");
		lb_bu_grade.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_6.add(lb_bu_grade);

		tf_bu_grade = new JTextField();
		panel_6.add(tf_bu_grade);
		tf_bu_grade.setColumns(10);

		JLabel label_6 = new JLabel("");
		panel_6.add(label_6);

		JPanel btn_add = new JPanel();
		contentPane.add(btn_add);

		JButton btnNewButton = new JButton("\u6DFB\u52A0");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int sno = Integer.parseInt(tf_sno.getText().trim());
				int cno = Integer.parseInt(tf_cno.getText().trim());
				String course_name = tf_cno_name.getText().trim();
				int grade = Integer.parseInt(tf_grade.getText().trim());
				int bu_grade = Integer.parseInt(tf_bu_grade.getText().trim());
				GradeBizImpl a = new GradeBizImpl();
				Grade newgrade = new Grade(sno, cno, course_name, grade, bu_grade);
				if(grade<0){
					JOptionPane.showMessageDialog(AddGrade.this, "成绩不合法");
					return;
				}
				if(bu_grade<0){
					JOptionPane.showMessageDialog(AddGrade.this, "成绩不合法");
					return;
				}
				boolean b = a.addGrade(newgrade);
				if (b == true) {
					JOptionPane.showMessageDialog(AddGrade.this, "添加成功");
				} else {
					JOptionPane.showMessageDialog(AddGrade.this, "添加失败");
				}
			}
		});
		btn_add.add(btnNewButton);

		JButton btn_quit = new JButton("\u9000\u51FA");
		btn_quit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btn_add.add(btn_quit);
		this.setVisible(true);
	}
}
