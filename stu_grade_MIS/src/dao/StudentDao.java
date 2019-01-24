package dao;

import java.util.List;

import entity.Course;
import entity.Student;
import entity.Student2;

public interface StudentDao {
		public boolean addStudent(Student student);  //添加学生信息；
		public boolean delStudent(int sno);  //删除学生信息；
		public boolean delStudent(String student_name); 
		public boolean updateStudent(Student student);  //更新学生信息；
		public List<Student>queryStudents();  //查询所有学生个人信息；
		public List<Student2>queryStudent();  //查询所有学生成绩信息；
		public List<Student2> queryStudentByName(String Student_name); //查询指定姓名的学生成绩信息
		public List<Student2> queryStudentBySno(int sno); //查询指定学号的学生成绩信息
		public List<Student2> queryStudentByClassroom(int classroom); //查询指定班级的学生成绩信息
		public List<Student2> queryStudentByMajor(String major); //查询指定专业的学生成绩信息
		public List<Student2> queryStudentByFaculty(String faculty); //查询指定学院的学生成绩信息

}
