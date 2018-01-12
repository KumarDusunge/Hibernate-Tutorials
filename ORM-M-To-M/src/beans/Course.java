package beans;

import java.util.Set;

public class Course {
	
	private int cid;
	private String cname;
	private int fee;
	private Set<Faculty> faculty;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public Set<Faculty> getFaculty() {
		return faculty;
	}
	public void setFaculty(Set<Faculty> faculty) {
		this.faculty = faculty;
	}
	
}
