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
	private JPanel panel_main = null;//主面板
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
	private JButton btn_confirm = null; //确认按钮
	private JButton btn_back = null;//取消按钮
	
	public UserRsgisterView(){
		init();
		registerListener();
	}
	
	public void init(){
		tf_uname = new JTextField(15);
		userPassInit = new JPasswordField(16);
		userPassConfirm = new JPasswordField(16);
		btn_confirm = new JButton("确认提交");
		btn_back = new JButton("取消");
		lb_name = new JLabel("用户名  ");
		lb_name.setFont(new Font("宋体",Font.BOLD,15));//设置字体
		lb_init_pass = new JLabel("初始化密码");
		lb_init_pass.setFont(new Font("宋体",Font.BOLD,15));//设置字体
		lb_confirm_pass =new JLabel("确认密码 ");
		lb_confirm_pass.setFont(new Font("宋体",Font.BOLD,15));//设置字体
		panel_main = new JPanel(new GridLayout(5, 1));//主面板
		
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
		this.setTitle("用户注册窗口");
		this.setSize(450,260);
		this.setResizable(false);//不可拖动窗体大小
		this.setLocationRelativeTo(null);//窗体居中显示
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭窗体
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
					JOptionPane.showMessageDialog(UserRsgisterView.this, "用户名不能为空");
					return;
				}else if(upass.equals("")){
					JOptionPane.showMessageDialog(UserRsgisterView.this, "密码不能为空");
					return;
				}else if(upass1.equals("")){
					JOptionPane.showMessageDialog(UserRsgisterView.this, "密码不能为空");
					return;
				}else if(!upass.equals(upass1)){
					JOptionPane.showMessageDialog(UserRsgisterView.this, "两次密码需要一致");
					return;
				}
				Student student = new Student(uname,upass);
			    int new_user = user.registerStudent(student);
			    if(new_user==1){
					JOptionPane.showMessageDialog(UserRsgisterView.this, "您注册的账户已存在");
					new LoginView();
					dispose();
				}else if(new_user==2){
					JOptionPane.showMessageDialog(UserRsgisterView.this, "恭喜，注册成功");
					new StudentMainView();
					dispose();
				}else if(new_user==3){
					JOptionPane.showMessageDialog(UserRsgisterView.this, "注册失败");
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
