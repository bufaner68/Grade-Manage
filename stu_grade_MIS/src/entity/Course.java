package entity;

public class Course {
	private int id;
	private int cno;
	private String course_name;
	private int hour;
	private int credit;
	
	public Course(){
		
	}
	public Course(int cno, String course_name, int hour, int credit) {
		super();
		this.cno = cno;
		this.course_name = course_name;
		this.hour = hour;
		this.credit = credit;
	}
	public Course(int id, int cno, String course_name, int hour, int credit) {
		super();
		this.id = id;
		this.cno = cno;
		this.course_name = course_name;
		this.hour = hour;
		this.credit = credit;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
}
