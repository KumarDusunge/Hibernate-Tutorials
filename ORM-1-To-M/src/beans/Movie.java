package beans;

public class Movie {
	private int mid;
	private String name;
	public Movie() {
	}
	public Movie(int mid, String name) {
		super();
		this.mid = mid;
		this.name = name;
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
