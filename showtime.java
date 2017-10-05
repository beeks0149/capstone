import java.util.Date;

public class showtime {
	
	private Date date;
	private Theater theater;
	private Movie movie;
	private int day;
	public showtime(Date date, Theater theater, Movie movie, int day) {
		super();
		this.date = date;
		this.theater = theater;
		this.movie = movie;
		this.day = day;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Theater getTheater() {
		return theater;
	}
	public void setTheater(Theater theater) {
		this.theater = theater;
	}
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	
	
	

}
