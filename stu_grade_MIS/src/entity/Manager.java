package entity;

public class Manager {
	private int id;
	private String manager_name;
	private String password;
	
	public Manager(){
		
	}
	public Manager(String manager_name, String password) {
		super();
		this.manager_name = manager_name;
		this.password = password;
	}
	public Manager(int id, String manager_name, String password) {
		super();
		this.id = id;
		this.manager_name = manager_name;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getManager_name() {
		return manager_name;
	}
	public void setManager_name(String manager_name) {
		this.manager_name = manager_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
