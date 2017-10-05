
public class MovieList {
	private int numberOfMovies;
	private Movie[] movielist;
	private int max;
	
	public MovieList(int number){
		this.numberOfMovies = 0;
		movielist = new Movie[number];
		max = number;
	}
	
	public void addMovie(String name, int minutes){
		numberOfMovies++;
		Movie m = new Movie(name, minutes);
		movielist = ensurecapacity(movielist);
		movielist[numberOfMovies-1] = m;
		
	}
	public Movie[] ensurecapacity(Movie[] movielist){
		if(numberOfMovies>max){
			Movie[] mlist = new Movie[max*2];
			for(int k = 0;k<max;k++){
				mlist[k] = movielist[k];
			}
			max = max*2;
			return mlist;
		}else{
			return movielist;
		}
	}
	public Movie getMovie(int i){
		return movielist[i];
	}
	public int getNumberOfMovies() {
		return numberOfMovies;
	}
	public int getMax() {
		return max;
	}
	
	
}
