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
	public Connection conn = null;   //创建Connection连接对象
	public Connection getConnection(){    //获取数据库连接方法
		try {
			Class.forName("com.mysql.jdbc.Driver");   //加载数据库驱动
			//指定连接数据库的url
			String url = "jdbc:mysql://127.0.0.1:3306/stu_grade?characterEncoding=utf8&useSSL=false";
			String user = "root";   //指定连接数据库的用户名
			String password ="123";   //指定连接数据库的密码
			conn = DriverManager.getConnection(url, user, password);
			if(conn != null){         //如果Connection实例不为空
				System.out.println("数据库连接成功");   //提示连接成功
			}
		} catch (Exception e) {
			e.printStackTrace();
		}  //异常处理
		return conn;    //返回Connection对象
	}
	/**
	 * 释放相应的资源
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
	 * 此方法可以完成增删改所有的操作
	 * @param sql
	 * @param params
	 * @return true 或 false
	 */
	public boolean OperUpdate(String sql, List<Object> params) {  
		int res = 0; //影响的行数
		Connection conn = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;

		try {
			conn = getConnection(); // 建立数据库连接
			ptmt = conn.prepareStatement(sql); //装载sql语句
			if (params != null) {
				//假如有？，在执行前把？占位符替换掉
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
	 * 使用泛型方法和反射机制进行封装查询方法
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
			conn = getConnection();// 建立数据库连接
			ptmt = conn.prepareStatement(sql); //装载sql语句
			if (params != null) {
				//假如有？，在执行前把？占位符替换掉
				for (int i = 0; i < params.size(); i++) {
					ptmt.setObject(i + 1, params.get(i));
				}
			}
			rs = ptmt.executeQuery();
			//把查询出来的记录封装成对应的实体类对象
			ResultSetMetaData rsd = rs.getMetaData();// 得到记录集元数据对象
			// 通过此对象可以得到表的结构，包括列名，列的个数，列的数据类型
			while (rs.next()) {
				T m = cls.newInstance();
				for (int i = 0; i < rsd.getColumnCount(); i++) {
					String col_name = rsd.getColumnName(i + 1);// 获得列名
					Object value = rs.getObject(col_name);// 获得列所对应的值
					Field field = cls.getDeclaredField(col_name);
					field.setAccessible(true);// 给私有属性设置可访问权
					field.set(m, value);// 给对象的私有属性赋值
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

//	public static void main(String [ ] args){   //程序主方法
//		GetConn getconn = new GetConn();   //创建getConn实例对象
//		getconn.getConnection();   //调用连接数据库的方法
//		
//	}
}
