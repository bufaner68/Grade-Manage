package entity;

public class Student2 {
	private int id;
	private String student_name;
	private int sno;
	private String course_name;
	private int grade;
	private String sex;
	private String birthday;
	private int classroom;
	private  String major;
	private String faculty;
	
	public Student2(){
		
	}
	
	public Student2(String student_name, int sno, String sex, String birthday, int classroom, String major,
			String faculty) {
		super();
		this.student_name = student_name;
		this.sno = sno;
		this.sex = sex;
		this.birthday = birthday;
		this.classroom = classroom;
		this.major = major;
		this.faculty = faculty;
	}

	public Student2(String student_name, int sno, String course_name, int grade, String sex, String birthday,
			int classroom, String major, String faculty) {
		super();
		this.student_name = student_name;
		this.sno = sno;
		this.course_name = course_name;
		this.grade = grade;
		this.sex = sex;
		this.birthday = birthday;
		this.classroom = classroom;
		this.major = major;
		this.faculty = faculty;
	}

	public Student2(int id, String student_name, int sno, String course_name, int grade, String sex, String birthday,
			int classroom, String major, String faculty) {
		super();
		this.id = id;
		this.student_name = student_name;
		this.sno = sno;
		this.course_name = course_name;
		this.grade = grade;
		this.sex = sex;
		this.birthday = birthday;
		this.classroom = classroom;
		this.major = major;
		this.faculty = faculty;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public int getClassroom() {
		return classroom;
	}
	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getFaculty() {
		return faculty;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	

}
