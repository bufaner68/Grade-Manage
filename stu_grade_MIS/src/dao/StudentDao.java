package dao;

import java.util.List;

import entity.Course;
import entity.Student;
import entity.Student2;

public interface StudentDao {
		public boolean addStudent(Student student);  //���ѧ����Ϣ��
		public boolean delStudent(int sno);  //ɾ��ѧ����Ϣ��
		public boolean delStudent(String student_name); 
		public boolean updateStudent(Student student);  //����ѧ����Ϣ��
		public List<Student>queryStudents();  //��ѯ����ѧ��������Ϣ��
		public List<Student2>queryStudent();  //��ѯ����ѧ���ɼ���Ϣ��
		public List<Student2> queryStudentByName(String Student_name); //��ѯָ��������ѧ���ɼ���Ϣ
		public List<Student2> queryStudentBySno(int sno); //��ѯָ��ѧ�ŵ�ѧ���ɼ���Ϣ
		public List<Student2> queryStudentByClassroom(int classroom); //��ѯָ���༶��ѧ���ɼ���Ϣ
		public List<Student2> queryStudentByMajor(String major); //��ѯָ��רҵ��ѧ���ɼ���Ϣ
		public List<Student2> queryStudentByFaculty(String faculty); //��ѯָ��ѧԺ��ѧ���ɼ���Ϣ

}
