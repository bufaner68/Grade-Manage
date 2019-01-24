 package view;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import biz.UserBiz;
import biz.impl.UserBizImpl;
import entity.Manager;
import entity.Student;
import impl.UserDaoImpl;

public class LoginView extends JFrame {
	private static final long serialVersionUID = -4972101784603327025L;
	private JPanel  panel_main = null; //�����
	private JPanel  panel_left = null; //������
	private JPanel  panel_right = null; //�Ҳ����
	
	private JLabel lb_uname = null; //�û�����ǩ
	private JLabel lb_upass = null; //�����ǩ
	private JLabel lb_type = null; //���ͱ�ǩ
	
	private JTextField tf_uname = null; //�û����ı���
	private JPasswordField pf_pass = null;//�����ı���
	
	private JLabel lb_img = null;//��ʾͼƬ�ı�ǩ
	
	private JButton btn_login = null; //��¼��ť
	private JButton btn_register = null; //ע�ᰴť
	
	private JComboBox<String> cb_type = null;//��¼���������б��

	public LoginView(){
		init();
		registerListener();
	}
	//��ʼ���ؼ��ķ���
	private void init (){
		this.setSize(320,220);//���ô���Ĵ�С
		this.setResizable(false);//�����϶������С
		this.setLocationRelativeTo(null);//���������ʾ
		this.setTitle("��¼����");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//�رմ���
		
		//��ʼ�����
		panel_main = new JPanel(new GridLayout(1, 2));
		panel_left = new JPanel();
		panel_right = new JPanel(new GridLayout(4, 2, 0, 10));
		
		//��ʼ���ؼ�
		tf_uname = new JTextField(8);
		pf_pass = new JPasswordField(8);
		cb_type = new JComboBox<String>(new String[]{"ѧ��","����Ա"});
		btn_login = new JButton("��¼");
		btn_register = new JButton("�˳�");
		lb_uname = new JLabel("��  ��:",JLabel.CENTER);
		lb_upass = new JLabel("��  ��:",JLabel.CENTER);
		lb_type = new JLabel("��  ��:",JLabel.CENTER);
		lb_img = new JLabel(new ImageIcon(
				ClassLoader.getSystemResource("images/login.jpg")));
		//����Ӧ�Ŀؼ��ŵ���Ӧ�������
		panel_left.add(lb_img);
		panel_right.add(lb_uname);
		panel_right.add(tf_uname);
		panel_right.add(lb_upass);
		panel_right.add(pf_pass);
		panel_right.add(lb_type);
		panel_right.add(cb_type);
		panel_right.add(btn_login);
		panel_right.add(btn_register);
		
		//������з������������
		panel_main.add(panel_left);
		panel_main.add(panel_right);
		
		//�ٰ������ŵ�������
		this.getContentPane().add(panel_main);
		this.pack();
		this.setVisible(true);//���ô���ɼ�
		
	}
	
	private void registerListener(){
		btn_register.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btn_login.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//��ȡ�û���������
				String uname = tf_uname.getText().trim();
				String upass =new String( pf_pass.getPassword());
				int index = cb_type.getSelectedIndex();
				UserBizImpl user= new UserBizImpl();
				if(uname.equals("")){
					JOptionPane.showMessageDialog(LoginView.this, "�û�������Ϊ��");
					return;
				}else if(upass.equals("")){
					JOptionPane.showMessageDialog(LoginView.this, "���벻��Ϊ��");
					return;
				}
				if(index == 0){
					Student student = new Student(uname,upass);
					student = user.loginStudent(student);
					if(student!=null){
						new StudentMainView();
						dispose();
					}else {
						JOptionPane.showMessageDialog(LoginView.this, "�û������������");
						return;
					}
				}
				else if(index == 1){
						Manager manager = new Manager(uname,upass);
						manager = user.loginManager(manager);
						if(manager!=null){
						new ManagerMainView();
						dispose();
						}
					}
				}
				
		});
	}
}
				
				
			
	
	

