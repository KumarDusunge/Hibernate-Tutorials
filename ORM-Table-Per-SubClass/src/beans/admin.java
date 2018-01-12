package beans;

public class admin extends Employee{
	
	private String departmentName;

	public admin() {
	}
	
	public admin(int id, String name, String email, int salary, String departmentName) {
		super(id, name, email, salary);
		this.departmentName = departmentName;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
}
