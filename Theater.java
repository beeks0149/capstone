
public class Theater {
	
	private String city;
	private String name;
	private int screens;
	
	public Theater(String city, String name, int screens) {
		this.city = city;
		this.name = name;
		this.screens = screens;
	}
	public int getScreens() {
		return screens;
	}
	public void setScreens(int screens) {
		this.screens = screens;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
