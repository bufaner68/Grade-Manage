package impl;

import java.util.ArrayList;
import java.util.List;

import dao.StudentDao;
import entity.Student;
import entity.Student2;

public class StudentDaoImpl extends GetConn implements StudentDao {

	@Override
	public boolean addStudent (Student student) {
		String sql = "insert into student(student_name,password,sno,sex,birthday,classroom,major,faculty)values(?,?,?,?,?,?,?,?)";
		List<Object> params = new ArrayList<Object>();
		params.add(student.getStudent_name());
		params.add(student.getPassword());
		params.add(student.getSno());
		params.add(student.getSex());
		params.add(student.getBirthday());
		params.add(student.getClassroom());
		params.add(student.getMajor());
		params.add(student.getFaculty());
		return this.OperUpdate(sql, params);
	}

	@Override
	public boolean delStudent(int sno) {
		String sql = "delete from student where sno = ?";
		List<Object> params = new ArrayList<Object>();
		params.add(sno);
		return this.OperUpdate(sql, params);
	}
	public boolean delStudent(String student_name) {
		String sql = "delete from student where student_name = ?";
		List<Object> params = new ArrayList<Object>();
		params.add(student_name);
		return this.OperUpdate(sql, params);
	}

	@Override
	public boolean updateStudent(Student student) {
		String sql = "update student set student_name=?,password=?,sno=?,sex=?,birthday=?,classroom=?,major=?,faculty=? where sno = ?";
		List<Object> params = new ArrayList<Object>();
		params.add(student.getStudent_name());
		params.add(student.getPassword());
		params.add(student.getSno());
		params.add(student.getSex());
		params.add(student.getBirthday());
		params.add(student.getClassroom());
		params.add(student.getMajor());
		params.add(student.getFaculty());
		params.add(student.getSno());
		return this.OperUpdate(sql, params);
	}

	@Override
	public List<Student> queryStudents() {
		String sql = "select id,student_name,sno,sex,birthday,classroom,major,faculty from student";
		List<Student> sList = null;
		try {
			sList = this.OperQuery(sql, null, Student.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sList;
	}

	@Override
	public List<Student2> queryStudent() {
		String sql = "select id,student_name,sno,course_name,grade,sex,birthday,classroom,major,faculty from student2";
		List<Student2> sList = null;
		try {
			sList = this.OperQuery(sql, null, Student2.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sList;
	}

	@Override
	public List<Student2> queryStudentByName(String Student_name) {
		String sql = "select id,student_name,sno,sex,birthday,classroom,major,faculty from student where student_name = ?";
		List<Student2> sList = null;
		try {
			sList = this.OperQuery(sql, null, Student2.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sList;
	}

	@Override
	public List<Student2> queryStudentBySno(int sno) {
		String sql = "select sno,student_name,sex,birthday,classroom,major,faculty from student where sno = ?";
		List<Student2> sList = null;
		List<Object> params = new ArrayList<Object>();
		params.add(sno);
		try {
			sList = this.OperQuery(sql, params, Student2.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sList;
	}

	@Override
	public List<Student2> queryStudentByClassroom(int classroom) {
		String sql = "select sno,student_name,sex,birthday,classroom,major,faculty from student where classroom = ?";
		List<Student2> sList = null;
		List<Object> params = new ArrayList<Object>();
		params.add(classroom);
		try {
			sList = this.OperQuery(sql, params, Student2.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sList;
	}

	@Override
	public List<Student2> queryStudentByMajor(String major) {
		String sql = "select sno,student_name,sex,birthday,classroom,major,faculty from student where major= ?";
		List<Student2> sList = null;
		List<Object> params = new ArrayList<Object>();
		params.add(major);
		try {
			sList = this.OperQuery(sql, params, Student2.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sList;
	}

	@Override
	public List<Student2> queryStudentByFaculty(String faculty) {
		String sql = "select sno,student_name,sex,birthday,classroom,major,faculty from student where faculty = ?";
		List<Student2> sList = null;
		List<Object> params = new ArrayList<Object>();
		params.add(faculty);
		try {
			sList = this.OperQuery(sql, params, Student2.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sList;
	}

}
