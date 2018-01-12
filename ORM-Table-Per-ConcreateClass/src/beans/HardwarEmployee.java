package beans;

public class HardwarEmployee extends Employee{

	private int workinghours;

	public HardwarEmployee() {
	}

	public HardwarEmployee(int id, String name, String email, int salary, int workinghours) {
		super(id, name, email, salary);
		this.workinghours = workinghours;
	}


	public int getWorkinghours() {
		return workinghours;
	}

	public void setWorkinghours(int workinghours) {
		this.workinghours = workinghours;
	}
	
}
