package beans;

public class SoftwarEmployee extends Employee{
	
	private String tool;

	public SoftwarEmployee() {
		
	}
	public SoftwarEmployee(int id, String name, String email, int salary, String tool) {
		super(id, name, email, salary);
		this.tool = tool;
	}

	public String getTool() {
		return tool;
	}

	public void setTool(String tool) {
		this.tool = tool;
	}

}
