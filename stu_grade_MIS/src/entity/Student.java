package entity;

public class Student {
	private int id;
	private String student_name;
	private String password;
	private int sno;
	private String sex;
	private String birthday;
	private int classroom;
	private  String major;
	private String faculty;
	
	public  Student() {
		
	}
	
	public Student(String student_name, int sno, String sex, String birthday, int classroom, String major,
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

	public Student(String student_name, String password, int sno, String sex, String birthday, int classroom,
			String major, String faculty) {
		super();
		this.student_name = student_name;
		this.password = password;
		this.sno = sno;
		this.sex = sex;
		this.birthday = birthday;
		this.classroom = classroom;
		this.major = major;
		this.faculty = faculty;
	}

	public Student(int id, String student_name, String password, int sno, String sex, String birthday, int classroom,
			String major, String faculty) {
		super();
		this.id = id;
		this.student_name = student_name;
		this.password = password;
		this.sno = sno;
		this.sex = sex;
		this.birthday = birthday;
		this.classroom = classroom;
		this.major = major;
		this.faculty = faculty;
	}

	public Student(String student_name, String password) {
		super();
		this.student_name=student_name;
		this.password=password;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
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
