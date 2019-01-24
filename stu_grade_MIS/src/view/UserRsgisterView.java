package view;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import biz.impl.UserBizImpl;
import entity.Student;
import impl.UserDaoImpl;

public class UserRsgisterView extends JFrame {
	private static final long serialVersionUID = 179257936422299734L;
	private JPanel panel_main = null;//�����
	private JPanel panel1 = null;
	private JPanel panel2 = null;
	private JPanel panel3 = null;
	private JPanel panel4 = null;
	private JPanel panel5 = null;
	private JLabel lb_name = null;
	private JLabel lb_init_pass = null;
	private JLabel lb_confirm_pass = null;
	private JTextField tf_uname = null;
	private JPasswordField userPassInit = null;
	private JPasswordField userPassConfirm = null;
	private JButton btn_confirm = null; //ȷ�ϰ�ť
	private JButton btn_back = null;//ȡ����ť
	
	public UserRsgisterView(){
		init();
		registerListener();
	}
	
	public void init(){
		tf_uname = new JTextField(15);
		userPassInit = new JPasswordField(16);
		userPassConfirm = new JPasswordField(16);
		btn_confirm = new JButton("ȷ���ύ");
		btn_back = new JButton("ȡ��");
		lb_name = new JLabel("�û���  ");
		lb_name.setFont(new Font("����",Font.BOLD,15));//��������
		lb_init_pass = new JLabel("��ʼ������");
		lb_init_pass.setFont(new Font("����",Font.BOLD,15));//��������
		lb_confirm_pass =new JLabel("ȷ������ ");
		lb_confirm_pass.setFont(new Font("����",Font.BOLD,15));//��������
		panel_main = new JPanel(new GridLayout(5, 1));//�����
		
		panel1 = new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();
		panel4 = new JPanel();
		panel5 = new JPanel();
		
		panel2.add(lb_name);
		panel2.add(tf_uname);
		panel3.add(lb_init_pass);
		panel3.add(userPassInit);
		panel4.add(lb_confirm_pass);
		panel4.add(userPassConfirm);
		panel5.add(btn_confirm);
		panel5.add(btn_back);
		
		panel_main.add(panel1);
		panel_main.add(panel2);
		panel_main.add(panel3);
		panel_main.add(panel4);
		panel_main.add(panel5);
		
		this.getContentPane().add(panel_main);
		this.setTitle("�û�ע�ᴰ��");
		this.setSize(450,260);
		this.setResizable(false);//�����϶������С
		this.setLocationRelativeTo(null);//���������ʾ
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//�رմ���
		this.setVisible(true);
	}
	private void registerListener(){
		btn_confirm.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				String uname = tf_uname.getText().trim();
				String upass = new String( userPassInit.getPassword());
				String upass1 = new String( userPassConfirm.getPassword());
				UserBizImpl user= new UserBizImpl();
				if(uname.equals("")){
					JOptionPane.showMessageDialog(UserRsgisterView.this, "�û�������Ϊ��");
					return;
				}else if(upass.equals("")){
					JOptionPane.showMessageDialog(UserRsgisterView.this, "���벻��Ϊ��");
					return;
				}else if(upass1.equals("")){
					JOptionPane.showMessageDialog(UserRsgisterView.this, "���벻��Ϊ��");
					return;
				}else if(!upass.equals(upass1)){
					JOptionPane.showMessageDialog(UserRsgisterView.this, "����������Ҫһ��");
					return;
				}
				Student student = new Student(uname,upass);
			    int new_user = user.registerStudent(student);
			    if(new_user==1){
					JOptionPane.showMessageDialog(UserRsgisterView.this, "��ע����˻��Ѵ���");
					new LoginView();
					dispose();
				}else if(new_user==2){
					JOptionPane.showMessageDialog(UserRsgisterView.this, "��ϲ��ע��ɹ�");
					new StudentMainView();
					dispose();
				}else if(new_user==3){
					JOptionPane.showMessageDialog(UserRsgisterView.this, "ע��ʧ��");
					new UserRsgisterView();
					dispose();
				}
			}
		});
		btn_back.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new LoginView();
			}
		});
	}
}
