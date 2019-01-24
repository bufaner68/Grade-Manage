package entity;

public class Grade {
	private int id;
	private int sno;
	private int cno;
	private String course_name;
	private int grade;
	private int b_grade;
	
	public  Grade(){
		
	}
	public Grade(int sno, int cno, String course_name, int grade, int b_grade) {
		super();
		this.sno = sno;
		this.cno = cno;
		this.course_name = course_name;
		this.grade = grade;
		this.b_grade = b_grade;
	}
	public Grade(int id, int sno, int cno, String course_name, int grade, int b_grade) {
		super();
		this.id = id;
		this.sno = sno;
		this.cno = cno;
		this.course_name = course_name;
		this.grade = grade;
		this.b_grade = b_grade;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public int getCno() {
		return cno;
	}
	public void setCno(int cno) {
		this.cno = cno;
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
	public int getB_grade() {
		return b_grade;
	}
	public void setB_grade(int b_grade) {
		this.b_grade = b_grade;
	}
}
