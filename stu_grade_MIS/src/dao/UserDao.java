package dao;

import java.util.List;

import entity.Manager;
import entity.Student;

public interface UserDao {
	public Student loginStudent(Student student); //��ѯ��¼��ѧ��
	public Manager loginManager(Manager manager); //��ѯ��¼�Ĺ���Ա
	public boolean SaveStudent(Student student);
	Student QueryStudent(Student student);
}
