package beans;

import java.util.Set;

public class Actor {
	private int aid;
	private String name;
	private Set<Movie> movie;
	
	public Actor() {
	}

	public Actor(int aid, String name, Set<Movie> movie) {
		super();
		this.aid = aid;
		this.name = name;
		this.movie = movie;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Movie> getMovie() {
		return movie;
	}

	public void setMovie(Set<Movie> movie) {
		this.movie = movie;
	}

}
