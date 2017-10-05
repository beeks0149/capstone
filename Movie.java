

public class Movie {

	private String name;
	private int minutes;
	public Movie(String name, int minutes) {
		this.name = name;
		this.minutes = minutes;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMinutes() {
		return minutes;
	}
	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
}
