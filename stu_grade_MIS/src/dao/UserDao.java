package dao;

import java.util.List;

import entity.Manager;
import entity.Student;

public interface UserDao {
	public Student loginStudent(Student student); //查询登录的学生
	public Manager loginManager(Manager manager); //查询登录的管理员
	public boolean SaveStudent(Student student);
	Student QueryStudent(Student student);
}
