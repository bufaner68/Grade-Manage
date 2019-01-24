package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;

public class ManagerQueryView extends JInternalFrame {
	private static final long serialVersionUID = 1L;
	private JPanel paneltable = null;//��������JTable�����
	private JTable table = null;
	private JPanel panelButton = null;//��ť���
	private JButton btn_query = null;
	private JButton btn_add = null;
	private JButton btn_del = null;
	private JButton btn_update = null;
	private JButton btn_exit = null;
	private JComboBox<String> cb_type = null;
	private JLabel lb_type = null;
	
	public ManagerQueryView(){
		init();
		registerListener();
	}
	private void init(){
		this.setTitle("ѧ��������Ϣ��ѯ");
		this.setSize(450,280);
		this.setVisible(true);
		this.setResizable(false);//�����϶������С
		this.setClosable(true);//����ɱ��ر�
		this.setIconifiable(true);//����ɱ���С��
		
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//�رմ���
		table = new JTable();
		paneltable = new JPanel(new BorderLayout());//�������
		//��������ñ߿�
		paneltable.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(null, null), "��ѯ��Ϣ"));
		paneltable.add(table);
		this.add(paneltable,BorderLayout.CENTER);
		
		panelButton=new JPanel(new GridLayout(7, 1,10,10));
		panelButton.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(null, null),"��ѯ��Ϣ"));
		this.add(panelButton, BorderLayout.EAST);
		lb_type = new JLabel("��ѯ����");
		panelButton.add(lb_type);
//		cb_type = new JComboBox<>(new String[]{"��ѧ�Ų�ѯ","��������ѯ","���༶��ѯ","��רҵ��ѯ","��ѧԺ��ѯ"});
//		panelButton.add(cb_type);
		btn_query = new JButton("��ѯ��Ϣ");
		panelButton.add(btn_query);
		btn_add = new JButton("�����Ϣ");
		panelButton.add(btn_add);
		btn_del = new JButton("ɾ����Ϣ");
		panelButton.add(btn_del);
		btn_update = new JButton("������Ϣ");
		panelButton.add(btn_update);
		btn_exit = new JButton("�˳�");
		panelButton.add(btn_exit);
		this.setVisible(true);
	}
	private void registerListener(){
		btn_del.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new DelStudent();
			}
		});
		btn_query.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new QueryStudent();
			}
		});
		btn_update.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new UpdateStudent();
				
			}
		});
		btn_add.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new AddStudent();
			}
		});
		btn_exit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
	}
}
