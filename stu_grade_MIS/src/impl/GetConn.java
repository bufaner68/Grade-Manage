package impl;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.Course;
import entity.Grade;
import entity.Student;
import entity.Student2;

public class GetConn {
	public Connection conn = null;   //����Connection���Ӷ���
	public Connection getConnection(){    //��ȡ���ݿ����ӷ���
		try {
			Class.forName("com.mysql.jdbc.Driver");   //�������ݿ�����
			//ָ���������ݿ��url
			String url = "jdbc:mysql://127.0.0.1:3306/stu_grade?characterEncoding=utf8&useSSL=false";
			String user = "root";   //ָ���������ݿ���û���
			String password ="123";   //ָ���������ݿ������
			conn = DriverManager.getConnection(url, user, password);
			if(conn != null){         //���Connectionʵ����Ϊ��
				System.out.println("���ݿ����ӳɹ�");   //��ʾ���ӳɹ�
			}
		} catch (Exception e) {
			e.printStackTrace();
		}  //�쳣����
		return conn;    //����Connection����
	}
	/**
	 * �ͷ���Ӧ����Դ
	 * 
	 */
	public void closeAll(ResultSet rs,  PreparedStatement ptmt, Connection conn){
		try {
			if(rs!=null){
				rs.close();
			}
			if(ptmt!=null){
				ptmt.close();
			}
			if(conn!=null){
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	/**
	 * �˷������������ɾ�����еĲ���
	 * @param sql
	 * @param params
	 * @return true �� false
	 */
	public boolean OperUpdate(String sql, List<Object> params) {  
		int res = 0; //Ӱ�������
		Connection conn = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;

		try {
			conn = getConnection(); // �������ݿ�����
			ptmt = conn.prepareStatement(sql); //װ��sql���
			if (params != null) {
				//�����У�����ִ��ǰ�ѣ�ռλ���滻��
				for (int i = 0; i < params.size(); i++) {
					ptmt.setObject(i + 1, params.get(i));
				}
			}
			res = ptmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeAll(rs, ptmt, conn);
		}
		return res > 0 ? true : false;
	}
	/**
	 * ʹ�÷��ͷ����ͷ�����ƽ��з�װ��ѯ����
	 * @param sql
	 * @param params
	 * @param cls
	 * @return
	 * @throws Exception
	 */
	
	public <T> List<T> OperQuery(String sql, List<Object> params, Class<T> cls) throws Exception {
		Connection conn = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;
		List<T> data = new ArrayList<T>();
		try {
			conn = getConnection();// �������ݿ�����
			ptmt = conn.prepareStatement(sql); //װ��sql���
			if (params != null) {
				//�����У�����ִ��ǰ�ѣ�ռλ���滻��
				for (int i = 0; i < params.size(); i++) {
					ptmt.setObject(i + 1, params.get(i));
				}
			}
			rs = ptmt.executeQuery();
			//�Ѳ�ѯ�����ļ�¼��װ�ɶ�Ӧ��ʵ�������
			ResultSetMetaData rsd = rs.getMetaData();// �õ���¼��Ԫ���ݶ���
			// ͨ���˶�����Եõ���Ľṹ�������������еĸ������е���������
			while (rs.next()) {
				T m = cls.newInstance();
				for (int i = 0; i < rsd.getColumnCount(); i++) {
					String col_name = rsd.getColumnName(i + 1);// �������
					Object value = rs.getObject(col_name);// ���������Ӧ��ֵ
					Field field = cls.getDeclaredField(col_name);
					field.setAccessible(true);// ��˽���������ÿɷ���Ȩ
					field.set(m, value);// �������˽�����Ը�ֵ
				}
				data.add(m);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeAll(rs, ptmt, conn);
		}
		return data;
	}

//	public static void main(String [ ] args){   //����������
//		GetConn getconn = new GetConn();   //����getConnʵ������
//		getconn.getConnection();   //�����������ݿ�ķ���
//		
//	}
}
